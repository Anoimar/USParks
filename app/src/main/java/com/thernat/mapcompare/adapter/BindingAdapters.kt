package com.thernat.mapcompare.adapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide

@BindingAdapter("imageUrl")
fun bindImage(view: ImageView, url: String?) {
    url?.let {
        val circularProgressDrawable = CircularProgressDrawable(view.context)
        circularProgressDrawable.strokeWidth = 5f
        circularProgressDrawable.centerRadius = 30f
        circularProgressDrawable.start()
        Glide.with(view.context)
            .load(url)
            .placeholder(circularProgressDrawable)
            .into(view)
    }
}