package com.example.payingguest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )



//          Fetching layouts id from spash_screen
//        val image=findViewById<ImageView>(R.id.imageView)
//        val paying=findViewById<TextView>(R.id.paying)
//        val textView=findViewById<TextView>(R.id.textView3)
//        val guest=findViewById<TextView>(R.id.guest)
        val tagline=findViewById<TextView>(R.id.tagline)
        val slideAnimation = AnimationUtils.loadAnimation(this, R.anim.side_slide)
//        image.startAnimation(slideAnimation)
//        paying.startAnimation(slideAnimation)
//        textView.startAnimation(slideAnimation)
//        guest.startAnimation(slideAnimation)
        tagline.startAnimation(slideAnimation)


        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, PGMain::class.java)
            startActivity(intent)
            finish()
        }, 2000)
    }
}