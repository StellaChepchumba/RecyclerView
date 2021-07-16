package com.example.mycontactsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class contactdetailactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contactdetailactivity)
        var name=intent.getStringExtra("name")
        Toast.makeText(baseContext,name,Toast.LENGTH_LONG).show()

        var phone=intent.getStringExtra("phoneNumber")
        Toast.makeText(baseContext,phone,Toast.LENGTH_LONG).show()

        var Email=intent.getStringExtra("Email")
        Toast.makeText(baseContext,Email,Toast.LENGTH_LONG).show()
    }
}