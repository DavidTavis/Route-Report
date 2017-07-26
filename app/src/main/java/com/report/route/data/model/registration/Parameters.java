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
    @SerializedName("LANGUAGE_CODE") @Expose private final String LANGUAGE_CODE = "ru-RU";
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
