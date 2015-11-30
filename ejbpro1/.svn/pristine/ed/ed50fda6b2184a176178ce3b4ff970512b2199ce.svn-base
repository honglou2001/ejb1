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
 * <p>Description: t_user_alarm EJB Interface Bean 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-7-15 16:24:42
 */
@Stateless(mappedName="UserAlarmService")
public class UserAlarmBean  implements UserAlarmService {
    
    @PersistenceContext(unitName = "ejbpro1")	
    private EntityManager manager;

	@Override
	public void Add(UserAlarm userAlarmInfo) {  
       
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("FSNIDStr", userAlarmInfo.getFsnidstr());
		
		int count = this.GetCount(map);
		if (count>=8 ) {

			throw new RuntimeException("同一个序列号下的闹钟数不能大于8个");
		}
		
    	Timestamp datetime = EJBTime.getTimeStamp();
    	userAlarmInfo.setFaddtime(datetime);
    	userAlarmInfo.setFupdatetime(datetime);
    	
		manager.persist(userAlarmInfo);		
	}
	
	@Override
	public void Update(UserAlarm userAlarmInfo) 
	{
		manager.merge(userAlarmInfo);		
	}
	
	@Override
	public void Delete(String id) 
	{
		UserAlarm userAlarmInfo = manager.find(UserAlarm.class, id);
		
		manager.remove(userAlarmInfo);
	}
	
	@Override
	public UserAlarm find(String id) 
	{
		UserAlarm userAlarmInfo = manager.find(UserAlarm.class, id);
		return userAlarmInfo;
	}
    
	private String GetWhere(HashMap<String, String> map) {
		String where = "";
		
		if(map!=null && map.size()>0)
		{
//			if(map.containsKey("FAlarmID") && map.get("FAlarmID")!=null && !map.get("FAlarmID").toString().equals(""))
//			{
//				where += " and a.FAlarmID like '%"+map.get("FAlarmID")+"%' ";
//			}	
//			
//			if(map.containsKey("FUserIDStr") && map.get("FUserIDStr")!=null && !map.get("FUserIDStr").toString().equals(""))
//			{
//				where += " and a.FUserIDStr like '%"+map.get("FUserIDStr")+"%' ";
//			}	
//			if(map.containsKey("FSNIDStr") && map.get("FSNIDStr")!=null && !map.get("FSNIDStr").toString().equals(""))
//			{
//				where += " and a.FSNIDStr like '%"+map.get("FSNIDStr")+"%' ";
//			}	
//			if(map.containsKey("FIsValid") && map.get("FIsValid")!=null && !map.get("FIsValid").toString().equals(""))
//			{
//				where += " and a.FIsValid like '%"+map.get("FIsValid")+"%' ";
//			}	
//			if(map.containsKey("FDataStatus") && map.get("FDataStatus")!=null && !map.get("FDataStatus").toString().equals(""))
//			{
//				where += " and a.FDataStatus like '%"+map.get("FDataStatus")+"%' ";
//			}	
//			if(map.containsKey("FFieldStatus") && map.get("FFieldStatus")!=null && !map.get("FFieldStatus").toString().equals(""))
//			{
//				where += " and a.FFieldStatus like '%"+map.get("FFieldStatus")+"%' ";
//			}	
//			if(map.containsKey("FName") && map.get("FName")!=null && !map.get("FName").toString().equals(""))
//			{
//				where += " and a.FName like '%"+map.get("FName")+"%' ";
//			}	
//			if(map.containsKey("FTime") && map.get("FTime")!=null && !map.get("FTime").toString().equals(""))
//			{
//				where += " and a.FTime like '%"+map.get("FTime")+"%' ";
//			}	
//			if(map.containsKey("FOrder") && map.get("FOrder")!=null && !map.get("FOrder").toString().equals(""))
//			{
//				where += " and a.FOrder like '%"+map.get("FOrder")+"%' ";
//			}	
//			if(map.containsKey("FAddTime") && map.get("FAddTime")!=null && !map.get("FAddTime").toString().equals(""))
//			{
//				where += " and a.FAddTime like '%"+map.get("FAddTime")+"%' ";
//			}	
//			if(map.containsKey("FUpdateTime") && map.get("FUpdateTime")!=null && !map.get("FUpdateTime").toString().equals(""))
//			{
//				where += " and a.FUpdateTime like '%"+map.get("FUpdateTime")+"%' ";
//			}	
//			if(map.containsKey("FRemark") && map.get("FRemark")!=null && !map.get("FRemark").toString().equals(""))
//			{
//				where += " and a.FRemark like '%"+map.get("FRemark")+"%' ";
//			}	
			
		}
		return where;
	}    
	
	@Override
	public int GetCount(HashMap<String, String> map){
		
		String where ="where 1=1 ";
		 
		if(map.containsKey("FSNIDStr") && map.get("FSNIDStr")!=null && !map.get("FSNIDStr").toString().equals(""))
		{
			where += " and FSNIDStr = '"+map.get("FSNIDStr")+"' ";
		}
		               
		String sql = "select count(*) from t_user_alarm ";	 
		
		sql += where;
		
		Query query = manager.createNativeQuery(sql.toString());
		 
		int total = (new Integer(query.getSingleResult().toString()));	    
		return total;
	}	
	
	@Override 
	public List<UserAlarm> ListUserAlarm(int offset, int length,HashMap<String, String> map) {					
		
		String where ="  ";
		 
		if(map.containsKey("FSNIDStr") && map.get("FSNIDStr")!=null && !map.get("FSNIDStr").toString().equals(""))
		{
			where += " and a.FSNIDStr = '"+map.get("FSNIDStr")+"' ";
		}
		
	    StringBuffer  sql = new StringBuffer();
        sql.append(" SELECT a.FAlarmID,a.FIncreaseID,a.FUserIDStr,a.FSNIDStr,a.FIsValid,a.FDataStatus,a.FFieldStatus,a.FName,a.FTime,a.FOrder,a.FAddTime,a.FUpdateTime,a.FRemark ");
        sql.append(" FROM T_USER_ALARM a ");
		sql.append(" WHERE 1 = 1 ");
		sql.append(where);

		Query query = manager.createNativeQuery(sql.toString());

		List rows = query.getResultList();
		List<UserAlarm> UserAlarms = new ArrayList<UserAlarm>();
		
		for (Object row : rows) {
			Object[] cells = (Object[]) row;
			
			UserAlarm item = new UserAlarm();	
            
            item.setFalarmid((String)cells[0]);            
            item.setFincreaseid((Integer)cells[1]);            
            item.setFuseridstr((String)cells[2]);            
            item.setFsnidstr((String)cells[3]);            
            item.setFisvalid((Integer)cells[4]);            
            item.setFdatastatus((Integer)cells[5]);            
            item.setFfieldstatus((Integer)cells[6]);            
            item.setFname((String)cells[7]);            
            item.setFtime((String)cells[8]);            
            item.setForder((Integer)cells[9]);            
            item.setFaddtime((java.sql.Timestamp)cells[10]);            
            item.setFupdatetime((java.sql.Timestamp)cells[11]);            
            item.setFremark((String)cells[12]);   
            
            //1:06:06
            String ftime = item.getFtime();
            if(ftime!=null && ftime.indexOf(":")>0)
            {
            	String[] strArr = ftime.split(":");
            	if(strArr.length==3)
            	{
            		item.setWeek(strArr[0]);
            		item.setHour(strArr[1]);
            		item.setMinute(strArr[2]);
            	}
            }
          			
			UserAlarms.add(item);			
		}
		return UserAlarms;	
	}
}