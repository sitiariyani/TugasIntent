package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    lateinit var ket: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        var intent = intent
        val nama = intent.getStringExtra("Nama")
        val nim = intent.getStringExtra("Nim")
        val nilai = intent.getStringExtra("Nilai")

        if  (nilai.toInt() >= 80) {
            ket="A"
        } else if(nilai.toInt() >= 60) {
            ket="B"
        } else if (nilai.toInt() >= 40){
            ket="C"
        } else if (nilai.toInt() >= 20) {
            ket="D"
        } else if (nilai.toInt() >= 0 ){
            ket="E"
        }


        //textview
        val resultTv = findViewById<TextView>(R.id.resultTv)
        resultTv.text = "Nama       : "+nama+"\nNim          : "+nim+"\nNilai         : "+nilai+"\nKeterangan: "+ket

    }
}
