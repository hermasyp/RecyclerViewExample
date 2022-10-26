package com.catnip.recyclerviewexample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.catnip.recyclerviewexample.databinding.ItemPeopleBinding
import com.catnip.recyclerviewexample.model.People

/**
Written with love by Muhammad Hermas Yuda Pamungkas
Github : https://github.com/hermasyp
 **/
class PeopleListAdapter(private val listener: PeopleAdapterListener) :
    RecyclerView.Adapter<PeopleItemViewHolder>() {

    private val data = mutableListOf<People>()

    fun setItemData(newData: List<People>) {
        data.clear()
        data.addAll(newData)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeopleItemViewHolder {
        return PeopleItemViewHolder(
            ItemPeopleBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ), listener
        )
    }

    override fun onBindViewHolder(holder: PeopleItemViewHolder, position: Int) {
        holder.bindView(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

}

interface PeopleAdapterListener {
    fun onItemClicked(item: People)
}