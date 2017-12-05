package edu.ramunc.vishnu.bikebuddy;

import android.content.Context;

import java.io.IOException;

import edu.ramunc.vishnu.bikebuddy.api.pojos.Incident;

/**
 * Created by vishnu on 12/4/17.
 */

public class AccidentPositionsTask extends IncidentTask {
    protected final double topLat;
    protected final double botLat;
    protected final double leftLong;
    protected final double rightLong;

    public AccidentPositionsTask(Context c, double topLat, double botLat, double leftLong, double rightLong) {
        super(c);
        this.topLat = topLat;
        this.botLat = botLat;
        this.leftLong = leftLong;
        this.rightLong = rightLong;
    }

    @Override
    protected Incident doInBackground(Void... voids) {
        Incident incident = null;
        try {
            // Calls the ApiFunction interface's register method and retrieves user data on successful register
            incident = api.accidentPositions(topLat, botLat, leftLong, rightLong).execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return incident;

    }
}
