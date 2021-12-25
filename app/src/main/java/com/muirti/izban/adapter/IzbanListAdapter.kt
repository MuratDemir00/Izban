package com.muirti.izban.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.muirti.izban.R
import kotlinx.android.synthetic.main.izban_list_item_layout.view.*

class IzbanListAdapter:RecyclerView.Adapter<IzbanListAdapter.IzbanListHolder>() {
    var izbanList:ArrayList<String> = arrayListOf()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IzbanListAdapter.IzbanListHolder =


       IzbanListHolder(
           LayoutInflater.from(parent.context)
               .inflate(R.layout.izban_list_item_layout,parent,false)
    )




    override fun onBindViewHolder(holder: IzbanListAdapter.IzbanListHolder, position: Int) =holder.bind(izbanList[position])

    override fun getItemCount(): Int =izbanList.size

    inner class IzbanListHolder(view: View):RecyclerView.ViewHolder(view){
        fun bind(s: String) {

        itemView.tv_izbanname.text = s

        }


    }

    fun getData(izbanResponse:ArrayList<String>){
        izbanList.addAll(izbanResponse)
        notifyDataSetChanged()


    }

}