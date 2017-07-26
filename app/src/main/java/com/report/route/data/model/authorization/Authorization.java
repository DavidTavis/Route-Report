package com.report.route.data.model.authorization;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Authorization {

    @SerializedName("name") @Expose public final String NAME = "AUTHENTICATION_WEB";
    @SerializedName("parameters") @Expose public AuthorizationParameters parameters;

    public Authorization() {
    }

    public Authorization(AuthorizationParameters parameters) {
        super();
        this.parameters = parameters;
    }

    public String getNAME() {
        return NAME;
    }

    public AuthorizationParameters getParameters() {
        return parameters;
    }

    public void setParameters(AuthorizationParameters parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return "Authorization{" +
                "NAME='" + NAME + '\'' +
                ", parameters=" + parameters +
                '}';
    }
}
