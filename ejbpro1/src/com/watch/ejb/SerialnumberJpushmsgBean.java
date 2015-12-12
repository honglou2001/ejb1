package com.watch.ejb;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.sql.Timestamp;
import com.common.ejb.EJBTime;
/**
 * <p>Title: ejb title </p>
 * <p>Description: t_serialnumber_jpushmsg EJB Interface Bean 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-12-12 17:21:28
 */
@Stateless(mappedName="SerialnumberJpushmsgService")
public class SerialnumberJpushmsgBean  implements SerialnumberJpushmsgService {
    
    @PersistenceContext(unitName = "ejbpro1")	
    private EntityManager manager;

	@Override
	public void AddSerialnumberJpushmsg(SerialnumberJpushmsg serialnumberJpushmsgInfo) {  
        serialnumberJpushmsgInfo.setFpushmsgid(UUID.randomUUID().toString());
     	Timestamp datetime = EJBTime.getTimeStamp();
     	serialnumberJpushmsgInfo.setFaddtime(datetime);
     	serialnumberJpushmsgInfo.setFupdatetime(datetime);
		manager.persist(serialnumberJpushmsgInfo);		
	}
	
	@Override
	public void UpdateSerialnumberJpushmsg(SerialnumberJpushmsg serialnumberJpushmsgInfo) 
	{
        Timestamp datetime = EJBTime.getTimeStamp();
     	serialnumberJpushmsgInfo.setFupdatetime(datetime);
		manager.merge(serialnumberJpushmsgInfo);		
	}
	
	@Override
	public void UpdateSerialnumberJpushmsg(SerialnumberJpushmsg serialnumberJpushmsgInfo,HashMap<String, String> map) 
	{
    	if(map!=null && map.size()>0){
			if(map.containsKey("actionType")){
				String actionType = map.get("actionType");
				
				if(actionType.equals("1"))
				{    		    										   					
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
	public void DeleteSerialnumberJpushmsg(String id) 
	{
		SerialnumberJpushmsg serialnumberJpushmsgInfo = manager.find(SerialnumberJpushmsg.class, id);
		
		manager.remove(serialnumberJpushmsgInfo);
	}
	
	@Override
	public SerialnumberJpushmsg findSerialnumberJpushmsg(String id) 
	{
		SerialnumberJpushmsg serialnumberJpushmsgInfo = manager.find(SerialnumberJpushmsg.class, id);
		return serialnumberJpushmsgInfo;
	}
    
	private String GetWhere(HashMap<String, String> map) {
		String where = "";
		
		if(map!=null && map.size()>0)
		{
			//if(map.containsKey("FPushMsgID") && map.get("FPushMsgID")!=null && !map.get("FPushMsgID").toString().equals(""))
			//{
			//	where += " and a.FPushMsgID like '%"+map.get("FPushMsgID")+"%' ";
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
			//if(map.containsKey("FTitle") && map.get("FTitle")!=null && !map.get("FTitle").toString().equals(""))
			//{
			//	where += " and a.FTitle like '%"+map.get("FTitle")+"%' ";
			//}	
			//if(map.containsKey("FType") && map.get("FType")!=null && !map.get("FType").toString().equals(""))
			//{
			//	where += " and a.FType like '%"+map.get("FType")+"%' ";
			//}	
			//if(map.containsKey("FContent") && map.get("FContent")!=null && !map.get("FContent").toString().equals(""))
			//{
			//	where += " and a.FContent like '%"+map.get("FContent")+"%' ";
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
	public int GetSerialnumberJpushmsgCount(HashMap<String, String> map){
		
        String where = GetWhere(map);
        
		String hql = "select count(*) from SerialnumberJpushmsg";	    
		Query query =manager.createQuery(hql);   
		int total = (new Integer(query.getSingleResult().toString()));	    
		return total;
	}	
	
	@Override 
	public List<SerialnumberJpushmsg> ListSerialnumberJpushmsg(int offset, int length,HashMap<String, String> map) {					
		
        String where = GetWhere(map);
        
        String hql = "from SerialnumberJpushmsg";      
		Query query =manager.createQuery(hql);   
		query.setFirstResult(offset);
		query.setMaxResults(length);
		@SuppressWarnings("unchecked")
		List<SerialnumberJpushmsg> SerialnumberJpushmsgs = query.getResultList();   
		return SerialnumberJpushmsgs;		
	}
}
