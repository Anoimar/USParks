package com.thernat.mapcompare.repository

import androidx.lifecycle.LiveData
import com.thernat.mapcompare.api.Resource
import androidx.lifecycle.liveData
import com.thernat.mapcompare.data.source.remote.ParkRemoteDataSource
import com.thernat.mapcompare.model.ParkResponse
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ParkRepository @Inject constructor(private val remoteDataSource: ParkRemoteDataSource) {

    fun getParks(): LiveData<Resource<ParkResponse>> =
        liveData(Dispatchers.IO) {
            emit(Resource.loading<ParkResponse>())
            val responseStatus = remoteDataSource.getParks()
            if (responseStatus.status == Resource.Status.SUCCESS) {
                emit(responseStatus)
            }
        }
}