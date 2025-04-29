package com.nit.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nit.entity.Student;
import com.nit.service.IService;

@Controller

public class MyController {
	@Autowired
	private IService service;

	@GetMapping("/")
	public String showHomePage() {
		return "home";
	}

	@GetMapping("/showReport")
	public String showReport(
			@PageableDefault(page = 0, size = 3, sort = "id", direction = Direction.ASC) Pageable pageable,
			Map<String, Object> map) throws Exception {
		Page<Student> studentPage = service.getAllPages(pageable);
		map.put("studentList", studentPage);
						
		return "report";
	}

	/*
	 * @GetMapping("/showReport") public String showReport(Map<String,Object>
	 * map)throws Exception { List<Student> studentList=service.getAllStudents();
	 * map.put("studentList",studentList); return "report"; }
	 * 
	 */
	@GetMapping("/register")
	public String getForm() throws Exception {

		return "studentForm";
	}

	@PostMapping("/register")
	public String addStudent(@ModelAttribute("stud") Student studuent, RedirectAttributes attribute) throws Exception {
		String message = service.registerStudent(studuent);
		attribute.addFlashAttribute("message", message);

		return "redirect:showReport";

	}

	@GetMapping("/edit")
	public String editStudent(@RequestParam Integer id, @ModelAttribute("studentD") Student student) throws Exception {

		Student savedStudent = service.getStudent(id);
		BeanUtils.copyProperties(savedStudent, student);
		return "editForm";
	}

	@PostMapping("/edit")
	public String editStudentAction(@RequestParam Integer id, @ModelAttribute("estud") Student student,
			RedirectAttributes attribute) throws Exception {
		Student foundStudent = service.getStudent(id);
		BeanUtils.copyProperties(student, foundStudent);
		service.registerStudent(foundStudent);
		attribute.addFlashAttribute("message", "Edited with values " + foundStudent.toString());
		return "redirect:showReport";

	}

	@GetMapping("/delete")
	public String deleteStudent(@RequestParam int id, RedirectAttributes attribute) throws Exception {

		String message = service.deleteStudent(id);
		attribute.addFlashAttribute("message", message);

		return "redirect:showReport";

	}

}
