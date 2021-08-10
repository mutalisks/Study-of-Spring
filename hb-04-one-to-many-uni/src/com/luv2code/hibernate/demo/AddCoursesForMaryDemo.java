package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class AddCoursesForMaryDemo {

    public static void main(String[] args){

        //create session factory
        SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml").
                addAnnotatedClass(Instructor.class).
                addAnnotatedClass(InstructorDetail.class).
                addAnnotatedClass(Course.class).
                addAnnotatedClass(Review.class).
                addAnnotatedClass(Student.class).
                buildSessionFactory();

        //create session
        Session session = factory.getCurrentSession();

        try{
            //start a transaction
            session.beginTransaction();
            //get the student mary from database
            int studentId = 2;
            Student theStudent = session.get(Student.class,studentId);
            System.out.println("Loaded student: " + theStudent);
            System.out.println("Courses :" + theStudent.getCourses());
            //create more courses
            Course tempCourse1 = new Course("Rubik's Cube - How to Speed Cube");
            Course tempCourse2 = new Course("Atari 2600 - Game Development");
            //add student to courses
            tempCourse1.addStudent(theStudent);
            tempCourse2.addStudent(theStudent);
            //save the courses
            System.out.println("Saving the courses");
            session.save(tempCourse1);
            session.save(tempCourse2);
            //commit transaction
            session.getTransaction().commit();
            System.out.println("OK");
        }finally {
            //add clean up code
            session.close();
            factory.close();
        }

    }
}
