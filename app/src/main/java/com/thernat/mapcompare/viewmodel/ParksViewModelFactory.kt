package com.thernat.mapcompare.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.thernat.mapcompare.repository.ParkRepository

class ParksViewModelFactory(
    private val repository: ParkRepository
): ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ParksViewModel(repository) as T
    }
}