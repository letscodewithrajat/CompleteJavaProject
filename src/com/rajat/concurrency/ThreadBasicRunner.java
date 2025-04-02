package com.rajat.concurrency;

/**
 * @author rajatsrivastava
 **/
class Task1 extends Thread {
    public void run() {
        System.out.println("Task 1 started");
        for (int i = 101; i <= 199; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Task 1 done");

    }
}

class Task2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Task 2 started");
        for (int i = 201; i <= 299; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Task 2 done");

    }
}


public class ThreadBasicRunner {

    public static void main(String[] args) throws InterruptedException {

        Task1 task1 = new Task1();
        // System.out.println("task1 state: " + task1.getState());
        Thread task2 = new Thread(new Task2());
        task2.setPriority(10);
        // System.out.println("task2 state: " + task2.getState());

        task1.start();
        //System.out.println("task1 state: " + task1.getState());

        task2.start();


        //System.out.println("task2 state: " + task2.getState());


        //wait for task 1 to complete
        task1.join();
        //wait for task 2 to complete
        task2.join();
        System.out.println("Task 3 started");
        for (int i = 301; i <= 399; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Task 3 done");


        System.out.println("Main Task done");
        //System.out.println("task2 state: " + task2.getState());
        //System.out.println("task1 state: " + task1.getState());
    }


}
