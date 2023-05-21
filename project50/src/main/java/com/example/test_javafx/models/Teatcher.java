package com.example.test_javafx.models;

public class Teatcher extends User {
    private String course;
    private String phone;
    private String name;

//name,username,password,phone,course
    public Teatcher(String name ,String username, String password, String phone,String course) {
        super(username, password);
        this.course = course;
        this.phone=phone;
        this.name=name;
    }

    public String toStringCsv() {
        return this.name+","+this.getUsername()+","+this.getPassword()+","+this.phone+","+this.course;
    }

    public String getCourse() {
        return course;
    }

    public void addLecture(String title, String location) {
        // Code to add a new lecture to the instructor's course
    }

    public void editLecture(String title, String newLocation) {
        // Code to edit an existing lecture of the instructor's course
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void recordAttendance(String studentId, boolean present) {
        // Code to record attendance of a student in the instructor's course
    }

    public void importAttendance(String filePath) {
        // Code to import attendance from a file for the instructor's course
    }

    public void generateAttendanceReport() {
        // Code to generate the attendance report for the instructor's course
    }
}
