package com.springboot.app.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.app.entity.Student;
import com.springboot.app.repository.StudentRepository;
import com.springboot.app.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService {

	
	private StudentRepository studentRepository; 
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
	}

	

}
