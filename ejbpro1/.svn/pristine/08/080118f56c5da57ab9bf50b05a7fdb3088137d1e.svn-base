package com.watch.ejb;

import java.util.HashMap;
import java.util.List;
import javax.ejb.Remote;

/**
 * <p>Title: ejb title </p>
 * <p>Description: t_user_alarm EJB Interface 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-7-15 15:56:33
 */
@Remote
public interface UserAlarmService{

    public void Add(UserAlarm userAlarmInfo) ;
	
	public void Update(UserAlarm userAlarmInfo) ;
	
	public void Delete(String id) ;
	
	public UserAlarm find(String id) ;
	
	public int GetCount(HashMap<String, String> map);
	
	public List<UserAlarm> ListUserAlarm(int offset, int length,HashMap<String, String> map);
}
