package edu.ramunc.vishnu.bikebuddy.api.pojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by RamVadlamani on 12/3/17.
 */

public abstract class ApiResponse implements Serializable{
    @SerializedName("code")
    @Expose
    private int code;

    @SerializedName("message")
    @Expose
    private String message;

    ApiResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }

    ApiResponse() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}

