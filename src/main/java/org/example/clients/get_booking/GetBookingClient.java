package org.example.clients.get_booking;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GetBookingClient {
 public GetBookingResponse[] getBookingIds(){
     String url = String.format("%s/booking","https://restful-booker.herokuapp.com" );

     Response response = given()
             .contentType("application/json")
             .when()
             .get(url)
             .then()
             .statusCode(200)
             .log()
             .all()
             .extract().response();

     GetBookingResponse[] getBookingResponse = response.as(GetBookingResponse[].class);

     return getBookingResponse;

 }
}
