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
 * <p>Description: t_serialnumber_jpush EJB Interface Bean 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-9-21 17:46:37
 */
@Stateless(mappedName="SerialnumberJpushService")
public class SerialnumberJpushBean  implements SerialnumberJpushService {
    
    @PersistenceContext(unitName = "ejbpro1")	
    private EntityManager manager;

	@Override
	public void AddSerialnumberJpush(SerialnumberJpush serialnumberJpushInfo) {  
        serialnumberJpushInfo.setFpushid(UUID.randomUUID().toString());
        
		Timestamp datetime = EJBTime.getTimeStamp();

		serialnumberJpushInfo.setFaddtime(datetime);
		serialnumberJpushInfo.setFupdatetime(datetime);
		
		manager.persist(serialnumberJpushInfo);		
	}
	
	@Override
	public void UpdateSerialnumberJpush(SerialnumberJpush serialnumberJpushInfo) 
	{
		Timestamp datetime = EJBTime.getTimeStamp();

		serialnumberJpushInfo.setFupdatetime(datetime);
		manager.merge(serialnumberJpushInfo);		
	}
	
	@Override
	public void DeleteSerialnumberJpush(String id) 
	{
		SerialnumberJpush serialnumberJpushInfo = manager.find(SerialnumberJpush.class, id);
		
		manager.remove(serialnumberJpushInfo);
	}
	
	@Override
	public SerialnumberJpush findSerialnumberJpush(String id) 
	{
		SerialnumberJpush serialnumberJpushInfo = manager.find(SerialnumberJpush.class, id);
		return serialnumberJpushInfo;
	}
    
	private String GetWhere(HashMap<String, String> map) {
		String where = "";
		
		if(map!=null && map.size()>0)
		{
			//if(map.containsKey("FPushID") && map.get("FPushID")!=null && !map.get("FPushID").toString().equals(""))
			//{
			//	where += " and a.FPushID like '%"+map.get("FPushID")+"%' ";
			//}	
			//if(map.containsKey("FIncreaseID") && map.get("FIncreaseID")!=null && !map.get("FIncreaseID").toString().equals(""))
			//{
			//	where += " and a.FIncreaseID like '%"+map.get("FIncreaseID")+"%' ";
			//}	
			//if(map.containsKey("FAppId") && map.get("FAppId")!=null && !map.get("FAppId").toString().equals(""))
			//{
			//	where += " and a.FAppId like '%"+map.get("FAppId")+"%' ";
			//}	
			//if(map.containsKey("FUserID") && map.get("FUserID")!=null && !map.get("FUserID").toString().equals(""))
			//{
			//	where += " and a.FUserID like '%"+map.get("FUserID")+"%' ";
			//}	
			//if(map.containsKey("FSNID") && map.get("FSNID")!=null && !map.get("FSNID").toString().equals(""))
			//{
			//	where += " and a.FSNID like '%"+map.get("FSNID")+"%' ";
			//}	
			//if(map.containsKey("FSNNumber") && map.get("FSNNumber")!=null && !map.get("FSNNumber").toString().equals(""))
			//{
			//	where += " and a.FSNNumber like '%"+map.get("FSNNumber")+"%' ";
			//}	
			//if(map.containsKey("FALias") && map.get("FALias")!=null && !map.get("FALias").toString().equals(""))
			//{
			//	where += " and a.FALias like '%"+map.get("FALias")+"%' ";
			//}	
			//if(map.containsKey("FTag") && map.get("FTag")!=null && !map.get("FTag").toString().equals(""))
			//{
			//	where += " and a.FTag like '%"+map.get("FTag")+"%' ";
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
	public int GetSerialnumberJpushCount(HashMap<String, String> map){
		
        String where = GetWhere(map);
        
		String hql = "select count(*) from SerialnumberJpush";	    
		Query query =manager.createQuery(hql);   
		int total = (new Integer(query.getSingleResult().toString()));	    
		return total;
	}	
	
	@Override 
	public List<SerialnumberJpush> ListSerialnumberJpush(int offset, int length,HashMap<String, String> map) {					
		
		String where = "";
	
		if(map!=null && map.size()>0)
		{
			if(map.containsKey("FUserID") && map.get("FUserID")!=null && !map.get("FUserID").toString().equals(""))
			{
				where += " and a.FUserID = '"+map.get("FUserID")+"' ";
			}					
			
		}
		
		StringBuffer  sql = new StringBuffer();
        sql.append(" SELECT a.FPushID,a.FIncreaseID,a.FAppId,a.FUserID,a.FSNID,a.FSNNumber,a.FALias,a.FTag,a.FDataStatus,a.FFieldStatus,a.FAddTime,a.FUpdateTime,a.FRemark ");
        sql.append(" FROM T_SERIALNUMBER_JPUSH a ");
		sql.append(" WHERE 1 = 1 ");
		sql.append(  where);		
		sql.append(" order by a.FIncreaseID desc ");
		sql.append(  "limit "+offset+","+length+"");
		
		
		Query query = manager.createNativeQuery(sql.toString());

		List rows = query.getResultList();
		List<SerialnumberJpush> SerialnumberJpushs = new ArrayList<SerialnumberJpush>();
		
		for (Object row : rows) {
			Object[] cells = (Object[]) row;
			
			SerialnumberJpush item = new SerialnumberJpush();	
            
            item.setFpushid((String)cells[0]);            
            item.setFincreaseid((Integer)cells[1]);            
            item.setFappid((String)cells[2]);            
            item.setFuserid((String)cells[3]);            
            item.setFsnid((String)cells[4]);            
            item.setFsnnumber((String)cells[5]);            
            item.setFalias((String)cells[6]);            
            item.setFtag((String)cells[7]);            
            item.setFdatastatus((Integer)cells[8]);            
            item.setFfieldstatus((Integer)cells[9]);            
            item.setFaddtime((java.sql.Timestamp)cells[10]);            
            item.setFupdatetime((java.sql.Timestamp)cells[11]);            
            item.setFremark((String)cells[12]);            
          			
			SerialnumberJpushs.add(item);			
		}
		return SerialnumberJpushs;
	}
}