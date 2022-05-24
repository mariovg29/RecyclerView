package com.mariovaladez.recyclerview.Adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mariovaladez.recyclerview.Lista_Basica_DataClass
import com.mariovaladez.recyclerview.Provider.Lista_Basica_Provider
import com.mariovaladez.recyclerview.R

class Lista_Basica_ViewHolder( view:View):RecyclerView.ViewHolder(view) {


    val foto     = view.findViewById<ImageView>(R.id.iv_lista_basica_foto)
    val nombre   = view.findViewById<TextView>(R.id.tv_lista_basica_nombre)
    val apellido = view.findViewById<TextView>(R.id.tv_lista_basica_apellido)
    val id       = view.findViewById<TextView>(R.id.tv_lista_basica_id)

    fun render(lista_basica_model:Lista_Basica_DataClass){

        nombre.text = lista_basica_model.Nombre
        apellido.text = lista_basica_model.Apellido
        id.text = lista_basica_model.id.toString()
        Glide.with(foto.context).load(lista_basica_model.foto).into(foto)







    }
}