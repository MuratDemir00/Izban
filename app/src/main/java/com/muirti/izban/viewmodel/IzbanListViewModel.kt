package com.muirti.izban.viewmodel

import android.annotation.SuppressLint
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.muirti.izban.model.GameListResponse
import com.muirti.izban.model.IzbanListResponse
import com.muirti.izban.service.IzbanAPIService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers

class IzbanListViewModel :ViewModel(){

   private var izbanAPIService =IzbanAPIService()

    val izbanListLiveData: MutableLiveData<GameListResponse> = MutableLiveData<GameListResponse>()


    @SuppressLint("CheckResult")
    fun getIzbanList(){
        izbanAPIService.getIzbanList()
            .subscribeOn(Schedulers.newThread())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeWith(object : DisposableSingleObserver<GameListResponse>() {
                override fun onSuccess(response: GameListResponse) {
                    izbanListLiveData.value = response
                }

                override fun onError(e: Throwable) {
                    e.printStackTrace()
                }
            })
    }


}