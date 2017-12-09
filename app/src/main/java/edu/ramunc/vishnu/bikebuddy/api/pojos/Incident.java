package edu.ramunc.vishnu.bikebuddy.api.pojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by RamVadlamani on 12/2/17.
 */

public class Incident extends ApiResponse{
    @SerializedName("count")
    @Expose
    private int count;

    public Incident(int code, String message, int count) {
        super(code, message);
        this.count = count;
    }

    public Incident(int count) {
        super();
        this.count = count;
    }

    public int getCount() {return count;}

    public void setCount(int count) {
        this.count = count;
    }

}
