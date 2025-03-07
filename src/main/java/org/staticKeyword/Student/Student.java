package org.staticKeyword.Student;

public class Student {
    public static String nameOfSchool;
    public String nameOfStudent;

    public String getStudentName() {
        return nameOfStudent;
    }

    public void setStudentName(String name) {
        this.nameOfStudent = name;
    }

    public static String getNameOfSchool() {
        return nameOfSchool;
    }

    public static void setNameOfSchool(String name) {
        nameOfSchool = name;
    }

}
