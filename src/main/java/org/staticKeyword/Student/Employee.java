package org.staticKeyword.Student;

public class Employee {
    private String name;
    private String jobTitle;
    private double hourlyWage;
    private static double minimumWage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static double getMinimumWage() {
        return minimumWage;
    }

    public static void setMinimumWage(double minimumWage) {
        Employee.minimumWage = minimumWage;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        if(hourlyWage < minimumWage){
            hourlyWage = minimumWage;
        }
        this.hourlyWage = hourlyWage;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
