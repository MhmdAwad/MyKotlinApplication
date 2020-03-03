package com.mhmdawad.myapplication.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mhmdawad.myapplication.R
import kotlinx.android.synthetic.main.item_session.view.*


class SessionAdapter (var sessions: Array<Sessions>): RecyclerView.Adapter<SessionAdapter.SessionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SessionViewHolder =
        SessionViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_session, parent, false)
        )


    override fun onBindViewHolder(holder: SessionViewHolder, position: Int) {
        holder.bind(sessions[position])
    }


    override fun getItemCount(): Int  = sessions.size

    class SessionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private var imgHeader = itemView.img_header
        private var imgInstructor = itemView.img_instructor
        private var nameTv = itemView.tv_name
        private var titleTv = itemView.tv_title
        private var descriptionTv = itemView.tv_description

        fun bind(sessions: Sessions){
            imgHeader.setImageResource(sessions.resources[0])
            imgInstructor.setImageResource(sessions.instructor.imgResource)
            titleTv.text = sessions.title
            nameTv.text = sessions.instructor.name
            descriptionTv.text = sessions.instructor.details

        }
    }

}