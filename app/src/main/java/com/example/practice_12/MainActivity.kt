package com.example.practice_12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onRadioButtonClicked (view:View){
        val image : ImageView = findViewById(R.id.imageView)
        when(view.id){
            R.id.radioButton ->  image.setImageResource(R.drawable.yabloko)
            R.id.radioButton2 -> image.setImageResource(R.drawable.vino)
            R.id.radioButton3 -> image.setImageResource(R.drawable.grusha)

        }

    }

    fun onCheckBoxClicked(view: View) {
        val image : ImageView = findViewById(R.id.imageView2)
        val image1 : ImageView = findViewById(R.id.imageView4)
        val image2 : ImageView = findViewById(R.id.imageView5)
        when(view.id){
            R.id.checkBox ->  image.setImageResource(R.drawable.yabloko)
            R.id.checkBox2 -> image1.setImageResource(R.drawable.grusha)
            R.id.checkBox3-> image2.setImageResource(R.drawable.vino)

        }

    }
}