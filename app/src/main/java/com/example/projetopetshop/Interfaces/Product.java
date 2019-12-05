package com.example.projetopetshop.Interfaces;

import com.example.projetopetshop.Model.Produto;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Product {

   @GET("/android/rest/produto")
   Call<List<Produto>> listarProduto();

}

