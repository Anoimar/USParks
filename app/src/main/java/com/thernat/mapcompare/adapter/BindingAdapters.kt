package com.thernat.mapcompare.adapter

import android.widget.Button
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.navigation.Navigation
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.thernat.mapcompare.ParksFragmentDirections
import com.thernat.mapcompare.data.Park
import com.thernat.mapcompare.data.ParkMapData

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

@BindingAdapter("goToParkDetails")
fun bindOnGoToDetailsClicked(button: Button, park: Park) {
    button.setOnClickListener {
        Navigation.createNavigateOnClickListener(
            ParksFragmentDirections.actionParksFragmentToParkMapsFragment(
                ParkMapData(
                    park.fullName,
                    park.longitude.toDouble(),
                    park.latitude.toDouble()
                )
            )
        ).onClick(it)
    }
}