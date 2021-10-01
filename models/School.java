package models;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private long schoolId;
    private Address address;
    private String description;

    private List<Class> classes = new ArrayList<Class>();

    private  SchoolType type;
    private  List<Staff> staffs = new ArrayList<>();
    private  List<Student> students = new ArrayList<>();


}