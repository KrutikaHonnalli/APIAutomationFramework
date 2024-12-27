package com.APIAutomationFramework.modules;

import com.APIAutomationFramework.pojos.*;
import com.google.gson.Gson;

import java.util.List;

public class PayloadManager {
    Gson gson;

    public String CraeteBookingPayload() {
        Booking BookingObject = new Booking();
        BookingObject.setFirstname("Jim");
        BookingObject.setLastname("Brown");
        BookingObject.setTotalprice(111);
        BookingObject.setDepositpaid(true);
        BookingObject.setAdditionalneeds("Lunch");

        Bookingdates BookingDateObject = new Bookingdates();
        BookingDateObject.setCheckin("2018-01-01");
        BookingDateObject.setCheckout("2019-01-01");
        BookingObject.setBookingdates(BookingDateObject);
        gson = new Gson();
        String JsonPayload = gson.toJson(BookingObject);
        return JsonPayload;
    }

    public BookingResponse bookingResponse(String responseData) {
        gson = new Gson();
        BookingResponse bookingObject = gson.fromJson(responseData, BookingResponse.class);
        return bookingObject;
    }

    public String AuthPayload() {
        Auth authObject = new Auth();
        authObject.setUsername("admin");
        authObject.setPassword("password123");
        gson = new Gson();
        String AuthJson = gson.toJson(authObject);
        return AuthJson;
    }

    public TokenResponse tokenResponse(String tokenObject) {
        gson = new Gson();
        TokenResponse tokenValue = gson.fromJson(tokenObject, TokenResponse.class);
        return tokenValue;
    }
}


