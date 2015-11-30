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
 * <p>Description: t_user_feedback EJB Interface Bean 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-7-22 14:56:17
 */
@Stateless(mappedName="UserFeedbackService")
public class UserFeedbackBean  implements UserFeedbackService {
    
    @PersistenceContext(unitName = "ejbpro1")	
    private EntityManager manager;

	@Override
	public void Add(UserFeedback userFeedbackInfo) {  
        userFeedbackInfo.setFfeedbackid(UUID.randomUUID().toString());
        
		Timestamp datetime = EJBTime.getTimeStamp();

		userFeedbackInfo.setFaddtime(datetime);
		userFeedbackInfo.setFupdatetime(datetime);
		
		manager.persist(userFeedbackInfo);		
	}
	
	@Override
	public void Update(UserFeedback userFeedbackInfo) 
	{
		manager.merge(userFeedbackInfo);		
	}
	
	@Override
	public void Delete(String id) 
	{
		UserFeedback userFeedbackInfo = manager.find(UserFeedback.class, id);
		
		manager.remove(userFeedbackInfo);
	}
	
	@Override
	public UserFeedback find(String id) 
	{
		UserFeedback userFeedbackInfo = manager.find(UserFeedback.class, id);
		return userFeedbackInfo;
	}
    
	private String GetWhere(HashMap<String, String> map) {
		String where = "";
		
//		if(map!=null && map.size()>0)
//		{
//			if(map.containsKey("FFeedBackID") && map.get("FFeedBackID")!=null && !map.get("FFeedBackID").toString().equals(""))
//			{
//				where += " and a.FFeedBackID like '%"+map.get("FFeedBackID")+"%' ";
//			}	
//			if(map.containsKey("FIncreaseID") && map.get("FIncreaseID")!=null && !map.get("FIncreaseID").toString().equals(""))
//			{
//				where += " and a.FIncreaseID like '%"+map.get("FIncreaseID")+"%' ";
//			}	
//			if(map.containsKey("FParentID") && map.get("FParentID")!=null && !map.get("FParentID").toString().equals(""))
//			{
//				where += " and a.FParentID like '%"+map.get("FParentID")+"%' ";
//			}	
//			if(map.containsKey("FUserIDStr") && map.get("FUserIDStr")!=null && !map.get("FUserIDStr").toString().equals(""))
//			{
//				where += " and a.FUserIDStr like '%"+map.get("FUserIDStr")+"%' ";
//			}	
//			if(map.containsKey("FContent") && map.get("FContent")!=null && !map.get("FContent").toString().equals(""))
//			{
//				where += " and a.FContent like '%"+map.get("FContent")+"%' ";
//			}	
//			if(map.containsKey("FCategory") && map.get("FCategory")!=null && !map.get("FCategory").toString().equals(""))
//			{
//				where += " and a.FCategory like '%"+map.get("FCategory")+"%' ";
//			}	
//			if(map.containsKey("FOrder") && map.get("FOrder")!=null && !map.get("FOrder").toString().equals(""))
//			{
//				where += " and a.FOrder like '%"+map.get("FOrder")+"%' ";
//			}	
//			if(map.containsKey("FLevel") && map.get("FLevel")!=null && !map.get("FLevel").toString().equals(""))
//			{
//				where += " and a.FLevel like '%"+map.get("FLevel")+"%' ";
//			}	
//			if(map.containsKey("FIsDelete") && map.get("FIsDelete")!=null && !map.get("FIsDelete").toString().equals(""))
//			{
//				where += " and a.FIsDelete like '%"+map.get("FIsDelete")+"%' ";
//			}	
//			if(map.containsKey("FIsAnswer") && map.get("FIsAnswer")!=null && !map.get("FIsAnswer").toString().equals(""))
//			{
//				where += " and a.FIsAnswer like '%"+map.get("FIsAnswer")+"%' ";
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
//			
//		}
		return where;
	}    
	
	@Override
	public int GetCount(HashMap<String, String> map){
		
        String where = GetWhere(map);
        
		String hql = "select count(*) from UserFeedback";	    
		Query query =manager.createQuery(hql);   
		int total = (new Integer(query.getSingleResult().toString()));	    
		return total;
	}	
	
	
	@Override
	public List<UserFeedback> ListUserFeedback(int offset, int length,HashMap<String, String> map) {
		
		String where ="";
		if(map!=null && map.size()>0)
		{
			if(map.containsKey("usid") && map.get("usid")!=null && !map.get("usid").toString().equals(""))
			{											
			  where += " and a.FUserIDStr = '"+map.get("usid")+"' ";
			  
				if(map.containsKey("category") && map.get("category")!=null && !map.get("category").toString().equals(""))
				{
					where += " and a.FCategory = "+map.get("category")+" ";
				}	
			}						
		}
		
		if(where.equals(""))
		{
			return new ArrayList<UserFeedback>();
		}
		
	    StringBuffer  sql = new StringBuffer();
        sql.append(" SELECT a.FFeedBackID,a.FIncreaseID,a.FParentID,a.FUserIDStr,a.FContent,a.FCategory,a.FOrder,a.FLevel,a.FIsDelete,a.FIsAnswer,a.FDataStatus,a.FFieldStatus,a.FAddTime,a.FUpdateTime ");
        sql.append(" FROM T_USER_FEEDBACK a ");
		sql.append(" WHERE 1 = 1 ");
		sql.append( where);
		sql.append(" order by a.FIncreaseID desc ");
		sql.append(  "limit "+offset+","+length+"");

		Query query = manager.createNativeQuery(sql.toString());

		List rows = query.getResultList();
		List<UserFeedback> UserFeedbacks = new ArrayList<UserFeedback>();
		
		for (Object row : rows) {
			Object[] cells = (Object[]) row;
			
			UserFeedback item = new UserFeedback();	
            
            item.setFfeedbackid((String)cells[0]);            
            item.setFincreaseid((Integer)cells[1]);            
            item.setFparentid((String)cells[2]);            
            item.setFuseridstr((String)cells[3]);            
            item.setFcontent((String)cells[4]);            
            item.setFcategory((Integer)cells[5]);            
            item.setForder((Integer)cells[6]);            
            item.setFlevel((Integer)cells[7]);            
            item.setFisdelete((Integer)cells[8]);            
            item.setFisanswer((Integer)cells[9]);            
            item.setFdatastatus((Integer)cells[10]);            
            item.setFfieldstatus((Integer)cells[11]);            
            item.setFaddtime((java.sql.Timestamp)cells[12]);            
            item.setFupdatetime((java.sql.Timestamp)cells[13]);            
          			
			UserFeedbacks.add(item);			
		}
		return UserFeedbacks;
	}
//	@Override 
//	public List<UserFeedback> ListUserFeedback(int offset, int length,HashMap<String, String> map) {					
//		
//		
////		HashMap<String, String> map = new HashMap<String, String>();	
////		map.put("category", category);
////		map.put("FUserIDStr", usrid);
//		
//        String where = GetWhere(map);
//        
//        String hql = "from UserFeedback";      
//		Query query =manager.createQuery(hql);   
//		query.setFirstResult(offset);
//		query.setMaxResults(length);
//		@SuppressWarnings("unchecked")
//		List<UserFeedback> UserFeedbacks = query.getResultList();   
//		return UserFeedbacks;		
//	}
}
