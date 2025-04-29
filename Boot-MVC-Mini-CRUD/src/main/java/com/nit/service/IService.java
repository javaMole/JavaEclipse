package com.nit.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.nit.entity.Student;

public interface IService {
	
	public List<Student> getAllStudents()throws Exception;
	public void registerAllStudent()throws Exception;
	public String registerStudent(Student student)throws Exception;
	public Student getStudent(Integer id)throws Exception;
	public String deleteStudent(Integer id )throws Exception;	
	public Page<Student> getAllPages(Pageable pageable)throws Exception;
}
