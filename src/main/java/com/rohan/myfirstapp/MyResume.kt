package com.rohan.myfirstapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MyResume : AppCompatActivity() {
    class MoreDetails : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_my_resume)
        }

        fun myResume(view: View) {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(""))
            startActivity(intent)
        }
    }
}