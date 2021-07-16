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
            Person("stellachepchumbah@gmail.com","0733453535","Stella",imageUrl = "https://media.istockphoto.com/photos/beautiful-african-american-female-model-picture-id910856488?k=6&m=910856488&s=612x612&w=0&h=r2YM9JLkSKBbs6gRrpUtK0ywxL7I9Vrt8cZELskqfs4="),
            Person("wakanda@gmail.com","0714255456","John Wakanda","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRj9re02eEwRzJLxzBa--iBtengke5V90jXjuGN1E_fbehutmU8IDBIN68vwSsZme0PE14&usqp=CAU"),
            Person("Keysher@gmail.com","0189795376","Kelly","https://thumbs.dreamstime.com/b/beauty-black-skin-woman-african-ethnic-female-face-young-african-american-model-long-afro-hair-lux-model-beauty-black-skin-163819635.jpg"),
            Person("jumajune@gmail.com","086521223","Juma","https://previews.123rf.com/images/kiuikson/kiuikson1811/kiuikson181100023/112441663-beauty-portrait-of-young-adult-african-american-woman-with-afro-hairstyle-looking-at-camera-isolated.jpg"),
            Person("susan@gmail.com","0733453535","Sue","https://img.freepik.com/free-photo/beautiful-afro-woman_186382-11204.jpg?size=626&ext=jpg"),
        Person("weyler@gmail.com","0714255456","Amanda way","https://thumbs.dreamstime.com/b/beautiful-black-girl-touching-face-young-woman-perfect-skin-natural-make-up-beauty-shot-isolated-white-background-copy-93268524.jpg"),

            )
        rvcourse=findViewById(R.id.rvContact)
        var coursesAdapter=PersonRvAdapter(courseList,baseContext)
        rvcourse.layoutManager= LinearLayoutManager(baseContext)
        rvcourse.adapter=coursesAdapter

    }
}
