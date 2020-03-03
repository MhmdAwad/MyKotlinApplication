package com.mhmdawad.myapplication

import com.mhmdawad.myapplication.model.Event

interface EventClickListener {
     fun onEventClick(event: Event, position: Int)
}