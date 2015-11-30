package com.example.ejb;


import javax.ejb.Stateless;  
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless(mappedName="UserServiceR")
public class UserServiceBeanR implements UserServiceR {

	@PersistenceContext(unitName = "ejbpro1")	
    private EntityManager manager;

	
	@Override 
	public String AddUser() {
			
		ExamUser user = new ExamUser();
		user.setAdress("address");
		user.setDescription("setDescription");
		user.setEmail("setEmail");
		user.setId("1c2efc0d-276d-4468-8b43-c0b58b396fe5");
		user.setMobile("mobile");
		user.setName("setName");
		user.setPwd("setPwd");		

		manager.persist(user);
		
		
		return "OK";
	}
	
}
