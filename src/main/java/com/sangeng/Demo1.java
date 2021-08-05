package com.sangeng;

import com.sangeng.config.ApplicationConfig;
import com.sangeng.dao.StudentDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo1 {
    public static void main(String[] args) {
        // 创建注解容器
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        // 获取对象
        StudentDao studentDao = (StudentDao) app.getBean("studentDao");
        System.out.println(studentDao);
        // 测试
//        Student stu = studentDao.getStudentById(0);
//        System.out.println(stu);

    }
}
