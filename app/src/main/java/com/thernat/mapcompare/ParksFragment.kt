package com.thernat.mapcompare

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.thernat.mapcompare.adapter.ParkAdapter
import com.thernat.mapcompare.api.Resource
import com.thernat.mapcompare.data.Park
import com.thernat.mapcompare.databinding.FragmentParksBinding
import com.thernat.mapcompare.viewmodel.ParksViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ParksFragment : Fragment() {

    private val viewModel: ParksViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentParksBinding.inflate(inflater, container, false).apply {
            parksViewPager.adapter = ParkAdapter().also { subscribeForUpdates(it) }
        }
        return binding.root
    }

    private fun subscribeForUpdates(adapter: ParkAdapter) {
        viewModel.parks.observe(viewLifecycleOwner) {
            if (it.status == Resource.Status.SUCCESS) {
                val parks = it.data?.park?.map { park ->
                    Park(
                        park.fullName,
                        park.description,
                        park.images.firstOrNull()?.url,
                        park.longitude,
                        park.latitude
                    )
                }
                adapter.submitList(parks)
            }
        }
    }

}