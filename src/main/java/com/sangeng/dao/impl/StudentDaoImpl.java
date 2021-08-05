package com.sangeng.dao.impl;

import com.sangeng.dao.StudentDao;
import com.sangeng.domain.Student;
import org.springframework.stereotype.Repository;

@Repository("studentDao")
public class StudentDaoImpl implements StudentDao {
    @Override
    public Student getStudentById(int id) {
        return new Student("西施", 30, 30);
    }

}
