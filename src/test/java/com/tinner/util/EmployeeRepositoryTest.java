package com.tinner.util;

import com.tinner.dao.StudentDao;
import com.tinner.domain.Employee;
import com.tinner.repository.EmployeeRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class EmployeeRepositoryTest {

    private ApplicationContext context = null;
    private StudentDao studentDao = null;
    private EmployeeRepository employeeRepository;
    @Before
    public void before(){
        context = new ClassPathXmlApplicationContext("beans-new.xml");
        employeeRepository = context.getBean(EmployeeRepository.class);
        System.out.println("setup");
    }

    @After
    public void ager(){
        context = null;
        System.out.println("tearDown");
    }

    @Test
    public void testEntityManagerFactory(){
        Employee zhangsan = employeeRepository.findByName("test16");
        System.out.println(zhangsan.getId());
        List<Employee> byNameLike = employeeRepository.findByNameStartingWithAndAgeLessThan("test",30);
        for (Employee s:byNameLike){
            System.out.println(s.getId());
        }

    }
}
