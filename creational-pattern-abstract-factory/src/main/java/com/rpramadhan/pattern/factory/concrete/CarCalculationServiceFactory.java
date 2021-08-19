package com.rpramadhan.pattern.factory.concrete;

import com.rpramadhan.pattern.factory.CalculationServiceFactory;
import com.rpramadhan.pattern.service.RefundCalculationService;
import com.rpramadhan.pattern.service.RescheduleCalculationService;
import com.rpramadhan.pattern.service.car.CarRefundCalculationService;
import com.rpramadhan.pattern.service.car.CarRescheduleCalculationService;

public class CarCalculationServiceFactory extends CalculationServiceFactory {

  public RefundCalculationService initRefundCalculationService() {
    return new CarRefundCalculationService();
  }

  public RescheduleCalculationService initRescheduleCalculationService() {
    return new CarRescheduleCalculationService();
  }

}
