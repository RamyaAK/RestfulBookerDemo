package restful_booker_client.clients.create_new_booking;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class CreateBookingClient {

    public CreateBookingResponse createNewBooking(CreateBookingRequest createBookingRequest){
        String url = String.format("%s/booking","https://restful-booker.herokuapp.com");
        System.out.println(url);
        Response response = given()
                .contentType("application/json")
                .when()
                .body(createBookingRequest)
                .post(url)
                .then()
                .log().all()
                .extract().response();

        CreateBookingResponse createBookingResponse = response.as(CreateBookingResponse.class);
        createBookingResponse.setHttpStatusCode(response.getStatusCode());
        return createBookingResponse;

    }

}
