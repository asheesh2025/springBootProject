package com.masai.service;

import java.util.List;

import com.masai.exceptions.StudentException;
import com.masai.model.Student;
import com.masai.model.StudentDTO;

public interface StudentService {
	
	public Student saveStudent(Student student);
	
	public Student getStudentByRoll(Integer roll)throws StudentException;

	public List<Student> getAllStudentDetails()throws StudentException;
	
	
	public Student deleteStudentByRoll(Integer roll)throws StudentException;
	
	
	public Student updateStudentDetails(Student student)throws StudentException;
	
	public Student updateStudentMarks(Integer roll, Integer graceMarks)throws StudentException;
	
	public List<Student> getStudentByName(String name)throws StudentException;
	
	public  List<StudentDTO> getStudentNameAndMarks()throws StudentException;
	
	
	
	
}







