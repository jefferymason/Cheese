package com.raywenderlich.cheese

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.content_scrolling.*


class ScrollingActivity : AppCompatActivity() {

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scrolling)
        setSupportActionBar(findViewById(R.id.toolbar))
        findViewById<CollapsingToolbarLayout>(R.id.toolbar_layout).title = title
        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

    }

    fun onButtonClick(v:View) {
        val cheddarIntent = Intent(baseContext, CheddarCheese::class.java)
        startActivity(cheddarIntent)
    }

    fun onButtonClick2(v:View) {
        val swissIntent = Intent(baseContext, SwissCheese::class.java)
        startActivity(swissIntent)
    }

    fun onButtonClick3(v:View) {
        val mozzarellaIntent = Intent(baseContext, MozzarellaCheese::class.java)
        startActivity(mozzarellaIntent)
    }

    fun onButtonClick4(v:View) {
        val goudaIntent = Intent(baseContext, GoudaCheese::class.java)
        startActivity(goudaIntent)
    }

    }
