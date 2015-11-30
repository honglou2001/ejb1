package com.watch.ejb;


import java.sql.Timestamp;
import java.util.ArrayList;
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
 * <p>Description: t_serialnumber_feepacket EJB Interface Bean 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-11-7 14:15:37
 */
@Stateless(mappedName="SerialnumberFeepacketService")
public class SerialnumberFeepacketBean  implements SerialnumberFeepacketService {
    
    @PersistenceContext(unitName = "ejbpro1")	
    private EntityManager manager;

	@Override
	public void AddSerialnumberFeepacket(SerialnumberFeepacket serialnumberFeepacketInfo) {  
        serialnumberFeepacketInfo.setFpacketid(UUID.randomUUID().toString());
        
     	Timestamp datetime = EJBTime.getTimeStamp();
     	serialnumberFeepacketInfo.setFaddtime(datetime);
     	serialnumberFeepacketInfo.setFupdatetime(datetime);
    	
		manager.persist(serialnumberFeepacketInfo);		
	}
	
	@Override
	public void UpdateSerialnumberFeepacket(SerialnumberFeepacket serialnumberFeepacketInfo) 
	{
     	Timestamp datetime = EJBTime.getTimeStamp();
     	serialnumberFeepacketInfo.setFupdatetime(datetime);
		manager.merge(serialnumberFeepacketInfo);		
	}
	
	@Override
	public void DeleteSerialnumberFeepacket(String id) 
	{
		SerialnumberFeepacket serialnumberFeepacketInfo = manager.find(SerialnumberFeepacket.class, id);
		
		manager.remove(serialnumberFeepacketInfo);
	}
	
	@Override
	public SerialnumberFeepacket findSerialnumberFeepacket(String id) 
	{
		SerialnumberFeepacket serialnumberFeepacketInfo = manager.find(SerialnumberFeepacket.class, id);
		return serialnumberFeepacketInfo;
	}
    
	private String GetWhere(HashMap<String, String> map) {
		String where = "";
		
		if(map!=null && map.size()>0)
		{
			//if(map.containsKey("FPacketID") && map.get("FPacketID")!=null && !map.get("FPacketID").toString().equals(""))
			//{
			//	where += " and a.FPacketID like '%"+map.get("FPacketID")+"%' ";
			//}	
			//if(map.containsKey("FIncreaseID") && map.get("FIncreaseID")!=null && !map.get("FIncreaseID").toString().equals(""))
			//{
			//	where += " and a.FIncreaseID like '%"+map.get("FIncreaseID")+"%' ";
			//}	
			//if(map.containsKey("FTitle") && map.get("FTitle")!=null && !map.get("FTitle").toString().equals(""))
			//{
			//	where += " and a.FTitle like '%"+map.get("FTitle")+"%' ";
			//}	
			//if(map.containsKey("FDescription") && map.get("FDescription")!=null && !map.get("FDescription").toString().equals(""))
			//{
			//	where += " and a.FDescription like '%"+map.get("FDescription")+"%' ";
			//}	
			//if(map.containsKey("FCategory") && map.get("FCategory")!=null && !map.get("FCategory").toString().equals(""))
			//{
			//	where += " and a.FCategory like '%"+map.get("FCategory")+"%' ";
			//}	
			//if(map.containsKey("FUserID") && map.get("FUserID")!=null && !map.get("FUserID").toString().equals(""))
			//{
			//	where += " and a.FUserID like '%"+map.get("FUserID")+"%' ";
			//}	
			//if(map.containsKey("FSNID") && map.get("FSNID")!=null && !map.get("FSNID").toString().equals(""))
			//{
			//	where += " and a.FSNID like '%"+map.get("FSNID")+"%' ";
			//}	
			//if(map.containsKey("FPacketType") && map.get("FPacketType")!=null && !map.get("FPacketType").toString().equals(""))
			//{
			//	where += " and a.FPacketType like '%"+map.get("FPacketType")+"%' ";
			//}	
			//if(map.containsKey("FPacketFee") && map.get("FPacketFee")!=null && !map.get("FPacketFee").toString().equals(""))
			//{
			//	where += " and a.FPacketFee like '%"+map.get("FPacketFee")+"%' ";
			//}	
			//if(map.containsKey("FDiscount") && map.get("FDiscount")!=null && !map.get("FDiscount").toString().equals(""))
			//{
			//	where += " and a.FDiscount like '%"+map.get("FDiscount")+"%' ";
			//}	
			//if(map.containsKey("FBeginTime") && map.get("FBeginTime")!=null && !map.get("FBeginTime").toString().equals(""))
			//{
			//	where += " and a.FBeginTime like '%"+map.get("FBeginTime")+"%' ";
			//}	
			//if(map.containsKey("FEndTime") && map.get("FEndTime")!=null && !map.get("FEndTime").toString().equals(""))
			//{
			//	where += " and a.FEndTime like '%"+map.get("FEndTime")+"%' ";
			//}	
			//if(map.containsKey("FValidStatus") && map.get("FValidStatus")!=null && !map.get("FValidStatus").toString().equals(""))
			//{
			//	where += " and a.FValidStatus like '%"+map.get("FValidStatus")+"%' ";
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
			
		}
		return where;
	}    
	
	@Override
	public int GetSerialnumberFeepacketCount(HashMap<String, String> map){
		
        String where = GetWhere(map);
        
		String hql = "select count(*) from SerialnumberFeepacket";	    
		Query query =manager.createQuery(hql);   
		int total = (new Integer(query.getSingleResult().toString()));	    
		return total;
	}	
	
	@Override 
	public List<SerialnumberFeepacket> ListSerialnumberFeepacket(int offset, int length,HashMap<String, String> map) {					
		
			String where=" ";
			
			if(map.containsKey("FUserID") && map.get("FUserID")!=null && !map.get("FUserID").toString().equals(""))
			{
				where += " and a.FUserID = '"+map.get("FUserID")+"' ";
			}
			if(map.containsKey("FSnID") && map.get("FSnID")!=null && !map.get("FSnID").toString().equals(""))
			{
				where += " and a.FSNID = '"+map.get("FSnID")+"' ";
			}
			if(map.containsKey("FCategory") && map.get("FCategory")!=null && !map.get("FCategory").toString().equals(""))
			{
				where += " and a.FCategory = "+map.get("FCategory")+" ";
			}
		
		    StringBuffer  sql = new StringBuffer();
	        sql.append(" SELECT a.FPacketID,a.FIncreaseID,a.FTitle,a.FDescription,a.FCategory,a.FUserID,a.FSNID,a.FPacketType,a.FPacketFee,a.FDiscount,a.FBeginTime,a.FEndTime,a.FValidStatus,a.FDataStatus,a.FFieldStatus,a.FAddTime,a.FUpdateTime,a.FRemark,a.FOperator,a.FOperateState,a.FOperateTime ");
	        sql.append(" FROM T_SERIALNUMBER_FEEPACKET a ");
			sql.append(" WHERE 1 = 1 ");
			
			sql.append(where);
			sql.append(" order by a.FIncreaseID desc ");
			sql.append(" limit "+offset+","+length+"");


			Query query = manager.createNativeQuery(sql.toString());

			List rows = query.getResultList();
			List<SerialnumberFeepacket> SerialnumberFeepackets = new ArrayList<SerialnumberFeepacket>();
			
			for (Object row : rows) {
				Object[] cells = (Object[]) row;
				
				SerialnumberFeepacket item = new SerialnumberFeepacket();	
	            
	            item.setFpacketid((String)cells[0]);            
	            item.setFincreaseid((Integer)cells[1]);            
	            item.setFtitle((String)cells[2]);            
	            item.setFdescription((String)cells[3]);            
	            item.setFcategory((Integer)cells[4]);            
	            item.setFuserid((String)cells[5]);            
	            item.setFsnid((String)cells[6]);            
	            item.setFpackettype((Integer)cells[7]);            
	            item.setFpacketfee((java.math.BigDecimal)cells[8]);            
	            item.setFdiscount((java.math.BigDecimal)cells[9]);            
	            item.setFbegintime((java.sql.Timestamp)cells[10]);            
	            item.setFendtime((java.sql.Timestamp)cells[11]);            
	            item.setFvalidstatus((Integer)cells[12]);            
	            item.setFdatastatus((Integer)cells[13]);            
	            item.setFfieldstatus((Integer)cells[14]);            
	            item.setFaddtime((java.sql.Timestamp)cells[15]);            
	            item.setFupdatetime((java.sql.Timestamp)cells[16]);            
	            item.setFremark((String)cells[17]);            
	            item.setFoperator((String)cells[18]);            
	            item.setFoperatestate((Integer)cells[19]);            
	            item.setFoperatetime((java.sql.Timestamp)cells[20]);            
	          			
				SerialnumberFeepackets.add(item);			
			}
			return SerialnumberFeepackets;
			
//        String where = GetWhere(map);
//        
//        String hql = "from SerialnumberFeepacket";      
//		Query query =manager.createQuery(hql);   
//		query.setFirstResult(offset);
//		query.setMaxResults(length);
//		@SuppressWarnings("unchecked")
//		List<SerialnumberFeepacket> SerialnumberFeepackets = query.getResultList();   
//		return SerialnumberFeepackets;		
	}
}