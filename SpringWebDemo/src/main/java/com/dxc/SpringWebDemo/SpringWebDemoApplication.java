package com.dxc.SpringWebDemo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.model.Department;
import com.model.Sports;
import com.model.Student;
import com.service.OrganisationService;

@SpringBootApplication
@ComponentScan(basePackages="com")
public class SpringWebDemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringWebDemoApplication.class, args);
		ConfigurableApplicationContext ctx= SpringApplication.run(SpringWebDemoApplication.class);
		OrganisationService os=ctx.getBean(OrganisationService.class);
         Student stu=new Student();
         stu.setStudentId("stu4");
         stu.setStudentName("sita");
         stu.setCity("pune");
         Department dept=new Department();
         dept.setStudentId("stu4");
         dept.setDeptName("DXC");
         dept.setSubject("java");
         Sports sp=new Sports();
         sp.setStudentId("stu4");
         sp.setSportsType("xxxxx");
         sp.setNoOfPlayers(4);
         os.addStudentToSportsandDept(stu, dept, sp);
	}

}
