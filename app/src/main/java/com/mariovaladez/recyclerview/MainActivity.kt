package com.mariovaladez.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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
        setContentView(binding.root)
        initRecyclerView()
    }

    fun initRecyclerView(){

        binding.rvListaBasica.layoutManager = LinearLayoutManager(this)
        binding.rvListaBasica.adapter = Lista_Basica_Adapter(Lista_Basica_Provider.listaBasicaList) { listabasica ->
            onItemSelected(
                listabasica
            )
        }

    }
    fun onItemSelected(listaBasica:Lista_Basica_DataClass){
        Toast.makeText(
            this,
            listaBasica.Nombre+" "+listaBasica.id,
            Toast.LENGTH_SHORT
        ).show()

    }
}