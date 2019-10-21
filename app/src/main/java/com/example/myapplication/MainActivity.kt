package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val namaEt = findViewById<EditText>(R.id.namaEt)
        val nimEt = findViewById<EditText>(R.id.nimEt)
        val nilaiEt = findViewById<EditText>(R.id.nilaiEt)
        val btn_proses = findViewById<Button>(R.id.btn_proses)



        btn_proses.setOnClickListener {

            val nama = namaEt.text.toString()
            val nim = nimEt.text.toString()
            val nilai = nilaiEt.text.toString()

            //intent to star

            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra("Nama", nama)
            intent.putExtra("Nim", nim)
            intent.putExtra("Nilai", nilai)


            startActivity(intent)


        }

    }

}

