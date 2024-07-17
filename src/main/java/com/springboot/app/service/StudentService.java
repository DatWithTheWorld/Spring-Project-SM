package com.springboot.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.app.entity.Student;

public interface StudentService {
   List<Student> getAllStudent();
   
   Student saveStudent(Student student);
   
   Student getStudentById(int id);
   Student updateStudent(Student student);
   
   void deleteStudent(int id);
}
