package com.rpramadhan.pattern.factory.redis;

import com.rpramadhan.pattern.factory.Accessor;
import com.rpramadhan.pattern.factory.ConnectionFactory;

import java.util.Map;

public class RedisAccessor implements Accessor {

  private Map<String, String> configMap;

  public RedisAccessor(Map<String, String> configMap) {
    this.configMap = configMap;
  }

  @Override
  public void connect() {
    System.out.println("connected to redis");
  }

}
