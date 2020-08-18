package com.model;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl  extends JdbcDaoSupport implements StudentDao {
	@Autowired
	DataSource dataSource;
	@PostConstruct
     void init() {
		setDataSource(dataSource);
	}
	@Override
	public void addStudent(Student stu) {
		 String sql = "INSERT INTO student " + "( studentId, studentName,City) VALUES (?, ?,?)";
	        getJdbcTemplate().update(sql, new Object[] {stu.getStudentId(),stu.getStudentName(),stu.getCity() });
		
	}
}
