package restfulbooker_api_tests.booking;

import restful_booker_client.builders.BookingDetailsBuilder;
import restful_booker_client.clients.create_new_booking.CreateBookingClient;
import restful_booker_client.clients.create_new_booking.CreateBookingRequest;
import restful_booker_client.clients.create_new_booking.CreateBookingResponse;
import restful_booker_client.clients.get_booking.GetBookingClient;
import restful_booker_client.clients.get_booking.GetBookingDetailsByIDClient;
import restful_booker_client.clients.get_booking.GetBookingDetailsByIDResponse;
import restful_booker_client.clients.get_booking.GetBookingResponse;
import restful_booker_client.entities.Booking;
import restful_booker_client.entities.UserDetails;
import org.testng.Assert;
import org.testng.annotations.Test;
import restfulbooker_api_tests.BaseTest;

public class BookingTests extends BaseTest {

    Booking booking = new Booking();
    int bookingId;

    UserDetails userDetails = new UserDetails();
    String token;
    @Test(priority = 1)
    public void getAllBookingIdsTest(){
        GetBookingResponse[] getBookingResponse = new GetBookingClient().getBookingIds();
        System.out.println("Number of Booking Ids: " + getBookingResponse.length);
        System.out.println(getBookingResponse[0].getBookingid());
        Assert.assertNotNull(getBookingResponse[100].getBookingid());

        booking.setBookingId(getBookingResponse[0].getBookingid());
        System.out.println(booking.getBookingId());
        bookingId= booking.getBookingId();
    }

    @Test(priority = 2)
    public void getBookingDetailsByIDTest(){
        token = userDetails.getToken();
        GetBookingDetailsByIDResponse getBookingDetailsByIDResponse = new GetBookingDetailsByIDClient().getBookingDetailsByID(token,bookingId);
        Assert.assertEquals(getBookingDetailsByIDResponse.getHttpStatusCode(),200);
        Assert.assertNotNull(getBookingDetailsByIDResponse.getFirstname());
    }

    @Test(priority = 3)
    public void createANewBookingTest(){
        CreateBookingRequest createBookingRequest = new BookingDetailsBuilder().build();
        CreateBookingResponse response = new CreateBookingClient().createNewBooking(createBookingRequest);

        Assert.assertEquals(response.getHttpStatusCode(),200);
        Assert.assertEquals(response.getBooking().getFirstname(),"RockStar");
        Assert.assertEquals(response.getBooking().getAdditionalneeds(),"Breakfast and Lunch");
        Assert.assertEquals(response.getBooking().getBookingdates().getCheckin(),"2024-01-01");
        Assert.assertEquals(response.getBooking().getBookingdates().getCheckout(),"2024-01-01");

        bookingId = response.getBookingid();
        booking.setBookingId(bookingId);
        System.out.println("New Booking Id = "+bookingId);
        System.out.println("New Booking Id set to work on  = "+ booking.getBookingId());

    }
}
