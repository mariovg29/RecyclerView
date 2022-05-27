package com.mariovaladez.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.mariovaladez.recyclerview.Adapter.AdapterLista3
import com.mariovaladez.recyclerview.Provider.ProviderLista3
import com.mariovaladez.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerview()
    }

    fun initRecyclerview(){

        val manager = LinearLayoutManager(this)
        val decoration = DividerItemDecoration(this,manager.orientation)

        binding.rvLista3.adapter = AdapterLista3(ProviderLista3.lista3) { onItemSelected(it) }
        binding.rvLista3.layoutManager = manager
        binding.rvLista3.addItemDecoration(decoration)


    }
    private fun onItemSelected(lista3selected: Lista3DataClass){
        Toast.makeText(this,lista3selected.Nombre+" "+lista3selected.ID.toString(),Toast.LENGTH_SHORT).show()

    }
}