package restfulbooker_api_tests.authentication;

import org.example.builders.UserAuthDetailsBuilder;
import org.example.clients.authentication.AuthClient;
import org.example.clients.authentication.AuthRequest;
import org.example.clients.authentication.AuthResponse;
import org.example.entities.UserDetails;
import org.testng.Assert;
import org.testng.annotations.Test;
import restfulbooker_api_tests.BaseTest;

public class AuthTest extends BaseTest {

   @Test(priority = 0)
   public void UserAuthTest(){
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
