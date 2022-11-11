package com

import android.media.Image
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.digibrainmedia.R

class WeekDueAdapter(val mList : ArrayList<WeekDueModel>) : RecyclerView.Adapter<myView>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myView {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.weekduedesing,parent,false)
        return myView(view)
    }

    override fun onBindViewHolder(holder: myView, position: Int) {
        val newList = mList[position]

        holder.logo.setImageResource(newList.logo)
        holder.title.setText(newList.title)
        holder.dueDate.setText(newList.dueDate)
        holder.dueDays.setText(newList.paymentDate)
        holder.amount.setText(newList.amount)
    }

    override fun getItemCount(): Int {
       return mList.size
    }

}

class myView(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val logo = itemView.findViewById<ImageView>(R.id.logo_comp)
    val title = itemView.findViewById<TextView>(R.id.title)
    val dueDate = itemView.findViewById<TextView>(R.id.dueDate)
    val dueDays = itemView.findViewById<TextView>(R.id.dueDays)
    val amount = itemView.findViewById<TextView>(R.id.amount)
}