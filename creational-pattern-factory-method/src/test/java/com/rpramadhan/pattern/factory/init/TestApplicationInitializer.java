package com.rpramadhan.pattern.factory.init;

import com.rpramadhan.pattern.factory.ConnectionFactory;
import com.rpramadhan.pattern.factory.postgres.PostgresAccessor;
import com.rpramadhan.pattern.factory.postgres.PostgresConnectionFactory;
import com.rpramadhan.pattern.factory.redis.RedisAccessor;
import com.rpramadhan.pattern.factory.redis.RedisConnectionFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class TestApplicationInitializer {

  @Test
  public void testStartApplication_postgresCase() {
    ApplicationInitializer applicationInitializer = new ApplicationInitializer();
    ConnectionFactory accessor = applicationInitializer.initAccessor("postgres");
    Assert.assertTrue(accessor instanceof PostgresConnectionFactory);
  }

  @Test
  public void testStartApplication_redisCase() {
    ApplicationInitializer applicationInitializer = new ApplicationInitializer();
    ConnectionFactory accessor = applicationInitializer.initAccessor("redis");
    Assert.assertTrue(accessor instanceof RedisConnectionFactory);
  }

  @Test
  public void testStartApplication_exceptionThrown() {
    ApplicationInitializer applicationInitializer = new ApplicationInitializer();
    Assert.expectThrows(IllegalArgumentException.class, () -> {
      applicationInitializer.initAccessor("mongodb");
    });
  }
}
