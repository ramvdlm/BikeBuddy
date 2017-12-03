package com.example.ramvadlamani.bikebuddy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class RecordIncidentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incident);
    }

    public void sentIncident(View view){
        IncidentTask mAuthTask = new IncidentRecordTask(this, latitude, longitude, ambulance, biker_age, bike_direction, biker_injury, bike_position, biker_race, biker_sex, city, county, day, location_of_crash, month, time);
        mAuthTask.execute((Void) null);
    }
}
