package restful_booker_client.clients.delete_booking_by_id;

import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class DeleteBookingByIdClient {

    public void deleteBookingById(String token, int booking_id){
        String url = String.format("%s/booking/%d","https://restful-booker.herokuapp.com",booking_id);
        System.out.println(url);

        Response response = given()
                .contentType("application/json")
                .header("Cookie","token="+token)
                .when()
                .delete(url)
                .then()
                .statusCode(201)
                .log().all()
                .extract().response();

        String jsonStringResponse = response.asString();
        System.out.println(jsonStringResponse);
        Assert.assertEquals(jsonStringResponse.contains("Created"),true);
    }
}
