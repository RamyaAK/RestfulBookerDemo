package restful_booker_client.builders;

import restful_booker_client.clients.authentication.AuthRequest;

public class UserAuthDetailsBuilder {
    public AuthRequest authRequest;

    public UserAuthDetailsBuilder() {
        authRequest = new AuthRequest();
        authRequest.setUsername("admin");
        authRequest.setPassword("password123");
    }

    public AuthRequest build() {
        return authRequest;
    }
}
