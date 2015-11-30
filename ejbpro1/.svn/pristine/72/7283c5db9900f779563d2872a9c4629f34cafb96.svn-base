package com.users.ejb;


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
 * <p>Description: t_serialnumber_detach EJB Interface Bean 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-8-31 14:34:04
 */
@Stateless(mappedName="SerialnumberDetachService")
public class SerialnumberDetachBean  implements SerialnumberDetachService {
    
    @PersistenceContext(unitName = "ejbpro1")	
    private EntityManager manager;

	@Override
	public void AddSerialnumberDetach(SerialnumberDetach serialnumberDetachInfo) {  
        serialnumberDetachInfo.setFdetachid(UUID.randomUUID().toString());
        
    	Timestamp datetime = EJBTime.getTimeStamp();

    	serialnumberDetachInfo.setFaddtime(datetime);
    	serialnumberDetachInfo.setFupdatetime(datetime);
		
		manager.persist(serialnumberDetachInfo);		
	}
	
	@Override
	public void UpdateSerialnumberDetach(SerialnumberDetach serialnumberDetachInfo) 
	{
		Timestamp datetime = EJBTime.getTimeStamp();

    	serialnumberDetachInfo.setFupdatetime(datetime);
		manager.merge(serialnumberDetachInfo);		
	}
	
	@Override
	public void DeleteSerialnumberDetach(String id) 
	{
		SerialnumberDetach serialnumberDetachInfo = manager.find(SerialnumberDetach.class, id);
		
		manager.remove(serialnumberDetachInfo);
	}
	
	@Override
	public SerialnumberDetach findSerialnumberDetach(String id) 
	{
		SerialnumberDetach serialnumberDetachInfo = manager.find(SerialnumberDetach.class, id);
		return serialnumberDetachInfo;
	}
    
	private String GetWhere(HashMap<String, String> map) {
		String where = "";
		
		if(map!=null && map.size()>0)
		{
			//if(map.containsKey("FDetachID") && map.get("FDetachID")!=null && !map.get("FDetachID").toString().equals(""))
			//{
			//	where += " and a.FDetachID like '%"+map.get("FDetachID")+"%' ";
			//}	
			//if(map.containsKey("FIncreaseID") && map.get("FIncreaseID")!=null && !map.get("FIncreaseID").toString().equals(""))
			//{
			//	where += " and a.FIncreaseID like '%"+map.get("FIncreaseID")+"%' ";
			//}	
			//if(map.containsKey("FUserID") && map.get("FUserID")!=null && !map.get("FUserID").toString().equals(""))
			//{
			//	where += " and a.FUserID like '%"+map.get("FUserID")+"%' ";
			//}	
			//if(map.containsKey("FSNID") && map.get("FSNID")!=null && !map.get("FSNID").toString().equals(""))
			//{
			//	where += " and a.FSNID like '%"+map.get("FSNID")+"%' ";
			//}	
			//if(map.containsKey("FDetachInfo") && map.get("FDetachInfo")!=null && !map.get("FDetachInfo").toString().equals(""))
			//{
			//	where += " and a.FDetachInfo like '%"+map.get("FDetachInfo")+"%' ";
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
	public int GetSerialnumberDetachCount(HashMap<String, String> map){
		
        String where = GetWhere(map);
        
		String hql = "select count(*) from SerialnumberDetach";	    
		Query query =manager.createQuery(hql);   
		int total = (new Integer(query.getSingleResult().toString()));	    
		return total;
	}	
	
	@Override 
	public List<SerialnumberDetach> ListSerialnumberDetach(int offset, int length,HashMap<String, String> map) {					
		
		String where=" ";
		
		if(map.containsKey("FSNID") && map.get("FSNID")!=null && !map.get("FSNID").toString().equals(""))
		{
			where += " and a.FSNID = '"+map.get("FSNID")+"' ";
		}	
		
		 	StringBuffer  sql = new StringBuffer();
	        sql.append(" SELECT a.FDetachID,a.FIncreaseID,a.FUserID,a.FSNID,a.FDetachInfo,a.FDataStatus,a.FFieldStatus,a.FAddTime,a.FUpdateTime,a.FRemark ");
	        sql.append(" FROM T_SERIALNUMBER_DETACH a ");
			sql.append(" WHERE 1 = 1 ");
			sql.append(where);
			sql.append(" order by a.FIncreaseID desc ");
			sql.append(" limit "+offset+","+length+"");

			Query query = manager.createNativeQuery(sql.toString());

			List rows = query.getResultList();
			List<SerialnumberDetach> SerialnumberDetachs = new ArrayList<SerialnumberDetach>();
			
			for (Object row : rows) {
				Object[] cells = (Object[]) row;
				
				SerialnumberDetach item = new SerialnumberDetach();	
	            
	            item.setFdetachid((String)cells[0]);            
	            item.setFincreaseid((Integer)cells[1]);            
	            item.setFuserid((String)cells[2]);            
	            item.setFsnid((String)cells[3]);            
	            item.setFdetachinfo((String)cells[4]);            
	            item.setFdatastatus((Integer)cells[5]);            
	            item.setFfieldstatus((Integer)cells[6]);            
	            item.setFaddtime((java.sql.Timestamp)cells[7]);            
	            item.setFupdatetime((java.sql.Timestamp)cells[8]);            
	            item.setFremark((String)cells[9]);            
	          			
				SerialnumberDetachs.add(item);			
			}
			return SerialnumberDetachs;
	}
}
