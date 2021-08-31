package com.maven.JpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
  public static void main(String[] args) {
	  
	  Student s =new Student();
	  s.setId(1);
	  s.setName("student1");
	  s.setAdddress("Address");
	
    
	  EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
	  EntityManager em =emf.createEntityManager();
	  
	  // to sava we need to begin and commit the transaction
	  em.getTransaction().begin();
	  em.persist(s);
	  em.getTransaction().commit();
	  
	  Student ss=em.find(Student.class, 1);
	  System.out.println(ss);
	  
	  
  }
}
