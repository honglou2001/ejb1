package com.watch.ejb;

import java.util.HashMap;
import java.util.List;
import javax.ejb.Remote;

/**
 * <p>Title: ejb title </p>
 * <p>Description: user EJB Interface 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-7-5 18:11:44
 */
@Remote
public interface UserWatchService{

    public void Add(UserWatch userInfo) ;
	
	public void Update(UserWatch userInfo) ;
	
	public void Delete(String id) ;
	
	public UserWatch find(String id) ;
	
	public int GetCount(HashMap<String, String> map);
	
	public List<UserWatch> ListUser(int offset, int length,HashMap<String, String> map);

}
