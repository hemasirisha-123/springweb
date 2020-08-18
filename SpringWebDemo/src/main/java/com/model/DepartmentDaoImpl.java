package com.model;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentDaoImpl extends JdbcDaoSupport implements DepartmentDao {

	  @Autowired
	    DataSource dataSource;
	    @PostConstruct
	     void init() {
	    	setDataSource(dataSource);
	    }
		@Override
		public void addDept(Department dept) {
			 String sql = "INSERT INTO department " + "( studentId,deptName, subject) VALUES (?, ?,?)";
		        getJdbcTemplate().update(sql, new Object[] {dept.getStudentId(),dept.getDeptName(),dept.getSubject() });
			
		}
}
