<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <LinearLayout
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:layout_marginStart="16dp"
        android:layout_marginTop="16dp"
        android:layout_marginEnd="16dp"
        android:layout_marginBottom="16dp"
        android:orientation="vertical"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent">

        <TextView
            android:id="@+id/textView"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Student Registration System"
            android:textAlignment="center"
            android:textSize="25sp"
            android:layout_marginTop="30dp"
            android:textStyle="bold" />

        <TextView
            android:id="@+id/textView2"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="30dp"
            android:text="NAME:"
            android:textStyle="bold" />

        <EditText
            android:id="@+id/inName"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:ems="10"
            android:inputType="text" />

        <TextView
            android:id="@+id/textView3"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="EMAIL:"
            android:textStyle="bold" />

        <EditText
            android:id="@+id/inEmail"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:ems="10"
            android:inputType="text" />

        <Button
            android:id="@+id/btnInsert"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="50dp"
            android:text="Insert Data" />

        <Button
            android:id="@+id/btnDelete"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Delete Data" />

        <Button
            android:id="@+id/btnUpdate"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Update Data" />
    </LinearLayout>
</androidx.constraintlayout.widget.ConstraintLayout>
