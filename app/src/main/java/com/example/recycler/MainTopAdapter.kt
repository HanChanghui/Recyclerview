package com.example.recycler

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MainTopAdapter(private val context: Context) :
	RecyclerView.Adapter<MainTopAdapter.ViewHolder>() {
	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
		val binding = ListItemBinding.from(context).inflate(R.layout.item_main_top, parent, false)
		return ViewHolder(view)
	}

	override fun onBindViewHolder(holder: ViewHolder, position: Int) {

	}

	override fun getItemCount(): Int {
		return 0
	}

	inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

	}


}