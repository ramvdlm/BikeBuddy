package edu.ramunc.vishnu.bikebuddy;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import java.io.IOException;
import java.util.Date;

import edu.ramunc.vishnu.bikebuddy.api.pojos.Incident;

/**
 * Created by RamVadlamani on 12/2/17.
 */

class IncidentRecordTask extends IncidentTask {
    protected final double latitude;
    protected final double longitude;
    protected final Enum crash_severity;
    protected final String notes;
    protected final String time;
    protected final Date date;

    public IncidentRecordTask(Context c, double latitude, double longitude, Enum crash_severity, String notes, String time, Date date) {
        super(c);
        this.latitude = latitude;
        this.longitude = longitude;
        this.crash_severity = crash_severity;
        this.notes = notes;
        this.time = time;
        this.date = date;
    }


    @Override
    protected Incident doInBackground(Void... voids) {
        Incident incident = null;
        try {
            // Calls the ApiFunction interface's register method and retrieves user data on successful register
            incident = api.recordIncident(latitude, longitude, crash_severity, notes, time, date).execute().body();
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
