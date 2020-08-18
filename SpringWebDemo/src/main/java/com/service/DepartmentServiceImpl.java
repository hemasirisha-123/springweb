package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Department;
import com.model.DepartmentDao;

@Service
public class DepartmentServiceImpl implements DepartmentService {
  @Autowired
  private DepartmentDao departmentDao;

@Override
public void addDept(Department dept) {
	departmentDao.addDept(dept);
	
}
}
