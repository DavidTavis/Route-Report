package com.report.route.data.remote.registration;

import com.report.route.data.model.registration.Registration;
import com.report.route.data.model.registration.RegistrationResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by TechnoA on 18.07.2017.
 */

public interface RegistrationService {

    String BASE_URL = "https://travelerassistance.net:8456";

    @Headers({"Accept: application/json"})
    @POST("/wpajsonarfull")
    Call<RegistrationResponse> registration(@Body Registration registration);
//    Call<ResponseBody> registration(@Body Registration registration);

}
