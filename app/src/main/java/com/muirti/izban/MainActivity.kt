package com.muirti.izban

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.muirti.izban.view.IzbanListActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "MURAT BABBA'NIN YERİ", Toast.LENGTH_SHORT).show()
        btn1.setOnClickListener {
            intent= Intent(this,IzbanListActivity::class.java)
            startActivity(intent)
        }



    }
}