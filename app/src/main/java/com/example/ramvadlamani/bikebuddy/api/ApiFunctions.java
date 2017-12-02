package com.example.ramvadlamani.bikebuddy.api;

import com.example.ramvadlamani.bikebuddy.api.pojos.Incident;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;


/**
 * Created by RamVadlamani on 12/2/17.
 */

public interface ApiFunctions {
    @POST("retrieveIncident.php")
    @FormUrlEncoded
    Call<Incident> retrieveIncident(@Field("email") String email, @Field("password") String password);

    @POST("recordIncident.php")
    @FormUrlEncoded
    Call<Incident> recordIncident(@Field("email") String email, @Field("firstname") String firstname, @Field("lastname") String lastname, @Field("password") String password, @Field("gender") String gender, @Field("age") int age);

}
