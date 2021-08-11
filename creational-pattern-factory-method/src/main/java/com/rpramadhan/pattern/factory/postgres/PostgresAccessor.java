package com.rpramadhan.pattern.factory.postgres;

import com.rpramadhan.pattern.factory.Accessor;
import com.rpramadhan.pattern.factory.ConnectionFactory;

import java.util.Map;

public class PostgresAccessor implements Accessor {

  private Map<String, String> configMap;

  public PostgresAccessor(Map<String, String> configMap) {
    this.configMap = configMap;
  }

  @Override
  public void connect() {
    System.out.println("connected to postgres");
  }

}
