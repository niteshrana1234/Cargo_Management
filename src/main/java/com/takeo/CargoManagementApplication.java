package com.takeo;

import com.takeo.model.Driver;
import com.takeo.repo.DriverRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CargoManagementApplication {

    public static void main(String[] args) {

      SpringApplication.run(CargoManagementApplication.class, args);

    }

}
