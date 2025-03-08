package org.polymorphismEx;

public class AdminUser extends UserAccount {

    private static int minAdminPassLength;
    public AdminUser(String username, String password, String fullName) {
        super(username, password, fullName);
    }

    @Override
    public void accessWebsite() {
        System.out.println("Accessing website with admin rights");
    }

    @Override
    public boolean changePassword(String newPass, String confrimPass){
        if (newPass.length() < minAdminPassLength || confrimPass.length() < minAdminPassLength) return false;
        return (newPass.equals(confrimPass));

    }

    public boolean changePassword(String newPass, String confrimPass, UserAccount userAccount){
        return userAccount.changePassword(newPass, confrimPass);

    }

    public static int getMinAdminPassLength() {
        return minAdminPassLength;
    }

    public static void setMinAdminPassLength(int minAdminPassLength) {
        AdminUser.minAdminPassLength = minAdminPassLength;
    }
}
