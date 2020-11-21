package com.thernat.mapcompare.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.thernat.mapcompare.repository.ParkRepository

class ParksViewModel @ViewModelInject internal constructor(
    repository: ParkRepository
) : ViewModel() {
    val parks  =
        repository.getParks()

}