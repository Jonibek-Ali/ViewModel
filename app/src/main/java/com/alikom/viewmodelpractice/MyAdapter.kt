package com.alikom.viewmodelpractice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val dataSet: MutableList<Model>) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    private val items = ArrayList<Model>()

    fun updateItems(items: List<Model>) {
        this.items.clear()
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    fun addData(newItem: Model) {
        dataSet.add(newItem)
        notifyItemInserted(dataSet.size - 1)
    }

    fun removeItem(position: Int) {
        dataSet.removeAt(position)
        notifyItemRemoved(position)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val icon: ImageView = view.findViewById(R.id.card_icon)
        private val name: TextView = view.findViewById(R.id.card_name)
        private val balance: TextView = view.findViewById(R.id.balance)
        private val number: TextView = view.findViewById(R.id.card_number)

        fun bind(item: Model) {
            icon.setImageResource(item.icon)
            name.text = item.name
            balance.text = item.balance
            number.text = item.number
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.viewpager_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dataSet[position])

    }


    override fun getItemCount() = dataSet.size

}

