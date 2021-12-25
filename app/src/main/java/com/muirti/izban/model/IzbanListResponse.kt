package com.muirti.izban.model


import com.google.gson.annotations.SerializedName

class IzbanListResponse : ArrayList<IzbanListResponse.IzbanListResponseItem>(){
    data class IzbanListResponseItem(
        @SerializedName("Boylam")
        var boylam: String? = null,
        @SerializedName("Enlem")
        var enlem: String? = null,
        @SerializedName("IstasyonAdi")
        var istasyonAdi: String? = null,
        @SerializedName("IstasyonId")
        var istasyonId: Int? = null,
        @SerializedName("IstasyonSirasi")
        var istasyonSirasi: Int? = null
    )
}