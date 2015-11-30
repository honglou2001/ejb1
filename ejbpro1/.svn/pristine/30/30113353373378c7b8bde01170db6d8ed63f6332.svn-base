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
 * <p>Description: t_mq_received EJB Interface Bean 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-8-16 17:54:32
 */
@Stateless(mappedName="MqReceivedService")
public class MqReceivedBean  implements MqReceivedService {
    
    @PersistenceContext(unitName = "ejbpro1")	
    private EntityManager manager;

	@Override
	public void AddMqReceived(MqReceived mqReceivedInfo) {  
        mqReceivedInfo.setFreceivedid(UUID.randomUUID().toString());
        
     	Timestamp datetime = EJBTime.getTimeStamp();
     	mqReceivedInfo.setFaddtime(datetime);
     	mqReceivedInfo.setFupdatetime(datetime);
     	mqReceivedInfo.setFreceivedtime(datetime);
     	
		manager.persist(mqReceivedInfo);
		
		if(mqReceivedInfo.getFcmd() == null)
		{
			return ;
		}
		else if(mqReceivedInfo.getFcmd().equals(""))
		{
			return ;
		}
		else if(!mqReceivedInfo.getFcmd().equals("7103"))  //通讯录应答
		{
			return ;
		}
		try{
			//以下更新回调信息
			String snnumber = mqReceivedInfo.getFsnid();
			String snId = "";
			
			HashMap<String,String> hMap = new HashMap<String,String>(1);
			hMap.put("sn.serialnumber", snnumber);
			
			SerialnumberBean snBean = new SerialnumberBean();
			List<Serialnumber>  listSNNumber = snBean.ListSerialnumberAll(0, 10, hMap);
			if(listSNNumber!=null && listSNNumber.size()>0)
			{
				snId = listSNNumber.get(0).getFuniqueid();
			}
			
		    StringBuffer  sql = new StringBuffer();
	        sql.append(" update t_mq_task a inner join (select  ");
			sql.append(" min(FIncreaseID) as fid from t_mq_task  where FCmd='7103'  and FSNID='"+snnumber+"'  and  ");
			sql.append(" (FExcResult is null or  FExcResult = 0))  ");      
			sql.append(" on a.FIncreaseID = b.fid ");
			sql.append(" set  FExcResult =1,FExcResult="+datetime);
			sql.append(" where FCmd='7103' and FSNID='"+snnumber+"' ");
			 
			Query query = manager.createNativeQuery(sql.toString());
			query.executeUpdate();
			
			
		    StringBuffer  sql1 = new StringBuffer();
	        sql.append(" update t_friend_contact a inner join (select min(FIncreaseID) as fid from t_friend_contact  where FToSnID = '"+snId+"'  ");
			sql.append(" and (FFieldStatus is null or  FFieldStatus = 0)) ");
			sql.append(" b on a.FIncreaseID = b.fid ");      
			sql.append(" set FFieldStatus =1 ,FUpdateTime='"+datetime+"',FRemark=CONCAT(ifnull(FRemark,''),'callback_') ");
			sql.append(" where FToSnID = '"+snId+"' ");
			 
			Query query1 = manager.createNativeQuery(sql1.toString());
			query1.executeUpdate();
			
			System.out.println("community return update OK");
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
			
			ex.printStackTrace();
		}
		
//		update t_friend_contact a inner join (select min(FIncreaseID) as fid from t_friend_contact  where FToSnID = '685802b4-d04d-4500-8460-d80169d4599b'
//				and (FDataStatus is null or  FDataStatus = 0))
//				 b on a.FIncreaseID = b.fid
//				set FDataStatus =1
//				where FToSnID = '685802b4-d04d-4500-8460-d80169d4599b'
	}
	
	@Override
	public void UpdateMqReceived(MqReceived mqReceivedInfo) 
	{
		manager.merge(mqReceivedInfo);		
	}
	
	@Override
	public void DeleteMqReceived(String id) 
	{
		MqReceived mqReceivedInfo = manager.find(MqReceived.class, id);
		
		manager.remove(mqReceivedInfo);
	}
	
	@Override
	public MqReceived findMqReceived(String id) 
	{
		MqReceived mqReceivedInfo = manager.find(MqReceived.class, id);
		return mqReceivedInfo;
	}
    
	private String GetWhere(HashMap<String, String> map) {
		String where = "";
		
		if(map!=null && map.size()>0)
		{
			//if(map.containsKey("FReceivedID") && map.get("FReceivedID")!=null && !map.get("FReceivedID").toString().equals(""))
			//{
			//	where += " and a.FReceivedID like '%"+map.get("FReceivedID")+"%' ";
			//}	
			//if(map.containsKey("FIncreaseID") && map.get("FIncreaseID")!=null && !map.get("FIncreaseID").toString().equals(""))
			//{
			//	where += " and a.FIncreaseID like '%"+map.get("FIncreaseID")+"%' ";
			//}	
			//if(map.containsKey("FMqID") && map.get("FMqID")!=null && !map.get("FMqID").toString().equals(""))
			//{
			//	where += " and a.FMqID like '%"+map.get("FMqID")+"%' ";
			//}	
			//if(map.containsKey("FCmd") && map.get("FCmd")!=null && !map.get("FCmd").toString().equals(""))
			//{
			//	where += " and a.FCmd like '%"+map.get("FCmd")+"%' ";
			//}	
			//if(map.containsKey("FCmdType") && map.get("FCmdType")!=null && !map.get("FCmdType").toString().equals(""))
			//{
			//	where += " and a.FCmdType like '%"+map.get("FCmdType")+"%' ";
			//}	
			//if(map.containsKey("FPriority") && map.get("FPriority")!=null && !map.get("FPriority").toString().equals(""))
			//{
			//	where += " and a.FPriority like '%"+map.get("FPriority")+"%' ";
			//}	
			//if(map.containsKey("FReceivedData") && map.get("FReceivedData")!=null && !map.get("FReceivedData").toString().equals(""))
			//{
			//	where += " and a.FReceivedData like '%"+map.get("FReceivedData")+"%' ";
			//}	
			//if(map.containsKey("FReceivedTime") && map.get("FReceivedTime")!=null && !map.get("FReceivedTime").toString().equals(""))
			//{
			//	where += " and a.FReceivedTime like '%"+map.get("FReceivedTime")+"%' ";
			//}	
			//if(map.containsKey("FReceivedResult") && map.get("FReceivedResult")!=null && !map.get("FReceivedResult").toString().equals(""))
			//{
			//	where += " and a.FReceivedResult like '%"+map.get("FReceivedResult")+"%' ";
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
	public int GetMqReceivedCount(HashMap<String, String> map){
		
        String where = GetWhere(map);
        
		String hql = "select count(*) from MqReceived";	    
		Query query =manager.createQuery(hql);   
		int total = (new Integer(query.getSingleResult().toString()));	    
		return total;
	}	
	
	@Override 
	public List<MqReceived> ListMqReceived(int offset, int length,HashMap<String, String> map) {					
		
        String where = GetWhere(map);
        
        String hql = "from MqReceived";      
		Query query =manager.createQuery(hql);   
		query.setFirstResult(offset);
		query.setMaxResults(length);
		@SuppressWarnings("unchecked")
		List<MqReceived> MqReceiveds = query.getResultList();   
		return MqReceiveds;		
	}
}