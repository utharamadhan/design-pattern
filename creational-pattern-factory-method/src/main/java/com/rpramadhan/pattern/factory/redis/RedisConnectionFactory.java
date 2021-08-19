package com.rpramadhan.pattern.factory.redis;

import com.rpramadhan.pattern.factory.Connection;
import com.rpramadhan.pattern.factory.ConnectionFactory;

public class RedisConnectionFactory extends ConnectionFactory {

  @Override
  public Connection createConnection(String configFileName) {
    return new RedisConnection(readConfig(configFileName));
  }

}
