package com.mariovaladez.recyclerview.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mariovaladez.recyclerview.Lista3DataClass
import com.mariovaladez.recyclerview.R

class AdapterLista3(val lista :List<Lista3DataClass>):RecyclerView.Adapter<ViewHolderLista3>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderLista3 {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_lista3,parent,false)
        return ViewHolderLista3(view)
    }

    override fun onBindViewHolder(holder: ViewHolderLista3, position: Int) {
        val item = lista[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = lista.size
}