package ge.edu.btu.model;

import java.util.ArrayList;

public class Studentdata {
    private static ArrayList<Student> studentarray;

    private Studentdata() {
    }
    public static ArrayList<Student> getInstance(){
        if (studentarray==null) {
            studentarray = new ArrayList<Student>();
        }
        return studentarray;
    }
}
