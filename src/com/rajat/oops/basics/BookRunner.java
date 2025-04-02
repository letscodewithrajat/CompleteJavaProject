package com.rajat.oops.basics;

public class BookRunner {

    public static void main(String[] args) {

        Book book = new Book(123, "Art Book");
        book.addReview(new Review(10, "Boring", 3));
        book.addReview(new Review(11, "Very Boring", 1));
        System.out.println(book);


    }

}
