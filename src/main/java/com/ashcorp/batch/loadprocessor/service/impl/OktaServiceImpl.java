package com.ashcorp.batch.loadprocessor.service.impl;

import com.ashcorp.batch.loadprocessor.service.OktaService;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
@RequiredArgsConstructor
public class OktaServiceImpl implements OktaService {


    @Override
    @Async("asyncExecutor")
    public CompletableFuture<String> loadBulkData() {

        System.out.println("Execute method asynchronously - "
                + Thread.currentThread().getName());
        try {
            Thread.sleep( 3 * 60 * 1000);
            return CompletableFuture.completedFuture("job executes");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return CompletableFuture.completedFuture("thread did not executes");
    }
}
