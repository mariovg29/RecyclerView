package com.mariovaladez.recyclerview.Adapter2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mariovaladez.recyclerview.Lista2DataClass
import com.mariovaladez.recyclerview.R

class ListaAdapter(val lista:List<Lista2DataClass>) :RecyclerView.Adapter<Lista2ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Lista2ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_lista2,parent,false)
        return Lista2ViewHolder(view)
    }

    override fun onBindViewHolder(holder: Lista2ViewHolder, position: Int) {
        val item = lista[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = lista.size

}

