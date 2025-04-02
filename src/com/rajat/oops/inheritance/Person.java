package com.rajat.oops.inheritance;

/**
 * @author rajatsrivastava
 **/
public class Person {
    private String name;
    private String email;
    private String phoneNumber;


    public Person(String name) {
        System.out.println("Person constructor");
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        // return getClass().getName() + "@#" + Integer.toHexString(hashCode());
        return "name -> " + name +
                " email -> " + email +
                " phoneNumber -> " + phoneNumber;
    }
}
