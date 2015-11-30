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
			//if(map.containsKey("FMQID") && map.get("FMQID")!=null && !map.get("FMQID").toString().equals(""))
			//{
			//	where += " and a.FMQID like '%"+map.get("FMQID")+"%' ";
			//}	
			//if(map.containsKey("FIncreaseID") && map.get("FIncreaseID")!=null && !map.get("FIncreaseID").toString().equals(""))
			//{
			//	where += " and a.FIncreaseID like '%"+map.get("FIncreaseID")+"%' ";
			//}	
			//if(map.containsKey("FCmd") && map.get("FCmd")!=null && !map.get("FCmd").toString().equals(""))
			//{
			//	where += " and a.FCmd like '%"+map.get("FCmd")+"%' ";
			//}	
			//if(map.containsKey("FCmdType") && map.get("FCmdType")!=null && !map.get("FCmdType").toString().equals(""))
			//{
			//	where += " and a.FCmdType like '%"+map.get("FCmdType")+"%' ";
			//}	
			//if(map.containsKey("FSrcTable") && map.get("FSrcTable")!=null && !map.get("FSrcTable").toString().equals(""))
			//{
			//	where += " and a.FSrcTable like '%"+map.get("FSrcTable")+"%' ";
			//}	
			//if(map.containsKey("FSrcColumn") && map.get("FSrcColumn")!=null && !map.get("FSrcColumn").toString().equals(""))
			//{
			//	where += " and a.FSrcColumn like '%"+map.get("FSrcColumn")+"%' ";
			//}	
			//if(map.containsKey("FParam") && map.get("FParam")!=null && !map.get("FParam").toString().equals(""))
			//{
			//	where += " and a.FParam like '%"+map.get("FParam")+"%' ";
			//}	
			//if(map.containsKey("FTryCount") && map.get("FTryCount")!=null && !map.get("FTryCount").toString().equals(""))
			//{
			//	where += " and a.FTryCount like '%"+map.get("FTryCount")+"%' ";
			//}	
			//if(map.containsKey("FPriority") && map.get("FPriority")!=null && !map.get("FPriority").toString().equals(""))
			//{
			//	where += " and a.FPriority like '%"+map.get("FPriority")+"%' ";
			//}	
			//if(map.containsKey("FSendData") && map.get("FSendData")!=null && !map.get("FSendData").toString().equals(""))
			//{
			//	where += " and a.FSendData like '%"+map.get("FSendData")+"%' ";
			//}	
			//if(map.containsKey("FExcTime") && map.get("FExcTime")!=null && !map.get("FExcTime").toString().equals(""))
			//{
			//	where += " and a.FExcTime like '%"+map.get("FExcTime")+"%' ";
			//}	
			//if(map.containsKey("FExcResult") && map.get("FExcResult")!=null && !map.get("FExcResult").toString().equals(""))
			//{
			//	where += " and a.FExcResult like '%"+map.get("FExcResult")+"%' ";
			//}	
			//if(map.containsKey("FPlanTime") && map.get("FPlanTime")!=null && !map.get("FPlanTime").toString().equals(""))
			//{
			//	where += " and a.FPlanTime like '%"+map.get("FPlanTime")+"%' ";
			//}	
			//if(map.containsKey("FUserID") && map.get("FUserID")!=null && !map.get("FUserID").toString().equals(""))
			//{
			//	where += " and a.FUserID like '%"+map.get("FUserID")+"%' ";
			//}	
			//if(map.containsKey("FSNID") && map.get("FSNID")!=null && !map.get("FSNID").toString().equals(""))
			//{
			//	where += " and a.FSNID like '%"+map.get("FSNID")+"%' ";
			//}	
			//if(map.containsKey("FState") && map.get("FState")!=null && !map.get("FState").toString().equals(""))
			//{
			//	where += " and a.FState like '%"+map.get("FState")+"%' ";
			//}	
			//if(map.containsKey("FDataStatus") && map.get("FDataStatus")!=null && !map.get("FDataStatus").toString().equals(""))
			//{
			//	where += " and a.FDataStatus like '%"+map.get("FDataStatus")+"%' ";
			//}	
			//if(map.containsKey("FFieldStatus") && map.get("FFieldStatus")!=null && !map.get("FFieldStatus").toString().equals(""))
			//{
			//	where += " and a.FFieldStatus like '%"+map.get("FFieldStatus")+"%' ";
			//}	
			//if(map.containsKey("FAddTime") && map.get("FAddTime")!=null && !map.get("FAddTime").toString().equals(""))
			//{
			//	where += " and a.FAddTime like '%"+map.get("FAddTime")+"%' ";
			//}	
			//if(map.containsKey("FUpdateTime") && map.get("FUpdateTime")!=null && !map.get("FUpdateTime").toString().equals(""))
			//{
			//	where += " and a.FUpdateTime like '%"+map.get("FUpdateTime")+"%' ";
			//}	
			//if(map.containsKey("FRemark") && map.get("FRemark")!=null && !map.get("FRemark").toString().equals(""))
			//{
			//	where += " and a.FRemark like '%"+map.get("FRemark")+"%' ";
			//}	
			
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
