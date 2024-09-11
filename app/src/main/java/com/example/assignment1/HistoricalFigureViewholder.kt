package com.example.assignment1


import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView





 class  HistoricalFigureViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
     val descriptionTextView: TextView = itemView.findViewById(R.id.description_text_view)
     val ageTextView: TextView = itemView.findViewById(R.id.age_text_view)
     val nameTextView: TextView = itemView.findViewById(R.id.name_text_view)

 }
      @Suppress("unused")
      fun onBindViewHolder(holder: HistoricalFigureViewHolder, position: Int) {
         val historicalFigure = historicalFigures[position]
         holder.nameTextView.text = historicalFigure.name

         holder.descriptionTextView. text = historicalFigure.description
         holder.ageTextView.text = historicalFigure.toString ()
          @Suppress("unused")
         data class HistoricalFigureData(val name : String, val description :String,val age: Int)

     }




