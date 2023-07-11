// Create a file that is an interface. An interface is a reference
// type in Jva that defines a contract of methods that a class implementing the
// interface must implement
// contains the definition of the interface, including its name, methods. constants
// and any other members
package com.marcoTorres.studentsystem.repository;
import com.marcoTorres.studentsystem.model.Student;

// The Spring Data KPA is a part of the larger Spring Data project, which aims to simplify
// database access and provide common data access functionalities for
// various data storage tech. Spring Data JPA specifically focuses on providing enhanced support for
// working with JPA (Java Persistence API) in spring applications/

// The JpaRepository interface is a generic interface provided by Spring Data JPA that
// extends the PagingAndSortingRepository interface. It provides a set of generic
// CRUD (Create, Read, Update, Delete) methods for working with JPA entities
import org.springframework.data.jpa.repository.JpaRepository;
// The Repository annotation is a specialization of the @Component annotation
// and is used to indicate that a class is a repository component in the Spring application
// context. It is typically applied to classes that are responsible for data access and persistence
// operations, such as database interactions
import org.springframework.stereotype.Repository;

// Here we use the Repository annotation to annotate the StudentRepository class
// This indicates that StudentRepository is a repository component and should be
// automatically detected and registered by the Spring container
@Repository
// Here StudentRepository interface extends the JpaRepository. The JpaRepository takes two
// type of parameters the entity class Student and the type of entity primary key Integer
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
