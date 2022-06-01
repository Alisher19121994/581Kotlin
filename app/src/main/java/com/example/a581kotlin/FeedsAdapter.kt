package com.example.a581kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class FeedsAdapter(var context: Context, var feedsList: ArrayList<Feeds>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.feeds, parent, false)
        return FeedsViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val feeds = feedsList[position]
        if (holder is FeedsViewHolder) {
            holder.profile.setImageResource(feeds.profile)
            holder.posts_photo_id.setImageResource(feeds.postsPhoto)
            holder.fullname.text = feeds.fullname
            holder.feeds_tv_id.text = feeds.ids
        }
    }

    override fun getItemCount(): Int {
        return feedsList.size
    }

    inner class FeedsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var profile: ShapeableImageView = itemView.findViewById(R.id.feeds_profile_id)
        var posts_photo_id: ShapeableImageView = itemView.findViewById(R.id.feeds_posts_photo_id)
        var fullname: TextView = itemView.findViewById(R.id.feeds_tv_fullname)
        var feeds_tv_id: TextView = itemView.findViewById(R.id.feeds_tv_id)

    }
}