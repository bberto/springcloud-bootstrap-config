package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class DemoAdminApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoAdminApplication.class, args);
  }
}
