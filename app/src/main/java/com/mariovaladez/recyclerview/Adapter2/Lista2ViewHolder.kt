package com.mariovaladez.recyclerview.Adapter2

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mariovaladez.recyclerview.Lista2DataClass
import com.mariovaladez.recyclerview.databinding.ItemLista2Binding

class Lista2ViewHolder(view: View):RecyclerView.ViewHolder(view)  {
    val binding = ItemLista2Binding.bind(view)

    fun render(lista2model: Lista2DataClass, onClickListener: (Lista2DataClass) -> Unit){
        binding.tvID2.text= lista2model.ID.toString()
        binding.tvNombre.text = lista2model.Nombre
        binding.Apellido.text = lista2model.Apellido
        Glide.with(binding.ivLista2.context).load(
            lista2model.foto
        ).into(binding.ivLista2)
        itemView.setOnClickListener {
            onClickListener(lista2model)
        }

    }
}