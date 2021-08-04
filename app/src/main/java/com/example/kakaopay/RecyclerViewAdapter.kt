package com.example.kakaopay

import android.graphics.Color
import android.graphics.Rect
import android.text.Layout
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView



class RecyclerViewAdapter(private val cardList: ArrayList<SlideCards>): RecyclerView.Adapter<RecyclerViewAdapter.CustomViewHolder>(){
//    private var items : List<>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        return CustomViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_slideitem, parent, false))
    }

    override fun getItemCount(): Int {
        Log.d("log", "getItemCount: ${cardList.size}")
        return cardList.size

    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.mainText.text = cardList[position].mainText
        holder.subText.text = cardList[position].subText
        holder.image.setImageResource(cardList[position].image)

        if (position%2==1){
            holder.bgColor.setBackgroundColor(Color.parseColor("#9ac1cf"))
        }

    }

    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val mainText = itemView.findViewById<TextView>(R.id.slide_card_main)
        val subText = itemView.findViewById<TextView>(R.id.slide_card_sub)
        val image = itemView.findViewById<ImageView>(R.id.image)
        val bgColor = itemView.findViewById<View>(R.id.card)  //배경색

    }

    class HorizontalSpaceDecoration(private val horizontalSpace: Int): RecyclerView.ItemDecoration(){
        override fun getItemOffsets(
            outRect: Rect,
            view: View,
            parent: RecyclerView,
            state: RecyclerView.State
        ) {
            outRect.left = horizontalSpace
            outRect.right = horizontalSpace
        }


    }




}
