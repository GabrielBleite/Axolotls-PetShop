package com.example.projetopetshop.Interfaces;

import com.example.projetopetshop.Model.Usuario;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface User {

   @POST("/android/rest/cliente")
   Call<Usuario> login(@Body Usuario usuario);

   @POST("/android/rest/cliente/cadastro")
   Call<Usuario> signup(@Body Usuario usuario);

}

