package database;

import models.School;

import java.util.ArrayList;
import java.util.List;

public class SchoolDataBase {
//    This is where we write to Write to AND This is where we want to Read to
//
    private List<School>schools = new ArrayList<>();

    public School findById(long id) {
        return schools.get((int) id);
    }

    public void delete(School school) {
//        We remove one "school" from schools from delete() method in the implementation Class
        schools.remove(school);
    }


    public void add(School school) {
//            We add one "school" from schools from "add()" method in the implementation Class
        schools.add(school);
    }

    public List<School> getAll() {
        return schools;
    }
}
