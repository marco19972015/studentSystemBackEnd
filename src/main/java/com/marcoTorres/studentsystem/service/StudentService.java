// The line below specifies the package where the interface  is located
package com.marcoTorres.studentsystem.service;
// These import statements import the necessary dependencies for the interface
// it imports the Student class from the model package and the list interface
// from the java.util package
import com.marcoTorres.studentsystem.model.Student;
import java.util.List;


// We declare the StudentService interface, which represents the contract for a
// student-related service
public interface StudentService {

  // This method declaration specifies that the implemented class should
  // provide an implementation for the saveStudent method. It takes a Student
  // object as a parameter and returns Student object
  public Student saveStudent(Student student);

  // This method declaration specifies that the implementing class should provide
  // an implementation for the getALLStudents method. it has no parameters and
  // returns a List of Student objects
  public List<Student> getALLStudents();
}
