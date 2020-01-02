package com.tinner.util;

import com.tinner.dao.StudentDao;
import com.tinner.domain.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringdataTest {

    private ApplicationContext context = null;
    private StudentDao studentDao = null;
    @Before
    public void before(){
        context = new ClassPathXmlApplicationContext("beans-new.xml");
        System.out.println("setup");
    }

    @After
    public void ager(){
        context = null;
        System.out.println("tearDown");
    }

    @Test
    public void testEntityManagerFactory(){

    }


}
