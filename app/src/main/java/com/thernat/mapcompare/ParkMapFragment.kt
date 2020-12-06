package com.thernat.mapcompare

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import org.osmdroid.tileprovider.tilesource.TileSourceFactory
import com.thernat.mapcompare.databinding.ParkMapFragmentBinding
import com.thernat.mapcompare.viewmodel.ParkMapViewModel
import dagger.hilt.android.AndroidEntryPoint
import org.osmdroid.config.Configuration
import org.osmdroid.views.CustomZoomButtonsController

@AndroidEntryPoint
class ParkMapFragment : Fragment() {

    private val args: ParkMapFragmentArgs by navArgs()

    private val viewModel: ParkMapViewModel by viewModels()

    private lateinit var binding: ParkMapFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = ParkMapFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Configuration.getInstance().apply {
            load(
                requireContext(),
                requireActivity().getSharedPreferences(
                    "${requireContext().packageName}_prefs",
                    Context.MODE_PRIVATE
                )
            )
            userAgentValue = BuildConfig.APPLICATION_ID
        }
        binding.park = args.ParkMapData
    }
}

