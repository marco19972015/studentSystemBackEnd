package com.marcoTorres.studentsystem.controller;

// importing the class student from the package model
import com.marcoTorres.studentsystem.model.Student;
// importing the class studentService from package service
import com.marcoTorres.studentsystem.service.StudentService;
// import the 'list' interface part of the java collections framework
import java.util.List;
// import multiple spring framework
// the autowired allows us to automatically wire (inject) dependencies into a spring bean
// When we annotate a field, constructor or setter method with 'Autowired' the Spring container
// will automatically resolve and inject the appropriate dependency into that field or method
  // A bean can be any Java object, including instances of classes created by the developer or instance
  // of pre-defined classes provided by Spring, such as services, repositories, controllers, and more.
  // Beans are typically created as singletons, meaning that the container creates only one instance
  // of each bean and reuses it whenever requested
import org.springframework.beans.factory.annotation.Autowired;
// Cross-Origin resource sharing is a mechanism that allows resources (js, AJAX request)
// served from one origin (domain, protocol, and port) to be accessed
// by a web page served from a different origin.
// CrossOrigin annotation provides a way to relax the same origin policy for
// specific controllers or methods, allowing them to be applied at the class level or at the method level
// within a controller
import org.springframework.web.bind.annotation.CrossOrigin;
// The GetMapping annotation is part of the Spring MVC (Model-View-Controller) framework in the Spring
// Framework. It is sued to map HTTP Get request to specific handler methods in Spring MVC controllers
// In spring MVC, controllers are responsible for handling incoming request, processing them, and returning
// an appropriate response. The GetMapping annotation is a convenient way to specify the mapping of a
// GET request to a particular method within a controller
import org.springframework.web.bind.annotation.GetMapping;
// The PostMapping annotation is a convenient way to specify the mapping of a POST request to a particular
// method within a controller
import org.springframework.web.bind.annotation.PostMapping;
// When we receive data in the request body of an HTTP request, such as in the case of a POST or PUT
// request, the @RequestBody, annotation can be used to automatically deserialize the request body and bind it to a
// parameter of a controller method
import org.springframework.web.bind.annotation.RequestBody;
// the RequestMapping annotation is used to define the URL patterns or paths that
// a controller method should handle
import org.springframework.web.bind.annotation.RequestMapping;
// The RestController annotation is a specialized version of the @Controller annotation and is
// used to indicate that a class is a RESTful controller
// (RESTful stands for Representational State Transer, and it is an architectural style for
// designing networked applications and web services. It provides a set of principals and constraints
// that, when followed, enable the creation of scalable, maintainable, and interoperable web services)
// the RestController annotation is used to combine the functionality of the @Controller annotation and the
// @ResponseBody annotation, making it convenient to build RESTful APIs
import org.springframework.web.bind.annotation.RestController;

@RestController
// Here we use the RequestMapping annotation at the class level StudentController
// to specify that all methods within the controller handle request with the /student
// base path.
@RequestMapping("/student")
//tells the react or springboot to connect to the applications
@CrossOrigin
public class StudentController {
  @Autowired
  private StudentService studentService;


  @PostMapping("/add")
  public String add(@RequestBody Student student){
    studentService.saveStudent(student);
    return "New student is added";
  }

  @GetMapping("/getAll")
  public List<Student> getAllStudents(){
    return studentService.getALLStudents();
  }
}
