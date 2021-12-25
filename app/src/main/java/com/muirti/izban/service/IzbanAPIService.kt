package com.muirti.izban.service

import com.muirti.izban.model.GameListResponse
import com.muirti.izban.model.IzbanListResponse
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class IzbanAPIService {

    private  val BASE_URL ="https://openapi.izmir.bel.tr/api/"
    private val TEMP_URL ="https://oyunpuanla.com/game/public/index.php/"

    private val api=Retrofit.Builder()
        .baseUrl(TEMP_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(IzbanAPI::class.java)

    fun getIzbanList() : Single<GameListResponse> {

        return api.getIzbanIstasyonList()
    }

}