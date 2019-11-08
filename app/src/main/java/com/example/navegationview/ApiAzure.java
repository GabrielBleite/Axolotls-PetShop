package com.example.navegationview;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiAzure {
    @GET("/android/rest/produto")
    Call<List<Produto>> listarProduto();
}
