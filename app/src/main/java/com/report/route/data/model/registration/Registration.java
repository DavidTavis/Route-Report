package com.report.route.data.model.registration;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Registration {

    @SerializedName("name") @Expose private final String name = "USER_REGISTRATION_WEB";
    @SerializedName("parameters") @Expose private Parameters parameters;

    public Registration() {
    }

    public Registration(Parameters parameters) {
        super();
        this.parameters = parameters;
    }
//    public Registration(String name, Parameters parameters) {
//        super();
//        this.name = name;
//        this.parameters = parameters;
//    }

    public Parameters getParameters() {
        return parameters;
    }

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "name='" + name + '\'' +
                ", parameters=" + parameters +
                '}';
    }
}