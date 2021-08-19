package com.rpramadhan.pattern.service;

public interface RescheduleCalculationService {

  public Double calculateRescheduleCost(Long bookingId, Integer minutesToDeparture);

}
