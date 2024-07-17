package com.springboot.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.app.entity.Student;
import com.springboot.app.repository.StudentRepository;

@SpringBootApplication
public class StudentMsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentMsApplication.class, args);
	}
   
	
	@Autowired
	private StudentRepository studentrepository;
	
	@Override
	public void run(String... args) throws Exception {

	
	}

}
