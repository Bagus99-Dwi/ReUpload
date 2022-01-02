package com.bagusdwip.retrofit2listview.rest;
import com.bagusdwip.retrofit2listview.models.Model;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Desember 2021.
 */
public interface RestAPI{

    @GET("example/buku")
    Call<Model> loadListBook();
}
