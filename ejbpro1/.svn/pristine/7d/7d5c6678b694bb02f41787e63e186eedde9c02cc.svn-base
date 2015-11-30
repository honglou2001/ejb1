package com.watch.ejb;


import java.util.HashMap;
import java.util.List;
import javax.ejb.Remote;

/**
 * <p>Title: ejb title </p>
 * <p>Description: t_mq_task EJB Interface 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-8-16 13:22:47
 */
@Remote
public interface MqTaskService{

    public void AddMqTask(MqTask mqTaskInfo) ;
	
	public void UpdateMqTask(MqTask mqTaskInfo) ;
	
	public void DeleteMqTask(String id) ;
	
	public MqTask findMqTask(String id) ;
	
	public int GetMqTaskCount(HashMap<String, String> map);
	
	public List<MqTask> ListMqTask(int offset, int length,HashMap<String, String> map);
}
