package com.example.profileuipractice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.profileuipractice.adapter.RecyclerAdapter

class MainActivity : AppCompatActivity() {
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        layoutManager = LinearLayoutManager(this)
        val profileListing = findViewById<RecyclerView>(R.id.profileListing)

        profileListing.layoutManager = layoutManager

        profileListing.adapter = RecyclerAdapter()
        profileListing.setHasFixedSize(true)
    }
}