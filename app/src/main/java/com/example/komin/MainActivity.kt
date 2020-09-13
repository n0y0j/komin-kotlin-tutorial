package com.example.komin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent as Intent1

class MainActivity : AppCompatActivity() {

    internal lateinit var viewpager : ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val img = arrayOf(
            R.drawable.ai,
            R.drawable.css,
            R.drawable.html,
            R.drawable.id,
            R.drawable.jpg,
            R.drawable.js,
            R.drawable.mp4,
            R.drawable.tiff,
            R.drawable.php,
            R.drawable.pdf,
            R.drawable.jpg,
            R.drawable.psd
        )

        val text = arrayOf(
            "ai",
            "css",
            "html",
            "id",
            "jpg",
            "js",
            "mp4",
            "tiff",
            "php",
            "pdf",
            "jpg",
            "psd"
        )

        val gridviewAdapter = GridviewAdapter(this, img, text)
        gridview.adapter = gridviewAdapter

        gridview.setOnItemClickListener { adapterView, view, position, id ->

            val intent = Intent1(this, LectureActivity::class.java)
            startActivity(intent)
        }

        viewpager = findViewById(R.id.viewpager) as ViewPager

        val adapter = ViewPagerAdapter(this)
        viewpager.adapter = adapter

    }
}