package restfulbooker_api_tests.authentication;

import restful_booker_client.builders.UserAuthDetailsBuilder;
import restful_booker_client.clients.authentication.AuthClient;
import restful_booker_client.clients.authentication.AuthRequest;
import restful_booker_client.clients.authentication.AuthResponse;
import restful_booker_client.entities.UserDetails;
import org.testng.Assert;
import org.testng.annotations.Test;
import restfulbooker_api_tests.BaseTest;

public class AuthTest extends BaseTest {

   @Test(priority = 1)
   public void userAuthTest(){
       AuthRequest authRequest = new UserAuthDetailsBuilder().build();
       AuthResponse authResponse = new AuthClient().authenticateUser(authRequest);

       Assert.assertEquals(authResponse.getHttpStatusCode(),200);
       Assert.assertNotNull(authResponse.getToken());

       UserDetails user = new UserDetails();
       user.setToken(authResponse.getToken());

       System.out.println(user.getToken()+" and "+authResponse.getToken());
       Assert.assertEquals(user.getToken(),authResponse.getToken());

    }

}
