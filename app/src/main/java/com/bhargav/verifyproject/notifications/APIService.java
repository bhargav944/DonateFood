package com.bhargav.verifyproject.notifications;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAxwMsWFE:APA91bEeThcontIWyGzXBd__aCZsBiwBSoWYcscUihHQEzWP_-QeJunW-c_WcbuFSwNFEpHZAsVVcMJASkzwJ-J2cSIq6CgsgY6QD09Bgaz6Z0T1D_c7nOgkO9h3JpZtwMWTZxNVj9DU"
    })

    @POST("fcm/send")
    Call<Response> sendNotification(@Body Sender body);
}
