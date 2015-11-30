package com.users.ejb;

import java.util.HashMap;
import java.util.List;
import javax.ejb.Remote;

/**
 * <p>Title: ejb title </p>
 * <p>Description: t_notify_info EJB Interface 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-8-30 14:26:23
 */
@Remote
public interface NotifyInfoService{

    public void AddNotifyInfo(NotifyInfo notifyInfoInfo) ;
	
	public void UpdateNotifyInfo(NotifyInfo notifyInfoInfo) ;
	
	public void DeleteNotifyInfo(String id) ;
	
	public NotifyInfo findNotifyInfo(String id) ;
	
	public int GetNotifyInfoCount(HashMap<String, String> map);
	
	public List<NotifyInfo> ListNotifyInfo(int offset, int length,HashMap<String, String> map);
}
