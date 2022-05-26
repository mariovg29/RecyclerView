package com.mariovaladez.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.mariovaladez.recyclerview.Adapter2.ListaAdapter
import com.mariovaladez.recyclerview.Providers.ProviderLista2
import com.mariovaladez.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    fun initRecyclerView(){
        val manager = LinearLayoutManager(this)
        binding.rvLista2.adapter = ListaAdapter(ProviderLista2.lista2)
        binding.rvLista2.layoutManager = manager

    }
}