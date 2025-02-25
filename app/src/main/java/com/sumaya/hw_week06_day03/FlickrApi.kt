package com.sumaya.hw_week06_day03

import com.sumaya.hw_week06_day03.FlickrResponse
import retrofit2.Call
import retrofit2.http.GET

interface FlickrApi {
    @GET("services/rest/?method=flickr.interestingness.getList" +
            "&api_key=yourApiKeyHere" +
            "&format=json" +
            "&nojsoncallback=1" +
            "&extras=url_s")
    fun fetchContents(): Call<FlickrResponse>
}