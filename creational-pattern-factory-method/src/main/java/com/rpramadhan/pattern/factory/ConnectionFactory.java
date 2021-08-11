package com.rpramadhan.pattern.factory;

import java.util.HashMap;
import java.util.Map;

public abstract class ConnectionFactory {

  public abstract Accessor initAccessor(String configFileName);

  public Map<String, String> readConfig(String configFileName) {
    Map<String, String> map = new HashMap<>();
    System.out.printf("reading the config: %s\n", configFileName);
    return map;
  }

  public void connect(String configFileName) {
    Accessor accessorInterface = initAccessor(configFileName);
    accessorInterface.connect();
  }

}
