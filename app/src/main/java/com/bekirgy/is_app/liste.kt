package com.bekirgy.is_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class liste : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_liste)


        val listview= findViewById<ListView>(R.id.listview)
        val names= arrayOf("ANDROID","php","KOTLIN","JAVA","C++")

        val arrayAdapter: ArrayAdapter<String> = ArrayAdapter(

            this, android.R.layout.simple_list_item_1,names
        )
        
        listview.adapter=arrayAdapter
        listview.setOnItemClickListener { parent, view, position, id ->

            Toast.makeText(this, "Secili item: "+names[position],Toast.LENGTH_LONG).show()
        }
    }

    fun recgec(view:View){
        val intent= Intent(this,recview::class.java)
        startActivity(intent)
    }
}