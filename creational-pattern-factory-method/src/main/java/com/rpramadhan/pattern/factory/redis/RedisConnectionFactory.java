package com.rpramadhan.pattern.factory.redis;

import com.rpramadhan.pattern.factory.Accessor;
import com.rpramadhan.pattern.factory.ConnectionFactory;
import com.rpramadhan.pattern.factory.postgres.PostgresAccessor;

import java.util.Map;

public class RedisConnectionFactory extends ConnectionFactory {

  @Override
  public Accessor initAccessor(String configFileName) {
    return new PostgresAccessor(readConfig(configFileName));
  }

}
