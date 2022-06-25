package com.ashcorp.batch.loadprocessor;

import com.ashcorp.batch.loadprocessor.service.OktaService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CompletableFuture;

@SpringBootApplication
@RequiredArgsConstructor
public class LoadProcessorApplication implements CommandLineRunner {

    private final OktaService oktaService;

    public static void main(String[] args) {
        SpringApplication.run(LoadProcessorApplication.class, args).close();
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("hello world.");

        for (int i = 0; i < args.length; i++) {
            System.out.println("arg : " + i);
            System.out.println(args[i]);
        }

        System.out.println("job ends");

        System.out.println("start bulk data");
        CompletableFuture<String> response = oktaService.loadBulkData();
        String res = response.get();

        System.out.println("finished build data : " + res);
    }
}
