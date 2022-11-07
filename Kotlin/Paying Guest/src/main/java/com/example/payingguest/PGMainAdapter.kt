package com.example.payingguest

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView


class PGMainAdapter(val context: Context, val data: List<Pg>) : RecyclerView.Adapter<PGMainAdapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.pgmain_adapter,parent,false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        //Binding data to layout we fetched from data list
        val pgData=data.get(position)
        holder.pgname.text=pgData.pg_name
        holder.location.text=pgData.location
        holder.price.text=pgData.price
        holder.image.setImageResource(pgData.image)

        holder.linearlayout.setOnClickListener{
            var intent = Intent(context, DetailedPgMain::class.java)
           intent.putExtra("pgId",pgData.id.toString())
            context.startActivity(intent)

        }

    }

    override fun getItemCount(): Int {
        return data.size
    }


    class ViewHolder(view: View):RecyclerView.ViewHolder(view){

        //Fetching names from pgmainadapterlayout
        var pgname=view.findViewById<TextView>(R.id.pgname)
        var location=view.findViewById<TextView>(R.id.location)
        var price=view.findViewById<TextView>(R.id.price)
        var image=view.findViewById<ImageView>(R.id.image)
        var linearlayout=view.findViewById<ConstraintLayout>(R.id.linearLayout)


    }

}



