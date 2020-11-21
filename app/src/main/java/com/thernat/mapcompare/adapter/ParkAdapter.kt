package com.thernat.mapcompare.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.thernat.mapcompare.BR
import com.thernat.mapcompare.R
import com.thernat.mapcompare.data.Park

class ParkAdapter : ListAdapter<Park, ParkAdapter.ParkViewHolder>(ParkItemDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParkViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding =
            DataBindingUtil.inflate<ViewDataBinding>(layoutInflater, viewType, parent, false)
        return ParkViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ParkViewHolder, position: Int) =
        holder.bind(getItem(position))

    override fun getItemViewType(position: Int) = R.layout.park_layouts

    class ParkItemDiffCallback() : DiffUtil.ItemCallback<Park>() {

        override fun areItemsTheSame(oldItem: Park, newItem: Park) = oldItem == newItem

        override fun areContentsTheSame(oldItem: Park, newItem: Park) = oldItem == newItem

    }

    class ParkViewHolder(private val binding: ViewDataBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(park: Park) {
            binding.setVariable(BR.park, park)
        }
    }
}