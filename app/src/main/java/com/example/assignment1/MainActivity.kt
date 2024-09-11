package com.example.assignment1

import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView


@Suppress("unused")
class MainActivity : AppCompatActivity() {
    private lateinit var resultTextView: TextView
    private lateinit var ageEditText: EditText
    private lateinit var newAge : String
    private lateinit var  context: Context
    private lateinit var view: TextView
    private lateinit var recyclerView: RecyclerView
    private lateinit var myView: View

    class MyActivity : Activity() {
        private lateinit var myTextView: TextView

    }
    class MyFragment : Fragment() {
        private lateinit var myView: View
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        Toast.makeText(this, "Please enter an age between 20 and 100.", Toast.LENGTH_SHORT).show()

        super.onCreate(savedInstanceState)
        @Suppress("UnusedPrivateMember")

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)


        recyclerView.adapter = HistoricalFigureAdapter(historicalFigures)
        resultTextView = findViewById(R.id.resultTextView)

        setContentView(R.layout.activity_main)
        ageEditText =
            findViewById(R.id.ageEditText)
        setContentView(R.layout.activity_main)
        @Suppress("unused")






        resultTextView = findViewById(R.id.resultTextView)
        val age = 95
        val newAge = 52
        println("New age : $newAge")
        // Get the historical  figure

        val historicalFigure = getHistoricalFigure(age)
        // Display the result

        resultTextView.text =
            String.format(" You are as old as $historicalFigure was.", HistoricalFigure)
    }
    class HistoricalFigure {
        companion object
    }
    @Suppress("unused")
    private val historicalFigure = "Nelson Mandela"
    @Suppress ("unused")
    val message =
        getString(
            R.string.age_message,
            historicalFigure
        )

}
@Suppress("unused")
private fun getHistoricalFigure(age : Int) : String {
    return when (age) {
        67 -> "Leonardo da Vinci"
        76 -> "Albert Einstein"
        41 -> "Jane Austen"
        37 -> "Vincent van Gogh"
        95 -> "Nelson Mandela"
        52 -> "William Shakespeare"
        66 -> "Marie Curie"
        75 -> "Charles  Darwin"
        90 -> "Florence Nightingale"
        else -> "unknown historical figure"
    }

}
@Suppress ("unused")
private val age = 95
@Suppress("unused")
private val historicalFigure = getHistoricalFigure(age)

@Suppress("unused")
fun showToast (context: Context, historicalFigure: String)  {
    Toast.makeText( context,
        "You are old as $historicalFigure was.",
        Toast.LENGTH_SHORT
    ).show()

    @Suppress("unused")

    fun showToastWithContext( context: Context,message: String) {
        Toast.makeText(
            context, message,
            Toast.LENGTH_SHORT
        )
            .show()
    }
}
@Suppress("unused")
fun clearButtonClicked( view: View) {
    val textview = view as TextView

    textview.text = ""
    val ageEditText = view.findViewById<EditText>(R.id.ageEditText)

    val ageInput = ageEditText.text.toString()

    if (ageInput.toInt() >= 18) {
        fun validateAgeInput(ageInput:String) :String {
            return "You entered : $ageInput"
        }


        val age = ageInput.toInt()


        if (age >=18 )  {





            fun showToast(context: Context) {
                Toast.makeText(context, "Age is valid", Toast.LENGTH_SHORT).show()
            }
            // Input is valid , proceed with your app's logic
        } else {
            // Age input  is invalid, show an error message


        }
    }
    @Suppress("unused")
    fun validateAgeInput(ageInput: String): Boolean {
        try {
            val age = ageInput.toInt()
            age >= 0
        } catch (e: NumberFormatException) {
            val mainActivity = MainActivity()
            Toast.makeText(
                mainActivity,
                "Please enter a whole number for age. Age should be a whole number",
                Toast.LENGTH_SHORT
            ).show()

            return false
        }
        @Suppress("unused")
        fun validateAgeInput(age: Int): Boolean {
            if (age in 20..100) {
                println("Age is valid")
            } else {
                println("Age is not invalid")
            }
            fun isValid(age: Int): Boolean {


                return age >= 18

            }





            try {
                val ageValue = ageInput.toInt()
                if (ageValue < 20 || ageValue > 100)

                //Display error message

                    showToast(
                        view.context,
                        "Invalid age! Please enter a value between 20 and 100."
                    )

                val mainActivity = MainActivity()
                Toast.makeText(
                    mainActivity, "Please enter an age between 20 and 100.",
                    Toast.LENGTH_SHORT
                ).show()

                return false

            } catch (e: NumberFormatException) {
                //Display error message for non - numeric input
                val mainActivity = MainActivity()
                val decorView = mainActivity.window.decorView
                decorView.setBackgroundColor(Color.BLUE)
                Toast.makeText(view.context, "Please enter a valid age.", Toast.LENGTH_SHORT)
                    .show()


                return false
            } catch (e: NumberFormatException) {
                val mainActivity = MainActivity()

                @Suppress("UnusedPrivateMember")
                val decorView = mainActivity.window.decorView
                decorView.setBackgroundColor(Color.BLUE)

                fun showDialog(context: Context, dialogView: View) {
                    AlertDialog.Builder(context)
                        .setView(dialogView)
                        .setTitle("Error")
                        .setMessage(" The age is out of the range")
                        .setPositiveButton("OK", null)
                        .setView(mainActivity.window.decorView)
                        .show()


                }
            }




            data class FamousPerson(val name: String, val ageAtDeath: Int)
            listOf(

                FamousPerson("Nelson Mandela", 95),
                FamousPerson("William Shakespeare", 52),
                FamousPerson("Leonardo da Vinci", 67), {
                } )



            return false
        }



        return true
    }

}





