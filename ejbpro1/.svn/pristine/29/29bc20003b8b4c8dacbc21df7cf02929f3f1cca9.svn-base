package com.users.ejb;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface RMenuService {
	
	public void Add(RMenu menu) ;
	
	public void Update(RMenu menu) ;
	
	public void Delete(String id) ;
	
	public void Delete(String roleid,String menuid) ;
	
	public RMenu find(String id) ;
	
	public int GetUserCount();
	
	public List<RMenu> GetRMenuByRole(String roleid);
	
}

