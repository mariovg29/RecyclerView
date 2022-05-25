package com.mariovaladez.recyclerview.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mariovaladez.recyclerview.Lista_Basica_DataClass
import com.mariovaladez.recyclerview.R

class Lista_Basica_Adapter(val lista:List<Lista_Basica_DataClass>) :RecyclerView.Adapter<Lista_Basica_ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Lista_Basica_ViewHolder {

        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.lista_basica_item,parent,false)
        return Lista_Basica_ViewHolder(view)



    }

    override fun onBindViewHolder(holder: Lista_Basica_ViewHolder, position: Int) {
        val item = lista[position]
        holder.render(item)

    }

    override fun getItemCount(): Int = lista.size
}