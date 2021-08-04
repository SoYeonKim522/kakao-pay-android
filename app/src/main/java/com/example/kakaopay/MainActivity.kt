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
import androidx.recyclerview.widget.RecyclerView
import com.example.kakaopay.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_slideitem.*


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainCardSpan()

        //recycler view
        val cardList = arrayListOf(
            SlideCards("주말, 카카오페이로\n편의점 털기!", "멤버십 가입 후 결제하면 적립", R.drawable.slidecard_1),
            SlideCards("제값 주고 결제하세요?\n혜택 꿀팁 알려드려요", "쓸 때마다 최대 2.5% 적립", R.drawable.slidecard_2)

            )

        binding.recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.adapter = RecyclerViewAdapter(cardList)

        //간격 따로 지정
        binding.recyclerView.addItemDecoration(RecyclerViewAdapter.HorizontalSpaceDecoration(10))
    }





//    글자색 변경 span
    private fun mainCardSpan() {
        val spannableString = SpannableString("비상금계좌 세전 연 0.6% 미니금고 카카오페이증권")
        spannableString.setSpan(ForegroundColorSpan(Color.parseColor("#fcec4e")), 0, 5, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)

        val styleSpan = StyleSpan(Typeface.BOLD)
        spannableString.setSpan(styleSpan, 0, 5, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)

        main_card_bottom_btn.text = spannableString
    }

//    override fun onStart() {
//        super.onStart()
//        Log.d("log", "onStart")
//    }
//
//    override fun onResume() {
//        super.onResume()
//        Log.d("log", "onResume")
//    }
//
//    override fun onPause() {
//        super.onPause()
//        Log.d("log","onPause")
//    }
//
//    override fun onStop() {
//        super.onStop()
//        Log.d("log","onStop")
//    }
//
//    override fun onRestart() {
//        super.onRestart()
//        Log.d("log","onRestart")
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        Log.d("log","onDestroy")
//    }
}