package com.example.retrofit.Network

import com.example.retrofit.ApiResponse
import com.example.retrofit.ResponseDataDeleteMahasiswa
import com.example.retrofit.ResponseDataInsertMahasiswa
import com.example.retrofit.ResponseDataUpdateMahasiswa
import retrofit2.Call
import retrofit2.http.*


interface ApiService {
    @GET("datamahasiswa/")
    fun remoteGetdatamahasiswa(): Call<ApiResponse>

    @FormUrlEncoded
    @POST("datamahasiswa/")
    fun insertMahasiswa(
        @Field("nim") nim: String,
        @Field("nama") nama: String,
        @Field("telepon") telepon: String
    ): Call<ResponseDataInsertMahasiswa>

    @DELETE("datamahasiswa/{nim}")
    fun deleteMahasiswa(@Path("nim") nim: String): Call<ResponseDataDeleteMahasiswa>

    @FormUrlEncoded
    @POST("datamahasiswa/{nim}")
    fun updateMahasiswa(
        @Path("nim") nim: String,
        @Field("nama") nama: String,
        @Field("telepon") telepon: String
    ): Call<ResponseDataUpdateMahasiswa>

}

