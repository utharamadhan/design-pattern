package com.rpramadhan.pattern.factory.redis;

import com.rpramadhan.pattern.factory.Connection;

import java.util.Map;

public class RedisConnection implements Connection {

  private Map<String, String> configMap;

  public RedisConnection(Map<String, String> configMap) {
    this.configMap = configMap;
  }

  @Override
  public void connect() {
    System.out.println("connected to redis");
  }

}
