package edu.ramunc.vishnu.bikebuddy.api;

import java.util.Date;

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
                                  @Field("crash_severity") String crash_severity, @Field("notes") String notes,
                                  @Field("time") String time, @Field("date") Date date);
}
