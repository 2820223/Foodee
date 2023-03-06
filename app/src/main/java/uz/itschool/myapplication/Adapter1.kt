package uz.itschool.myapplication

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.appcompat.view.menu.MenuAdapter
import androidx.recyclerview.widget.RecyclerView

class Adapter1(context: Context, var info:MutableList<Food>) : ArrayAdapter<Food>(context, R.layout.rv1_activity, info) {


    class myHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    }

    fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuAdapter {

    }

    fun onBindViewHolder(holder: MenuAdapter, position: Int) {
        TODO("Not yet implemented")
    }

    fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}