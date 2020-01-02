package com.tinner.dao.impl;

import com.tinner.dao.StudentDao;
import com.tinner.domain.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOSpringJdbcImpl implements StudentDao {

    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Student> query() {
        final List<Student> students = new ArrayList<>();

        String sql = "select * from student";
        jdbcTemplate.query(sql, resultSet -> {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                Student student = new Student();
                student = new Student();
                student.setId(id);
                student.setName(name);
                student.setAge(age);
                students.add(student);
        });
        return students;
    }

    @Override
    public void save() {
        String sql = "insert into student(name,age) values (?,?)";
        jdbcTemplate.update(sql, "jinping11",12);
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
