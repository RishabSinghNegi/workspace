package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernatedemo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
		
		//create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")								   
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		//create Session
		Session session=factory.getCurrentSession();
		
		try {
			System.out.println("creating a new student object...");
			//create a student object
			Student tempStudent= new Student("Rishab","Negi", "Rishab.negi@hotmail.com");

			// start a transaction
			session.beginTransaction();
		
			//save a transaction
			System.out.println(tempStudent);
			session.save(tempStudent);
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	
	}

}
