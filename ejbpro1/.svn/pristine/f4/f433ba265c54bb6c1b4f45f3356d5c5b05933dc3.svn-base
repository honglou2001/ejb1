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
 * <p>Description: user EJB Interface Bean 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-7-5 18:12:41
 */
@Stateless(mappedName="UserService")
public class UserWatchBean  implements UserWatchService {
    
    @PersistenceContext(unitName = "ejbpro1")	
    private EntityManager manager;

	@Override
	public void Add(UserWatch userInfo) {  
		
	   	Timestamp datetime = EJBTime.getTimeStamp();

	   	userInfo.setFloglasttime(datetime);

//        userInfo.setFuniqueid(UUID.randomUUID().toString());
		manager.persist(userInfo);		
	}
	
	@Override
	public void Update(UserWatch userInfo) 
	{
		manager.merge(userInfo);		
	}
	
	@Override
	public void Delete(String id) 
	{
		UserWatch userInfo = manager.find(UserWatch.class, id);
		
		manager.remove(userInfo);
	}
	
	@Override
	public UserWatch find(String id) 
	{
		UserWatch userInfo = manager.find(UserWatch.class, id);
		return userInfo;
	}
    
	private String GetWhere(HashMap<String, String> map) {
		String where = "";
		
		if(map!=null && map.size()>0)
		{
			if(map.containsKey("funiqueid") && map.get("funiqueid")!=null && !map.get("funiqueid").toString().equals(""))
			{
				where += " and a.funiqueid like '%"+map.get("funiqueid")+"%' ";
			}	
			if(map.containsKey("id") && map.get("id")!=null && !map.get("id").toString().equals(""))
			{
				where += " and a.id like '%"+map.get("id")+"%' ";
			}	
			if(map.containsKey("serialnumber") && map.get("serialnumber")!=null && !map.get("serialnumber").toString().equals(""))
			{
				where += " and a.serialnumber like '%"+map.get("serialnumber")+"%' ";
			}	
			if(map.containsKey("username") && map.get("username")!=null && !map.get("username").toString().equals(""))
			{
				where += " and a.username like '%"+map.get("username")+"%' ";
			}	
			if(map.containsKey("phone") && map.get("phone")!=null && !map.get("phone").toString().equals(""))
			{
				where += " and a.phone like '%"+map.get("phone")+"%' ";
			}	
			if(map.containsKey("password") && map.get("password")!=null && !map.get("password").toString().equals(""))
			{
				where += " and a.password like '%"+map.get("password")+"%' ";
			}	
			if(map.containsKey("sex") && map.get("sex")!=null && !map.get("sex").toString().equals(""))
			{
				where += " and a.sex like '%"+map.get("sex")+"%' ";
			}	
			if(map.containsKey("status") && map.get("status")!=null && !map.get("status").toString().equals(""))
			{
				where += " and a.status like '%"+map.get("status")+"%' ";
			}	
			if(map.containsKey("createtime") && map.get("createtime")!=null && !map.get("createtime").toString().equals(""))
			{
				where += " and a.createtime like '%"+map.get("createtime")+"%' ";
			}	
			if(map.containsKey("fmobile") && map.get("fmobile")!=null && !map.get("fmobile").toString().equals(""))
			{
				where += " and a.fmobile like '%"+map.get("fmobile")+"%' ";
			}	
			if(map.containsKey("nickname") && map.get("nickname")!=null && !map.get("nickname").toString().equals(""))
			{
				where += " and a.nickname like '%"+map.get("nickname")+"%' ";
			}	
			if(map.containsKey("birthday") && map.get("birthday")!=null && !map.get("birthday").toString().equals(""))
			{
				where += " and a.birthday like '%"+map.get("birthday")+"%' ";
			}	
			if(map.containsKey("height") && map.get("height")!=null && !map.get("height").toString().equals(""))
			{
				where += " and a.height like '%"+map.get("height")+"%' ";
			}	
			if(map.containsKey("weight") && map.get("weight")!=null && !map.get("weight").toString().equals(""))
			{
				where += " and a.weight like '%"+map.get("weight")+"%' ";
			}	
			if(map.containsKey("picture") && map.get("picture")!=null && !map.get("picture").toString().equals(""))
			{
				where += " and a.picture like '%"+map.get("picture")+"%' ";
			}	
			if(map.containsKey("flogcount") && map.get("flogcount")!=null && !map.get("flogcount").toString().equals(""))
			{
				where += " and a.flogcount like '%"+map.get("flogcount")+"%' ";
			}	
			if(map.containsKey("floglasttime") && map.get("floglasttime")!=null && !map.get("floglasttime").toString().equals(""))
			{
				where += " and a.floglasttime like '%"+map.get("floglasttime")+"%' ";
			}	
			if(map.containsKey("floglaspip") && map.get("floglaspip")!=null && !map.get("floglaspip").toString().equals(""))
			{
				where += " and a.floglaspip like '%"+map.get("floglaspip")+"%' ";
			}	
			if(map.containsKey("fienabled") && map.get("fienabled")!=null && !map.get("fienabled").toString().equals(""))
			{
				where += " and a.fienabled like '%"+map.get("fienabled")+"%' ";
			}	
			if(map.containsKey("fdatastatus") && map.get("fdatastatus")!=null && !map.get("fdatastatus").toString().equals(""))
			{
				where += " and a.fdatastatus like '%"+map.get("fdatastatus")+"%' ";
			}	
			if(map.containsKey("fremark") && map.get("fremark")!=null && !map.get("fremark").toString().equals(""))
			{
				where += " and a.fremark like '%"+map.get("fremark")+"%' ";
			}	
			if(map.containsKey("femail") && map.get("femail")!=null && !map.get("femail").toString().equals(""))
			{
				where += " and a.femail like '%"+map.get("femail")+"%' ";
			}	
			if(map.containsKey("furl") && map.get("furl")!=null && !map.get("furl").toString().equals(""))
			{
				where += " and a.furl like '%"+map.get("furl")+"%' ";
			}	
			if(map.containsKey("faddress") && map.get("faddress")!=null && !map.get("faddress").toString().equals(""))
			{
				where += " and a.faddress like '%"+map.get("faddress")+"%' ";
			}	
			
		}
		return where;
	}    
	
	@Override
	public int GetCount(HashMap<String, String> map){
		
        String where = GetWhere(map);
        
		String hql = "select count(*) from User";	    
		Query query =manager.createQuery(hql);   
		int total = (new Integer(query.getSingleResult().toString()));	    
		return total;
	}	
	
//	@Override 
//	public List<UserWatch> ListUser(int offset, int length,HashMap<String, String> map) {					
//		
//        String where = GetWhere(map);
//        
//        String hql = "from User";      
//		Query query =manager.createQuery(hql);   
//		query.setFirstResult(offset);
//		query.setMaxResults(length);
//		@SuppressWarnings("unchecked")
//		List<UserWatch> Users = query.getResultList();   
//		return Users;		
//	}
	
	
	@Override
	public List<UserWatch> ListUser(int offset, int length,HashMap<String, String> map) {

		String where = " ";
		
		if(map!=null && map.size() > 0)
		{
			if(map.containsKey("fmobile") && map.get("fmobile")!=null && !map.get("fmobile").toString().equals(""))
			{
				where += " and a.fmobile = '"+map.get("fmobile")+"' ";
			}
//			if(map.containsKey("fpwd") && map.get("fpwd")!=null && !map.get("fpwd").toString().equals(""))
//			{
//				where += " and a.password = '"+map.get("fpwd")+"' ";
//			}
			
			if(map.containsKey("funiqueid") && map.get("funiqueid")!=null && !map.get("funiqueid").toString().equals(""))
			{
				where += " and a.funiqueid = '"+map.get("funiqueid")+"' ";
			}	
			if(map.containsKey("userName") && map.get("userName")!=null && !map.get("userName").toString().equals(""))
			{
				where += " and a.username = '"+map.get("userName")+"' ";
			}	
			//如为查找加好友，其他两个key都要有
			if(map.containsKey("forfriend") && map.get("forfriend")!=null && !map.get("forfriend").toString().equals(""))
			{
				if(!map.containsKey("fmobile"))
				{
					return new ArrayList<UserWatch>();
				}
			}				
						
		}

		
	    StringBuffer  sql = new StringBuffer();
        sql.append(" SELECT a.funiqueid,a.id,c.serialnumber,a.username,a.phone,a.password,a.sex,a.status,a.createtime,a.fmobile,a.nickname,a.birthday,a.height,a.weight,a.picture,a.flogcount,a.floglasttime,a.floglaspip,a.fienabled,a.fdatastatus,a.fremark,a.femail,a.furl,a.faddress ");
        sql.append(" FROM USER a  inner join t_user_snrelate b ");        
        sql.append(" on a.funiqueid=b.FUserIDStr inner join serialnumber c on c.funiqueid = b.FSNIDStr ");       
		sql.append(" WHERE b.FDataStatus=1 | b.FDataStatus ");
		sql.append(where);

		Query query = manager.createNativeQuery(sql.toString());

		List rows = query.getResultList();
		List<UserWatch> Users = new ArrayList<UserWatch>();
		
		for (Object row : rows) {
			Object[] cells = (Object[]) row;
			
			UserWatch item = new UserWatch();	
            
            item.setFuniqueid((String)cells[0]);            
            item.setId((Integer)cells[1]);            
            item.setSerialnumber((String)cells[2]);            
            item.setUsername((String)cells[3]);            
            item.setPhone((String)cells[4]);            
            item.setPassword((String)cells[5]);            
            item.setSex((String)cells[6]);            
            item.setStatus((String)cells[7]);            
            item.setCreatetime((String)cells[8]);            
            item.setFmobile((String)cells[9]);            
            item.setNickname((String)cells[10]);            
            item.setBirthday((String)cells[11]);            
            item.setHeight((String)cells[12]);            
            item.setWeight((String)cells[13]);            
            item.setPicture((String)cells[14]);            
            item.setFlogcount((Integer)cells[15]);            
            item.setFloglasttime((java.sql.Timestamp)cells[16]);            
            item.setFloglaspip((String)cells[17]);            
            item.setFienabled((Integer)cells[18]);            
            item.setFdatastatus((Integer)cells[19]);            
            item.setFremark((String)cells[20]);            
            item.setFemail((String)cells[21]);            
            item.setFurl((String)cells[22]);            
            item.setFaddress((String)cells[23]);            
          			
			Users.add(item);			
		}
		return Users;
	}
}