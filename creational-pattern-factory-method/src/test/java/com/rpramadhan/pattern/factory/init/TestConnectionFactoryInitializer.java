package com.rpramadhan.pattern.factory.init;

import com.rpramadhan.pattern.factory.Connection;
import com.rpramadhan.pattern.factory.ConnectionFactory;
import com.rpramadhan.pattern.factory.postgres.PostgresConnection;
import com.rpramadhan.pattern.factory.postgres.PostgresConnectionFactory;
import com.rpramadhan.pattern.factory.redis.RedisConnection;
import com.rpramadhan.pattern.factory.redis.RedisConnectionFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class TestConnectionFactoryInitializer {

  @Test
  public void testStartApplication_postgresCase() {
    ApplicationInitializer applicationInitializer = new ApplicationInitializer();
    Connection connection = applicationInitializer.initAccessor("postgres");
    Assert.assertTrue(connection instanceof PostgresConnection);
  }

  @Test
  public void testStartApplication_redisCase() {
    ApplicationInitializer applicationInitializer = new ApplicationInitializer();
    Connection connection = applicationInitializer.initAccessor("redis");
    Assert.assertTrue(connection instanceof RedisConnection);
  }

  @Test
  public void testStartApplication_exceptionThrown() {
    ApplicationInitializer applicationInitializer = new ApplicationInitializer();
    Assert.expectThrows(IllegalArgumentException.class, () -> {
      applicationInitializer.initAccessor("mongodb");
    });
  }
}
