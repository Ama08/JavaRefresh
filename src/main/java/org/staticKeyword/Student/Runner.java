package org.staticKeyword.Student;

public class Runner {
    public static void main(String[] args) {

        System.out.println(EnergyMatterCalculator.matterToEnergy(32));
        System.out.println(EnergyMatterCalculator.matterToEnergy(25));

        Employee.setMinimumWage(9.53);

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        employee1.setHourlyWage(5.32);
        employee2.setHourlyWage(3.6);
        employee3.setHourlyWage(10.5);

        double wage1 = employee1.getHourlyWage();
        double wage2 = employee2.getHourlyWage();
        double wage3 = employee3.getHourlyWage();

        System.out.println(wage1 + " " +  wage2 + " " +  wage3);
    }
}
