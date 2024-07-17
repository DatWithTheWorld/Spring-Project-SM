package com.springboot.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.app.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
