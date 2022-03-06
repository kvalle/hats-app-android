package com.example.hats.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hats.R
import com.example.hats.model.HatType

class HatTypeAdapter(private val context: Context, private val dataset: List<HatType>) :
    RecyclerView.Adapter<HatTypeAdapter.HatTypeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HatTypeViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.hat_list_item, parent, false)

        return HatTypeViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: HatTypeViewHolder, position: Int) {
        val hatType = dataset[position]
        holder.nameTextView.text = context.resources.getString(hatType.name)
        holder.imageView.setImageResource(hatType.image)
    }

    override fun getItemCount() = dataset.size

    class HatTypeViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val nameTextView: TextView = view.findViewById(R.id.hat_type_name)
        val imageView: ImageView = view.findViewById(R.id.hat_type_image)
    }

}