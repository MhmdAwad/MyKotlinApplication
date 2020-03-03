package com.mhmdawad.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.content.Intent
import androidx.recyclerview.widget.DividerItemDecoration
import com.mhmdawad.myapplication.model.DummyData
import com.mhmdawad.myapplication.model.Event


class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val rv: RecyclerView = findViewById(R.id.rv)
        rv.layoutManager = LinearLayoutManager(this)
        val adapter = EventAdapter(DummyData.events, object : EventClickListener{
            override fun onEventClick(event: Event, position: Int) {
                intent = Intent(this@HomeActivity, EventActivity::class.java)
                intent.putExtra("pos", position)
                startActivity(intent)
            }
        })
        rv.adapter = adapter
        rv.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
    }
}
