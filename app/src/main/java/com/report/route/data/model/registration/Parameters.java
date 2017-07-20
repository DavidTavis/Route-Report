package com.report.route.data.model.registration;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Parameters {

    @SerializedName("L_IP") @Expose private String lIp;
    @SerializedName("FIRST_NAME") @Expose private String firstName;
    @SerializedName("LAST_NAME") @Expose private String lastName;
    @SerializedName("USER_EMAIL") @Expose private String userEmail;
    @SerializedName("BIRTHDAY") @Expose private String birthday;
    @SerializedName("NICKNAME") @Expose private String nickname;
    @SerializedName("PASSWD") @Expose private String passwd;
    @SerializedName("GENDER") @Expose private Integer gender;
    @SerializedName("OS_VERSION") @Expose private String osVersion;
    @SerializedName("BROWSER_VERSION") @Expose private String browserVersion;
    @SerializedName("latitude") @Expose private Float latitude;
    @SerializedName("longitude") @Expose private Float longitude;
    @SerializedName("COUNTRY_ID") @Expose private final String COUNTRY_ID = "UA";
    @SerializedName("LANGUAGE_CODE") @Expose private final String LANGUAGE_CODE = "Ru_RU";
    @SerializedName("ID_TRIP") @Expose private final Integer TRIP_ID = 0;


    public Parameters() {
    }

    public Parameters(String lIp, String firstName, String lastName, String userEmail, String birthday,
                      String nickname, String passwd, Integer gender, String osVersion, String browserVersion,
                      Float latitude, Float longitude) {
        super();
        this.lIp = lIp;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userEmail = userEmail;
        this.birthday = birthday;
        this.nickname = nickname;
        this.passwd = passwd;
        this.gender = gender;
        this.osVersion = osVersion;
        this.browserVersion = browserVersion;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getlIp() {
        return lIp;
    }

    public void setlIp(String lIp) {
        this.lIp = lIp;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
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

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Parameters{" +
                "lIp='" + lIp + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", birthday='" + birthday + '\'' +
                ", nickname='" + nickname + '\'' +
                ", passwd='" + passwd + '\'' +
                ", gender=" + gender +
                ", osVersion='" + osVersion + '\'' +
                ", browserVersion='" + browserVersion + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", COUNTRY_ID='" + COUNTRY_ID + '\'' +
                ", LANGUAGE_CODE='" + LANGUAGE_CODE + '\'' +
                ", TRIP_ID=" + TRIP_ID +
                '}';
    }
}
