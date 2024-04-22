package org.example.builders;

import org.example.clients.create_new_booking.CreateBookingRequest;
import org.example.entities.Bookingdates;

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
