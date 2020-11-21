package com.thernat.mapcompare.api

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import com.thernat.mapcompare.BuildConfig
import com.thernat.mapcompare.model.ParkResponse
import okhttp3.OkHttp
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface NPService {

    @GET("parks")
    suspend fun getParks(
        @Query("api_key") apiKey: String = BuildConfig.PARK_API_KEY
    ): Response<ParkResponse>

    companion object {
        private const val BASE_URL = "https://developer.nps.gov/api/v1/"

        fun create(): NPService {
            val moshi = Moshi.Builder()
                .add(KotlinJsonAdapterFactory())
                .build()
            val logger = HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BASIC }

            val client = OkHttpClient.Builder()
                    .addInterceptor(logger)
                    .build()

            return Retrofit.Builder()
                    .baseUrl(BASE_URL)
                .client(client)
                    .addConverterFactory(MoshiConverterFactory.create(moshi))
                .build()
                .create(NPService::class.java)

        }
    }
}