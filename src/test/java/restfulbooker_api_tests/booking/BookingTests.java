package restfulbooker_api_tests.booking;

import org.example.clients.get_booking.GetBookingClient;
import org.example.clients.get_booking.GetBookingResponse;
import org.example.entities.BookingDetails;
import org.testng.Assert;
import org.testng.annotations.Test;
import restfulbooker_api_tests.BaseTest;

public class BookingTests extends BaseTest {
    @Test
    public void getAllBookingIdsTest(){
        GetBookingResponse[] getBookingResponse = new GetBookingClient().getBookingIds();
        System.out.println("Number of Booking Ids: " + getBookingResponse.length);
        System.out.println(getBookingResponse[0].getBookingid());
        Assert.assertNotNull(getBookingResponse[100].getBookingid());

        BookingDetails bookingDetails = new BookingDetails();
        bookingDetails.setBookingId(getBookingResponse[0].getBookingid());
        System.out.println(bookingDetails.getBookingId());
    }
}
