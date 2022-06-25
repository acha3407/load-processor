package com.ashcorp.batch.loadprocessor.service;

import java.util.concurrent.CompletableFuture;

public interface OktaService {

    CompletableFuture<String> loadBulkData();

}
