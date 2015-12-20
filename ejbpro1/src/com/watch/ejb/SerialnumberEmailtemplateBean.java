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
 * <p>Description: t_serialnumber_emailtemplate EJB Interface Bean 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-12-20 11:56:36
 */
@Stateless(mappedName="SerialnumberEmailtemplateService")
public class SerialnumberEmailtemplateBean  implements SerialnumberEmailtemplateService {
    
    @PersistenceContext(unitName = "ejbpro1")	
    private EntityManager manager;

	@Override
	public void AddSerialnumberEmailtemplate(SerialnumberEmailtemplate serialnumberEmailtemplateInfo) {  
        serialnumberEmailtemplateInfo.setFtemplateid(UUID.randomUUID().toString());
     	Timestamp datetime = EJBTime.getTimeStamp();
     	serialnumberEmailtemplateInfo.setFaddtime(datetime);
     	serialnumberEmailtemplateInfo.setFupdatetime(datetime);
		manager.persist(serialnumberEmailtemplateInfo);		
	}
	
	@Override
	public void UpdateSerialnumberEmailtemplate(SerialnumberEmailtemplate serialnumberEmailtemplateInfo) 
	{
        Timestamp datetime = EJBTime.getTimeStamp();
     	serialnumberEmailtemplateInfo.setFupdatetime(datetime);
		manager.merge(serialnumberEmailtemplateInfo);		
	}
	
	@Override
	public void UpdateSerialnumberEmailtemplate(SerialnumberEmailtemplate serialnumberEmailtemplateInfo,HashMap<String, String> map) 
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
	public void DeleteSerialnumberEmailtemplate(String id) 
	{
		SerialnumberEmailtemplate serialnumberEmailtemplateInfo = manager.find(SerialnumberEmailtemplate.class, id);
		
		manager.remove(serialnumberEmailtemplateInfo);
	}
	
	@Override
	public SerialnumberEmailtemplate findSerialnumberEmailtemplate(String id) 
	{
		SerialnumberEmailtemplate serialnumberEmailtemplateInfo = manager.find(SerialnumberEmailtemplate.class, id);
		return serialnumberEmailtemplateInfo;
	}
    
	private String GetWhere(HashMap<String, String> map) {
		String where = "";
		
		if(map!=null && map.size()>0)
		{
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
			//if(map.containsKey("FLanguage") && map.get("FLanguage")!=null && !map.get("FLanguage").toString().equals(""))
			//{
			//	where += " and a.FLanguage like '%"+map.get("FLanguage")+"%' ";
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
	public int GetSerialnumberEmailtemplateCount(HashMap<String, String> map){
		
        String where = GetWhere(map);
        
		String hql = "select count(*) from SerialnumberEmailtemplate";	    
		Query query =manager.createQuery(hql);   
		int total = (new Integer(query.getSingleResult().toString()));	    
		return total;
	}	
	
	@Override 
	public List<SerialnumberEmailtemplate> ListSerialnumberEmailtemplate(int offset, int length,HashMap<String, String> map) {					
		
//        String where = GetWhere(map);
//        
//        String hql = "from SerialnumberEmailtemplate";      
//		Query query =manager.createQuery(hql);   
//		query.setFirstResult(offset);
//		query.setMaxResults(length);
//		@SuppressWarnings("unchecked")
//		List<SerialnumberEmailtemplate> SerialnumberEmailtemplates = query.getResultList();   
//		return SerialnumberEmailtemplates;	
		
		String where = "";
		
		if(map!=null && map.size()>0)
		{
			if(map.containsKey("FType") && map.get("FType")!=null && !map.get("FType").toString().equals(""))
			{
				where += " and a.FType = "+map.get("FType")+" ";
			}	
			if(map.containsKey("FLanguage") && map.get("FLanguage")!=null && !map.get("FLanguage").toString().equals(""))
			{
				where += " and a.FLanguage = "+map.get("FLanguage")+" ";
			}	
		}
		
	    StringBuffer  sql = new StringBuffer();
        sql.append(" SELECT a.FTemplateID,a.FIncreaseID,a.FAppId,a.FUserID,a.FSNID,a.FSNNumber,a.FTag,a.FTitle,a.FType,a.FContent,a.FLanguage,a.FDataStatus,a.FFieldStatus,a.FAddTime,a.FUpdateTime,a.FRemark ");
        sql.append(" FROM T_SERIALNUMBER_EMAILTEMPLATE a ");
		sql.append(" WHERE 1 = 1 ");

		sql.append(  where);
		sql.append(" order by a.FIncreaseID desc ");
		sql.append(" limit "+offset+","+length+"");
		
		Query query = manager.createNativeQuery(sql.toString());

		List rows = query.getResultList();
		List<SerialnumberEmailtemplate> SerialnumberEmailtemplates = new ArrayList<SerialnumberEmailtemplate>();
		
		for (Object row : rows) {
			Object[] cells = (Object[]) row;
			
			SerialnumberEmailtemplate item = new SerialnumberEmailtemplate();	
            
            item.setFtemplateid((String)cells[0]);            
            item.setFincreaseid((Integer)cells[1]);            
            item.setFappid((String)cells[2]);            
            item.setFuserid((String)cells[3]);            
            item.setFsnid((String)cells[4]);            
            item.setFsnnumber((String)cells[5]);            
            item.setFtag((String)cells[6]);            
            item.setFtitle((String)cells[7]);            
            item.setFtype((Integer)cells[8]);            
            item.setFcontent((String)cells[9]);            
            item.setFlanguage((Integer)cells[10]);            
            item.setFdatastatus((Integer)cells[11]);            
            item.setFfieldstatus((Integer)cells[12]);            
            item.setFaddtime((java.sql.Timestamp)cells[13]);            
            item.setFupdatetime((java.sql.Timestamp)cells[14]);            
            item.setFremark((String)cells[15]);            
          			
			SerialnumberEmailtemplates.add(item);			
		}
		return SerialnumberEmailtemplates;
	}
}