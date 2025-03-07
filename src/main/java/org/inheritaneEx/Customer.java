package org.inheritaneEx;

public class Customer extends UserAccount{

    public Customer(String username, String password, String fullName) {
        super(username, password, fullName);
    }

    @Override
    public void accessWebsite(){
        System.out.println("Accessing website as a customer ");
    }
}
