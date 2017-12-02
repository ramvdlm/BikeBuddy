package com.example.ramvadlamani.bikebuddy;

import android.content.Context;
import android.os.AsyncTask;

import com.example.ramvadlamani.bikebuddy.api.ApiFunctions;
import com.example.ramvadlamani.bikebuddy.api.pojos.Incident;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by RamVadlamani on 12/2/17.
 */

public abstract class IncidentTask extends AsyncTask<Void, Void, Incident> {
    protected Context mContext;
    // Retrofit and post
    protected ApiFunctions api;

    protected IncidentTask(Context context) {
        this.mContext = context;


        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(mContext.getString(R.string.api_url))
                .addConverterFactory(GsonConverterFactory.create());

        Retrofit retrofit = builder.client(httpClient.build()).build();

        api = retrofit.create(ApiFunctions.class);
    }



}
