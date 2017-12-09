package edu.ramunc.vishnu.bikebuddy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class RecordIncidentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incident);
    }

    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.submit:
                Toast.makeText(getApplicationContext(), "Incident successfully reported!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.near_miss:
                Toast.makeText(getApplicationContext(), "Near miss selected.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.minor:
                Toast.makeText(getApplicationContext(), "Minor selected.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.major:
                Toast.makeText(getApplicationContext(), "Major selected.", Toast.LENGTH_SHORT).show();
                break;
        }

    }

        public void sentIncident(View view){
        //IncidentTask mAuthTask = new IncidentRecordTask(this, latitude, longitude, ambulance, biker_age, bike_direction, biker_injury, bike_position, biker_race, biker_sex, city, county, day, location_of_crash, month, time);
        //mAuthTask.execute((Void) null);
    }


}
