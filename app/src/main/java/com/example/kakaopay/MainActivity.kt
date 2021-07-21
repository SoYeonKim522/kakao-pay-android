package com.example.kakaopay

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("log", "onCreate")

        mainCardSpan()

    }


//    글자색 변경 span
    private fun mainCardSpan() {
        val spannableString = SpannableString("비상금계좌 세전 연 0.6% 미니금고 카카오페이증권")
        spannableString.setSpan(ForegroundColorSpan(Color.parseColor("#fcec4e")), 0, 5, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)

        val styleSpan = StyleSpan(Typeface.BOLD)
        spannableString.setSpan(styleSpan, 0, 5, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)

        main_card_bottom_btn.text = spannableString
    }

    override fun onStart() {
        super.onStart()
        Log.d("log", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("log", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("log","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("log","onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("log","onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("log","onDestroy")

    }
}