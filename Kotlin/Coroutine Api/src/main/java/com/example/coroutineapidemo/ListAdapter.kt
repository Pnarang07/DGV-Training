package com.example.coroutineapidemo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.coroutineapidemo.models.MainData
import com.squareup.picasso.Picasso


class ListAdapter(val context: Context, val items:List<MainData>) : RecyclerView.Adapter<ListAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.list_adapter, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        val itemData=items.get(position)

        holder.id.text= itemData.id.toString()
        holder.albumId.text=itemData.albumId.toString()
        Picasso.get().load(itemData.thumbnailUrl).into(holder.image)
        holder.title_.text=itemData.title.toString()
    }

    override fun getItemCount(): Int {

        return items.size
    }

    class ViewHolder(view: View):RecyclerView.ViewHolder(view) {

        var id=view.findViewById<TextView>(R.id.id)
        var albumId=view.findViewById<TextView>(R.id.albumID)
        var title_=view.findViewById<TextView>(R.id.title_)
        var image=view.findViewById<ImageButton>(R.id.image)
    }
}