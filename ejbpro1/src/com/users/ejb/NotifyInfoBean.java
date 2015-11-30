package com.users.ejb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.watch.ejb.LocElectfence;
import com.watch.ejb.LocElectfenceBean;
import com.watch.ejb.Serialnumber;
import com.watch.ejb.SerialnumberBean;
/**
 * <p>Title: ejb title </p>
 * <p>Description: t_notify_info EJB Interface Bean 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-8-30 14:27:13
 */
@Stateless(mappedName="NotifyInfoService")
public class NotifyInfoBean  implements NotifyInfoService {
    
    @PersistenceContext(unitName = "ejbpro1")	
    private EntityManager manager;

	@Override
	public void AddNotifyInfo(NotifyInfo notifyInfoInfo) {  
        notifyInfoInfo.setFnotifyid(UUID.randomUUID().toString());
		manager.persist(notifyInfoInfo);		
	}
	
	@Override
	public void UpdateNotifyInfo(NotifyInfo notifyInfoInfo) 
	{
		manager.merge(notifyInfoInfo);		
	}
	
	@Override
	public void DeleteNotifyInfo(String id) 
	{
		NotifyInfo notifyInfoInfo = manager.find(NotifyInfo.class, id);
		
		manager.remove(notifyInfoInfo);
	}
	
	@Override
	public NotifyInfo findNotifyInfo(String id) 
	{
		NotifyInfo notifyInfoInfo = manager.find(NotifyInfo.class, id);
		return notifyInfoInfo;
	}
    
	private String GetWhere(HashMap<String, String> map) {
		String where = "";
		
		if(map!=null && map.size()>0)
		{
			//if(map.containsKey("FNotifyID") && map.get("FNotifyID")!=null && !map.get("FNotifyID").toString().equals(""))
			//{
			//	where += " and a.FNotifyID like '%"+map.get("FNotifyID")+"%' ";
			//}	
			//if(map.containsKey("FIncreaseID") && map.get("FIncreaseID")!=null && !map.get("FIncreaseID").toString().equals(""))
			//{
			//	where += " and a.FIncreaseID like '%"+map.get("FIncreaseID")+"%' ";
			//}	
			//if(map.containsKey("FNotifyType") && map.get("FNotifyType")!=null && !map.get("FNotifyType").toString().equals(""))
			//{
			//	where += " and a.FNotifyType like '%"+map.get("FNotifyType")+"%' ";
			//}	
			//if(map.containsKey("FTitle") && map.get("FTitle")!=null && !map.get("FTitle").toString().equals(""))
			//{
			//	where += " and a.FTitle like '%"+map.get("FTitle")+"%' ";
			//}	
			//if(map.containsKey("FDescription") && map.get("FDescription")!=null && !map.get("FDescription").toString().equals(""))
			//{
			//	where += " and a.FDescription like '%"+map.get("FDescription")+"%' ";
			//}	
			//if(map.containsKey("FUserID") && map.get("FUserID")!=null && !map.get("FUserID").toString().equals(""))
			//{
			//	where += " and a.FUserID like '%"+map.get("FUserID")+"%' ";
			//}	
			//if(map.containsKey("FSNID") && map.get("FSNID")!=null && !map.get("FSNID").toString().equals(""))
			//{
			//	where += " and a.FSNID like '%"+map.get("FSNID")+"%' ";
			//}	
			//if(map.containsKey("FName") && map.get("FName")!=null && !map.get("FName").toString().equals(""))
			//{
			//	where += " and a.FName like '%"+map.get("FName")+"%' ";
			//}	
			//if(map.containsKey("FVal1") && map.get("FVal1")!=null && !map.get("FVal1").toString().equals(""))
			//{
			//	where += " and a.FVal1 like '%"+map.get("FVal1")+"%' ";
			//}	
			//if(map.containsKey("FVal2") && map.get("FVal2")!=null && !map.get("FVal2").toString().equals(""))
			//{
			//	where += " and a.FVal2 like '%"+map.get("FVal2")+"%' ";
			//}	
			//if(map.containsKey("FVal3") && map.get("FVal3")!=null && !map.get("FVal3").toString().equals(""))
			//{
			//	where += " and a.FVal3 like '%"+map.get("FVal3")+"%' ";
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
	public int GetNotifyInfoCount(HashMap<String, String> map){
		
        String where = GetWhere(map);
        
		String hql = "select count(*) from NotifyInfo";	    
		Query query =manager.createQuery(hql);   
		int total = (new Integer(query.getSingleResult().toString()));	    
		return total;
	}	
	
	@Override 
	public List<NotifyInfo> ListNotifyInfo(int offset, int length,HashMap<String, String> map) {					
		
		String serialNumber="";
		if(map!=null && map.size()>0)
		{
			serialNumber = map.get("serialNumber");			
		}
		
//		SerialnumberBean serialNumbBean = new SerialnumberBean();
//		Serialnumber serialNumber = serialNumbBean.find(serialNumid);
		
		HashMap<String, String> queryMap = new HashMap<String, String>();		
		queryMap.put("serialNumber", serialNumber);
		
		LocElectfenceBean locElctBean = new LocElectfenceBean();
		List<LocElectfence> listloc= locElctBean.ListLocElectfenceTop1(0,100,queryMap);
		
		List<NotifyInfo> NotifyInfos = new ArrayList<NotifyInfo>();		
		if(listloc!=null&&listloc.size()>0)
		{
			for (LocElectfence row : listloc) {
				
				NotifyInfo item = new NotifyInfo();	
				item.setFnotifytype(1);  
				item.setFdatastatus(row.getFdatastatus());
				item.setFaddtime(row.getFupdatetime());
				item.setFval1(row.getFareaname());				
				NotifyInfos.add(item);	
				
			}
		}
		
		//////////////////////

		
	  	StringBuffer  sql = new StringBuffer();
        sql.append(" SELECT a.FNotifyID,a.FIncreaseID,a.FNotifyType,a.FTitle,a.FDescription,a.FUserID,a.FSNID,a.FName,a.FVal1,a.FVal2,a.FVal3,a.FDataStatus,a.FFieldStatus,a.FAddTime,a.FUpdateTime,a.FRemark ");
        sql.append(" FROM T_NOTIFY_INFO a ");
		sql.append(" WHERE 1 = 1 ");

		Query query = manager.createNativeQuery(sql.toString());

		List rows = query.getResultList();
//		List<NotifyInfo> NotifyInfos = new ArrayList<NotifyInfo>();
		
		for (Object row : rows) {
			Object[] cells = (Object[]) row;
			
			NotifyInfo item = new NotifyInfo();	
            
            item.setFnotifyid((String)cells[0]);            
            item.setFincreaseid((Integer)cells[1]);            
            item.setFnotifytype((Integer)cells[2]);            
            item.setFtitle((String)cells[3]);            
            item.setFdescription((String)cells[4]);            
            item.setFuserid((String)cells[5]);            
            item.setFsnid((String)cells[6]);            
            item.setFname((String)cells[7]);            
            item.setFval1((String)cells[8]);            
            item.setFval2((String)cells[9]);            
            item.setFval3((String)cells[10]);            
            item.setFdatastatus((Integer)cells[11]);            
            item.setFfieldstatus((Integer)cells[12]);            
            item.setFaddtime((java.sql.Timestamp)cells[13]);            
            item.setFupdatetime((java.sql.Timestamp)cells[14]);            
            item.setFremark((String)cells[15]);            
          			
			NotifyInfos.add(item);			
		}
		return NotifyInfos;
	}
}