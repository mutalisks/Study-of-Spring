package com.luv2code;

import com.luv2code.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class SearchByQuery {
    public static void main(String[]args){
        //create session factory
        SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml").
                addAnnotatedClass(Employee.class).
                buildSessionFactory();

        //create session
        Session session = factory.getCurrentSession();
        try{
            session.beginTransaction();
            List<Employee> employeeList = session.createQuery("from Employee e where e.lastName > 'd'").getResultList();
            for(Employee employee:employeeList){
                System.out.println(employee);
            }
            session.getTransaction().commit();
        }finally {
            factory.close();
        }
    }
}
