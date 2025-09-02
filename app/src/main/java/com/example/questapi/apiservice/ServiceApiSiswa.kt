package com.example.questapi.apiservice

import com.example.questapi.modeldata.DataSiswa
import retrofit2.http.GET

interface ServiceApiSiswa {
    @GET("bacateman.php")
    suspend fun getSiswa() : List<DataSiswa>
}