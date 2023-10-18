package com.Mapping.OneToMany.controller;

import com.Mapping.OneToMany.entity.Student;
import com.Mapping.OneToMany.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentContoller {
    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("add/students")
    public Student addStudents(@RequestBody Student student){
     return studentRepository.save(student);
    }

    @GetMapping("fetch/students")
    public List<Student> fetchStudents(){
        return studentRepository.findAll();
    }
}
