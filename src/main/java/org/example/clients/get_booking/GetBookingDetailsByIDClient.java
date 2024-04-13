package org.example.clients.get_booking;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GetBookingDetailsByIDClient {

    public GetBookingDetailsByIDResponse getBookingDetailsByID(String token,int bookingId){
        String url = String.format("%s/%d","https://restful-booker.herokuapp.com/booking",bookingId);
        System.out.println(url);

        Response response = given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json")
                .when()
                .get(url)
                .then()
                .statusCode(200)
                .log().all().extract().response();
        GetBookingDetailsByIDResponse getBookingDetailsByIDResponse = response.as(GetBookingDetailsByIDResponse.class);
        getBookingDetailsByIDResponse.setHttpStatusCode(response.getStatusCode());
        return getBookingDetailsByIDResponse;
    }
}
