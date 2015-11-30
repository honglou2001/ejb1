package com.watch.ejb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
/**
 * <p>Title: ejb title </p>
 * <p>Description: t_reward_list EJB Interface Bean 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-8-8 17:37:06
 */
@Stateless(mappedName="RewardListService")
public class RewardListBean  implements RewardListService {
    
    @PersistenceContext(unitName = "ejbpro1")	
    private EntityManager manager;

	@Override
	public void AddRewardList(RewardList rewardListInfo) {  
       
		manager.persist(rewardListInfo);		
	}
	
	@Override
	public void UpdateRewardList(RewardList rewardListInfo) 
	{
		manager.merge(rewardListInfo);		
	}
	
	@Override
	public void DeleteRewardList(String id) 
	{
		RewardList rewardListInfo = manager.find(RewardList.class, id);
		
		manager.remove(rewardListInfo);
	}
	
	@Override
	public RewardList findRewardList(String id) 
	{
		RewardList rewardListInfo = manager.find(RewardList.class, id);
		return rewardListInfo;
	}
    
	private String GetWhere(HashMap<String, String> map) {
		String where = "";
		
		if(map!=null && map.size()>0)
		{
			//if(map.containsKey("FRewardID") && map.get("FRewardID")!=null && !map.get("FRewardID").toString().equals(""))
			//{
			//	where += " and a.FRewardID like '%"+map.get("FRewardID")+"%' ";
			//}	
			//if(map.containsKey("FIncreaseID") && map.get("FIncreaseID")!=null && !map.get("FIncreaseID").toString().equals(""))
			//{
			//	where += " and a.FIncreaseID like '%"+map.get("FIncreaseID")+"%' ";
			//}	
			//if(map.containsKey("FUserID") && map.get("FUserID")!=null && !map.get("FUserID").toString().equals(""))
			//{
			//	where += " and a.FUserID like '%"+map.get("FUserID")+"%' ";
			//}	
			//if(map.containsKey("FSNID") && map.get("FSNID")!=null && !map.get("FSNID").toString().equals(""))
			//{
			//	where += " and a.FSNID like '%"+map.get("FSNID")+"%' ";
			//}	
			//if(map.containsKey("FCategory") && map.get("FCategory")!=null && !map.get("FCategory").toString().equals(""))
			//{
			//	where += " and a.FCategory like '%"+map.get("FCategory")+"%' ";
			//}	
			//if(map.containsKey("FTitle") && map.get("FTitle")!=null && !map.get("FTitle").toString().equals(""))
			//{
			//	where += " and a.FTitle like '%"+map.get("FTitle")+"%' ";
			//}	
			//if(map.containsKey("FContent") && map.get("FContent")!=null && !map.get("FContent").toString().equals(""))
			//{
			//	where += " and a.FContent like '%"+map.get("FContent")+"%' ";
			//}	
			//if(map.containsKey("FPicture") && map.get("FPicture")!=null && !map.get("FPicture").toString().equals(""))
			//{
			//	where += " and a.FPicture like '%"+map.get("FPicture")+"%' ";
			//}	
			//if(map.containsKey("FScore") && map.get("FScore")!=null && !map.get("FScore").toString().equals(""))
			//{
			//	where += " and a.FScore like '%"+map.get("FScore")+"%' ";
			//}	
			//if(map.containsKey("FState") && map.get("FState")!=null && !map.get("FState").toString().equals(""))
			//{
			//	where += " and a.FState like '%"+map.get("FState")+"%' ";
			//}	
			//if(map.containsKey("FStarttime") && map.get("FStarttime")!=null && !map.get("FStarttime").toString().equals(""))
			//{
			//	where += " and a.FStarttime like '%"+map.get("FStarttime")+"%' ";
			//}	
			//if(map.containsKey("FEndTime") && map.get("FEndTime")!=null && !map.get("FEndTime").toString().equals(""))
			//{
			//	where += " and a.FEndTime like '%"+map.get("FEndTime")+"%' ";
			//}	
			//if(map.containsKey("FProduct") && map.get("FProduct")!=null && !map.get("FProduct").toString().equals(""))
			//{
			//	where += " and a.FProduct like '%"+map.get("FProduct")+"%' ";
			//}	
			//if(map.containsKey("FProductID") && map.get("FProductID")!=null && !map.get("FProductID").toString().equals(""))
			//{
			//	where += " and a.FProductID like '%"+map.get("FProductID")+"%' ";
			//}	
			//if(map.containsKey("FOrder") && map.get("FOrder")!=null && !map.get("FOrder").toString().equals(""))
			//{
			//	where += " and a.FOrder like '%"+map.get("FOrder")+"%' ";
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
	public int GetRewardListCount(HashMap<String, String> map){
		
        String where = GetWhere(map);
        
		String hql = "select count(*) from RewardList";	    
		Query query =manager.createQuery(hql);   
		int total = (new Integer(query.getSingleResult().toString()));	    
		return total;
	}	
	
	@Override 
	public List<RewardList> ListRewardList(int offset, int length,HashMap<String, String> map) {					
		
		String where ="";

		if(map!=null && map.size()>0)
		{
			if(map.containsKey("usrid") && map.get("usrid")!=null && !map.get("usrid").toString().equals(""))
			{							
				where += " and a.FUserID = '"+map.get("usrid")+"' ";			
			}
			 if(map.containsKey("serialnumid") && map.get("serialnumid")!=null && !map.get("serialnumid").toString().equals(""))
			{
				 where += " and a.FSNID = '"+map.get("serialnumid")+"' ";	
			}
		}
		
		if(where.equals(""))
		{
			where = " and 1=0 ";
		}
		
		 StringBuffer  sql = new StringBuffer();
	        sql.append(" SELECT a.FRewardID,a.FIncreaseID,a.FUserID,a.FSNID,a.FCategory,a.FTitle,a.FContent,a.FPicture,a.FScore,a.FState,a.FStarttime,a.FEndTime,a.FProduct,a.FProductID,a.FOrder,a.FDataStatus,a.FFieldStatus,a.FAddTime,a.FUpdateTime,a.FRemark ");
	        sql.append(" FROM T_REWARD_LIST a ");
			sql.append(" WHERE a.FCategory=1 or (1=1");
			sql.append( where);
			sql.append( ")");
			sql.append(" order by a.fcategory desc,a.FIncreaseID desc ");

			Query query = manager.createNativeQuery(sql.toString());

			List rows = query.getResultList();
			List<RewardList> RewardLists = new ArrayList<RewardList>();
			
			for (Object row : rows) {
				Object[] cells = (Object[]) row;
				
				RewardList item = new RewardList();	
	            
	            item.setFrewardid((String)cells[0]);            
	            item.setFincreaseid((Integer)cells[1]);            
	            item.setFuserid((String)cells[2]);            
	            item.setFsnid((String)cells[3]);            
	            item.setFcategory((Integer)cells[4]);            
	            item.setFtitle((String)cells[5]);            
	            item.setFcontent((String)cells[6]);            
	            item.setFpicture((String)cells[7]);            
	            item.setFscore((String)cells[8]);            
	            item.setFstate((Integer)cells[9]);            
	            item.setFstarttime((java.sql.Timestamp)cells[10]);            
	            item.setFendtime((java.sql.Timestamp)cells[11]);            
	            item.setFproduct((String)cells[12]);            
	            item.setFproductid((String)cells[13]);            
	            item.setForder((Integer)cells[14]);            
	            item.setFdatastatus((Integer)cells[15]);            
	            item.setFfieldstatus((Integer)cells[16]);            
	            item.setFaddtime((java.sql.Timestamp)cells[17]);            
	            item.setFupdatetime((java.sql.Timestamp)cells[18]);            
	            item.setFremark((String)cells[19]);            
	          			
				RewardLists.add(item);			
			}
			return RewardLists;
			
//        String where = GetWhere(map);
//        
//        String hql = "from RewardList";      
//		Query query =manager.createQuery(hql);   
//		query.setFirstResult(offset);
//		query.setMaxResults(length);
//		@SuppressWarnings("unchecked")
//		List<RewardList> RewardLists = query.getResultList();   
//		return RewardLists;		
	}
}
