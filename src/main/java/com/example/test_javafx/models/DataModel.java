package com.example.test_javafx.models;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class DataModel {
    private static ArrayList<Student> students = null;

    public DataModel() {
initialize();
    }

    public static void initialize() {
        if (students == null) {
            File file = new File("Student.csv");
            if (file.exists()) {
                try  {
                    Scanner scanner = new Scanner(file);
                    //read header line

                    students = new ArrayList<>();
                    while (scanner.hasNext()) {

                        String[] strings = scanner.nextLine().split(", ");
                       students.add(new Student(strings[0], strings[1], strings[2],strings[3],Float.parseFloat(strings[4])));
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            } else {
                students = new ArrayList<>();
                // add Test data when you run the program for the first time
                students.add(new Student("Student 1", "120210994", "0599480220", "gaza", 95f));
                students.add(new Student("Student 2", "120210994", "0599480220", "gaza", 95f));
                students.add(new Student("Student 3", "120210994", "0599480220", "gaza", 95f));
                students.add(new Student("Student 4", "120210994", "0599480220", "gaza", 95f));
            }
        }
    }

    public void save_Students() {
        try (PrintWriter pw = new PrintWriter("students.csv")) {
            //print header line
            pw.println("name, gpa");
            for (Student s : students) {
                //print each student object as string
                pw.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getStudentByName(String name) {
        for (Student student : students) {
            if (Objects.equals(student.getName(), name)) {
                return student;
            }
        }
        return null;
    }



    public ArrayList<Student> getStudents() {
        return students;
    }

    public Student deleteStudentByName(String name) {
        for (Student student : students) {
            if (Objects.equals(student.getName(), name)) {
                students.remove(student);
                return student;
            }
        }
        return null;
    }
}
