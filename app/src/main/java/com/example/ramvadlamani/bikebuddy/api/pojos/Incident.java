package com.example.ramvadlamani.bikebuddy.api.pojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by RamVadlamani on 12/2/17.
 */

public class Incident extends ApiResponse{
    @SerializedName("latitude")
    @Expose
    private double latitude;

    @SerializedName("longitude")
    @Expose
    private double longitude;

    @SerializedName("ambulance")
    @Expose
    private Enum ambulance;

    @SerializedName("biker_age")
    @Expose
    private int biker_age;

    @SerializedName("bike_direction")
    @Expose
    private Enum bike_direction;

    @SerializedName("biker_injury")
    @Expose
    private Enum biker_injury;

    @SerializedName("bike_position")
    @Expose
    private Enum bike_position;

    @SerializedName("biker_race")
    @Expose
    private Enum biker_race;

    @SerializedName("biker_sex")
    @Expose
    private Enum biker_sex;

    @SerializedName("city")
    @Expose
    private Enum city;

    @SerializedName("county")
    @Expose
    private Enum county;

    @SerializedName("day")
    @Expose
    private Enum day;

    @SerializedName("location_of_crash")
    @Expose
    private Enum location_of_crash;

    @SerializedName("month")
    @Expose
    private Enum month;

    @SerializedName("time")
    @Expose
    private String time;

    public Incident(int code, String message, double latitude, double longitude, Enum ambulance, int biker_age, Enum bike_direction, Enum biker_injury, Enum bike_position, Enum biker_race, Enum biker_sex, Enum city, Enum county, Enum day, Enum location_of_crash, Enum month, String time) {
        super(code, message);
        this.latitude = latitude;
        this.longitude = longitude;
        this.ambulance = ambulance;
        this.biker_age = biker_age;
        this.bike_direction = bike_direction;
        this.biker_injury = biker_injury;
        this.bike_position = bike_position;
        this.biker_race = biker_race;
        this.biker_sex = biker_sex;
        this.city = city;
        this.county = county;
        this.day = day;
        this.location_of_crash = location_of_crash;
        this.month = month;
        this.time = time;
    }

    public Incident(double latitude, double longitude, Enum ambulance, int biker_age, Enum bike_direction, Enum biker_injury, Enum bike_position, Enum biker_race, Enum biker_sex, Enum city, Enum county, Enum day, Enum location_of_crash, Enum month, String time) {
        super();
        this.latitude = latitude;
        this.longitude = longitude;
        this.ambulance = ambulance;
        this.biker_age = biker_age;
        this.bike_direction = bike_direction;
        this.biker_injury = biker_injury;
        this.bike_position = bike_position;
        this.biker_race = biker_race;
        this.biker_sex = biker_sex;
        this.city = city;
        this.county = county;
        this.day = day;
        this.location_of_crash = location_of_crash;
        this.month = month;
        this.time = time;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Enum getAmbulance() {
        return ambulance;
    }

    public void setAmbulance(Enum ambulance) {
        this.ambulance = ambulance;
    }

    public int getBiker_age() {
        return biker_age;
    }

    public void setBiker_age(int biker_age) {
        this.biker_age = biker_age;
    }

    public Enum getBike_direction() {
        return bike_direction;
    }

    public void setBike_direction(Enum bike_direction) {
        this.bike_direction = bike_direction;
    }

    public Enum getBiker_injury() {
        return biker_injury;
    }

    public void setBiker_injury(Enum biker_injury) {
        this.biker_injury = biker_injury;
    }

    public Enum getBike_position() {
        return bike_position;
    }

    public void setBike_position(Enum bike_position) {
        this.bike_position = bike_position;
    }

    public Enum getBiker_race() {
        return biker_race;
    }

    public void setBiker_race(Enum biker_race) {
        this.biker_race = biker_race;
    }

    public Enum getBiker_sex() {
        return biker_sex;
    }

    public void setBiker_sex(Enum biker_sex) {
        this.biker_sex = biker_sex;
    }

    public Enum getCity() {
        return city;
    }

    public void setCity(Enum city) {
        this.city = city;
    }

    public Enum getCounty() {
        return county;
    }

    public void setCounty(Enum county) {
        this.county = county;
    }

    public Enum getDay() {
        return day;
    }

    public void setDay(Enum day) {
        this.day = day;
    }

    public Enum getLocation_of_crash() {
        return location_of_crash;
    }

    public void setLocation_of_crash(Enum location_of_crash) {
        this.location_of_crash = location_of_crash;
    }

    public Enum getMonth() {
        return month;
    }

    public void setMonth(Enum month) {
        this.month = month;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
