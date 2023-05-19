package com.example.test_javafx.models;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DataModelTeatcher {
    public DataModelTeatcher() {
        initialize();
    }

    private static ArrayList<Teatcher> teatchers = null;
    public static void initialize() {
        if (teatchers == null) {
            File file = new File("teatchers.csv");
            if (file.exists()) {
                try  {
                    Scanner scanner = new Scanner(file);
                    //read header line

                    teatchers = new ArrayList<>();
                    while (scanner.hasNext()) {

                        String[] strings = scanner.nextLine().split(",");
                        teatchers.add(new Teatcher(strings[0], strings[1], strings[2],strings[3],strings[4]));
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            } else {
                teatchers = new ArrayList<>();
                // add Test data when you run the program for the first time
                teatchers.add(new Teatcher("mostfa", "mostfa_moq", "123456","0595921811", "program" ));
            }
        }
    }

    public static ArrayList<Teatcher> getTeatchers() {
        return teatchers;
    }
    public static void addTeatcher(Teatcher teatcher){
        teatchers.add(teatcher);
    }
    public static void deleteTeatcher(Teatcher teatcher){
        teatchers.remove(teatcher);
    }
    //name,username,password,phone,course
    public void saveTeatchers() {
        try (PrintWriter pw = new PrintWriter("teatchers.csv")) {
            //print header line
            pw.println("name, username,password,phone,course");
            for (Teatcher s : teatchers) {
                //print each student object as string
                pw.println(s.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    }