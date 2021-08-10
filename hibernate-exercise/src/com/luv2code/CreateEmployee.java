package com.luv2code;

import com.luv2code.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateEmployee {
    public static void main(String[]args){
        //create session factory
        SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml").
                addAnnotatedClass(Employee.class).
                buildSessionFactory();

        //create session
        Session session = factory.getCurrentSession();
        try{
            Employee employee = new Employee("a","b","C");
            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();
        }finally {
            factory.close();
        }
    }

}
