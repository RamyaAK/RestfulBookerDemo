package org.example.clients.create_new_booking;

import org.example.clients.BaseResponse;
import org.example.entities.Booking;
import org.example.entities.Bookingdates;

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
