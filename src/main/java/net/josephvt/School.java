package net.josephvt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Spring Dependency Injection basics
 */
@Component
public class School
{
    private final Course course;

    @Autowired
    public School(Course course)
    {
        this.course = course;
    }

    public void displayStudentCount() {
        int count = course.getStudentCount();
        System.out.println(count);
    }
    public static void main( String[] args )
    {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            School school = context.getBean(School.class);
            school.displayStudentCount();
        }
    }
}
