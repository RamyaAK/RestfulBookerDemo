package restfulbooker_api_tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    @BeforeClass
    public void setUp() {
        System.out.println("Starting the Restful Booker Store!");
        System.out.println("Welcome!");
    }

    @AfterClass
    public void teardown() {
        System.out.println("Restful Booker Store is now closed.");
        System.out.println("Thank you for visiting our Book Store!");

    }
}
