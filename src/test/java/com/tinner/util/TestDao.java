package com.tinner.util;

import com.tinner.dao.StudentDao;
import com.tinner.dao.impl.StudentDaoImpl;
import com.tinner.domain.Student;
import org.junit.Test;

import java.awt.*;
import java.util.List;

public class TestDao {

    @Test
    public void testQuery(){
        StudentDao studentDao = new StudentDaoImpl();
        List<Student> students = studentDao.query();
        for (Student student: students){
            System.out.println(student.toString());
        }
    }

    @Test
    public void testSave(){
        StudentDao studentDao = new StudentDaoImpl();
        studentDao.save();
    }
}
