package com.example.komin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.komin.fragment.FragmentAdapter
import kotlinx.android.synthetic.main.activity_lecture.*

class LectureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lecture)

        val fragmentAdapter = FragmentAdapter(supportFragmentManager)
        list_viewpager.adapter = fragmentAdapter
    }
}