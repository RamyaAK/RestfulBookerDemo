package restful_booker_client.builders;

import restful_booker_client.clients.update_booking.UpdateBookingRequest;
import restful_booker_client.entities.Bookingdates;

public class UpdateBookingDetailsBuilder {

    UpdateBookingRequest updateBookingRequest;
    Bookingdates bookingdates;

    public UpdateBookingDetailsBuilder(){
        updateBookingRequest = new UpdateBookingRequest();
        bookingdates = new UpdateBookingDatesBuilder().build();
        updateBookingRequest.setFirstname("Rocky");
        updateBookingRequest.setLastname("bhai");
        updateBookingRequest.setTotalprice(2222);
        updateBookingRequest.setDepositpaid(true);
        updateBookingRequest.setBookingdates(bookingdates);
        updateBookingRequest.setAdditionalneeds("Nothing");

    }
    public UpdateBookingRequest build(){
        return updateBookingRequest;
    }
}
