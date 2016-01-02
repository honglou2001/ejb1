package com.watch.ejb;


import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
		
		
		this.UpdateByAck(mqReceivedInfo);
		
//		update t_friend_contact a inner join (select min(FIncreaseID) as fid from t_friend_contact  where FToSnID = '685802b4-d04d-4500-8460-d80169d4599b'
//				and (FDataStatus is null or  FDataStatus = 0))
//				 b on a.FIncreaseID = b.fid
//				set FDataStatus =1
//				where FToSnID = '685802b4-d04d-4500-8460-d80169d4599b'
	}
	
	private void UpdateByAck(MqReceived mqReceivedInfo)
	{
		
		try{
			//以下更新回调信息
			DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");   
			String tsStr = "";   
			tsStr = sdf.format(mqReceivedInfo.getFupdatetime());   
			
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
			
		
			//应答ack,下发发送通讯录_0,0,17727578621 //mqReceivedInfo.getFremark()		
			String phoneNum = "";
			String[] strArr = mqReceivedInfo.getFremark().split(",");
			if(strArr!=null && strArr.length>0)
			{
				if(strArr[strArr.length-1].length()>7)
				{					
					phoneNum = strArr[strArr.length-1];
				}				
			}
			
		    StringBuffer  sql = new StringBuffer();
	        sql.append(" update t_mq_task a inner join (select  ");
			sql.append(" min(FIncreaseID) as fid from t_mq_task  where FCmd='7103'  and FSNID='"+snnumber+"'  and  ");
			sql.append(" (FExcResult is null or  FExcResult = 0)) b ");      
			sql.append(" on a.FIncreaseID = b.fid ");
			sql.append(" set  FExcResult =1,FExcTime='"+tsStr+"'");
			sql.append(" where FCmd='7103' and FSNID='"+snnumber+"' ");
			 
			Query query = manager.createNativeQuery(sql.toString());
			query.executeUpdate();
			
			 if(snId==null || snId.equals("")){
					return ;
			 }
			
		    sql = new StringBuffer();
	        sql.append(" update t_friend_contact a inner join (select min(FIncreaseID) as fid from t_friend_contact  where FToSnID = '"+snId+"' and FPhoneNum='"+phoneNum+"' ");
			sql.append(" and (FFieldStatus is null or  FFieldStatus = 0)) ");
			sql.append(" b on a.FIncreaseID = b.fid ");      
			sql.append(" set FFieldStatus =1 ,FUpdateTime='"+tsStr+"',FRemark=CONCAT(ifnull(FRemark,''),'callback_') ");
			sql.append(" where FToSnID = '"+snId+"' ");
			 
			query = manager.createNativeQuery(sql.toString());
			query.executeUpdate();
			
			System.out.println("community return update OK");
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
			
			ex.printStackTrace();
		}
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