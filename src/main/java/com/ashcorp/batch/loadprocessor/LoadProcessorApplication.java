package com.ashcorp.batch.loadprocessor;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoadProcessorApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(LoadProcessorApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("hello world.");

        for (int i = 0; i < args.length; i++) {
            System.out.println("arg : " + i);
            System.out.println(args[i]);
        }

        System.out.println("job ends");
    }
}
