package com.watch.ejb;

import java.util.HashMap;
import java.util.List;
import javax.ejb.Remote;

/**
 * <p>Title: ejb title </p>
 * <p>Description: t_mq_received EJB Interface 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-8-16 17:55:14
 */
@Remote
public interface MqReceivedService{

    public void AddMqReceived(MqReceived mqReceivedInfo) ;
	
	public void UpdateMqReceived(MqReceived mqReceivedInfo) ;
	
	public void DeleteMqReceived(String id) ;
	
	public MqReceived findMqReceived(String id) ;
	
	public int GetMqReceivedCount(HashMap<String, String> map);
	
	public List<MqReceived> ListMqReceived(int offset, int length,HashMap<String, String> map);
}
