package com.watch.ejb;

import java.util.HashMap;
import java.util.List;
import javax.ejb.Remote;

/**
 * <p>Title: ejb title </p>
 * <p>Description: t_mq_log EJB Interface 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-8-22 11:09:28
 */
@Remote
public interface MqLogService{

    public void AddMqLog(MqLog mqLogInfo) ;
	
	public void UpdateMqLog(MqLog mqLogInfo) ;
	
	public void DeleteMqLog(String id) ;
	
	public MqLog findMqLog(String id) ;
	
	public int GetMqLogCount(HashMap<String, String> map);
	
	public List<MqLog> ListMqLog(int offset, int length,HashMap<String, String> map);
}
