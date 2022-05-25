package com.mariovaladez.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mariovaladez.recyclerview.Adapter.Lista_Basica_Adapter
import com.mariovaladez.recyclerview.Provider.Lista_Basica_Provider
import com.mariovaladez.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        initRecyclerView()
    }

    fun initRecyclerView(){

        binding.rvListaBasica.layoutManager = LinearLayoutManager(this)
        binding.rvListaBasica.adapter = Lista_Basica_Adapter(Lista_Basica_Provider.listaBasicaList)

    }
}