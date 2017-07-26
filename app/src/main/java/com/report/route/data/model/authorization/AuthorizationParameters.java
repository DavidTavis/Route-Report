package com.report.route.data.model.authorization;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AuthorizationParameters {

    @SerializedName("L_IP") @Expose public String lIP;
    @SerializedName("USER_EMAIL") @Expose public String userEmail;
    @SerializedName("PASSWD") @Expose public String passwd;
    @SerializedName("OS_VERSION") @Expose public String osVersion;
    @SerializedName("BROWSER_VERSION") @Expose public String browserVersion;
    @SerializedName("latitude") @Expose public float latitude;
    @SerializedName("longitude") @Expose public float longitude;
    @SerializedName("ID_TRIP") @Expose public final int TRIP_ID = 0;

    public AuthorizationParameters() {
    }

    public AuthorizationParameters(String lIP, String userEmail, String passwd, String osVersion, String browserVersion, float latitude, float longitude) {
        this.lIP = lIP;
        this.userEmail = userEmail;
        this.passwd = passwd;
        this.osVersion = osVersion;
        this.browserVersion = browserVersion;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getlIP() {
        return lIP;
    }

    public void setlIP(String lIP) {
        this.lIP = lIP;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getBrowserVersion() {
        return browserVersion;
    }

    public void setBrowserVersion(String browserVersion) {
        this.browserVersion = browserVersion;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public int getTripID() {
        return TRIP_ID;
    }

    @Override
    public String toString() {
        return "AuthorizationParameters{" +
                "lIP='" + lIP + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", passwd='" + passwd + '\'' +
                ", osVersion='" + osVersion + '\'' +
                ", browserVersion='" + browserVersion + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", tripID=" + TRIP_ID +
                '}';
    }
}
