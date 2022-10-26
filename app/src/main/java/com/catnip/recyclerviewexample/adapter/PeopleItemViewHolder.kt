package com.catnip.recyclerviewexample.adapter

import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.catnip.recyclerviewexample.databinding.ItemPeopleBinding
import com.catnip.recyclerviewexample.model.People

/**
Written with love by Muhammad Hermas Yuda Pamungkas
Github : https://github.com/hermasyp
 **/
class PeopleItemViewHolder(
    private val binding: ItemPeopleBinding,
    private val listener: PeopleAdapterListener
) :
    RecyclerView.ViewHolder(binding.root) {

    fun bindView(item: People) {
        binding.ivProfilePict.load(item.profilePictUrl)
        binding.tvPersonName.text = item.name
        binding.tvPersonJob.text = item.job
/*        itemView.setOnClickListener {
            Toast.makeText(itemView.context, item.name, Toast.LENGTH_SHORT).show()
        }*/
        itemView.setOnClickListener {
            listener.onItemClicked(item)
        }
    }
}