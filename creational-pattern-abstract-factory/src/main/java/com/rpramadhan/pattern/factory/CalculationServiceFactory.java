package com.rpramadhan.pattern.factory;

import com.rpramadhan.pattern.service.RefundCalculationService;
import com.rpramadhan.pattern.service.RescheduleCalculationService;

public abstract class CalculationServiceFactory {

  public abstract RefundCalculationService initRefundCalculationService();

  public abstract RescheduleCalculationService initRescheduleCalculationService();

}
