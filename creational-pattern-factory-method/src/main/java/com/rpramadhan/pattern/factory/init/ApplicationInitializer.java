package com.rpramadhan.pattern.factory.init;

import com.rpramadhan.pattern.factory.ConnectionFactory;
import com.rpramadhan.pattern.factory.postgres.PostgresAccessor;
import com.rpramadhan.pattern.factory.postgres.PostgresConnectionFactory;
import com.rpramadhan.pattern.factory.redis.RedisAccessor;
import com.rpramadhan.pattern.factory.redis.RedisConnectionFactory;

public class ApplicationInitializer {

  private ConnectionFactory accessor;

  public ConnectionFactory initAccessor(String storageType) {

    if (storageType.equals("postgres")) {
      accessor = new PostgresConnectionFactory();
    } else if (storageType.equals("redis")) {
      accessor = new RedisConnectionFactory();
    }

    if (accessor == null) {
      throw new IllegalArgumentException(String.format("unknown storageType: %s", storageType));
    }

    accessor.connect("file.config");
    return accessor;
  }
}
