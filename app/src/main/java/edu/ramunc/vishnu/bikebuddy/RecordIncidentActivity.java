package edu.ramunc.vishnu.bikebuddy;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static android.R.attr.defaultValue;

public class RecordIncidentActivity extends AppCompatActivity {
    Intent intent = getIntent();
    Calendar c = Calendar.getInstance();

    double latitude;
    double longitude;
    String crash_severity;
    String notes;
    String time = new SimpleDateFormat("HH.mm").format(c.getTime());
    Date date = c.getTime();
    EditText mEdit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incident);
    }

    public void onClick(View v) {
        if(intent != null){
            latitude = intent.getDoubleExtra("latitude", defaultValue);
            longitude = intent.getDoubleExtra("longitude", defaultValue);
        }
        switch(v.getId()) {
            case R.id.submit:
                mEdit = (EditText)findViewById(R.id.plain_text_input);
                notes = mEdit.getText().toString();
                IncidentTask mAuthTask = new IncidentRecordTask(this, latitude, longitude, crash_severity, notes, time, date);
                mAuthTask.execute((Void) null);
                Toast.makeText(getApplicationContext(), "Incident successfully reported!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.near_miss:
                crash_severity = "NEAR_MISS";
                Toast.makeText(getApplicationContext(), "Near miss selected.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.minor:
                crash_severity = "MINOR";
                Toast.makeText(getApplicationContext(), "Minor selected.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.major:
                crash_severity = "MAJOR";
                Toast.makeText(getApplicationContext(), "Major selected.", Toast.LENGTH_SHORT).show();
                break;
        }

    }

    public void sentIncident(View view){
        //IncidentTask mAuthTask = new IncidentRecordTask(this, latitude, longitude, ambulance, biker_age, bike_direction, biker_injury, bike_position, biker_race, biker_sex, city, county, day, location_of_crash, month, time);
        //mAuthTask.execute((Void) null);

    }


}
