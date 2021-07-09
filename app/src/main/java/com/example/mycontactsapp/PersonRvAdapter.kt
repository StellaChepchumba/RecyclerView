package com.example.mycontactsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PersonRvAdapter (var contact:List<Person>):RecyclerView.Adapter<coursesViewholder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): coursesViewholder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.person_list_item,parent,false)
        return coursesViewholder(itemView)
    }

    override fun onBindViewHolder(holder: coursesViewholder, position: Int) {
        var currentCourse=contact.get(position)
        holder.tvName.text=currentCourse.Name
        holder.tvEmail.text=currentCourse.Email
        holder.tvPhoneNum.text=currentCourse.PhoneNumber
    }

    override fun getItemCount(): Int {
        return contact.size
    }


}
class coursesViewholder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvEmail=itemView.findViewById<TextView>(R.id.tvEmail)
    var tvPhoneNum=itemView.findViewById<TextView>(R.id.tvPhoneNum)
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
}