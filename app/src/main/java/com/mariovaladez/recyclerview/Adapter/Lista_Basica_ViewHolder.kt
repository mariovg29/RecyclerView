package com.mariovaladez.recyclerview.Adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mariovaladez.recyclerview.Lista_Basica_DataClass
import com.mariovaladez.recyclerview.Provider.Lista_Basica_Provider
import com.mariovaladez.recyclerview.R
import com.mariovaladez.recyclerview.databinding.ListaBasicaItemBinding

class Lista_Basica_ViewHolder( view:View):RecyclerView.ViewHolder(view) {

    val binding = ListaBasicaItemBinding.bind(view)

    fun render(lista_basica_model:Lista_Basica_DataClass){

        binding.tvListaBasicaNombre.text = lista_basica_model.Nombre
        binding.tvListaBasicaApellido.text = lista_basica_model.Apellido
        binding.tvListaBasicaId.text = lista_basica_model.id.toString()
        Glide.with(binding.ivListaBasicaFoto.context)
            .load(lista_basica_model.foto)
            .into(binding.ivListaBasicaFoto)

        binding.ivListaBasicaFoto.setOnClickListener { Toast.makeText(
            binding.ivListaBasicaFoto.context,
            lista_basica_model.Nombre+" "+lista_basica_model.id,
            Toast.LENGTH_SHORT
        ).show()
        }

        itemView.setOnClickListener {
            Toast.makeText(
                binding.ivListaBasicaFoto.context,
                lista_basica_model.Apellido,
                Toast.LENGTH_SHORT
            ).show()
        }

    }
}