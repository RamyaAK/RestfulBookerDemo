package restful_booker_client.clients.create_new_booking;

import restful_booker_client.clients.BaseResponse;
import restful_booker_client.entities.Booking;

public class CreateBookingResponse extends BaseResponse {

    public int bookingid;
    public Booking booking;

    public int getBookingid() {
        return bookingid;
    }

    public void setBookingid(int bookingid) {
        this.bookingid = bookingid;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}
