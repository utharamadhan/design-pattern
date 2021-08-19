package com.rpramadhan.pattern.service.car;

import com.rpramadhan.pattern.service.RefundCalculationService;

public class CarRefundCalculationService implements RefundCalculationService {

  @Override
  public Double calculateRefundAmount(Long bookingId, Integer minutesToDeparture) {
    return 1d;
  }
}
