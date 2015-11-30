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
 * <p>Description: t_friend_relation EJB Interface Bean 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-7-22 16:59:53
 */
@Stateless(mappedName="FriendRelationService")
public class FriendRelationBean  implements FriendRelationService {
    
    @PersistenceContext(unitName = "ejbpro1")	
    private EntityManager manager;

	@Override
	public void Add(FriendRelation friendRelationInfo) {  
		
		if (friendRelationInfo.getFuseridstr().equals(friendRelationInfo.getFfriendid())) {
			throw new RuntimeException("不允许添加自己为好友。");
		}		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("snid", friendRelationInfo.getFuseridstr());
		map.put("FFriendID", friendRelationInfo.getFfriendid());
		
		List<FriendRelation> lists = this.ListFriendRelation(0, 100, map);
		if(lists!=null && lists.size()>0)
		{
			throw new RuntimeException("已请求添加好友，不能重复请求。");
		}
		
        friendRelationInfo.setFrelationid(UUID.randomUUID().toString());
        
    	Timestamp datetime = EJBTime.getTimeStamp();
    	friendRelationInfo.setFaddtime(datetime);
    	friendRelationInfo.setFupdatetime(datetime);
    	
		manager.persist(friendRelationInfo);		
	}
	
	@Override
	public void Update(FriendRelation friendRelationInfo) 
	{
		if (friendRelationInfo.getFuseridstr() == friendRelationInfo.getFfriendid()) {
			throw new RuntimeException("不允许添加自己为好友。");
		}
		
    	Timestamp datetime = EJBTime.getTimeStamp();
    	friendRelationInfo.setFupdatetime(datetime);
    	
		manager.merge(friendRelationInfo);		
	}
	
	@Override
	public void Delete(String id) 
	{
		FriendRelation friendRelationInfo = manager.find(FriendRelation.class, id);
		
		manager.remove(friendRelationInfo);
	}
	
	@Override
	public FriendRelation find(String id) 
	{
		FriendRelation friendRelationInfo = manager.find(FriendRelation.class, id);
		return friendRelationInfo;
	}
    
	private String GetWhere(HashMap<String, String> map) {
		String where = "";
		
		if(map!=null && map.size()>0)
		{
			//if(map.containsKey("FRelationID") && map.get("FRelationID")!=null && !map.get("FRelationID").toString().equals(""))
			//{
			//	where += " and a.FRelationID like '%"+map.get("FRelationID")+"%' ";
			//}	
			//if(map.containsKey("FIncreaseID") && map.get("FIncreaseID")!=null && !map.get("FIncreaseID").toString().equals(""))
			//{
			//	where += " and a.FIncreaseID like '%"+map.get("FIncreaseID")+"%' ";
			//}	
			//if(map.containsKey("FUserIDStr") && map.get("FUserIDStr")!=null && !map.get("FUserIDStr").toString().equals(""))
			//{
			//	where += " and a.FUserIDStr like '%"+map.get("FUserIDStr")+"%' ";
			//}	
			//if(map.containsKey("FFriendID") && map.get("FFriendID")!=null && !map.get("FFriendID").toString().equals(""))
			//{
			//	where += " and a.FFriendID like '%"+map.get("FFriendID")+"%' ";
			//}	
			//if(map.containsKey("FCategory") && map.get("FCategory")!=null && !map.get("FCategory").toString().equals(""))
			//{
			//	where += " and a.FCategory like '%"+map.get("FCategory")+"%' ";
			//}	
			//if(map.containsKey("FOrder") && map.get("FOrder")!=null && !map.get("FOrder").toString().equals(""))
			//{
			//	where += " and a.FOrder like '%"+map.get("FOrder")+"%' ";
			//}	
			//if(map.containsKey("FLevel") && map.get("FLevel")!=null && !map.get("FLevel").toString().equals(""))
			//{
			//	where += " and a.FLevel like '%"+map.get("FLevel")+"%' ";
			//}	
			//if(map.containsKey("FIsDelete") && map.get("FIsDelete")!=null && !map.get("FIsDelete").toString().equals(""))
			//{
			//	where += " and a.FIsDelete like '%"+map.get("FIsDelete")+"%' ";
			//}	
			//if(map.containsKey("FStatus") && map.get("FStatus")!=null && !map.get("FStatus").toString().equals(""))
			//{
			//	where += " and a.FStatus like '%"+map.get("FStatus")+"%' ";
			//}	
			//if(map.containsKey("FStatusTime") && map.get("FStatusTime")!=null && !map.get("FStatusTime").toString().equals(""))
			//{
			//	where += " and a.FStatusTime like '%"+map.get("FStatusTime")+"%' ";
			//}	
			//if(map.containsKey("FAttachText") && map.get("FAttachText")!=null && !map.get("FAttachText").toString().equals(""))
			//{
			//	where += " and a.FAttachText like '%"+map.get("FAttachText")+"%' ";
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
	public int GetCount(HashMap<String, String> map){
		
        String where = GetWhere(map);
        
		String hql = "select count(*) from FriendRelation";	    
		Query query =manager.createQuery(hql);   
		int total = (new Integer(query.getSingleResult().toString()));	    
		return total;
	}	
	
//	@Override 
//	public List<FriendRelation> ListFriendRelation(int offset, int length,HashMap<String, String> map) {					
//		
//        String where = GetWhere(map);
//        
//        String hql = "from FriendRelation";      
//		Query query =manager.createQuery(hql);   
//		query.setFirstResult(offset);
//		query.setMaxResults(length);
//		@SuppressWarnings("unchecked")
//		List<FriendRelation> FriendRelations = query.getResultList();   
//		return FriendRelations;		
//	}
	
	@Override
	public List<FriendRelation> ListFriendRelation(int offset, int length,HashMap<String, String> map) {		
		String where ="";
		String snid = "";
		String appusrid="";
		
		if(map!=null && map.size()>0)
		{
			if(map.containsKey("snid") && map.get("snid")!=null && !map.get("snid").toString().equals(""))
			{			
				snid = map.get("snid");
				
				if(map.containsKey("qtype") && map.get("qtype")!=null && map.get("qtype").toString().equals("2"))
				{
					where += " and a.FFriendID = '"+map.get("snid")+"' ";
				}
				else if(map.containsKey("qtype") && map.get("qtype")!=null && map.get("qtype").toString().equals("3"))
				{
					where += " and (a.FUserIDStr = '"+map.get("snid")+"'  or a.FFriendID = '"+map.get("snid")+"') ";
				}

				else
				{
					where += " and a.FUserIDStr = '"+map.get("snid")+"' ";
				}
			}
			else if(map.containsKey("qtype") && map.get("qtype")!=null && map.get("qtype").toString().equals("4"))
			{
				appusrid = map.get("appusrid");
				where += " and (f.funiqueid = '"+appusrid+"'  or g.funiqueid = '"+appusrid+"') ";
			}
			
			if(map.containsKey("FFriendID") && map.get("FFriendID")!=null && !map.get("FFriendID").toString().equals(""))
			{
				where += " and a.FFriendID = '"+map.get("FFriendID")+"' ";
			}
			
			if(where.equals(""))
			{
				where = " and 1=0 ";
			}
		
			
		}
		
	    StringBuffer  sql = new StringBuffer();
        sql.append(" SELECT a.FRelationID,a.FIncreaseID,a.FUserIDStr,a.FFriendID,a.FCategory,a.FOrder,a.FLevel,a.FIsDelete,a.FStatus,a.FStatusTime,a.FAttachText,a.FDataStatus,a.FFieldStatus,a.FAddTime,a.FUpdateTime,a.FRemark ");
        sql.append(" ,b.nickname,b.fphonenum,c.nickname as Fusername,c.fphonenum as FuserMobile,b.fpicture ,c.fpicture,g.funiqueid ");       
        sql.append(" FROM T_FRIEND_RELATION a inner join serialnumber b on a.FFriendID=b.funiqueid ");
        sql.append(" inner join serialnumber c on a.FUserIDStr=c.funiqueid ");
        
        //关联到序列号用户信息
        sql.append(" inner join t_user_snrelate d on d.FSNIDStr=b.funiqueid ");        
        sql.append(" inner join user f on f.funiqueid=d.FUserIDStr ");        
        sql.append(" inner join t_user_snrelate e on e.FSNIDStr=c.funiqueid ");
        sql.append(" inner join user g on g.funiqueid=e.FUserIDStr ");
        
		sql.append(" WHERE 1 = 1 ");
		sql.append( where);
		sql.append(" order by a.FUpdateTime desc ");
		

		Query query = manager.createNativeQuery(sql.toString());

		List rows = query.getResultList();
		List<FriendRelation> FriendRelations = new ArrayList<FriendRelation>();
		
		for (Object row : rows) {
			Object[] cells = (Object[]) row;
			
			FriendRelation item = new FriendRelation();	
            
            item.setFrelationid((String)cells[0]);            
            item.setFincreaseid((Integer)cells[1]);            
            item.setFuseridstr((String)cells[2]);            
            item.setFfriendid((String)cells[3]);            
            item.setFcategory((Integer)cells[4]);            
            item.setForder((Integer)cells[5]);            
            item.setFlevel((Integer)cells[6]);            
            item.setFisdelete((Integer)cells[7]);            
            item.setFstatus((Integer)cells[8]);            
            item.setFstatustime((java.sql.Timestamp)cells[9]);            
            item.setFattachtext((String)cells[10]);            
            //item.setFdatastatus((Integer)cells[11]);  
                       
            item.setFfieldstatus((Integer)cells[12]);            
            item.setFaddtime((java.sql.Timestamp)cells[13]);            
            item.setFupdatetime((java.sql.Timestamp)cells[14]);            
            item.setFremark((String)cells[15]);   
            
            item.setFriendname((String)cells[16]);   
            item.setFmobile((String)cells[17]);            		
            item.setFusername((String)cells[18]);   
            item.setFusermobile((String)cells[19]);  
                       
            item.setFrompic((String)cells[20]);   
            item.setTopic((String)cells[21]);  
            
            String appfromusrid = (String)cells[22];
            //Fdatastatus 为1表示是我发起要加的朋友
            if(snid.equals(item.getFuseridstr()) || appusrid.equals(appfromusrid)){            	
            	item.setFdatastatus(1);             	
            }
            else
            {
            	item.setFdatastatus(0);  
            }
            
			FriendRelations.add(item);			
		}
		return FriendRelations;
	}
}

