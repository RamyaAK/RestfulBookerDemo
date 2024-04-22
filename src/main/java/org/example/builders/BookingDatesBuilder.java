package org.example.builders;

import org.example.entities.Bookingdates;

public class BookingDatesBuilder {
  Bookingdates bookingdates;

  public BookingDatesBuilder(){
      bookingdates = new Bookingdates();
      bookingdates.setCheckin("2024-01-01");
      bookingdates.setCheckout("2024-01-01");
  }

  public Bookingdates build(){
      return bookingdates;
  }
}
