package com.odukabdulbasit.customlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class CustomListAdapter(context: Context, private val data: List<String>) :
    ArrayAdapter<String>(context, R.layout.list_item, data) {

    // ViewHolder pattern for efficient view recycling
    private class ViewHolder {
        internal var textView: TextView? = null
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var convertView = convertView
        val holder: ViewHolder

        if (convertView == null) {
            // Inflate the custom list item layout
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.list_item, null)

            // Initialize the ViewHolder
            holder = ViewHolder()
            holder.textView = convertView.findViewById(R.id.textView) as TextView
            convertView.tag = holder
        } else {
            // Reuse the existing ViewHolder
            holder = convertView.tag as ViewHolder
        }

        // Set the data for the list item
        val item = data[position]
        holder.textView?.text = item

        return convertView!!
    }
}
