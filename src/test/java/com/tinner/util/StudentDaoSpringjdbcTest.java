package com.tinner.util;

import com.tinner.dao.StudentDao;
import com.tinner.domain.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class StudentDaoSpringjdbcTest {

    private ApplicationContext context = null;
    private StudentDao studentDao = null;

    @Test
    public void setUp(){
        context = new ClassPathXmlApplicationContext("beans.xml");
        studentDao = (StudentDao) context.getBean("studentDao");
        studentDao.save();
        List<Student> query = studentDao.query();
        for (Student student: query){
            System.out.println(student.toString());
        }
    }


}
