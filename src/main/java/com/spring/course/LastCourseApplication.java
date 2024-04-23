package com.spring.course;

import com.spring.course.beans.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LastCourseApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(LastCourseApplication.class);
	Teacher myService = ctx.getBean(Teacher.class);
    }

}
