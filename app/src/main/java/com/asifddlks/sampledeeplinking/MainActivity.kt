package com.asifddlks.sampledeeplinking

import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView = findViewById<TextView>(R.id.textView)

        textView.text = "this is a new course..."


        // getting the data from our
        // intent in our uri.
        // getting the data from our
        // intent in our uri.
        val uri: Uri? = intent.data

        // checking if the uri is null or not.

        // checking if the uri is null or not.
        if (uri != null) {
            // if the uri is not null then we are getting the
            // path segments and storing it in list.
            val parameters: List<String> = uri.getPathSegments()

            // after that we are extracting string from that parameters.
            val param = parameters[parameters.size - 1]

            // on below line we are setting
            // that string to our text view
            // which we got as params.
            textView.text = param
        }
    }
}