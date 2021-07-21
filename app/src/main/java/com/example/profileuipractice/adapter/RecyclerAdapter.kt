package com.example.profileuipractice.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.profileuipractice.R


class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private var titles = (arrayOf("Cat", "House", "Doge", "Buff Boi", "Cheem"))

    private var details = arrayOf("Description Uno", "Description Dos", "Description Tres", "Description Quatro", "Description I ran out of spanish.")

    private var images = intArrayOf(R.drawable.cat, R.drawable.house, R.drawable.doge, R.drawable.buffboi, R.drawable.cheem)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.profileTitle.text = titles[position]
        holder.profileDetail.text = details[position]
        holder.profileImage.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var profileImage: ImageView
        var profileTitle: TextView
        var profileDetail: TextView

        init {
            profileImage = itemView.findViewById(R.id.profile_image)
            profileTitle = itemView.findViewById(R.id.profile_title)
            profileDetail = itemView.findViewById(R.id.profile_detail)

        }
    }
}