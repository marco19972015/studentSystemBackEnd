package com.marcoTorres.studentsystem.service;

import com.marcoTorres.studentsystem.model.Student;
import com.marcoTorres.studentsystem.repository.StudentRepository;
import java.util.List;
// The Autowired annotation is a Spring-specified annotation used for automatic
// dependency injections. It allows Spring to automatically wire (inject) dependencies into
// beans without requiring explicit configuration

// When we annotate a field, constructor, or setter method with @Autowired, Spring will
// attempt to find a matching bean of the required type and inject it into the annotated
// component
import org.springframework.beans.factory.annotation.Autowired;
// When we annotate a class with @Service, it serves as a hint to the Spring container to
// identify that class as a service implementation that should be managed and instantiated
// by the container
import org.springframework.stereotype.Service;

// Below we use the @Service annotation to the StudentServiceImpl class. The spring container
// will automatically detect and register the class as a bean, allowing it to be easily managed
// and injected into other components.
@Service
public class StudentServiceImpl implements StudentService{
  // Spring will automatically inject an instance of StudentRepository
  @Autowired
  private StudentRepository studentRepository;

  // We use the @Override annotation so the Java compiler verifies that the
  // annotated method is indeed overriding a method from the superclass
  // or implementing a method from the interface. If the annotated method does not match
  // any method in the superclass or interface, a compilation error is generated
  @Override
  public Student saveStudent(Student student) {
    return studentRepository.save(student);
  }

  @Override
  public List<Student> getALLStudents() {
    return studentRepository.findAll();
  }
}
