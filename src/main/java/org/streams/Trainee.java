package org.streams;

public class Trainee {

    private String firstName;
    private String lastName;
    private String stream;
    private Integer week;
    private Integer age;
    private Double AverageGrade;

    public Trainee(String firstName, String lastName, String stream, Integer week, Integer age, Double averageGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.stream = stream;
        this.week = week;
        this.age = age;
        AverageGrade = averageGrade;
    }

    public Double getAverageGrade() {
        return AverageGrade;
    }

    public void setAverageGrade(Double averageGrade) {
        AverageGrade = averageGrade;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
