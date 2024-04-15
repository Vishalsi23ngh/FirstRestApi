package com.avengers.studentManagement;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class StudentRepository {
    HashMap<Integer,Student> db = new HashMap<>();

    public Student getStudent(int id){
        return db.get(id);
    }

    public String addStudent(Student student){
        int id = student.getAdmnNo();
        db.put(id ,student);
        return " student addded";

    }
    public String updateStudent(int id,int age){
        if(!db.containsKey(id)){
            return "invalid id";
        }
        else{
            db.get(id).setAge(age);
            return "Student updated";
        }
    }
    public String deleteStudent(int id){
        if(db.containsKey(id)){
            db.remove(id);
            return " Student is removed";
        }
        return " No student with this id exist";
    }
}
