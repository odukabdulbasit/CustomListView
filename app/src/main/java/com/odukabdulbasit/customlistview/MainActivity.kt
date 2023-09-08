package com.odukabdulbasit.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)

        // Sample data
        val data = listOf("Item 1", "Item 2", "Item 3", "Item 4", "Item 5")

        // Create and set the custom adapter
        val adapter = CustomListAdapter(this, data)
        listView.adapter = adapter

    }
}