package com.rajat.concurrency;

import java.util.concurrent.*;

/**
 * @author rajatsrivastava
 **/

class CallableTask implements Callable<String> {

    private String name;

    public CallableTask(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Hello " + name;
    }
}

public class CallableRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> welcomeFuture = executorService.submit(new CallableTask("Rajat"));
        System.out.println("new CallableTask(\"Rajat\") executed");

        String welcomeMessage = welcomeFuture.get();
        System.out.println(welcomeMessage);
        executorService.shutdown();
        System.out.println("Main completed");
    }
}
