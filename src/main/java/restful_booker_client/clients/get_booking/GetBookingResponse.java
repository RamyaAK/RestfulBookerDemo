package restful_booker_client.clients.get_booking;

import restful_booker_client.clients.BaseResponse;

public class GetBookingResponse extends BaseResponse {
    public int bookingid;

    public int getBookingid() {
        return bookingid;
    }

    public void setBookingid(int bookingid) {
        this.bookingid = bookingid;
    }
}
