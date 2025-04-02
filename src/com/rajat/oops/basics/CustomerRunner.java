package com.rajat.oops.basics;

/**
 * @author rajatsrivastava
 **/
public class CustomerRunner {
    public static void main(String[] args) {
        Customer customer = new Customer("Ranga", new Address("58", "York", "YO1 6DP"));
        System.out.println(customer);
        customer.setWorkAddress(new Address("2", "Leeds", "LS1 6DP"));
        System.out.println(customer);
    }
}
