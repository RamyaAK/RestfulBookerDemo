package restful_booker_client.builders;

import restful_booker_client.clients.create_new_booking.CreateBookingRequest;
import restful_booker_client.entities.Bookingdates;

public class BookingDetailsBuilder {

    CreateBookingRequest createBookingRequest;
    Bookingdates bookingDates;



    public BookingDetailsBuilder(){
        createBookingRequest = new CreateBookingRequest();
        bookingDates = new BookingDatesBuilder().build();

        createBookingRequest.setFirstname("RockStar");
        createBookingRequest.setLastname("London");
        createBookingRequest.setTotalprice(1234);
        createBookingRequest.setDepositpaid(true);
        createBookingRequest.setBookingdates(bookingDates);
        createBookingRequest.setAdditionalneeds("Breakfast and Lunch");
    }

    public CreateBookingRequest build(){
        return createBookingRequest;
    }
}
