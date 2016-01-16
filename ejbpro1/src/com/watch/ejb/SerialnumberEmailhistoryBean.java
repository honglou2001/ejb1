package com.watch.ejb;

import java.util.ArrayList;
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
 * <p>Description: t_serialnumber_emailhistory EJB Interface Bean 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-12-20 11:59:29
 */
@Stateless(mappedName="SerialnumberEmailhistoryService")
public class SerialnumberEmailhistoryBean  implements SerialnumberEmailhistoryService {
    
    @PersistenceContext(unitName = "ejbpro1")	
    private EntityManager manager;

	@Override
	public void AddSerialnumberEmailhistory(SerialnumberEmailhistory serialnumberEmailhistoryInfo) {  
        serialnumberEmailhistoryInfo.setFemailrecid(UUID.randomUUID().toString());
     	Timestamp datetime = EJBTime.getTimeStamp();
     	serialnumberEmailhistoryInfo.setFaddtime(datetime);
     	serialnumberEmailhistoryInfo.setFupdatetime(datetime);
		manager.persist(serialnumberEmailhistoryInfo);		
	}
	
	@Override
	public void UpdateSerialnumberEmailhistory(SerialnumberEmailhistory serialnumberEmailhistoryInfo) 
	{
        Timestamp datetime = EJBTime.getTimeStamp();
     	serialnumberEmailhistoryInfo.setFupdatetime(datetime);
		manager.merge(serialnumberEmailhistoryInfo);		
	}
	
	@Override
	public void UpdateSerialnumberEmailhistory(SerialnumberEmailhistory serialnumberEmailhistoryInfo,HashMap<String, String> map) 
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
	public void DeleteSerialnumberEmailhistory(String id) 
	{
		SerialnumberEmailhistory serialnumberEmailhistoryInfo = manager.find(SerialnumberEmailhistory.class, id);
		
		manager.remove(serialnumberEmailhistoryInfo);
	}
	
	@Override
	public SerialnumberEmailhistory findSerialnumberEmailhistory(String id) 
	{
		SerialnumberEmailhistory serialnumberEmailhistoryInfo = manager.find(SerialnumberEmailhistory.class, id);
		return serialnumberEmailhistoryInfo;
	}
    
	private String GetWhere(HashMap<String, String> map) {
		String where = "";
		
		if(map!=null && map.size()>0)
		{
			//if(map.containsKey("FEmailRecID") && map.get("FEmailRecID")!=null && !map.get("FEmailRecID").toString().equals(""))
			//{
			//	where += " and a.FEmailRecID like '%"+map.get("FEmailRecID")+"%' ";
			//}	
			//if(map.containsKey("FTemplateID") && map.get("FTemplateID")!=null && !map.get("FTemplateID").toString().equals(""))
			//{
			//	where += " and a.FTemplateID like '%"+map.get("FTemplateID")+"%' ";
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
			//if(map.containsKey("FLanguage") && map.get("FLanguage")!=null && !map.get("FLanguage").toString().equals(""))
			//{
			//	where += " and a.FLanguage like '%"+map.get("FLanguage")+"%' ";
			//}	
			//if(map.containsKey("FTag") && map.get("FTag")!=null && !map.get("FTag").toString().equals(""))
			//{
			//	where += " and a.FTag like '%"+map.get("FTag")+"%' ";
			//}	
			//if(map.containsKey("FTitle") && map.get("FTitle")!=null && !map.get("FTitle").toString().equals(""))
			//{
			//	where += " and a.FTitle like '%"+map.get("FTitle")+"%' ";
			//}	
			//if(map.containsKey("FToAddress") && map.get("FToAddress")!=null && !map.get("FToAddress").toString().equals(""))
			//{
			//	where += " and a.FToAddress like '%"+map.get("FToAddress")+"%' ";
			//}	
			//if(map.containsKey("FFromAddress") && map.get("FFromAddress")!=null && !map.get("FFromAddress").toString().equals(""))
			//{
			//	where += " and a.FFromAddress like '%"+map.get("FFromAddress")+"%' ";
			//}	
			//if(map.containsKey("FType") && map.get("FType")!=null && !map.get("FType").toString().equals(""))
			//{
			//	where += " and a.FType like '%"+map.get("FType")+"%' ";
			//}	
			//if(map.containsKey("FContent") && map.get("FContent")!=null && !map.get("FContent").toString().equals(""))
			//{
			//	where += " and a.FContent like '%"+map.get("FContent")+"%' ";
			//}	
			//if(map.containsKey("FAattachment") && map.get("FAattachment")!=null && !map.get("FAattachment").toString().equals(""))
			//{
			//	where += " and a.FAattachment like '%"+map.get("FAattachment")+"%' ";
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
	public int GetSerialnumberEmailhistoryCount(HashMap<String, String> map){
		
        String where = GetWhere(map);
        
		String hql = "select count(*) from SerialnumberEmailhistory";	    
		Query query =manager.createQuery(hql);   
		int total = (new Integer(query.getSingleResult().toString()));	    
		return total;
	}	
	
	@Override 
	public List<SerialnumberEmailhistory> ListSerialnumberEmailhistory(int offset, int length,HashMap<String, String> map) {					
		

	    StringBuffer  sql = new StringBuffer();
        sql.append(" SELECT a.FEmailRecID,a.FTemplateID,a.FIncreaseID,a.FAppId,a.FUserID,a.FSNID,a.FSNNumber,a.FLanguage,a.FTag,a.FTitle,a.FToAddress,a.FFromAddress,a.FType,a.FContent,a.FAattachment,a.FDataStatus,a.FFieldStatus,a.FAddTime,a.FUpdateTime,a.FRemark ");
        sql.append(" FROM T_SERIALNUMBER_EMAILHISTORY a ");
		sql.append(" WHERE 1 = 1 ");
		sql.append(" order by a.FUpdateTime desc ");
		sql.append(" limit "+offset+","+length+"");

		Query query = manager.createNativeQuery(sql.toString());

		List rows = query.getResultList();
		List<SerialnumberEmailhistory> SerialnumberEmailhistorys = new ArrayList<SerialnumberEmailhistory>();
		
		for (Object row : rows) {
			Object[] cells = (Object[]) row;
			
			SerialnumberEmailhistory item = new SerialnumberEmailhistory();	
            
            item.setFemailrecid((String)cells[0]);            
            item.setFtemplateid((String)cells[1]);            
            item.setFincreaseid((Integer)cells[2]);            
            item.setFappid((String)cells[3]);            
            item.setFuserid((String)cells[4]);            
            item.setFsnid((String)cells[5]);            
            item.setFsnnumber((String)cells[6]);            
            item.setFlanguage((Integer)cells[7]);            
            item.setFtag((String)cells[8]);            
            item.setFtitle((String)cells[9]);            
            item.setFtoaddress((String)cells[10]);            
            item.setFfromaddress((String)cells[11]);            
            item.setFtype((Integer)cells[12]);            
            item.setFcontent((String)cells[13]);            
            item.setFaattachment((String)cells[14]);            
            item.setFdatastatus((Integer)cells[15]);            
            item.setFfieldstatus((Integer)cells[16]);            
            item.setFaddtime((java.sql.Timestamp)cells[17]);            
            item.setFupdatetime((java.sql.Timestamp)cells[18]);            
            item.setFremark((String)cells[19]);            
          			
			SerialnumberEmailhistorys.add(item);			
		}
		return SerialnumberEmailhistorys;	
	}
}