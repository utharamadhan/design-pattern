package com.rpramadhan.pattern;

import com.rpramadhan.pattern.factory.CalculationServiceFactory;
import com.rpramadhan.pattern.service.RefundCalculationService;
import com.rpramadhan.pattern.service.RescheduleCalculationService;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class TestAbstractFactory {

  Application application = new Application();

  @Test
  public void testCarCalculationServiceFactory() {
    CalculationServiceFactory calculationFactory = application.iniCalculationFactory("CAR");

    RefundCalculationService refundCalculationService =  calculationFactory.initRefundCalculationService();
    Double refundAmount = refundCalculationService.calculateRefundAmount(1L, 180);
    Assert.assertEquals(refundAmount.doubleValue(), 1d);

    RescheduleCalculationService rescheduleCalculationService =  calculationFactory.initRescheduleCalculationService();
    Double rescheduleAmount = rescheduleCalculationService.calculateRescheduleCost(1L, 180);
    Assert.assertEquals(rescheduleAmount.doubleValue(), 2d);
  }

  @Test
  public void testBusCalculationServiceFactory() {
    CalculationServiceFactory calculationFactory = application.iniCalculationFactory("BUS");

    RefundCalculationService refundCalculationService =  calculationFactory.initRefundCalculationService();
    Double refundAmount = refundCalculationService.calculateRefundAmount(1L, 180);
    Assert.assertEquals(refundAmount.doubleValue(), 3d);

    RescheduleCalculationService rescheduleCalculationService =  calculationFactory.initRescheduleCalculationService();
    Double rescheduleAmount = rescheduleCalculationService.calculateRescheduleCost(1L, 180);
    Assert.assertEquals(rescheduleAmount.doubleValue(), 4d);
  }

  @Test
  public void testUnregisteredCalculationServiceFactory() {
    Assert.assertThrows(IllegalArgumentException.class, () -> {
      application.iniCalculationFactory("FLIGHT");
    });
  }

}
