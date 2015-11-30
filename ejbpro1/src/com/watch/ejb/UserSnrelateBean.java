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
 * <p>Description: t_user_snrelate EJB Interface Bean 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-7-5 16:27:11
 */
@Stateless(mappedName="UserSnrelateService")
public class UserSnrelateBean  implements UserSnrelateService {
    
    @PersistenceContext(unitName = "ejbpro1")	
    private EntityManager manager;

	@Override
	public void Add(UserSnrelate userSnrelateInfo) {  
		
				
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("FUserIDStr", userSnrelateInfo.getFuseridstr());
		map.put("FSNIDStr", userSnrelateInfo.getFsnidstr());
		
		List<UserSnrelate> listUser = this.ListUserSnrelate(0, 1, map);
		if(listUser!=null && listUser.size()>0)
		{
			throw new RuntimeException("已存在此序列号与用户的关联关系。");
		}
		 
		
		//在此判断是否已经有关联关系
        userSnrelateInfo.setFrelateid(UUID.randomUUID().toString());
        
    	Timestamp datetime = EJBTime.getTimeStamp();
    	userSnrelateInfo.setFaddtime(datetime);
    	userSnrelateInfo.setFupdatetime(datetime);
		
		manager.persist(userSnrelateInfo);		
	}
	
	@Override
	public void Update(UserSnrelate userSnrelateInfo) 
	{
	 	Timestamp datetime = EJBTime.getTimeStamp();
    	userSnrelateInfo.setFupdatetime(datetime);
		manager.merge(userSnrelateInfo);		
	}
	
	@Override
	public void Delete(String id) 
	{
		UserSnrelate userSnrelateInfo = manager.find(UserSnrelate.class, id);
		
		manager.remove(userSnrelateInfo);
	}
	
	@Override
	public UserSnrelate find(String id) 
	{
		UserSnrelate userSnrelateInfo = manager.find(UserSnrelate.class, id);
		return userSnrelateInfo;
	}
    
	private String GetWhere(HashMap<String, String> map) {
		String where = "";
		
		if(map!=null && map.size()>0)
		{
//			if(map.containsKey("FRelateID") && map.get("FRelateID")!=null && !map.get("FRelateID").toString().equals(""))
//			{
//				where += " and a.FRelateID like '%"+map.get("FRelateID")+"%' ";
//			}	
//			if(map.containsKey("FIncreaseID") && map.get("FIncreaseID")!=null && !map.get("FIncreaseID").toString().equals(""))
//			{
//				where += " and a.FIncreaseID like '%"+map.get("FIncreaseID")+"%' ";
//			}	
//			if(map.containsKey("FUserID") && map.get("FUserID")!=null && !map.get("FUserID").toString().equals(""))
//			{
//				where += " and a.FUserID like '%"+map.get("FUserID")+"%' ";
//			}	
//			if(map.containsKey("FSNID") && map.get("FSNID")!=null && !map.get("FSNID").toString().equals(""))
//			{
//				where += " and a.FSNID like '%"+map.get("FSNID")+"%' ";
//			}	
//			if(map.containsKey("FUserIDStr") && map.get("FUserIDStr")!=null && !map.get("FUserIDStr").toString().equals(""))
//			{
//				where += " and a.FUserIDStr like '%"+map.get("FUserIDStr")+"%' ";
//			}	
//			if(map.containsKey("FSNIDStr") && map.get("FSNIDStr")!=null && !map.get("FSNIDStr").toString().equals(""))
//			{
//				where += " and a.FSNIDStr like '%"+map.get("FSNIDStr")+"%' ";
//			}	
//			if(map.containsKey("FDataStatus") && map.get("FDataStatus")!=null && !map.get("FDataStatus").toString().equals(""))
//			{
//				where += " and a.FDataStatus like '%"+map.get("FDataStatus")+"%' ";
//			}	
//			if(map.containsKey("FFieldStatus") && map.get("FFieldStatus")!=null && !map.get("FFieldStatus").toString().equals(""))
//			{
//				where += " and a.FFieldStatus like '%"+map.get("FFieldStatus")+"%' ";
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
		
        String where = GetWhere(map);
        
		String hql = "select count(*) from UserSnrelate";	    
		Query query =manager.createQuery(hql);   
		int total = (new Integer(query.getSingleResult().toString()));	    
		return total;
	}	
	
//	@Override 
//	public List<UserSnrelate> ListUserSnrelate(int offset, int length,HashMap<String, String> map) {					
//		
//        String where = GetWhere(map);
//        
//        String hql = "from UserSnrelate";      
//		Query query =manager.createQuery(hql);   
//		query.setFirstResult(offset);
//		query.setMaxResults(length);
//		@SuppressWarnings("unchecked")
//		List<UserSnrelate> UserSnrelates = query.getResultList();   
//		return UserSnrelates;		
//	}
	
	@Override
	public List<UserSnrelate> ListUserSnrelate(int offset, int length,HashMap<String, String> map) {
		String where = "";
		
		if(map!=null && map.size()>0)
		{
			if(map.containsKey("FUserIDStr") && map.get("FUserIDStr")!=null && !map.get("FUserIDStr").toString().equals(""))
			{
				where += " and a.FUserIDStr = '"+map.get("FUserIDStr")+"' ";
			}	
			if(map.containsKey("FSNIDStr") && map.get("FSNIDStr")!=null && !map.get("FSNIDStr").toString().equals(""))
			{
				where += " and a.FSNIDStr = '"+map.get("FSNIDStr")+"' ";
			}	
		}
	    StringBuffer  sql = new StringBuffer();
        sql.append(" SELECT a.FRelateID,a.FIncreaseID,a.FUserID,a.FSNID,a.FUserIDStr,a.FSNIDStr,a.FDataStatus,a.FFieldStatus,a.FAddTime,a.FUpdateTime,a.FRemark ");
        sql.append(" FROM T_USER_SNRELATE a ");
		sql.append(" WHERE 1 = 1 ");
		sql.append(  where);

		Query query = manager.createNativeQuery(sql.toString());

		List rows = query.getResultList();
		List<UserSnrelate> UserSnrelates = new ArrayList<UserSnrelate>();
		
		for (Object row : rows) {
			Object[] cells = (Object[]) row;
			
			UserSnrelate item = new UserSnrelate();	
            
            item.setFrelateid((String)cells[0]);            
            item.setFincreaseid((Integer)cells[1]);            
            item.setFuserid((Integer)cells[2]);            
            item.setFsnid((Integer)cells[3]);            
            item.setFuseridstr((String)cells[4]);            
            item.setFsnidstr((String)cells[5]);            
            item.setFdatastatus((Integer)cells[6]);            
            item.setFfieldstatus((Integer)cells[7]);            
            item.setFaddtime((java.sql.Timestamp)cells[8]);            
            item.setFupdatetime((java.sql.Timestamp)cells[9]);            
            item.setFremark((String)cells[10]);            
          			
			UserSnrelates.add(item);			
		}
		return UserSnrelates;
	}
}