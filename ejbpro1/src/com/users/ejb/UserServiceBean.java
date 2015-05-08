package com.users.ejb;

import java.util.List;
import java.util.UUID;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


@Stateless(mappedName="UserService")
public class UserServiceBean implements UserService {

	@PersistenceContext(unitName = "ejbpro1")	
    private EntityManager manager;

	@Override
	public void Add(User user) {
		// TODO Auto-generated method stub
		
		user.setId(UUID.randomUUID().toString());
		
		manager.persist(user);
		
	}
	
	@Override
	public void Update(User user) 
	{
		manager.merge(user);		
	}
	
	@Override
	public void Delete(String id) 
	{
		User user = manager.find(User.class, id);
		
		manager.remove(user);
	}
	
	@Override
	public User find(String id) 
	{
		User user = manager.find(User.class, id);
		return user;
	}
	
	@Override
	public int GetUserCount(){
		
		String hql = "select count(*) from User";	    
		Query query =manager.createQuery(hql);   
		int total = (new Integer(query.getSingleResult().toString()));	    
		return total;
	}
	
	
	@Override 
	public List<User> ListUser(int offset, int length) {
			
//		User user = new User();
//		user.setAdress("address");
//		user.setDescription("setDescription");
//		user.setEmail("setEmail");
//		user.setId("1c2efc0d-276d-4468-8b43-c0b58b396fe5");
//		user.setMobile("mobile");
//		user.setName("setName");
//		user.setPwd("setPwd");		
		
		String hql = "from User";      
		Query query =manager.createQuery(hql);   
		query.setFirstResult(offset);
		query.setMaxResults(length);
		@SuppressWarnings("unchecked")
		List<User> users = query.getResultList();   
		return users;
		
	}
	
}