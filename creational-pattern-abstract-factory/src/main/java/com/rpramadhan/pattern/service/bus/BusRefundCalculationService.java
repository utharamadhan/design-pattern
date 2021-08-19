package com.rpramadhan.pattern.service.bus;

import com.rpramadhan.pattern.service.RefundCalculationService;

public class BusRefundCalculationService implements RefundCalculationService {

  @Override
  public Double calculateRefundAmount(Long bookingId, Integer minutesToDeparture) {
    return 3d;
  }
}
