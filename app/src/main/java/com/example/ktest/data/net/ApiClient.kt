package com.example.ktest.data.net

import com.example.ktest.data.models.PersonModel
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface ApiClient {

    //    @GET("android-test")
//    fun getPeopleDetails() : Call<List<PersonModel>>
//
    @GET("android-test")
    fun getPeopleDetails(): Observable<List<PersonModel>>

}