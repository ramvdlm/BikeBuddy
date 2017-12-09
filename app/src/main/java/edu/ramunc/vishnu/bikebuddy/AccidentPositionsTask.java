package edu.ramunc.vishnu.bikebuddy;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import java.io.IOException;
import java.util.List;

import edu.ramunc.vishnu.bikebuddy.api.ApiFunctions;
import edu.ramunc.vishnu.bikebuddy.api.pojos.Position;
import edu.ramunc.vishnu.bikebuddy.api.pojos.PositionList;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by vishnu on 12/4/17.
 */

public class AccidentPositionsTask extends AsyncTask<Void, Void, PositionList> {
    protected final double topLat;
    protected final double botLat;
    protected final double leftLong;
    protected final double rightLong;
    protected Context mContext;
    // Retrofit and post
    protected ApiFunctions api;

    public AccidentPositionsTask(Context c, double topLat, double botLat, double leftLong, double rightLong) {
        this.topLat = topLat;
        this.botLat = botLat;
        this.leftLong = leftLong;
        this.rightLong = rightLong;
        this.mContext = c;


        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(mContext.getString(R.string.api_url))
                .addConverterFactory(GsonConverterFactory.create());

        Retrofit retrofit = builder.client(httpClient.build()).build();

        api = retrofit.create(ApiFunctions.class);
    }

    @Override
    protected PositionList doInBackground(Void... voids) {
        PositionList positions = null;
        try {
            // Calls the ApiFunction interface's register method and retrieves user data on successful register
            positions = api.accidentPositions(topLat, botLat, leftLong, rightLong).execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return positions;

    }

    @Override
    protected void onPostExecute(final PositionList positions) {
        if (positions.getCode() == 0) {
            // On successful response, get back to maps activity with updated count

            //list of all longitudes and latitudes
            List<Position> positionList = positions.getPositions();

        } else {
            // Displays error
            Toast.makeText(mContext, positions.getMessage(), Toast.LENGTH_LONG).show();
        }
    }
}
