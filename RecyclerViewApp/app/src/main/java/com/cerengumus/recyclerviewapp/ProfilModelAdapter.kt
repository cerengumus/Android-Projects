package com.cerengumus.recyclerviewapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatCheckBox
import androidx.recyclerview.widget.RecyclerView

class ProfilModelAdapter(val profilList: MutableList<ProfilModel>) : RecyclerView.Adapter<ProfilModelAdapter.ModelViewHolder>() {
    val selectedItem : Int = -1
    inner class ModelViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val flagImage: ImageView = view.findViewById(R.id.flagImage)
        val checkBox: AppCompatCheckBox = view.findViewById(R.id.check_box)
        fun bindItems(item: ProfilModel) {
            flagImage.setImageResource(item.flagImage)
            checkBox.setButtonDrawable(item.checkBox)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModelViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_profile_card_view, parent, false)
        return ModelViewHolder(view)
    }

    override fun getItemCount(): Int {
        return profilList.size
    }

    override fun onBindViewHolder(holder: ModelViewHolder, position: Int) {
        holder.bindItems(profilList.get(position))
    }
}