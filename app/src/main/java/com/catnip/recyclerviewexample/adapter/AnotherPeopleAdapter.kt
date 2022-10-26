package com.catnip.recyclerviewexample.adapter;

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.catnip.recyclerviewexample.databinding.ItemPeopleBinding
import com.catnip.recyclerviewexample.model.People

/**
Written with love by Muhammad Hermas Yuda Pamungkas
Github : https://github.com/hermasyp
 **/
class AnotherPeopleAdapter(private val itemClick: (People) -> Unit) :
    RecyclerView.Adapter<AnotherPeopleAdapter.PeopleViewHolder>() {


    private var items: MutableList<People> = mutableListOf()

    fun setItems(items: List<People>) {
        clearItems()
        addItems(items)
        notifyDataSetChanged()
    }

    fun addItems(items: List<People>) {
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    fun clearItems() {
        this.items.clear()
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeopleViewHolder {
        val binding = ItemPeopleBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PeopleViewHolder(binding, itemClick)
    }

    override fun onBindViewHolder(holder: PeopleViewHolder, position: Int) {
        holder.bindView(items[position])
    }

    override fun getItemCount(): Int = items.size


    class PeopleViewHolder(
        private val binding: ItemPeopleBinding,
        val itemClick: (People) -> Unit
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bindView(item: People) {
            with(item) {
                binding.ivProfilePict.load(item.profilePictUrl)
                binding.tvPersonName.text = item.name
                binding.tvPersonJob.text = item.job
                itemView.setOnClickListener { itemClick(this) }
            }

        }
    }

}