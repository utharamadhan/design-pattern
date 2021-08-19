package com.rpramadhan.pattern.service;

public interface RefundCalculationService {

  public Double calculateRefundAmount(Long bookingId, Integer minutesToDeparture);

}
