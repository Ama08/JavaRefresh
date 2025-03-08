package org.polymorphismEx;

public class Runner {
    public static void main(String[] args) {
        AdminUser adminUser1 = new AdminUser("Jay123", "12345","Jay Gale" );
        AdminUser adminUser2 = new AdminUser("lo45", "1564", "Loe Jet");
        Customer customer = new Customer("uji56", "1234", "Ujet Iko");
        Customer customer1 = new Customer("dh67", "123345", " Deo Hotk");

        AdminUser.setMinAdminPassLength(10);
        Customer.setMinAdminPassLength(7);
        UserAccountManager userAccountManager = new UserAccountManager();
        userAccountManager.addUser(adminUser1);
        userAccountManager.addUser(adminUser2);
        userAccountManager.addUser(customer1);
        userAccountManager.addUser(customer);
        boolean pass1 = customer1.changePassword("2561235", "2561235");
        boolean pass2 = customer.changePassword("123", "256");

        boolean pass =  adminUser2.changePassword("12345678962", "12345678963");

        boolean pass3 = adminUser1.changePassword("123457896", "1234567896", adminUser1);
        adminUser2.accessWebsite();
        customer1.accessWebsite();
        System.out.println(pass1 + " " + pass2);

        boolean login = userAccountManager.login("Ja123", "12345");

        System.out.println(login);
        System.out.println(pass);
        System.out.println(pass1);
    }
}
