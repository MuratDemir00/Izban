package com.muirti.izban.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.muirti.izban.R
import com.muirti.izban.adapter.IzbanListAdapter
import com.muirti.izban.model.IzbanListResponse
import com.muirti.izban.viewmodel.IzbanListViewModel
import kotlinx.android.synthetic.main.activity_izban_list.*
import retrofit2.http.GET


class IzbanListActivity : AppCompatActivity() {
    private var izbanListViewModel =IzbanListViewModel()
    var izbanadapter = IzbanListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_izban_list)

        izbanListViewModel = ViewModelProvider(this).get(IzbanListViewModel::class.java)
        izbanListViewModel.getIzbanList()
        izbanListViewModel.izbanListLiveData.observe(this, Observer {cevap->

            Toast.makeText(this,cevap[0].tur_ad,Toast.LENGTH_LONG).show()
        })

        Toast.makeText(this, "İZBAN İSTASYONLARI", Toast.LENGTH_SHORT).show()

        var duraklistesi:ArrayList<String> = arrayListOf()

        duraklistesi.add("Bağcılar")
        duraklistesi.add("Başakşehir")
        duraklistesi.add("Göztepe")
        duraklistesi.add("Kayaşehir")
        duraklistesi.add("Los Angeles")
        duraklistesi.add("Berlin")
        duraklistesi.add("Tokyo")
        duraklistesi.add("Helsinki")
        duraklistesi.add("Texas")
        duraklistesi.add("Paris")
        duraklistesi.add("Pekin")



        rv_izbanlist.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rv_izbanlist.adapter =izbanadapter

        izbanadapter.getData(duraklistesi)

    }


}