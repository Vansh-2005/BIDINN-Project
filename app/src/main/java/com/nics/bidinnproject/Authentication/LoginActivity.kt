package com.nics.bidinnproject.Authentication

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.text.style.LeadingMarginSpan
import android.text.style.StyleSpan
import android.widget.Button
import android.widget.EditText
import com.nics.bidinnproject.MainActivity
import com.nics.bidinnproject.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val editTextMobile: EditText = findViewById(R.id.editTextMobile)
        val buttonSubmit = findViewById<Button>(R.id.buttonSubmit)
        val hint = "+91 | Mobile Number"

        val spannableString = SpannableString(hint)
        val blackColor = Color.BLACK
        val marginLeft = 16

// Set the color of "+91" to black
        spannableString.setSpan(ForegroundColorSpan(blackColor), 0, 4, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

// Set the left margin of "+91" using a leading margin span
        spannableString.setSpan(LeadingMarginSpan.Standard(marginLeft, 0), 0, 4, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        editTextMobile.hint = spannableString



        buttonSubmit.setOnClickListener {
            // Create a Dialog or a custom view with transparent background
            val intent = Intent(this, MainActivity::class.java)

            // Start the new activity
            startActivity(intent)
        }


    }
}