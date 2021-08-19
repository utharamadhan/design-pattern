package com.rpramadhan.pattern;

import com.rpramadhan.pattern.factory.CalculationServiceFactory;
import com.rpramadhan.pattern.factory.concrete.BusCalculationServiceFactory;
import com.rpramadhan.pattern.factory.concrete.CarCalculationServiceFactory;

public class Application {

  public CalculationServiceFactory iniCalculationFactory(String product) {
    CalculationServiceFactory calculationServiceFactory = null;
    if (product.equals("CAR")) {
      calculationServiceFactory = new CarCalculationServiceFactory();
    } else if (product.equals("BUS")) {
      calculationServiceFactory = new BusCalculationServiceFactory();
    }

    if (calculationServiceFactory == null) {
      throw new IllegalArgumentException("product is not registered");
    }

    return calculationServiceFactory;
  }

}
