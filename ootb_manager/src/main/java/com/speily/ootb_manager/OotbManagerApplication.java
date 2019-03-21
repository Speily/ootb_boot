package com.speily.ootb_manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.speily.*")
public class OotbManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OotbManagerApplication.class, args);
    }

}
