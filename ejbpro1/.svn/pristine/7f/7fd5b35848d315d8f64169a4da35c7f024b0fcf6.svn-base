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
 * <p>Description: t_serialnumber_apiphone EJB Interface Bean 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-9-5 21:21:56
 */
@Stateless(mappedName="SerialnumberApiphoneService")
public class SerialnumberApiphoneBean  implements SerialnumberApiphoneService {
    
    @PersistenceContext(unitName = "ejbpro1")	
    private EntityManager manager;

	@Override
	public void AddSerialnumberApiphone(SerialnumberApiphone serialnumberApiphoneInfo) {  
        serialnumberApiphoneInfo.setFclientid(UUID.randomUUID().toString());
        
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("FClientNumber", serialnumberApiphoneInfo.getFclientnumber());
		map.put("FMobile", serialnumberApiphoneInfo.getFmobile());
		
		List<SerialnumberApiphone> lists = this.ListSerialnumberApiphone(0, 100, map);
		if(lists!=null && lists.size()>0)
		{
			throw new RuntimeException("ClientNumber或电话号码已经申请");
		}
		
		Timestamp datetime = EJBTime.getTimeStamp();

		serialnumberApiphoneInfo.setFaddtime(datetime);
		serialnumberApiphoneInfo.setFupdatetime(datetime);
		
		manager.persist(serialnumberApiphoneInfo);		
	}
	
	@Override
	public void UpdateSerialnumberApiphone(SerialnumberApiphone serialnumberApiphoneInfo) 
	{
		
		Timestamp datetime = EJBTime.getTimeStamp();

		serialnumberApiphoneInfo.setFupdatetime(datetime);
		
		manager.merge(serialnumberApiphoneInfo);		
	}
	
	@Override
	public void DeleteSerialnumberApiphone(String id) 
	{
		SerialnumberApiphone serialnumberApiphoneInfo = manager.find(SerialnumberApiphone.class, id);
		
		manager.remove(serialnumberApiphoneInfo);
	}
	
	@Override
	public SerialnumberApiphone findSerialnumberApiphone(String id) 
	{
		SerialnumberApiphone serialnumberApiphoneInfo = manager.find(SerialnumberApiphone.class, id);
		return serialnumberApiphoneInfo;
	}
    
	private String GetWhere(HashMap<String, String> map) {
		String where = "";
		
		if(map!=null && map.size()>0)
		{
			//if(map.containsKey("FClientID") && map.get("FClientID")!=null && !map.get("FClientID").toString().equals(""))
			//{
			//	where += " and a.FClientID like '%"+map.get("FClientID")+"%' ";
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
			//if(map.containsKey("FClientNumber") && map.get("FClientNumber")!=null && !map.get("FClientNumber").toString().equals(""))
			//{
			//	where += " and a.FClientNumber like '%"+map.get("FClientNumber")+"%' ";
			//}	
			//if(map.containsKey("FClientPwd") && map.get("FClientPwd")!=null && !map.get("FClientPwd").toString().equals(""))
			//{
			//	where += " and a.FClientPwd like '%"+map.get("FClientPwd")+"%' ";
			//}	
			//if(map.containsKey("FClientType") && map.get("FClientType")!=null && !map.get("FClientType").toString().equals(""))
			//{
			//	where += " and a.FClientType like '%"+map.get("FClientType")+"%' ";
			//}	
			//if(map.containsKey("FFriendlyName") && map.get("FFriendlyName")!=null && !map.get("FFriendlyName").toString().equals(""))
			//{
			//	where += " and a.FFriendlyName like '%"+map.get("FFriendlyName")+"%' ";
			//}	
			//if(map.containsKey("FMobile") && map.get("FMobile")!=null && !map.get("FMobile").toString().equals(""))
			//{
			//	where += " and a.FMobile like '%"+map.get("FMobile")+"%' ";
			//}	
			//if(map.containsKey("FRoam") && map.get("FRoam")!=null && !map.get("FRoam").toString().equals(""))
			//{
			//	where += " and a.FRoam like '%"+map.get("FRoam")+"%' ";
			//}	
			//if(map.containsKey("FBalance") && map.get("FBalance")!=null && !map.get("FBalance").toString().equals(""))
			//{
			//	where += " and a.FBalance like '%"+map.get("FBalance")+"%' ";
			//}	
			//if(map.containsKey("FDataStatus") && map.get("FDataStatus")!=null && !map.get("FDataStatus").toString().equals(""))
			//{
			//	where += " and a.FDataStatus like '%"+map.get("FDataStatus")+"%' ";
			//}	
			//if(map.containsKey("FFieldStatus") && map.get("FFieldStatus")!=null && !map.get("FFieldStatus").toString().equals(""))
			//{
			//	where += " and a.FFieldStatus like '%"+map.get("FFieldStatus")+"%' ";
			//}	
			//if(map.containsKey("FCreateDate") && map.get("FCreateDate")!=null && !map.get("FCreateDate").toString().equals(""))
			//{
			//	where += " and a.FCreateDate like '%"+map.get("FCreateDate")+"%' ";
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
	public int GetSerialnumberApiphoneCount(HashMap<String, String> map){
		
        String where = GetWhere(map);
        
		String hql = "select count(*) from SerialnumberApiphone";	    
		Query query =manager.createQuery(hql);   
		int total = (new Integer(query.getSingleResult().toString()));	    
		return total;
	}	
	
	@Override 
	public List<SerialnumberApiphone> ListSerialnumberApiphone(int offset, int length,HashMap<String, String> map) {					
	  	
		String where = "";
		
		if(map!=null && map.size()>0)
		{
			if(map.containsKey("FSNID") && map.get("FSNID")!=null && !map.get("FSNID").toString().equals(""))
			{
				where += " and a.FSNID = '"+map.get("FSNID")+"' ";
			}
			if(map.containsKey("FSNNumber") && map.get("FSNNumber")!=null && !map.get("FSNNumber").toString().equals(""))
			{
				where += " and a.FSNNumber = '"+map.get("FSNNumber")+"' ";
			}
			if(map.containsKey("FClientNumber") && map.get("FClientNumber")!=null && !map.get("FClientNumber").toString().equals(""))
			{
				where += " and a.FClientNumber = '"+map.get("FClientNumber")+"' ";
			}
			if(map.containsKey("FMobile") && map.get("FMobile")!=null && !map.get("FMobile").toString().equals(""))
			{
				where += " and a.FMobile = '"+map.get("FMobile")+"' ";
			}			
			
		}
		
		StringBuffer  sql = new StringBuffer();
        sql.append(" SELECT a.FClientID,a.FIncreaseID,a.FAppId,a.FUserID,a.FSNID,a.FSNNumber,a.FClientNumber,a.FClientPwd,a.FClientType,a.FFriendlyName,a.FMobile,a.FRoam,a.FBalance,a.FDataStatus,a.FFieldStatus,a.FCreateDate,a.FAddTime,a.FUpdateTime,a.FRemark ");
        sql.append(" FROM T_SERIALNUMBER_APIPHONE a ");
		sql.append(" WHERE 1 = 1 ");		
		sql.append(  where);		
		sql.append(" order by a.FIncreaseID desc ");
		sql.append(  "limit "+offset+","+length+"");

		Query query = manager.createNativeQuery(sql.toString());

		List rows = query.getResultList();
		List<SerialnumberApiphone> SerialnumberApiphones = new ArrayList<SerialnumberApiphone>();
		
		for (Object row : rows) {
			Object[] cells = (Object[]) row;
			
			SerialnumberApiphone item = new SerialnumberApiphone();	
            
            item.setFclientid((String)cells[0]);            
            item.setFincreaseid((Integer)cells[1]);            
            item.setFappid((String)cells[2]);            
            item.setFuserid((String)cells[3]);            
            item.setFsnid((String)cells[4]);            
            item.setFsnnumber((String)cells[5]);            
            item.setFclientnumber((String)cells[6]);            
            item.setFclientpwd((String)cells[7]);            
            item.setFclienttype((String)cells[8]);            
            item.setFfriendlyname((String)cells[9]);            
            item.setFmobile((String)cells[10]);            
            item.setFroam((String)cells[11]);            
            item.setFbalance((java.math.BigDecimal)cells[12]);            
            item.setFdatastatus((Integer)cells[13]);            
            item.setFfieldstatus((Integer)cells[14]);            
            item.setFcreatedate((java.sql.Timestamp)cells[15]);            
            item.setFaddtime((java.sql.Timestamp)cells[16]);            
            item.setFupdatetime((java.sql.Timestamp)cells[17]);            
            item.setFremark((String)cells[18]);            
          			
			SerialnumberApiphones.add(item);			
		}
		return SerialnumberApiphones;	
	}
}