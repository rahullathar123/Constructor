package com.company;

public class VipCustomer {

    private String name;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    private double creditLimit;
    private String emailAddress;


    public VipCustomer() {
        this("deafultName",5000,"default123@gmail.com");
        System.out.println("1 st constructor is called");

    }

    public VipCustomer(String name, double creditLimit) {
       this(name,creditLimit,"default123@gmail.com");
        System.out.println("2nd constructor is called");
    }


    public VipCustomer(String name, double creditLimit, String emailAddress) {
        System.out.println("3rd constructor  is called");
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
}
