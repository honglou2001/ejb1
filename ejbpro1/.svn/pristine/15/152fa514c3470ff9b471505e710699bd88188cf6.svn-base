package com.users.ejb;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface UserService {
	
	public void Add(User user) ;
	
	public void Update(User user) ;
	
	public void Delete(String id) ;
	
	public User find(String id) ;
	
	public int GetUserCount();
	
	public List<User> ListUser(int offset, int length);
	
}
