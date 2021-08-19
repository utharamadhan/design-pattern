package com.rpramadhan.pattern.factory.postgres;

import com.rpramadhan.pattern.factory.Connection;

import java.util.Map;

public class PostgresConnection implements Connection {

  private Map<String, String> configMap;

  public PostgresConnection(Map<String, String> configMap) {
    this.configMap = configMap;
  }

  @Override
  public void connect() {
    System.out.println("connected to postgres");
  }

}
