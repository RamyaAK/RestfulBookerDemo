package restfulbooker_api_tests.booking;

import org.example.clients.get_booking.GetBookingClient;
import org.example.clients.get_booking.GetBookingDetailsByIDClient;
import org.example.clients.get_booking.GetBookingDetailsByIDResponse;
import org.example.clients.get_booking.GetBookingResponse;
import org.example.entities.BookingDetails;
import org.example.entities.UserDetails;
import org.testng.Assert;
import org.testng.annotations.Test;
import restfulbooker_api_tests.BaseTest;

public class BookingTests extends BaseTest {

    BookingDetails bookingDetails = new BookingDetails();
    int bookingId;

    UserDetails userDetails = new UserDetails();
    String token;
    @Test(priority = 1)
    public void getAllBookingIdsTest(){
        GetBookingResponse[] getBookingResponse = new GetBookingClient().getBookingIds();
        System.out.println("Number of Booking Ids: " + getBookingResponse.length);
        System.out.println(getBookingResponse[0].getBookingid());
        Assert.assertNotNull(getBookingResponse[100].getBookingid());

        bookingDetails.setBookingId(getBookingResponse[0].getBookingid());
        System.out.println(bookingDetails.getBookingId());
        bookingId=bookingDetails.getBookingId();
    }

    @Test(priority = 2)
    public void getBookingDetailsByIDTest(){
        token = userDetails.getToken();
        GetBookingDetailsByIDResponse getBookingDetailsByIDResponse = new GetBookingDetailsByIDClient().getBookingDetailsByID(token,bookingId);
        Assert.assertEquals(getBookingDetailsByIDResponse.getHttpStatusCode(),200);
        Assert.assertNotNull(getBookingDetailsByIDResponse.getFirstname());
    }
}
