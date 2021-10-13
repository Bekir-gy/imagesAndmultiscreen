package com.bekirgy.is_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class recview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recview)

        val recyclerView=findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false)


        val usernames= ArrayList<ModelUser>()
        usernames.add(ModelUser("ali",25,"adres1"))
        usernames.add(ModelUser("veli",24,"adres2"))
        usernames.add(ModelUser("antuon",23,"adres3"))
        usernames.add(ModelUser("wicked",22,"adres4"))


            val adapter= recviewAdapter(usernames)
        recyclerView.adapter=adapter
    }
}