package com.mariovaladez.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mariovaladez.recyclerview.Adapter.Lista_Basica_Adapter
import com.mariovaladez.recyclerview.Provider.Lista_Basica_Provider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()
    }

    fun initRecyclerView(){
        val recyclerView = findViewById<RecyclerView>(R.id.rv_lista_basica)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = Lista_Basica_Adapter(Lista_Basica_Provider.listaBasicaList)

    }
}