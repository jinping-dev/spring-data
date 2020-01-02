package com.tinner.dao;

import com.tinner.domain.Student;

import java.util.List;

public interface StudentDao {

    List<Student> query();

    void save();

}
