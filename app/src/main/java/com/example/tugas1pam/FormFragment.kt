package com.example.tugas1pam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import com.example.tugas1pam.R

class FormFragment : Fragment() {

    private lateinit var editTextName: EditText
    private lateinit var editTextNIM: EditText
    private lateinit var editTextKelas: EditText
    private lateinit var editTextEmail: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_form, container, false)

        editTextName = view.findViewById(R.id.edit_text_name)
        editTextNIM = view.findViewById(R.id.edit_text_NIM)
        editTextKelas = view.findViewById(R.id.edit_text_kelas)
        editTextEmail = view.findViewById(R.id.edit_text_email)

        return view
    }
    fun getName(): String {
        return editTextName.text.toString()
    }
    fun getNIM(): String {
        return editTextNIM.text.toString()
    }
    fun getKelas(): String {
        return editTextKelas.text.toString()
    }
    fun getEmail(): String {
        return editTextEmail.text.toString()
    }
}
