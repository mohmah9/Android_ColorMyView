package com.example.colormyview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.colormyview.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setlistensers()
    }

    private fun setlistensers() {
        val clickableVie : List<View> = listOf(box_one_text,box_two_text,box_three_text,box_four_text,box_five_text,const_lay,red_button,yellow_button,green_button)
        for (item in clickableVie){
            item.setOnClickListener{makeColored(item)}
        }
    }
    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            binding.boxOneText.id -> view.setBackgroundColor(Color.DKGRAY)
            binding.boxTwoText.id -> view.setBackgroundColor(Color.GRAY)
//            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
//            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            binding.boxThreeText.id -> view.setBackgroundResource(android.R.color.holo_green_light)
            binding.boxFourText.id -> view.setBackgroundResource(android.R.color.holo_green_dark)
            binding.boxFiveText.id -> view.setBackgroundResource(android.R.color.holo_green_light)
//            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
//            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
//            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            binding.redButton.id -> binding.boxThreeText.setBackgroundResource(android.R.color.holo_red_dark)
            binding.yellowButton.id -> binding.boxFourText.setBackgroundColor(Color.YELLOW)
            binding.greenButton.id -> binding.boxFiveText.setBackgroundResource(android.R.color.holo_blue_dark)
//            R.id.red_button -> box_three_text.setBackgroundResource(android.R.color.holo_red_dark)
//            R.id.yellow_button -> box_four_text.setBackgroundColor(Color.YELLOW)
//            R.id.green_button -> box_five_text.setBackgroundResource(android.R.color.holo_blue_dark)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
