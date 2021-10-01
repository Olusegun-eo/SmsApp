package services;

import database.SchoolDataBase;
import exceptions.SchoolIsNotfoundException;
import models.School;

import java.util.List;

//This is the implementation of The School service
//By adding data to the database
public class SchoolServiceImplementaion implements SchoolService {
    SchoolDataBase schoolDataBase;
    @Override
    public void add(School school) {
        schoolDataBase.add(school);
    }

    @Override
    public void delete(School school) {
        schoolDataBase.delete(school);
    }

    @Override
//    HERE WE ADDED EXCEPTION SIGNATURE ==> "throws SchoolNotFoundException"
//    IF YOU ARE NOT THE FINAL CALLER I.E ANYONE THAT CALL THIS MEHTOD SHOULD THROW THIS EXCEPTION
//    IF we call this in the final caller(psvm) we will use try and catch when we invoke this Method
    public School update(long id, School school) throws SchoolIsNotfoundException {
        School foundSchool = schoolDataBase.findById(id);
        if (foundSchool == null){
            throw new SchoolIsNotfoundException("School with this id is not present");
        }

        return foundSchool;
    }

    @Override
    public School findById(long id) throws SchoolIsNotfoundException {
        School foundSchool = schoolDataBase.findById(id);
        if (foundSchool == null) {
            throw new SchoolIsNotfoundException("School with this id is not present");
        }
        return foundSchool;
    }

    @Override
    public List<School> getAll() {
        return schoolDataBase.getAll();
    }
}
