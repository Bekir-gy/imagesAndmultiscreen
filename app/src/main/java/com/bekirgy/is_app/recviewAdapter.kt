package com.bekirgy.is_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class recviewAdapter (val userDataList: ArrayList<ModelUser>): RecyclerView.Adapter
<recviewAdapter.ViewHolder>(){
    class ViewHolder(itenView:View): RecyclerView.ViewHolder(itenView){
        fun bindData(userModel: ModelUser){
            val nameTextView=itemView.findViewById<TextView>(R.id.NameText)
            val ageTextView= itemView.findViewById<TextView>(R.id.AgeText)
            val addresTextView= itemView.findViewById<TextView>(R.id.AddressText)

            nameTextView.text=userModel.name
            ageTextView.text=userModel.age.toString()
            addresTextView.text=userModel.address
        }


    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): recviewAdapter.ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item2,parent,false)


        return  ViewHolder(view)
    }

    override fun onBindViewHolder(holder: recviewAdapter.ViewHolder, position: Int) {
        holder.bindData(userDataList[position])
    }

    override fun getItemCount(): Int {
    return userDataList.size
    }


}
