package com.example.mycontactsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.squareup.picasso.Picasso

class contactdetailactivity : AppCompatActivity() {
    lateinit var tvName:TextView
    lateinit var image:ImageView
    lateinit var phone: TextView
    lateinit var Email:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contactdetailactivity)
        tvName.findViewById<TextView>(R.id.tvName)
        phone.findViewById<TextView>(R.id.tvPhoneNum)
        Email.findViewById<TextView>(R.id.tvEmail)
        image.findViewById<ImageView>(R.id.imageView)


        var name=intent.getStringExtra("name")
        var phone2=intent.getStringExtra("phoneNumber")
        var Email2=intent.getStringExtra("Email")
        var image2=intent.getStringExtra("image").toString()


        tvName.text=name
        phone.text=phone2
        Email.text=Email2

        Picasso.get()
            .load(image2)
            .into(image)

    }


}