package com.dicoding.myintentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ViewActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)

        val btnBuy: Button = findViewById(R.id.btn_buy)
        btnBuy.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_buy) {
            val backMain = Intent(this, MainActivity::class.java)
            startActivity(backMain)
        }
    }
}