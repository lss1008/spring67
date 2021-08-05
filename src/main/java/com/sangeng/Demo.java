package com.sangeng;

import com.sangeng.dao.StudentDao;
import com.sangeng.domain.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        // 创建容器
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 获取对象
        StudentDao studentDao = (StudentDao) app.getBean("studentDao");

        // 测试
        Student stu = studentDao.getStudentById(0);
        System.out.println(stu);

    }
}
