package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Sports;
import com.model.SportsDao;

@Service
public class SportsServiceImpl implements SportsService{
  @Autowired
  private SportsDao sportsDao;

@Override
public void addSports(Sports sp) {
	sportsDao.addSports(sp);
	
}
}
