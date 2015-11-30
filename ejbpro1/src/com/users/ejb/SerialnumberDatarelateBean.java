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
 * <p>Description: t_serialnumber_datarelate EJB Interface Bean 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-11-29 16:01:36
 */
@Stateless(mappedName="SerialnumberDatarelateService")
public class SerialnumberDatarelateBean  implements SerialnumberDatarelateService {
    
    @PersistenceContext(unitName = "ejbpro1")	
    private EntityManager manager;

	@Override
	public void AddSerialnumberDatarelate(SerialnumberDatarelate serialnumberDatarelateInfo) {  
        serialnumberDatarelateInfo.setFdatarelateid(UUID.randomUUID().toString());
        
    	Timestamp datetime = EJBTime.getTimeStamp();
    	
    	serialnumberDatarelateInfo.setFaddtime(datetime);   	
    	serialnumberDatarelateInfo.setFupdatetime(datetime);
    	
		manager.persist(serialnumberDatarelateInfo);		
	}
	
	@Override
	public void UpdateSerialnumberDatarelate(SerialnumberDatarelate serialnumberDatarelateInfo) 
	{
    	Timestamp datetime = EJBTime.getTimeStamp();  	
    	serialnumberDatarelateInfo.setFupdatetime(datetime);
    	
		manager.merge(serialnumberDatarelateInfo);		
	}
	
	@Override
	public void UpdateSerialnumberDatarelate(SerialnumberDatarelate serialnumberDatarelateInfo,HashMap<String, String> map) 
	{
    	if(map!=null && map.size()>0){
			if(map.containsKey("actionType")){
				String actionType = map.get("actionType");
				
				if(actionType.equals("1")){    		    										   					
					Query q = manager.createNativeQuery("UPDATE exampletb SET fphonenum = ?, fphonetime = ?,fdatastatus=?  WHERE funiqueid = ?");
					q.setParameter(1, 1);					
			     	Timestamp datetime = EJBTime.getTimeStamp();			    	
					q.setParameter(2, datetime);	   			
					q.executeUpdate();
				}			
			}
		}	
	}
    
	@Override
	public void DeleteSerialnumberDatarelate(String id) 
	{
		SerialnumberDatarelate serialnumberDatarelateInfo = manager.find(SerialnumberDatarelate.class, id);
		
		manager.remove(serialnumberDatarelateInfo);
	}
	
	@Override
	public SerialnumberDatarelate findSerialnumberDatarelate(String id) 
	{
		SerialnumberDatarelate serialnumberDatarelateInfo = manager.find(SerialnumberDatarelate.class, id);
		return serialnumberDatarelateInfo;
	}
    
	private String GetWhere(HashMap<String, String> map) {
		String where = "";
		
		if(map!=null && map.size()>0)
		{
			//if(map.containsKey("FDatarelateID") && map.get("FDatarelateID")!=null && !map.get("FDatarelateID").toString().equals(""))
			//{
			//	where += " and a.FDatarelateID like '%"+map.get("FDatarelateID")+"%' ";
			//}	
			//if(map.containsKey("fsndusrid") && map.get("fsndusrid")!=null && !map.get("fsndusrid").toString().equals(""))
			//{
			//	where += " and a.fsndusrid like '%"+map.get("fsndusrid")+"%' ";
			//}	
			//if(map.containsKey("funiqueid") && map.get("funiqueid")!=null && !map.get("funiqueid").toString().equals(""))
			//{
			//	where += " and a.funiqueid like '%"+map.get("funiqueid")+"%' ";
			//}	
			//if(map.containsKey("FIncreaseID") && map.get("FIncreaseID")!=null && !map.get("FIncreaseID").toString().equals(""))
			//{
			//	where += " and a.FIncreaseID like '%"+map.get("FIncreaseID")+"%' ";
			//}	
			//if(map.containsKey("fappcountid") && map.get("fappcountid")!=null && !map.get("fappcountid").toString().equals(""))
			//{
			//	where += " and a.fappcountid like '%"+map.get("fappcountid")+"%' ";
			//}	
			//if(map.containsKey("FUserID") && map.get("FUserID")!=null && !map.get("FUserID").toString().equals(""))
			//{
			//	where += " and a.FUserID like '%"+map.get("FUserID")+"%' ";
			//}	
			//if(map.containsKey("fstarttime") && map.get("fstarttime")!=null && !map.get("fstarttime").toString().equals(""))
			//{
			//	where += " and a.fstarttime like '%"+map.get("fstarttime")+"%' ";
			//}	
			//if(map.containsKey("fendtime") && map.get("fendtime")!=null && !map.get("fendtime").toString().equals(""))
			//{
			//	where += " and a.fendtime like '%"+map.get("fendtime")+"%' ";
			//}	
			//if(map.containsKey("FIsDelete") && map.get("FIsDelete")!=null && !map.get("FIsDelete").toString().equals(""))
			//{
			//	where += " and a.FIsDelete like '%"+map.get("FIsDelete")+"%' ";
			//}	
			//if(map.containsKey("FIsLock") && map.get("FIsLock")!=null && !map.get("FIsLock").toString().equals(""))
			//{
			//	where += " and a.FIsLock like '%"+map.get("FIsLock")+"%' ";
			//}	
			//if(map.containsKey("FDataStatus") && map.get("FDataStatus")!=null && !map.get("FDataStatus").toString().equals(""))
			//{
			//	where += " and a.FDataStatus like '%"+map.get("FDataStatus")+"%' ";
			//}	
			//if(map.containsKey("FRemark") && map.get("FRemark")!=null && !map.get("FRemark").toString().equals(""))
			//{
			//	where += " and a.FRemark like '%"+map.get("FRemark")+"%' ";
			//}	
			//if(map.containsKey("FOrder") && map.get("FOrder")!=null && !map.get("FOrder").toString().equals(""))
			//{
			//	where += " and a.FOrder like '%"+map.get("FOrder")+"%' ";
			//}	
			//if(map.containsKey("FAddTime") && map.get("FAddTime")!=null && !map.get("FAddTime").toString().equals(""))
			//{
			//	where += " and a.FAddTime like '%"+map.get("FAddTime")+"%' ";
			//}	
			//if(map.containsKey("FUpdateTime") && map.get("FUpdateTime")!=null && !map.get("FUpdateTime").toString().equals(""))
			//{
			//	where += " and a.FUpdateTime like '%"+map.get("FUpdateTime")+"%' ";
			//}	
			//if(map.containsKey("fdeletetime") && map.get("fdeletetime")!=null && !map.get("fdeletetime").toString().equals(""))
			//{
			//	where += " and a.fdeletetime like '%"+map.get("fdeletetime")+"%' ";
			//}	
			
		}
		return where;
	}    
	
	@Override
	public int GetSerialnumberDatarelateCount(HashMap<String, String> map){
		
        String where = GetWhere(map);
        
		String hql = "select count(*) from SerialnumberDatarelate";	    
		Query query =manager.createQuery(hql);   
		int total = (new Integer(query.getSingleResult().toString()));	    
		return total;
	}	
	
	@Override 
	public List<SerialnumberDatarelate> ListSerialnumberDatarelate(int offset, int length,HashMap<String, String> map) {					
//		
//        String where = GetWhere(map);
//        
//        String hql = "from SerialnumberDatarelate";      
//		Query query =manager.createQuery(hql);   
//		query.setFirstResult(offset);
//		query.setMaxResults(length);
//		@SuppressWarnings("unchecked")
//		List<SerialnumberDatarelate> SerialnumberDatarelates = query.getResultList();   
//		return SerialnumberDatarelates;		
		
		
		String where=" ";
		
		if(map.containsKey("a.funiqueid") && map.get("a.funiqueid")!=null && !map.get("a.funiqueid").toString().equals(""))
		{
			where += " and a.funiqueid = '"+map.get("a.funiqueid")+"' ";
		}	
		if(map.containsKey("a.fsndusrid") && map.get("a.fsndusrid")!=null && !map.get("a.fsndusrid").toString().equals(""))
		{
			where += " and a.fsndusrid = '"+map.get("a.fsndusrid")+"' ";
		}	
		
		if(map.containsKey("a.fappcountid") && map.get("a.fappcountid")!=null && !map.get("a.fappcountid").toString().equals(""))
		{
			where += " and a.fappcountid = '"+map.get("a.fappcountid")+"' ";
		}	
		
		if(where.equals(""))
		{
			where +="and 1=0";
		}	
		
	   	StringBuffer  sql = new StringBuffer();
        sql.append(" SELECT a.FDatarelateID,a.fsndusrid,a.funiqueid,a.FIncreaseID,a.fappcountid,a.FUserID,a.fstarttime,a.fendtime,a.FIsDelete,a.FIsLock,a.FDataStatus,a.FRemark,a.FOrder,a.FAddTime,a.FUpdateTime,a.fdeletetime ");
        sql.append(" FROM T_SERIALNUMBER_DATARELATE a ");
		sql.append(" WHERE 1 = 1 ");
		
		sql.append(  where);
		sql.append(" order by a.FIncreaseID desc ");
		sql.append(" limit "+offset+","+length+"");

		Query query = manager.createNativeQuery(sql.toString());

		List rows = query.getResultList();
		List<SerialnumberDatarelate> SerialnumberDatarelates = new ArrayList<SerialnumberDatarelate>();
		
		for (Object row : rows) {
			Object[] cells = (Object[]) row;
			
			SerialnumberDatarelate item = new SerialnumberDatarelate();	
            
            item.setFdatarelateid((String)cells[0]);            
            item.setFsndusrid((String)cells[1]);            
            item.setFuniqueid((String)cells[2]);            
            item.setFincreaseid((Integer)cells[3]);            
            item.setFappcountid((String)cells[4]);            
            item.setFuserid((String)cells[5]);            
            item.setFstarttime((java.sql.Timestamp)cells[6]);            
            item.setFendtime((java.sql.Timestamp)cells[7]);            
            item.setFisdelete((Integer)cells[8]);            
            item.setFislock((Integer)cells[9]);            
            item.setFdatastatus((Integer)cells[10]);            
            item.setFremark((String)cells[11]);            
            item.setForder((Integer)cells[12]);            
            item.setFaddtime((java.sql.Timestamp)cells[13]);            
            item.setFupdatetime((java.sql.Timestamp)cells[14]);            
            item.setFdeletetime((java.sql.Timestamp)cells[15]);            
          			
			SerialnumberDatarelates.add(item);			
		}
		return SerialnumberDatarelates;
	}
}