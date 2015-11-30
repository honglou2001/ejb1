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
 * <p>Description: t_mq_log EJB Interface Bean 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-8-22 11:10:24
 */
@Stateless(mappedName="MqLogService")
public class MqLogBean  implements MqLogService {
    
    @PersistenceContext(unitName = "ejbpro1")	
    private EntityManager manager;

	@Override
	public void AddMqLog(MqLog mqLogInfo) {  
        mqLogInfo.setFlogid(UUID.randomUUID().toString());
        
    	Timestamp datetime = EJBTime.getTimeStamp();

    	mqLogInfo.setFaddtime(datetime);
    	mqLogInfo.setFupdatetime(datetime);
		
		manager.persist(mqLogInfo);		
	}
	
	@Override
	public void UpdateMqLog(MqLog mqLogInfo) 
	{
		manager.merge(mqLogInfo);		
	}
	
	@Override
	public void DeleteMqLog(String id) 
	{
		MqLog mqLogInfo = manager.find(MqLog.class, id);
		
		manager.remove(mqLogInfo);
	}
	
	@Override
	public MqLog findMqLog(String id) 
	{
		MqLog mqLogInfo = manager.find(MqLog.class, id);
		return mqLogInfo;
	}
    
	private String GetWhere(HashMap<String, String> map) {
		String where = "";
		
		if(map!=null && map.size()>0)
		{
			//if(map.containsKey("FLogID") && map.get("FLogID")!=null && !map.get("FLogID").toString().equals(""))
			//{
			//	where += " and a.FLogID like '%"+map.get("FLogID")+"%' ";
			//}	
			//if(map.containsKey("FIncreaseID") && map.get("FIncreaseID")!=null && !map.get("FIncreaseID").toString().equals(""))
			//{
			//	where += " and a.FIncreaseID like '%"+map.get("FIncreaseID")+"%' ";
			//}	
			//if(map.containsKey("FMQID") && map.get("FMQID")!=null && !map.get("FMQID").toString().equals(""))
			//{
			//	where += " and a.FMQID like '%"+map.get("FMQID")+"%' ";
			//}	
			//if(map.containsKey("FLogType") && map.get("FLogType")!=null && !map.get("FLogType").toString().equals(""))
			//{
			//	where += " and a.FLogType like '%"+map.get("FLogType")+"%' ";
			//}	
			//if(map.containsKey("FDescription") && map.get("FDescription")!=null && !map.get("FDescription").toString().equals(""))
			//{
			//	where += " and a.FDescription like '%"+map.get("FDescription")+"%' ";
			//}	
			//if(map.containsKey("FCmd") && map.get("FCmd")!=null && !map.get("FCmd").toString().equals(""))
			//{
			//	where += " and a.FCmd like '%"+map.get("FCmd")+"%' ";
			//}	
			//if(map.containsKey("FCmdData") && map.get("FCmdData")!=null && !map.get("FCmdData").toString().equals(""))
			//{
			//	where += " and a.FCmdData like '%"+map.get("FCmdData")+"%' ";
			//}	
			//if(map.containsKey("FCmdFrame") && map.get("FCmdFrame")!=null && !map.get("FCmdFrame").toString().equals(""))
			//{
			//	where += " and a.FCmdFrame like '%"+map.get("FCmdFrame")+"%' ";
			//}	
			//if(map.containsKey("FUserID") && map.get("FUserID")!=null && !map.get("FUserID").toString().equals(""))
			//{
			//	where += " and a.FUserID like '%"+map.get("FUserID")+"%' ";
			//}	
			//if(map.containsKey("FSNID") && map.get("FSNID")!=null && !map.get("FSNID").toString().equals(""))
			//{
			//	where += " and a.FSNID like '%"+map.get("FSNID")+"%' ";
			//}	
			//if(map.containsKey("FSNnumber") && map.get("FSNnumber")!=null && !map.get("FSNnumber").toString().equals(""))
			//{
			//	where += " and a.FSNnumber like '%"+map.get("FSNnumber")+"%' ";
			//}	
			//if(map.containsKey("FElapseCount") && map.get("FElapseCount")!=null && !map.get("FElapseCount").toString().equals(""))
			//{
			//	where += " and a.FElapseCount like '%"+map.get("FElapseCount")+"%' ";
			//}	
			//if(map.containsKey("FElapseSec") && map.get("FElapseSec")!=null && !map.get("FElapseSec").toString().equals(""))
			//{
			//	where += " and a.FElapseSec like '%"+map.get("FElapseSec")+"%' ";
			//}	
			//if(map.containsKey("FDataStatus") && map.get("FDataStatus")!=null && !map.get("FDataStatus").toString().equals(""))
			//{
			//	where += " and a.FDataStatus like '%"+map.get("FDataStatus")+"%' ";
			//}	
			//if(map.containsKey("FFieldStatus") && map.get("FFieldStatus")!=null && !map.get("FFieldStatus").toString().equals(""))
			//{
			//	where += " and a.FFieldStatus like '%"+map.get("FFieldStatus")+"%' ";
			//}	
			//if(map.containsKey("FPlanTime") && map.get("FPlanTime")!=null && !map.get("FPlanTime").toString().equals(""))
			//{
			//	where += " and a.FPlanTime like '%"+map.get("FPlanTime")+"%' ";
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
			//if(map.containsKey("FOperator") && map.get("FOperator")!=null && !map.get("FOperator").toString().equals(""))
			//{
			//	where += " and a.FOperator like '%"+map.get("FOperator")+"%' ";
			//}	
			//if(map.containsKey("FOperateState") && map.get("FOperateState")!=null && !map.get("FOperateState").toString().equals(""))
			//{
			//	where += " and a.FOperateState like '%"+map.get("FOperateState")+"%' ";
			//}	
			//if(map.containsKey("FOperateTime") && map.get("FOperateTime")!=null && !map.get("FOperateTime").toString().equals(""))
			//{
			//	where += " and a.FOperateTime like '%"+map.get("FOperateTime")+"%' ";
			//}	
			//if(map.containsKey("FNotifyState") && map.get("FNotifyState")!=null && !map.get("FNotifyState").toString().equals(""))
			//{
			//	where += " and a.FNotifyState like '%"+map.get("FNotifyState")+"%' ";
			//}	
			//if(map.containsKey("FNotifyMode") && map.get("FNotifyMode")!=null && !map.get("FNotifyMode").toString().equals(""))
			//{
			//	where += " and a.FNotifyMode like '%"+map.get("FNotifyMode")+"%' ";
			//}	
			//if(map.containsKey("FNotifyTime") && map.get("FNotifyTime")!=null && !map.get("FNotifyTime").toString().equals(""))
			//{
			//	where += " and a.FNotifyTime like '%"+map.get("FNotifyTime")+"%' ";
			//}	
			
		}
		return where;
	}    
	
	@Override
	public int GetMqLogCount(HashMap<String, String> map){
		
        String where = GetWhere(map);
        
		String hql = "select count(*) from MqLog";	    
		Query query =manager.createQuery(hql);   
		int total = (new Integer(query.getSingleResult().toString()));	    
		return total;
	}	
	
	@Override 
	public List<MqLog> ListMqLog(int offset, int length,HashMap<String, String> map) {					
		
        String where = GetWhere(map);
        
        String hql = "from MqLog";      
		Query query =manager.createQuery(hql);   
		query.setFirstResult(offset);
		query.setMaxResults(length);
		@SuppressWarnings("unchecked")
		List<MqLog> MqLogs = query.getResultList();   
		return MqLogs;		
	}
}