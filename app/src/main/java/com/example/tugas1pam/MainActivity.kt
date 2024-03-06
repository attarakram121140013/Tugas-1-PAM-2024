package com.example.tugas1pam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSubmit: Button = findViewById(R.id.button_submit)
        buttonSubmit.setOnClickListener(this)

        val fragmentTransaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container, FormFragment())
        fragmentTransaction.commit()
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.button_submit) {
            val formFragment =
                supportFragmentManager.findFragmentById(R.id.fragment_container) as FormFragment
            val name = formFragment.getName()
            val nim = formFragment.getNIM()
            val prodi = formFragment.getProdi()
            val kelas = formFragment.getKelas()
            val email = formFragment.getEmail()

            val intent = Intent(this, DisplayActivity::class.java)
            intent.putExtra("name", name)
            intent.putExtra("nim", nim)
            intent.putExtra("prodi", prodi)
            intent.putExtra("kelas", kelas)
            intent.putExtra("email", email)
            startActivity(intent)
        }
    }
}
