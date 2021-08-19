package com.rpramadhan.pattern.service.car;

import com.rpramadhan.pattern.service.RescheduleCalculationService;

public class CarRescheduleCalculationService implements RescheduleCalculationService {

  @Override
  public Double calculateRescheduleCost(Long bookingId, Integer minutesToDeparture) {
    return 2d;
  }
}
