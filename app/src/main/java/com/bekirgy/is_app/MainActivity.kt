package com.bekirgy.is_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var viewPager: ViewPager?= null
    var images= intArrayOf(R.drawable.aquman,R.drawable.batman,R.drawable.ironman,R.drawable.spiderman)
    var vadapter: vAdapter?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager=findViewById<ViewPager>(R.id.viewPager) as ViewPager
        vadapter= vAdapter(this,images)
        viewPager!!.adapter=vadapter

    }

     fun gecisyap(v: View?) {
        val intent= Intent(this,liste::class.java)
        startActivity(intent)
    }


}









