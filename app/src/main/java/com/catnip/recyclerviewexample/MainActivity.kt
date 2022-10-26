package com.catnip.recyclerviewexample

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.catnip.recyclerviewexample.adapter.AnotherPeopleAdapter
import com.catnip.recyclerviewexample.data.DummyPeopleDataSource
import com.catnip.recyclerviewexample.data.PeopleDataSource
import com.catnip.recyclerviewexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
/*    private val adapter : PeopleListAdapter by lazy {
        PeopleListAdapter(object : PeopleAdapterListener{
            override fun onItemClicked(item: People) {
                Toast.makeText(this@MainActivity, item.name, Toast.LENGTH_SHORT).show()
            }
        })
    }*/

    private val adapter: AnotherPeopleAdapter by lazy {
        AnotherPeopleAdapter {
            Toast.makeText(this@MainActivity, it.name, Toast.LENGTH_SHORT).show()
        }
    }
    private val dataSource: PeopleDataSource by lazy {
        DummyPeopleDataSource()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupList()
    }

    private fun setupList() {
        binding.rvPeople.apply {
            adapter = this@MainActivity.adapter
        }
        //adapter.setItemData(dataSource.getPeople())
        adapter.setItems(dataSource.getPeople())
    }


}