package com.cerengumus.recyclerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.GridLayoutManager




class RecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        val recyclerview = findViewById<RecyclerView>(R.id.recycler_view)
        val gridLayoutManager = GridLayoutManager(applicationContext, 3)
        recyclerview.setLayoutManager(gridLayoutManager)
        recyclerview.adapter = ProfilModelAdapter(getModels())
    }
    fun getModels(): MutableList<ProfilModel> {

        val models = mutableListOf(
            ProfilModel(R.drawable.ic_drawable_avatar_1,1),
            ProfilModel(R.drawable.ic_drawable_avatar_2,2),
            ProfilModel(R.drawable.ic_drawable_avatar_3,3),
            ProfilModel(R.drawable.ic_drawable_avatar_4,4),
            ProfilModel(R.drawable.ic_drawable_avatar_5,5),
            ProfilModel(R.drawable.ic_drawable_avatar_6,6),
            ProfilModel(R.drawable.ic_drawable_avatar_7,7),
            ProfilModel(R.drawable.ic_drawable_avatar_8,8),
            ProfilModel(R.drawable.ic_drawable_avatar_9,9),
            ProfilModel(R.drawable.ic_drawable_avatar_1,1),
            ProfilModel(R.drawable.ic_drawable_avatar_2,2),
            ProfilModel(R.drawable.ic_drawable_avatar_3,3),
            ProfilModel(R.drawable.ic_drawable_avatar_4,4),
            ProfilModel(R.drawable.ic_drawable_avatar_5,5),
            ProfilModel(R.drawable.ic_drawable_avatar_6,6),
            ProfilModel(R.drawable.ic_drawable_avatar_7,7),
            ProfilModel(R.drawable.ic_drawable_avatar_8,8),
            ProfilModel(R.drawable.ic_drawable_avatar_9,9),
            ProfilModel(R.drawable.ic_drawable_avatar_1,1),
            ProfilModel(R.drawable.ic_drawable_avatar_2,2),
            ProfilModel(R.drawable.ic_drawable_avatar_3,3),
            ProfilModel(R.drawable.ic_drawable_avatar_4,4),
            ProfilModel(R.drawable.ic_drawable_avatar_5,5),
            ProfilModel(R.drawable.ic_drawable_avatar_6,6),
            ProfilModel(R.drawable.ic_drawable_avatar_7,7),
            ProfilModel(R.drawable.ic_drawable_avatar_8,8),
            ProfilModel(R.drawable.ic_drawable_avatar_9,9),
            ProfilModel(R.drawable.ic_drawable_avatar_1,1),
            ProfilModel(R.drawable.ic_drawable_avatar_2,2),
            ProfilModel(R.drawable.ic_drawable_avatar_3,3),
            ProfilModel(R.drawable.ic_drawable_avatar_4,4),
            ProfilModel(R.drawable.ic_drawable_avatar_5,5),
            ProfilModel(R.drawable.ic_drawable_avatar_6,6),
            ProfilModel(R.drawable.ic_drawable_avatar_7,7),
            ProfilModel(R.drawable.ic_drawable_avatar_8,8),
            ProfilModel(R.drawable.ic_drawable_avatar_9,9),
            ProfilModel(R.drawable.ic_drawable_avatar_1,1),
            ProfilModel(R.drawable.ic_drawable_avatar_2,2),
            ProfilModel(R.drawable.ic_drawable_avatar_3,3),
            ProfilModel(R.drawable.ic_drawable_avatar_4,4),
            ProfilModel(R.drawable.ic_drawable_avatar_5,5),
            ProfilModel(R.drawable.ic_drawable_avatar_6,6),
            ProfilModel(R.drawable.ic_drawable_avatar_7,7),
            ProfilModel(R.drawable.ic_drawable_avatar_8,8),
            ProfilModel(R.drawable.ic_drawable_avatar_9,9),

        )
        return models
    }
}