package com.nit.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nit.entity.Student;
import com.nit.repository.IRepository;

@Service
public class ServiceStudent implements IService {
		
	@Autowired
	private IRepository repo;
	@Override
	public List<Student> getAllStudents() throws Exception {
			return StreamSupport.stream(repo.findAll().spliterator(), false)
					.toList();
	}
	
	@Override
	public void registerAllStudent() throws Exception {
		List<Student> list=new ArrayList<>();
		list.add(new Student("Abhishek", "Java", 3500.0));
		list.add(new Student("Raju", "Oracle", 4500.0));
		list.add(new Student("Mukesh", "UI", 5500.0));
		list.add(new Student("Devi", "Testing", 7500.0));
		list.add(new Student("Praveen", "Java", 3500.0));
		repo.saveAll(list);
	}

	@Override
	public String registerStudent(Student student) throws Exception {
		Student savedStudent=repo.save(student);
		return "Student registered with id : "+savedStudent.getId();
	}
	
	
	public Student getStudent(Integer id)throws Exception
	{
				return repo.findById(id).get();
		
	}

	@Override
	public String deleteStudent(Integer id) throws Exception {
		
			repo.deleteById(id);
			return "Student registered with id :"+id+" got deleted ";
	}

	@Override
	public Page<Student> getAllPages(Pageable pageable) throws Exception {
			return repo.findAll(pageable);
	}
	
	
		
	

}
