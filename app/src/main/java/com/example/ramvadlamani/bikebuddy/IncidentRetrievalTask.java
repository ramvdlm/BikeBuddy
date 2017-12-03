package com.example.ramvadlamani.bikebuddy;

import android.content.Context;

import com.example.ramvadlamani.bikebuddy.api.pojos.Incident;

import java.io.IOException;

/**
 * Created by RamVadlamani on 12/2/17.
 */

class IncidentRetrievalTask extends IncidentTask {
    protected final double latitude;
    protected final double longitude;

    public IncidentRetrievalTask(Context c, double longitude, double latitude) {
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
}
