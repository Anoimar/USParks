package com.thernat.mapcompare.data.source.remote

import com.thernat.mapcompare.api.NPService
import com.thernat.mapcompare.data.source.BaseDataSource
import javax.inject.Inject

class ParkRemoteDataSource @Inject constructor(
        private val npService: NPService
): BaseDataSource() {

    suspend fun getParks() = getResult {npService.getParks()}
}