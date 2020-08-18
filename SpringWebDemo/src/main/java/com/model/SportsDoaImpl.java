package com.model;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class SportsDoaImpl extends JdbcDaoSupport implements SportsDao{

	@Autowired
    DataSource dataSource;
    @PostConstruct
     void init() {
    	setDataSource(dataSource);
    }
	@Override
	public void addSports(Sports sp) {
		 String sql = "INSERT INTO sports " + "(studentId, sportsType,noOfPlayers) VALUES (?, ?,?)";
	        getJdbcTemplate().update(sql, new Object[] {sp.getStudentId(),sp.getSportsType(),sp.getNoOfPlayers() });

		
	}
}
