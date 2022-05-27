package com.mariovaladez.recyclerview.Adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mariovaladez.recyclerview.Lista3DataClass
import com.mariovaladez.recyclerview.Provider.ProviderLista3.Companion.lista3
import com.mariovaladez.recyclerview.databinding.ItemLista3Binding

class ViewHolderLista3(view:View):RecyclerView.ViewHolder(view){

    val binding = ItemLista3Binding.bind(view)

    fun render(lista3Model: Lista3DataClass, onClickListener: (Lista3DataClass) -> Unit){

        binding.tvNombre.text = lista3Model.Nombre
        binding.tvDescripcion.text = lista3Model.Descripción
        binding.tvId.text = lista3Model.ID.toString()

        Glide.with(binding.ivLista3.context)
            .load(lista3Model.foto)
            .into(binding.ivLista3)

        itemView.setOnClickListener {
            onClickListener(lista3Model)

        }

    }




}