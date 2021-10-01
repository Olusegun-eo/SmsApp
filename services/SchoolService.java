package services;

import exceptions.SchoolIsNotfoundException;
import models.School;

import java.util.List;

public interface SchoolService {
    /*INTERFACE
    *Why services? Because of crud===> create a new school, delete a new school,
    * update school, and edit a school
    * Interfaces is a barrier btwn two ends
    * It has no implementation
    * It is a class that has Methods without bodies
    * all methods in an abtsract class are public hence no nedd to add keyword public
    * abstract classes can not be used === they are like human thought
    * unless implemented
    * It is used to create interaction AND it can be used by multiple classes
    * */

//    Service: Transacting with database
//    These are the service we will do for life as back enders
    void add(School school);
    void delete(School school);
    School update(long id, School school) throws SchoolIsNotfoundException;
    School findById(long id) throws SchoolIsNotfoundException;

    List<School> getAll();

//    After creating Service we create the implementation
// Crincles
}
