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
 * <p>Description: t_friend_contact EJB Interface Bean 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-8-19 11:52:58
 */
@Stateless(mappedName="FriendContactService")
public class FriendContactBean  implements FriendContactService {
    
    @PersistenceContext(unitName = "ejbpro1")	
    private EntityManager manager;

	@Override
	public void AddFriendContact(FriendContact friendContactInfo) {  
        friendContactInfo.setFcontactid(UUID.randomUUID().toString());
        
    	Timestamp datetime = EJBTime.getTimeStamp();
    	friendContactInfo.setFaddtime(datetime);
    	friendContactInfo.setFupdatetime(datetime);
    	friendContactInfo.setFdatastatus(0);
    	
    	//此处要计算索引   	
		manager.persist(friendContactInfo);		
	}
	
	@Override
	public void UpdateFriendContact(FriendContact friendContactInfo) 
	{
		Timestamp datetime = EJBTime.getTimeStamp();
    	friendContactInfo.setFupdatetime(datetime);
    	
		manager.merge(friendContactInfo);		
	}
	
	@Override
	public void DeleteFriendContact(String id) 
	{
		FriendContact friendContactInfo = manager.find(FriendContact.class, id);
		
		manager.remove(friendContactInfo);
	}
	
	@Override
	public FriendContact findFriendContact(String id) 
	{
		FriendContact friendContactInfo = manager.find(FriendContact.class, id);
		return friendContactInfo;
	}
    
	private String GetWhere(HashMap<String, String> map) {
		String where = "";
		
		if(map!=null && map.size()>0)
		{
			
		}
		return where;
	}    
	
	@Override
	public int GetFriendContactCount(HashMap<String, String> map){
		
        String where = GetWhere(map);
        
		String hql = "select count(*) from FriendContact";	    
		Query query =manager.createQuery(hql);   
		int total = (new Integer(query.getSingleResult().toString()));	    
		return total;
	}	
	
	@Override 
	public List<FriendContact> ListFriendContact(int offset, int length,HashMap<String, String> map) {					
		
		
		String where="";
		String order = "order by a.FIndex desc";
		
		if(map.containsKey("FToSnID") && map.get("FToSnID")!=null && !map.get("FToSnID").toString().equals(""))
		{
			where += " and a.FToSnID = '"+map.get("FToSnID")+"' ";
		}	
		if(map.containsKey("FPhoneNum") && map.get("FPhoneNum")!=null && !map.get("FPhoneNum").toString().equals(""))
		{
			where += " and a.FPhoneNum = '"+map.get("FPhoneNum")+"' ";
		}			
		
//		if(map.containsKey("FAction") && map.get("FAction")!=null && !map.get("FAction").toString().equals(""))
//		{
//			where += " and a.FAction = "+map.get("FAction")+" ";
//		}	
		
		StringBuffer  sql = new StringBuffer();
        sql.append(" SELECT a.FContactID,a.FIncreaseID,a.FAPPUserID,a.FFromSnID,a.FToSnID,a.FAction,a.FIndex,a.FName,a.FPhoneNum,a.FProperties,a.FDialType,a.FZone,a.FBackup1,a.FBackup2,a.FCallBackUrl,a.FDataStatus,a.FFieldStatus,a.FAddTime,a.FUpdateTime,a.FRemark ");
        sql.append(" ,ifnull(b.nickname,''),ifnull(b.fpicture,''),ifnull(b.serialnumber,'')  ");
        sql.append(" FROM T_FRIEND_CONTACT a ");        
        sql.append(" left join serialnumber b on a.FFromSnID = b.funiqueid and a.FProperties = 4");        
		sql.append(" WHERE 1 = 1 ");
		sql.append(where);
		sql.append(order);
		
//		select a.*,b.nickname,b.fpicture,b.serialnumber from t_friend_contact a left join serialnumber b on a.FFromSnID = b.funiqueid
//				and a.FProperties = 4

		Query query = manager.createNativeQuery(sql.toString());

		List rows = query.getResultList();
		List<FriendContact> FriendContacts = new ArrayList<FriendContact>();
		
		for (Object row : rows) {
			Object[] cells = (Object[]) row;
			
			FriendContact item = new FriendContact();	
            
            item.setFcontactid((String)cells[0]);            
            item.setFincreaseid((Integer)cells[1]);            
            item.setFappuserid((String)cells[2]);            
            item.setFfromsnid((String)cells[3]);            
            item.setFtosnid((String)cells[4]);            
            item.setFaction((Integer)cells[5]);            
            item.setFindex((Integer)cells[6]);            
            item.setFname((String)cells[7]);            
            item.setFphonenum((String)cells[8]);            
            item.setFproperties((Integer)cells[9]);            
            item.setFdialtype((Integer)cells[10]);            
            item.setFzone((String)cells[11]);            
            item.setFbackup1((String)cells[12]);            
            item.setFbackup2((String)cells[13]);            
            item.setFcallbackurl((String)cells[14]);            
            item.setFdatastatus((Integer)cells[15]);            
            item.setFfieldstatus((Integer)cells[16]);            
            item.setFaddtime((java.sql.Timestamp)cells[17]);            
            item.setFupdatetime((java.sql.Timestamp)cells[18]);            
            item.setFremark((String)cells[19]);               
            item.setNickname((String)cells[20]);            
            item.setFpicture((String)cells[21]);
            item.setSerialnumber((String)cells[22]);         			
			FriendContacts.add(item);			
		}
		return FriendContacts;
	}
}