package com.rohan.myfirstapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

        override fun onCreateOptionsMenu(menu: Menu?): Boolean {
            val inflaror = menuInflater.inflate(R.menu.my_menu, menu)
            return true
        }

        override fun onOptionsItemSelected(item: MenuItem): Boolean {
            when (item.itemId) {
                R.id.myResume -> {
                    val intent = Intent(this@MainActivity, MyResume::class.java)
                    startActivity(intent)
                }
                R.id.exit -> {
                    finish()
                }
            }
            return super.onOptionsItemSelected(item)
        }

        fun gitHub(view : View) {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("www.github.com/RMandhani1"))
            startActivity(intent)
        }

        fun instagram(view : View) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/thedaintybiped/"))
        startActivity(intent)
        }

        fun twitter(view: View){
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/rohan_mandhani7"))
            startActivity(intent)
        }

        fun linkedin(view: View){
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/rohan-mandhani-8ba5a6214/"))
            startActivity(intent)
        }

        fun snapchat(view: View){
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.snapchat.com"))
            startActivity(intent)
        }

        fun youtube(view: View){
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCYU5CYQ2HpOXoEkK7ka3JzA"))
            startActivity(intent)
        }

        fun gmail(view: View){
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://mail.google.com/"))
            startActivity(intent)
        }

        fun facebook(view: View){
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/rmandhani1/"))
            startActivity(intent)
        }

        fun share(view: View){
            Toast.makeText(this, "Feature Coming Soon", Toast.LENGTH_SHORT).show()
        }

        fun discord(view: View){
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://support.discord.com/hc/en-us"))
            startActivity(intent)
        }
    }
