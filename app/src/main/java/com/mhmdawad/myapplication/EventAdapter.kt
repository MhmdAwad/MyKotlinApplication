package com.mhmdawad.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mhmdawad.myapplication.model.Event
import kotlinx.android.synthetic.main.item_event.view.*

class EventAdapter(var eventList: Array<Event>, var clickListener: EventClickListener) :
    RecyclerView.Adapter<EventAdapter.EventViewHolder>() {

    fun updateEventList(event: Array<Event>) {
        this.eventList = event
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = EventViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_event, parent, false)
    )

    override fun getItemCount(): Int =
        if (eventList.isEmpty()) {
            0
        } else {
            eventList.size
        }

    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
        holder.bind(eventList[position], position, clickListener)
    }

    class EventViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var eventImg: ImageView = itemView.img_event
        var titleTv: TextView = itemView.tv_title

        fun bind(event: Event, position: Int, clickListener: EventClickListener) {
            eventImg.setImageResource(event.imgResource)
            titleTv.text = event.title

            itemView.setOnClickListener { clickListener.onEventClick(event, position) }

        }
    }

}