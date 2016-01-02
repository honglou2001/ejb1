package com.watch.ejb;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.common.ejb.EJBTime;
/**
 * <p>Title: ejb title </p>
 * <p>Description: t_mq_task EJB Interface Bean 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-8-16 13:20:56
 */
@Stateless(mappedName="MqTaskService")
public class MqTaskBean  implements MqTaskService {
    
    @PersistenceContext(unitName = "ejbpro1")	
    private EntityManager manager;

	@Override
	public void AddMqTask(MqTask mqTaskInfo) {  
        mqTaskInfo.setFmqid(UUID.randomUUID().toString());
        
     	Timestamp datetime = EJBTime.getTimeStamp();
     	mqTaskInfo.setFaddtime(datetime);
     	mqTaskInfo.setFupdatetime(datetime);
    	
		manager.persist(mqTaskInfo);		
	}
	
	@Override
	public void UpdateMqTask(MqTask mqTaskInfo) 
	{
		manager.merge(mqTaskInfo);		
	}
	
	@Override
	public void DeleteMqTask(String id) 
	{
		MqTask mqTaskInfo = manager.find(MqTask.class, id);
		
		manager.remove(mqTaskInfo);
	}
	
	@Override
	public MqTask findMqTask(String id) 
	{
		MqTask mqTaskInfo = manager.find(MqTask.class, id);
		return mqTaskInfo;
	}
    
	private String GetWhere(HashMap<String, String> map) {
		String where = "";
		
		if(map!=null && map.size()>0)
		{
			
		}
		return where;
	}    
	
	@Override
	public int GetMqTaskCount(HashMap<String, String> map){
		
        String where = GetWhere(map);
        
		String hql = "select count(*) from MqTask";	    
		Query query =manager.createQuery(hql);   
		int total = (new Integer(query.getSingleResult().toString()));	    
		return total;
	}	
	
	@Override 
	public List<MqTask> ListMqTask(int offset, int length,HashMap<String, String> map) {					
		
        String where = GetWhere(map);
        
        String hql = "from MqTask";      
		Query query =manager.createQuery(hql);   
		query.setFirstResult(offset);
		query.setMaxResults(length);
		@SuppressWarnings("unchecked")
		List<MqTask> MqTasks = query.getResultList();   
		return MqTasks;		
	}
}
