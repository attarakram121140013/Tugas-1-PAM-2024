package com.example.tugas1pam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.tugas1pam.R

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        val name = intent.getStringExtra("name")
        val nim = intent.getStringExtra("nim")
        val prodi = intent.getStringExtra("prodi")
        val kelas = intent.getStringExtra("kelas")
        val email = intent.getStringExtra("email")

        val textViewDisplay: TextView = findViewById(R.id.text_view_display)
        textViewDisplay.text = "Nama: $name\nNIM: $nim\nProgram Studi: $prodi\nKelas: $kelas\nEmail: $email"
    }
}
