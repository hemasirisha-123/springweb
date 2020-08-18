package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.model.Department;
import com.model.Sports;
import com.model.Student;

@Service
public class OrganisationServiceImpl implements OrganisationService{
	@Autowired
  private StudentService studentService;
	@Autowired
  private DepartmentService departmentService;
	@Autowired
  private SportsService sportsService;
@Override
@Transactional
public void addStudentToSportsandDept(Student stu, Department dept, Sports sp) {
	studentService.addStudent(stu);
	if(stu.getStudentId().equals("stu2")) {
		throw new RuntimeException("Exception thrown");
	}
	departmentService.addDept(dept);
	sportsService.addSports(sp);
	
}
  
  
}
