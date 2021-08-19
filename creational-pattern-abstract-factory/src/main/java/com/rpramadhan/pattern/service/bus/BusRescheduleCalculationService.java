package com.rpramadhan.pattern.service.bus;

import com.rpramadhan.pattern.service.RescheduleCalculationService;

public class BusRescheduleCalculationService implements RescheduleCalculationService {

  @Override
  public Double calculateRescheduleCost(Long bookingId, Integer minutesToDeparture) {
    return 4d;
  }
}
