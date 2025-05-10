package com.stou.studentregister

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.*
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {

    private lateinit var inName: EditText
    private lateinit var inEmail: EditText
    private lateinit var btnInsert: Button
    private lateinit val btnDelete: Button
    private lateinit var btnUpdaet: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        inName = findViewById(R.id.inName)
        inEmail = findViewById(R.id.inEmail)
        btnInsert = findViewById(R.id.btnInsert)
        btnDelete = findViewById(R.id.btnDelete)
        btnUpdaet = findViewById(R.id.btnInsert)

        btnInsert.setOnClickListener({
            addNewData()
        })
    }
    private fun addNewData(){
        val sname = inName.text.toString().trim()
        val semail = inEmail.text.toString().trim()

        if (sname.isEmpty()){
            inName.error = "Please enter a student name"
            return
        }
        val ref = FirebaseDatabase.getInstance()
            .getReferenceFromUrl("https://studentregister-e6e9a-default-rtdb.firebaseio.com/")
        val sid: String? = ref.push().key

        val student = Student(sname, semail )
        val addOnCompleteListener =
            ref.child(sid.toString()).setValue(student).addOnCompleteListener {
                Toast.makeText(applicationContext, "Successfully", Toast.LENGTH_LONG).show()
            }
    }

}
