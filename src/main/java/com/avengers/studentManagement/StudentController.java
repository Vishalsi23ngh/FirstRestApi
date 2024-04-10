package com.avengers.studentManagement;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class StudentController {
    HashMap<Integer,Student> db = new HashMap<>();

    //get student
    @GetMapping("/get_student")
    public Student getStudent(@RequestParam("q") int admnNo){
        return db.get(admnNo);
    }

    // add student
    @PostMapping("/add_Student")
    public String addStudent(@RequestBody Student student){

        int admnNo = student.getAdmnNo();
        db.put(admnNo,student);

        return "Student is added";

    }

    // delete the student
    @PostMapping("/del_student")
    public  String deleteStudent(@RequestParam("q") int admnNo){

        db.remove(admnNo);
        return  "Studnet is deleted  ";

    }
}
