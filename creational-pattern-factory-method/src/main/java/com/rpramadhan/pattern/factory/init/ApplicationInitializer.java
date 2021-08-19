package com.rpramadhan.pattern.factory.init;

import com.rpramadhan.pattern.factory.Connection;
import com.rpramadhan.pattern.factory.ConnectionFactory;
import com.rpramadhan.pattern.factory.postgres.PostgresConnectionFactory;
import com.rpramadhan.pattern.factory.redis.RedisConnectionFactory;

public class ApplicationInitializer {

  private ConnectionFactory connectionFactory;

  public Connection initAccessor(String storageType) {

    if (storageType.equals("postgres")) {
      connectionFactory = new PostgresConnectionFactory();
    } else if (storageType.equals("redis")) {
      connectionFactory = new RedisConnectionFactory();
    }

    if (connectionFactory == null) {
      throw new IllegalArgumentException(String.format("unknown storageType: %s", storageType));
    }

    return connectionFactory.connect("file.config");
  }
}
