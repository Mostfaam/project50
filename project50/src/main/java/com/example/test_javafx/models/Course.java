package com.example.test_javafx.models;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private String subject;
    private String textbook;
    private String instructor;
    private String classRoom;
    private List<Lecture> lectures;
    private ArrayList<ArrayList> students=null;

    public Course(String courseName, String subject, String textbook, String instructor, String virtualRoom) {
        this.courseName = courseName;
        this.subject = subject;
        this.textbook = textbook;
        this.instructor = instructor;
        this.classRoom = virtualRoom;
        this.lectures = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public String getSubject() {
        return subject;
    }

    public String getTextbook() {
        return textbook;
    }

    public String getInstructor() {
        return instructor;
    }

    public String getVirtualRoom() {
        return classRoom;
    }

    public List<Lecture> getLectures() {
        return lectures;
    }

    public void addLecture(Lecture lecture) {
        lectures.add(lecture);
    }

    public void removeLecture(Lecture lecture) {
        lectures.remove(lecture);
    }

    // Other methods as needed
}
