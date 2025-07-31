package com.smktunas.app2_collab

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val inputNama = findViewById<EditText>(R.id.etNama)
        val inputKelas = findViewById<EditText>(R.id.etKelas)
        val tvTampil = findViewById<TextView>(R.id.tvHasil)
        val btnTampil = findViewById<Button>(R.id.btnTampilkan)

        btnTampil.setOnClickListener {
            val Nama = inputNama.text.toString()
            val Kelas = inputKelas.text.toString()
            val hasil = "Nama : ${Nama}\nKelas : ${Kelas}"
            tvTampil.text = hasil
        }
    }
}