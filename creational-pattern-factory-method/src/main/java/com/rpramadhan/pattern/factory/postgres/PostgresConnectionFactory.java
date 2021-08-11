package com.rpramadhan.pattern.factory.postgres;

import com.rpramadhan.pattern.factory.Accessor;
import com.rpramadhan.pattern.factory.ConnectionFactory;

public class PostgresConnectionFactory extends ConnectionFactory {

  @Override
  public Accessor initAccessor(String configFileName) {
    return new PostgresAccessor(readConfig(configFileName));
  }
}
