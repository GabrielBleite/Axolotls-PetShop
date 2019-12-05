package com.example.projetopetshop.Controller;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CriaBanco extends SQLiteOpenHelper {

    public void onCreate(SQLiteDatabase db){

        String sql = "CREATE TABLE CARRINHO (ID_CARRINHO integer primary key autoincrement, " +
                ")";

    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }
}
