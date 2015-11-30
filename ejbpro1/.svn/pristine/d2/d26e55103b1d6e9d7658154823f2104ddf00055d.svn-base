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
 * <p>Description: t_serialnumber_datauser EJB Interface Bean 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-11-29 12:28:26
 */
@Stateless(mappedName="SerialnumberDatauserService")
public class SerialnumberDatauserBean  implements SerialnumberDatauserService {
    
    @PersistenceContext(unitName = "ejbpro1")	
    private EntityManager manager;

	@Override
	public void AddSerialnumberDatauser(SerialnumberDatauser serialnumberDatauserInfo) {  
        serialnumberDatauserInfo.setFsndusrid(UUID.randomUUID().toString());
        
       	Timestamp datetime = EJBTime.getTimeStamp();
       	serialnumberDatauserInfo.setFaddtime(datetime);
       	serialnumberDatauserInfo.setFupdatetime(datetime);
    	
		manager.persist(serialnumberDatauserInfo);		
	}
	
	@Override
	public void UpdateSerialnumberDatauser(SerialnumberDatauser serialnumberDatauserInfo) 
	{
	   	Timestamp datetime = EJBTime.getTimeStamp();
       	serialnumberDatauserInfo.setFupdatetime(datetime);
       	
		manager.merge(serialnumberDatauserInfo);		
	}
	
	@Override
	public void UpdateSerialnumberDatauser(SerialnumberDatauser serialnumberDatauserInfo,HashMap<String, String> map) 
	{
    	if(map!=null && map.size()>0){
			if(map.containsKey("actionType")){
				String actionType = map.get("actionType");
				
				if(actionType.equals("1")){    		    										   					
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
	public void DeleteSerialnumberDatauser(String id) 
	{
		SerialnumberDatauser serialnumberDatauserInfo = manager.find(SerialnumberDatauser.class, id);
		
		manager.remove(serialnumberDatauserInfo);
	}
	
	@Override
	public SerialnumberDatauser findSerialnumberDatauser(String id) 
	{
		SerialnumberDatauser serialnumberDatauserInfo = manager.find(SerialnumberDatauser.class, id);
		return serialnumberDatauserInfo;
	}
    
	private String GetWhere(HashMap<String, String> map) {
		String where = "";
		
		if(map!=null && map.size()>0)
		{
			//if(map.containsKey("fsndusrid") && map.get("fsndusrid")!=null && !map.get("fsndusrid").toString().equals(""))
			//{
			//	where += " and a.fsndusrid like '%"+map.get("fsndusrid")+"%' ";
			//}	
			//if(map.containsKey("FIncreaseID") && map.get("FIncreaseID")!=null && !map.get("FIncreaseID").toString().equals(""))
			//{
			//	where += " and a.FIncreaseID like '%"+map.get("FIncreaseID")+"%' ";
			//}	
			//if(map.containsKey("fappcountid") && map.get("fappcountid")!=null && !map.get("fappcountid").toString().equals(""))
			//{
			//	where += " and a.fappcountid like '%"+map.get("fappcountid")+"%' ";
			//}	
			//if(map.containsKey("username") && map.get("username")!=null && !map.get("username").toString().equals(""))
			//{
			//	where += " and a.username like '%"+map.get("username")+"%' ";
			//}	
			//if(map.containsKey("realname") && map.get("realname")!=null && !map.get("realname").toString().equals(""))
			//{
			//	where += " and a.realname like '%"+map.get("realname")+"%' ";
			//}	
			//if(map.containsKey("nickname") && map.get("nickname")!=null && !map.get("nickname").toString().equals(""))
			//{
			//	where += " and a.nickname like '%"+map.get("nickname")+"%' ";
			//}	
			//if(map.containsKey("callname") && map.get("callname")!=null && !map.get("callname").toString().equals(""))
			//{
			//	where += " and a.callname like '%"+map.get("callname")+"%' ";
			//}	
			//if(map.containsKey("relation") && map.get("relation")!=null && !map.get("relation").toString().equals(""))
			//{
			//	where += " and a.relation like '%"+map.get("relation")+"%' ";
			//}	
			//if(map.containsKey("phone") && map.get("phone")!=null && !map.get("phone").toString().equals(""))
			//{
			//	where += " and a.phone like '%"+map.get("phone")+"%' ";
			//}	
			//if(map.containsKey("fpassword") && map.get("fpassword")!=null && !map.get("fpassword").toString().equals(""))
			//{
			//	where += " and a.fpassword like '%"+map.get("fpassword")+"%' ";
			//}	
			//if(map.containsKey("sex") && map.get("sex")!=null && !map.get("sex").toString().equals(""))
			//{
			//	where += " and a.sex like '%"+map.get("sex")+"%' ";
			//}	
			//if(map.containsKey("fstatus") && map.get("fstatus")!=null && !map.get("fstatus").toString().equals(""))
			//{
			//	where += " and a.fstatus like '%"+map.get("fstatus")+"%' ";
			//}	
			//if(map.containsKey("createtime") && map.get("createtime")!=null && !map.get("createtime").toString().equals(""))
			//{
			//	where += " and a.createtime like '%"+map.get("createtime")+"%' ";
			//}	
			//if(map.containsKey("fmobile") && map.get("fmobile")!=null && !map.get("fmobile").toString().equals(""))
			//{
			//	where += " and a.fmobile like '%"+map.get("fmobile")+"%' ";
			//}	
			//if(map.containsKey("femail") && map.get("femail")!=null && !map.get("femail").toString().equals(""))
			//{
			//	where += " and a.femail like '%"+map.get("femail")+"%' ";
			//}	
			//if(map.containsKey("address") && map.get("address")!=null && !map.get("address").toString().equals(""))
			//{
			//	where += " and a.address like '%"+map.get("address")+"%' ";
			//}	
			//if(map.containsKey("birthday") && map.get("birthday")!=null && !map.get("birthday").toString().equals(""))
			//{
			//	where += " and a.birthday like '%"+map.get("birthday")+"%' ";
			//}	
			//if(map.containsKey("height") && map.get("height")!=null && !map.get("height").toString().equals(""))
			//{
			//	where += " and a.height like '%"+map.get("height")+"%' ";
			//}	
			//if(map.containsKey("weight") && map.get("weight")!=null && !map.get("weight").toString().equals(""))
			//{
			//	where += " and a.weight like '%"+map.get("weight")+"%' ";
			//}	
			//if(map.containsKey("picture") && map.get("picture")!=null && !map.get("picture").toString().equals(""))
			//{
			//	where += " and a.picture like '%"+map.get("picture")+"%' ";
			//}	
			//if(map.containsKey("flogcount") && map.get("flogcount")!=null && !map.get("flogcount").toString().equals(""))
			//{
			//	where += " and a.flogcount like '%"+map.get("flogcount")+"%' ";
			//}	
			//if(map.containsKey("floglasttime") && map.get("floglasttime")!=null && !map.get("floglasttime").toString().equals(""))
			//{
			//	where += " and a.floglasttime like '%"+map.get("floglasttime")+"%' ";
			//}	
			//if(map.containsKey("floglaspip") && map.get("floglaspip")!=null && !map.get("floglaspip").toString().equals(""))
			//{
			//	where += " and a.floglaspip like '%"+map.get("floglaspip")+"%' ";
			//}	
			//if(map.containsKey("fienabled") && map.get("fienabled")!=null && !map.get("fienabled").toString().equals(""))
			//{
			//	where += " and a.fienabled like '%"+map.get("fienabled")+"%' ";
			//}	
			//if(map.containsKey("fdatastatus") && map.get("fdatastatus")!=null && !map.get("fdatastatus").toString().equals(""))
			//{
			//	where += " and a.fdatastatus like '%"+map.get("fdatastatus")+"%' ";
			//}	
			//if(map.containsKey("fisdeleted") && map.get("fisdeleted")!=null && !map.get("fisdeleted").toString().equals(""))
			//{
			//	where += " and a.fisdeleted like '%"+map.get("fisdeleted")+"%' ";
			//}	
			//if(map.containsKey("fdeletetime") && map.get("fdeletetime")!=null && !map.get("fdeletetime").toString().equals(""))
			//{
			//	where += " and a.fdeletetime like '%"+map.get("fdeletetime")+"%' ";
			//}	
			//if(map.containsKey("flockstatus") && map.get("flockstatus")!=null && !map.get("flockstatus").toString().equals(""))
			//{
			//	where += " and a.flockstatus like '%"+map.get("flockstatus")+"%' ";
			//}	
			//if(map.containsKey("fremark") && map.get("fremark")!=null && !map.get("fremark").toString().equals(""))
			//{
			//	where += " and a.fremark like '%"+map.get("fremark")+"%' ";
			//}	
			//if(map.containsKey("furl") && map.get("furl")!=null && !map.get("furl").toString().equals(""))
			//{
			//	where += " and a.furl like '%"+map.get("furl")+"%' ";
			//}	
			//if(map.containsKey("faddress") && map.get("faddress")!=null && !map.get("faddress").toString().equals(""))
			//{
			//	where += " and a.faddress like '%"+map.get("faddress")+"%' ";
			//}	
			//if(map.containsKey("FAddTime") && map.get("FAddTime")!=null && !map.get("FAddTime").toString().equals(""))
			//{
			//	where += " and a.FAddTime like '%"+map.get("FAddTime")+"%' ";
			//}	
			//if(map.containsKey("FUpdateTime") && map.get("FUpdateTime")!=null && !map.get("FUpdateTime").toString().equals(""))
			//{
			//	where += " and a.FUpdateTime like '%"+map.get("FUpdateTime")+"%' ";
			//}	
			
		}
		return where;
	}    
	
	@Override
	public int GetSerialnumberDatauserCount(HashMap<String, String> map){
		
        String where = GetWhere(map);
        
		String hql = "select count(*) from SerialnumberDatauser";	    
		Query query =manager.createQuery(hql);   
		int total = (new Integer(query.getSingleResult().toString()));	    
		return total;
	}	
	
	@Override 
	public List<SerialnumberDatauser> ListSerialnumberDatauser(int offset, int length,HashMap<String, String> map) {					
		
//        String where = GetWhere(map);
//        
//        String hql = "from SerialnumberDatauser";      
//		Query query =manager.createQuery(hql);   
//		query.setFirstResult(offset);
//		query.setMaxResults(length);
//		@SuppressWarnings("unchecked")
//		List<SerialnumberDatauser> SerialnumberDatausers = query.getResultList();   
//		return SerialnumberDatausers;		
		
		String where = " ";
		
		if(map!=null && map.size() > 0)
		{					
			//修改
			if(map.containsKey("updatetype") && map.get("updatetype")!=null && !map.get("updatetype").toString().equals(""))
			{
				where += " and a.fsndusrid <> '"+map.get("fsndusrid")+"' and a.realname = '"+map.get("realname")+"'";
			}
			
			if(map.containsKey("realname") && map.get("realname")!=null && !map.get("realname").toString().equals(""))
			{
				where += " and a.realname = '"+map.get("realname")+"' ";
			}
			if(map.containsKey("fappcountid") && map.get("fappcountid")!=null && !map.get("fappcountid").toString().equals(""))
			{
				where += " and a.fappcountid = '"+map.get("fappcountid")+"' ";
			}	
			if(map.containsKey("fisdeleted") && map.get("fisdeleted")!=null && !map.get("fisdeleted").toString().equals(""))
			{
				if(map.get("fisdeleted").equals("1")){
					where += " and a.fisdeleted = 1 ";
				}
				else if(map.get("fisdeleted").equals("0")){
					where += " and (a.fisdeleted = 0 or a.fisdeleted is null) ";
				}
			}		
		}
		
		
		StringBuffer  sql = new StringBuffer();
        sql.append(" SELECT a.fsndusrid,a.FIncreaseID,a.fappcountid,a.username,a.realname,a.nickname,a.callname,a.relation,a.phone,a.fpassword,a.sex,a.fstatus,a.createtime,a.fmobile,a.femail,a.address,a.birthday,a.height,a.weight,a.picture,a.flogcount,a.floglasttime,a.floglaspip,a.fienabled,a.fdatastatus,a.fisdeleted,a.fdeletetime,a.flockstatus,a.fremark,a.furl,a.faddress,a.FAddTime,a.FUpdateTime ");
        sql.append(" FROM T_SERIALNUMBER_DATAUSER a ");
		sql.append(" WHERE 1 = 1 ");
		sql.append(  where);
		sql.append(" order by a.FIncreaseID desc ");
		sql.append(" limit "+offset+","+length+"");

		Query query = manager.createNativeQuery(sql.toString());

		List rows = query.getResultList();
		List<SerialnumberDatauser> SerialnumberDatausers = new ArrayList<SerialnumberDatauser>();
		
		for (Object row : rows) {
			Object[] cells = (Object[]) row;
			
			SerialnumberDatauser item = new SerialnumberDatauser();	
            
            item.setFsndusrid((String)cells[0]);            
            item.setFincreaseid((Integer)cells[1]);            
            item.setFappcountid((String)cells[2]);            
            item.setUsername((String)cells[3]);            
            item.setRealname((String)cells[4]);            
            item.setNickname((String)cells[5]);            
            item.setCallname((String)cells[6]);            
            item.setRelation((String)cells[7]);            
            item.setPhone((String)cells[8]);            
            item.setFpassword((String)cells[9]);            
            item.setSex((String)cells[10]);            
            item.setFstatus((String)cells[11]);            
            item.setCreatetime((String)cells[12]);            
            item.setFmobile((String)cells[13]);            
            item.setFemail((String)cells[14]);            
            item.setAddress((String)cells[15]);            
            item.setBirthday((String)cells[16]);            
            item.setHeight((String)cells[17]);            
            item.setWeight((String)cells[18]);            
            item.setPicture((String)cells[19]);            
            item.setFlogcount((Integer)cells[20]);            
            item.setFloglasttime((java.sql.Timestamp)cells[21]);            
            item.setFloglaspip((String)cells[22]);            
            item.setFienabled((Integer)cells[23]);            
            item.setFdatastatus((Integer)cells[24]);            
            item.setFisdeleted((Integer)cells[25]);            
            item.setFdeletetime((java.sql.Timestamp)cells[26]);            
            item.setFlockstatus((Integer)cells[27]);            
            item.setFremark((String)cells[28]);            
            item.setFurl((String)cells[29]);            
            item.setFaddress((String)cells[30]);            
            item.setFaddtime((java.sql.Timestamp)cells[31]);            
            item.setFupdatetime((java.sql.Timestamp)cells[32]);            
          			
			SerialnumberDatausers.add(item);			
		}
		return SerialnumberDatausers;
	}
}