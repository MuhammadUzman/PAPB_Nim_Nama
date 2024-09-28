package com.example.nim_nama

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referensi TextView
        val textViewNama = findViewById<TextView>(R.id.textViewNama)
        val textViewNIM = findViewById<TextView>(R.id.textViewNIM)

        // Set teks jika ingin memodifikasi dari kode (opsional)
        textViewNama.text = "Nama: Muhammad Usman"
        textViewNIM.text = "NIM: 225150601111021"
    }
}