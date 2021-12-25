package com.muirti.izban.service


import com.muirti.izban.model.GameListResponse
import com.muirti.izban.model.IzbanListResponse
import io.reactivex.Single
import retrofit2.http.GET


interface IzbanAPI {

    companion object {
            const val TEMP_GAME ="gameType"
            const val IZBAN_ISTASYONLAR ="izban/istasyonlar"
    }

    @GET(TEMP_GAME)
    fun getIzbanIstasyonList( ):Single<GameListResponse>



}