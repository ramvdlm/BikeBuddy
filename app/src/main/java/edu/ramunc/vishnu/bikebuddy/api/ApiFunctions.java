package edu.ramunc.vishnu.bikebuddy.api;

import edu.ramunc.vishnu.bikebuddy.api.pojos.Incident;

import edu.ramunc.vishnu.bikebuddy.api.pojos.PositionList;
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
    Call<Incident> retrieveIncident(@Field("latitude") double latitude, @Field("longitude") double longitude);

    @POST("accidentPositions.php")
    @FormUrlEncoded
    Call<PositionList> accidentPositions(@Field("topLat") double topLat, @Field("botLat") double botLat,
                                         @Field("leftLong") double leftLong, @Field("rightLong") double rightLong);

    @POST("recordIncident.php")
    @FormUrlEncoded
    Call<Incident> recordIncident(@Field("latitude") double latitude, @Field("longitude") double longitude,
                                  @Field("ambulance") Enum ambulance, @Field("biker_age") int biker_age,
                                  @Field("bike_direction") Enum bike_direction, @Field("biker_injury") Enum biker_injury,
                                  @Field("bike_position") Enum bike_position, @Field("biker_race") Enum biker_race,
                                  @Field("biker_sex") Enum biker_sex , @Field("city") Enum city,
                                  @Field("county") Enum county, @Field("day") Enum day,
                                  @Field("location_of_crash") Enum location_of_crash, @Field("month") Enum month,
                                  @Field("time") String time);
}
