package com.rpramadhan.pattern.factory.concrete;

import com.rpramadhan.pattern.factory.CalculationServiceFactory;
import com.rpramadhan.pattern.service.RefundCalculationService;
import com.rpramadhan.pattern.service.RescheduleCalculationService;
import com.rpramadhan.pattern.service.bus.BusRefundCalculationService;
import com.rpramadhan.pattern.service.bus.BusRescheduleCalculationService;

public class BusCalculationServiceFactory extends CalculationServiceFactory {

  public RefundCalculationService initRefundCalculationService() {
    return new BusRefundCalculationService();
  }

  public RescheduleCalculationService initRescheduleCalculationService() {
    return new BusRescheduleCalculationService();
  }

}
