package com.example.assignment1


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView



 class HistoricalFigureAdapter(private val figures : List<HistoricalFigure>) :
        RecyclerView.Adapter<HistoricalFigureViewHolder> () {
     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
             HistoricalFigureViewHolder {

         val view = LayoutInflater.from(parent.context)
             .inflate(R.layout.histrorical_figure_item , parent, false)
         return HistoricalFigureViewHolder(view)
     }

     override fun onBindViewHolder(holder: HistoricalFigureViewHolder, position: Int) {
         TODO("Not yet implemented")

     }

     override fun getItemCount(): Int {
         return  figures. size

     }


 }








