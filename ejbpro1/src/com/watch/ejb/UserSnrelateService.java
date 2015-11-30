package com.watch.ejb;

import java.util.HashMap;
import java.util.List;
import javax.ejb.Remote;

/**
 * <p>Title: ejb title </p>
 * <p>Description: t_user_snrelate EJB Interface 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-7-5 16:26:16
 */
@Remote
public interface UserSnrelateService{

    public void Add(UserSnrelate userSnrelateInfo) ;
	
	public void Update(UserSnrelate userSnrelateInfo) ;
	
	public void Delete(String id) ;
	
	public UserSnrelate find(String id) ;
	
	public int GetCount(HashMap<String, String> map);
	
	public List<UserSnrelate> ListUserSnrelate(int offset, int length,HashMap<String, String> map);
}
