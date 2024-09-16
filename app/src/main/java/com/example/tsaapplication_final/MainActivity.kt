package com.example.tsaapplication_final

import android.os.Bundle  // imports listed libraries
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var tapHereButton: Button  // initializes the listed variables and their types
    private lateinit var leftArrow: ImageButton
    private lateinit var rightArrow: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        tapHereButton = findViewById(R.id.tap_here_button)  // ties variables to the listed resource IDs
        leftArrow = findViewById(R.id.left_arrow)
        rightArrow = findViewById(R.id.right_arrow)

        tapHereButton.setOnClickListener {  // sets an OnClickListener to the tapHereButton
            showRandomArrow()  // calls showRandomArrow function
        }

        leftArrow.setOnClickListener {  // sets an OnClickListener to the leftArrow ImageButton
            reset()  // calls reset function
        }

        rightArrow.setOnClickListener {  // sets an OnClickListener to the rightArrow ImageButton
            reset()  // calls reset function
        }

    }

    private fun reset() {  // defines reset function
        leftArrow.visibility = View.INVISIBLE  // changes ImageButton and Button visibility
        rightArrow.visibility = View.INVISIBLE
        tapHereButton.visibility = View.VISIBLE
    }

    private fun showRandomArrow() {  // defines showRandomArrow function
        tapHereButton.visibility = View.INVISIBLE  // changes tapHereButton visibility
        val direction = listOf("left", "right").random()  // initializes direction value that holds a random value from a listOf values
        if (direction == "left") {  // if direction variable is equal to "left"
            leftArrow.visibility = View.VISIBLE  // makes leftArrow ImageButton visible
        } else {
            rightArrow.visibility = View.VISIBLE  // makes rightArrow ImageButton visible
        }
    }

    override fun onPause() {  // defines onPause function
        super.onPause()
        Log.i("Main Activity", "The Activity is paused")  // logCat TAG with message
    }

    override fun onResume() {  // defines onResume function
        super.onResume()
        Log.i("Main Activity", "The Activity is resumed")  // logCat TAG with message 
    }


}
