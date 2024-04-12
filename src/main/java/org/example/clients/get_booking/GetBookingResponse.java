package org.example.clients.get_booking;

import org.example.clients.BaseResponse;

public class GetBookingResponse extends BaseResponse {
    public int bookingid;

    public int getBookingid() {
        return bookingid;
    }

    public void setBookingid(int bookingid) {
        this.bookingid = bookingid;
    }
}
