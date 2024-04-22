package restful_booker_client.clients.authentication;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class AuthClient {
    public AuthResponse authenticateUser(AuthRequest authRequest){
        String url= String.format("%s/auth","https://restful-booker.herokuapp.com");
        System.out.println(url);
        Response response = given()
                .when()
                .contentType("application/json")
                .body(authRequest)
                .post(url)
                .then()
                .log().all()
                .extract().response();
        AuthResponse authResponse =response.as(AuthResponse.class);
        authResponse.setHttpStatusCode(response.getStatusCode());

        return authResponse;
    }
}
