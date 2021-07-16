package com.example.mycontactsapp

import android.content.Context
import android.content.Intent
import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class PersonRvAdapter (var contact:List<Person>,var context:Context):RecyclerView.Adapter<coursesViewholder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): coursesViewholder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.person_list_item,parent,false)
        return coursesViewholder(itemView)
    }

    override fun onBindViewHolder(holder: coursesViewholder, position: Int) {
        var currentCourse=contact.get(position)
        holder.tvName.text=currentCourse.Name
        holder.tvEmail.text=currentCourse.Email
        holder.tvPhoneNum.text=currentCourse.PhoneNumber
        Picasso.get()
            .load(currentCourse.imageUrl)
            .resize(80,80)
            .centerCrop()
            .into(holder.ivContact)
        holder.cvPerson.setOnClickListener {
            var intent = Intent(context, contactdetailactivity::class.java)
            intent.putExtra("name", currentCourse.Name)
            context.startActivity(intent)

            var intent2=Intent(context,contactdetailactivity::class.java)
            intent2=intent2.putExtra("PhoneNumber",currentCourse.PhoneNumber)
            context.startActivity(intent2)

            var intent3=Intent(context,contactdetailactivity::class.java)
            intent3=intent3.putExtra("Email",currentCourse.Email)
            context.startActivity(intent3)

        }
        }
    override fun getItemCount(): Int {
        return contact.size
    }
    }





class coursesViewholder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvEmail=itemView.findViewById<TextView>(R.id.tvEmail)
    var tvPhoneNum=itemView.findViewById<TextView>(R.id.tvPhoneNum)
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var ivContact=itemView.findViewById<ImageView>(R.id.ivContact)
    var cvPerson=itemView.findViewById<CardView>(R.id.cvPerson)
}