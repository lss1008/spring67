package com.sangeng.dao;

import com.sangeng.domain.Student;
import org.springframework.stereotype.Repository;


public interface StudentDao {
    Student getStudentById(int id);
}
