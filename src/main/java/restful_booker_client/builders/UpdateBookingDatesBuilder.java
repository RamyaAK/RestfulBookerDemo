package restful_booker_client.builders;

import restful_booker_client.entities.Bookingdates;

public class UpdateBookingDatesBuilder {
    Bookingdates bookingdates;

   public UpdateBookingDatesBuilder(){
        bookingdates = new Bookingdates();
        bookingdates.setCheckin("2023-01-01");
        bookingdates.setCheckout("2023-01-01");
    }
    public Bookingdates build(){
       return bookingdates;
    }

}
