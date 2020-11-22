package com.thernat.mapcompare

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.thernat.mapcompare.data.ParkMapData
import com.thernat.mapcompare.databinding.ParkMapFragmentBinding
import com.thernat.mapcompare.viewmodel.ParkMapViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ParkMapFragment : Fragment() {

    private val args: ParkMapFragmentArgs by navArgs()

    private val viewModel: ParkMapViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bindings = ParkMapFragmentBinding.inflate(inflater, container, false)
            .apply {
                park = args.ParkMapData
            }
        return bindings.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

}