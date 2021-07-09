package com.example.mycontactsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvcourse: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayContacts()
    }
    fun displayContacts(){
        var courseList= listOf<Person>(
            Person("stellachepchumbah@gmail.com","0733453535","Stella"),
            Person("wakanda@gmail.com","0714255456","John Wakanda"),
            Person("Keysher@gmail.com","0189795376","Kelly"),
            Person("jumajune@gmail.com","086521223","Juma"),
            Person("susan@gmail.com","0733453535","Sue"),
        Person("weyler@gmail.com","0714255456","Amanda way"),

            )
        rvcourse=findViewById(R.id.rvContact)
        var coursesAdapter=PersonRvAdapter(courseList)
        rvcourse.layoutManager= LinearLayoutManager(baseContext)
        rvcourse.adapter=coursesAdapter

    }
}