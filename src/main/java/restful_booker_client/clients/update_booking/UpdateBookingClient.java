package restful_booker_client.clients.update_booking;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UpdateBookingClient {
   public UpdateBookingResponse updateBookingDetails(UpdateBookingRequest requestBody,int booking_id,String token){
       String url = String.format("%s/booking/%d","https://restful-booker.herokuapp.com",booking_id);
       System.out.println(url);
       String tokenValue = "token="+token;

       Response response = given()
               .contentType("application/json")
               .headers("Cookie",tokenValue)
               .when()
               .body(requestBody)
               .put(url)
               .then()
               .log().all()
               .extract().response();

       UpdateBookingResponse updateBookingResponse = response.as(UpdateBookingResponse.class);
       updateBookingResponse.setHttpStatusCode(response.getStatusCode());
       return updateBookingResponse;
   }
}
