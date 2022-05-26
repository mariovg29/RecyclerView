package com.mariovaladez.recyclerview.Adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mariovaladez.recyclerview.Lista3DataClass
import com.mariovaladez.recyclerview.databinding.ItemLista3Binding

class ViewHolderLista3(view:View):RecyclerView.ViewHolder(view){

    val binding = ItemLista3Binding.bind(view)

    fun render(lista3: Lista3DataClass){

        binding.tvNombre.text = lista3.Nombre
        binding.tvDescripcion.text = lista3.Descripción
        binding.tvId.text = lista3.ID.toString()

        Glide.with(binding.ivLista3.context)
            .load(lista3.foto)
            .into(binding.ivLista3)

    }




}