package com.abc.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public interface JsonPlaceHolderApi {
    @GET("pokemon")
    Call<Pokemon> getAllPhotos();


}
