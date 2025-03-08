package org.polymorphismEx;

public class Customer extends UserAccount {

    private static int minAdminPassLength;

    public Customer(String username, String password, String fullName) {
        super(username, password, fullName);
    }

    @Override
    public void accessWebsite(){
        System.out.println("Accessing website as a customer ");
    }

    @Override
    public boolean changePassword(String newPass, String confrimPass){
        if (newPass.length() < minAdminPassLength || confrimPass.length() < minAdminPassLength) return false;
        return (newPass.equals(confrimPass));

    }
    public static int getMinAdminPassLength() {
        return minAdminPassLength;
    }

    public static void setMinAdminPassLength(int minAdminPassLength) {
        Customer.minAdminPassLength = minAdminPassLength;
    }
}
