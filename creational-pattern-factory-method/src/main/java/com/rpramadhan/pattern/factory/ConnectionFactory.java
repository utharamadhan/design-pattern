package com.rpramadhan.pattern.factory;

import java.util.HashMap;
import java.util.Map;

public abstract class ConnectionFactory {

  public abstract Connection createConnection(String configFileName);

  public Map<String, String> readConfig(String configFileName) {
    Map<String, String> map = new HashMap<>();
    System.out.printf("reading the config: %s\n", configFileName);
    return map;
  }

  public Connection connect(String configFileName) {
    Connection connection = createConnection(configFileName);
    connection.connect();
    return connection;
  }

}
