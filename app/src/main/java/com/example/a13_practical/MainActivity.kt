package com.example.a13_practical

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var img: ImageView
    private lateinit var frameAnimation: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        img = findViewById(R.id.ivAnim)
        val btnCellAnimation: Button = findViewById(R.id.btnCellAnimation)
        val btnTweenAnimation: Button = findViewById(R.id.btnTweenAnimation)

        btnCellAnimation.setOnClickListener {
            startCellAnimation()
        }

        btnTweenAnimation.setOnClickListener {
            startTweenAnimation()
        }
    }

    private fun startCellAnimation() {
        img.setBackgroundResource(R.drawable.cat_animation) // Устанавливаем ресурс анимации
        frameAnimation = img.background as AnimationDrawable
        img.visibility = View.VISIBLE
        frameAnimation.start() // Запускаем анимацию
    }

    private fun startTweenAnimation() {
        img.setImageResource(R.drawable.q1) // Установите свой ресурс изображения
        img.visibility = View.VISIBLE
        val anim = AnimationUtils.loadAnimation(this, R.anim.new_animation)
        img.startAnimation(anim) // Запускаем Tween-анимацию
    }
}