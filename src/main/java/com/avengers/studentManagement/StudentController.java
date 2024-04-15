package com.avengers.studentManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    Map<Integer,Student> db = new HashMap<>();

    @Autowired
    StudentSevice studentSevice;
    //get student
    @GetMapping("/get_student")
    public Student getStudent(@RequestParam("q") int admnNo){
        return studentSevice.getStudent(admnNo);
    }

    // add student
    @PostMapping("/add_Student")
    public String addStudent(@RequestBody Student student){

        return studentSevice.addStudent(student);

    }

    // delete the student
    @DeleteMapping("/del_student")
    public  String deleteStudent(@PathVariable("id") int id){
        return  studentSevice.deleteStudent(id);
    }

    // Update Student
    @PostMapping("/update_student")
    public String upadateStudent(@RequestParam("id") int admnNo, @RequestParam("age") int age){
        return studentSevice.updateStudent(admnNo,age);
    }
}
