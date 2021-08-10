package com.luv2code;

import com.luv2code.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SearchByKey {
    public static void main(String[]args){
        //create session factory
        SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml").
                addAnnotatedClass(Employee.class).
                buildSessionFactory();

        //create session
        Session session = factory.getCurrentSession();
        try{
            int id = 2;
            //Search employee by id
            session.beginTransaction();
            Employee theEmployee = session.get(Employee.class,id);
            System.out.println(theEmployee);
            session.getTransaction().commit();
        }finally {
            factory.close();
        }
    }

}
