package com.example.udemyspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SpringBootApplication
@EntityScan(basePackageClasses = com.example.udemyspring.User.class)
public class UdemySpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(UdemySpringApplication.class);


    }

}
