package com.rajat.concurrency;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author rajatsrivastava
 **/
public class MultipleCallableRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        List<CallableTask> tasks = List.of(new CallableTask("Rajat"), new CallableTask("Ranga"), new CallableTask("Billa"));

        List<Future<String>> results = executorService.invokeAll(tasks);

        for (Future<String> result : results) {
            System.out.println(result.get());
        }

        executorService.shutdown();

    }
}
