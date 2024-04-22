package restful_booker_client.clients.authentication;

import restful_booker_client.clients.BaseResponse;



public class AuthResponse extends BaseResponse {
    public String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
