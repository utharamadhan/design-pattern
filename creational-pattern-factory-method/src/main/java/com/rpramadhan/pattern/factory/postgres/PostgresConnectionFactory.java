package com.rpramadhan.pattern.factory.postgres;

import com.rpramadhan.pattern.factory.Connection;
import com.rpramadhan.pattern.factory.ConnectionFactory;

public class PostgresConnectionFactory extends ConnectionFactory {

  @Override
  public Connection createConnection(String configFileName) {
    return new PostgresConnection(readConfig(configFileName));
  }
}
