package edu.ramunc.vishnu.bikebuddy;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import edu.ramunc.vishnu.bikebuddy.api.pojos.Incident;

import java.io.IOException;

/**
 * Created by RamVadlamani on 12/2/17.
 */

class IncidentRecordTask extends IncidentTask {
    protected final double latitude;
    protected final double longitude;
    protected final Enum ambulance;
    protected final int biker_age;
    protected final Enum bike_direction;
    protected final Enum biker_injury;
    protected final Enum bike_position;
    protected final Enum biker_race;
    protected final Enum biker_sex;
    protected final Enum city;
    protected final Enum county;
    protected final Enum day;
    protected final Enum location_of_crash;
    protected final Enum month;
    protected final String time;

    public IncidentRecordTask(Context c, double latitude, double longitude, Enum ambulance, int biker_age, Enum bike_direction, Enum biker_injury, Enum bike_position, Enum biker_race, Enum biker_sex, Enum city, Enum county, Enum day, Enum location_of_crash, Enum month, String time) {
        super(c);
        this.latitude = latitude;
        this.longitude = longitude;
        this.ambulance = ambulance;
        this.biker_age = biker_age;
        this.bike_direction = bike_direction;
        this.biker_injury = biker_injury;
        this.bike_position = bike_position;
        this.biker_race = biker_race;
        this.biker_sex = biker_sex;
        this.city = city;
        this.county = county;
        this.day = day;
        this.location_of_crash = location_of_crash;
        this.month = month;
        this.time = time;
    }


    @Override
    protected Incident doInBackground(Void... voids) {
        Incident incident = null;
        try {
            // Calls the ApiFunction interface's register method and retrieves user data on successful register
            incident = api.recordIncident(latitude, longitude, ambulance, biker_age, bike_direction, biker_injury, bike_position, biker_race, biker_sex, city, county, day, location_of_crash, month, time).execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return incident;

    }

    protected void recordIncident(Incident incident) {
        Intent intent = new Intent(mContext, MapsActivity.class);
        mContext.startActivity(intent);
        ((Activity) mContext).finish();
    }

    @Override
    protected void onPostExecute(final Incident incident) {
        if (incident.getCode() == 0) {
            // On successful response, stores credentials in SharedPreferences and continues to MapsActivity
            recordIncident(incident);
        } else {
            // Displays error
            Toast.makeText(mContext, incident.getMessage(), Toast.LENGTH_LONG).show();
        }
    }
}
