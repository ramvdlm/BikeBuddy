package edu.ramunc.vishnu.bikebuddy;

import android.content.Context;
import android.content.Intent;
import android.telecom.Call;
import android.widget.Toast;

import edu.ramunc.vishnu.bikebuddy.api.pojos.Incident;

import java.io.IOException;

/**
 * Created by RamVadlamani on 12/2/17.
 */

class IncidentRetrievalTask extends IncidentTask {
    protected final double latitude;
    protected final double longitude;

    public IncidentRetrievalTask(Context c, double latitude, double longitude) {
        super(c);
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    protected Incident doInBackground(Void... voids) {
        Incident incident = null;
        try {
            // Calls the ApiFunction interface's register method and retrieves user data on successful register
            incident = api.retrieveIncident(latitude, longitude).execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return incident;

    }

    @Override
    protected void onPostExecute(final Incident incident) {
        if (incident.getCode() == 0) {
            // On successful response, get back to maps activity with updated count
            if(incident.getCount() > 0 ){
                //intent to alert activity
                Intent intent = new Intent();

            }

        } else {
            // Displays error
            Toast.makeText(mContext, incident.getMessage(), Toast.LENGTH_LONG).show();
        }
    }
}
