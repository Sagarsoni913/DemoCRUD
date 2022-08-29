package com.tns.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest
{

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//create one employee
		Employee employee = new Employee();//EMPLOYEE CLASS OBJECT
		employee.setName("Riya");
		employee.setSalary(8000);
		em.persist(employee);
		
		//create one manager
		Manager manager = new Manager();//MANAGER CLASS OBJECT
		manager.setName("Sandy");
		manager.setSalary(10000);
		manager.setDepartmentName("HR");
		em.persist(manager);
		
		
		
		em.getTransaction().commit();
		
		System.out.println("Added one employee and manager to database.");
		em.close();
		factory.close();
	}
}