package com.rajat.concurrency;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author rajatsrivastava
 **/
public class MultipleAnyCallableRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        List<CallableTask> tasks = List.of(new CallableTask("Rajat"), new CallableTask("Ranga"), new CallableTask("Billa"));

        String result = executorService.invokeAny(tasks);
        System.out.println(result);
        executorService.shutdown();

    }
}
