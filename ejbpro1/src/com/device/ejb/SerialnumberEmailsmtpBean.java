package com.device.ejb;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.sql.Timestamp;
import com.common.ejb.EJBTime;
/**
 * <p>Title: ejb title </p>
 * <p>Description: t_serialnumber_emailsmtp EJB Interface Bean 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2016-1-16 13:39:22
 */
@Stateless(mappedName="SerialnumberEmailsmtpService")
public class SerialnumberEmailsmtpBean  implements SerialnumberEmailsmtpService {
    
    @PersistenceContext(unitName = "ejbpro1")	
    private EntityManager manager;

	@Override
	public void AddSerialnumberEmailsmtp(SerialnumberEmailsmtp serialnumberEmailsmtpInfo) {  
        serialnumberEmailsmtpInfo.setFsmtprecid(UUID.randomUUID().toString());
     	Timestamp datetime = EJBTime.getTimeStamp();
     	serialnumberEmailsmtpInfo.setFaddtime(datetime);
     	serialnumberEmailsmtpInfo.setFupdatetime(datetime);
     	
     	if(serialnumberEmailsmtpInfo.getFisdefault() == 1)
     	{
     		HashMap<String, String> map = new HashMap<String, String>();
     		map.put("actionType", "1");     		
     		this.UpdateSerialnumberEmailsmtp(serialnumberEmailsmtpInfo,map);
     	}
		manager.persist(serialnumberEmailsmtpInfo);		
	}
	
	@Override
	public void UpdateSerialnumberEmailsmtp(SerialnumberEmailsmtp serialnumberEmailsmtpInfo) 
	{
        Timestamp datetime = EJBTime.getTimeStamp();
     	serialnumberEmailsmtpInfo.setFupdatetime(datetime);
     	
     	if(serialnumberEmailsmtpInfo.getFisdefault() == 1)
     	{
     		HashMap<String, String> map = new HashMap<String, String>();
     		map.put("actionType", "1");     		
     		this.UpdateSerialnumberEmailsmtp(serialnumberEmailsmtpInfo,map);
     	}
     	
		manager.merge(serialnumberEmailsmtpInfo);		
	}
	
	@Override
	public void UpdateSerialnumberEmailsmtp(SerialnumberEmailsmtp serialnumberEmailsmtpInfo,HashMap<String, String> map) 
	{
    	if(map!=null && map.size()>0){
			if(map.containsKey("actionType")){
				String actionType = map.get("actionType");
				
				if(actionType.equals("1"))
				{    		    										   					
					Query q = manager.createNativeQuery("UPDATE t_serialnumber_emailsmtp SET FIsDefault = 0 ");   			
					q.executeUpdate();
				}			
			}
		}	
	}
    
	@Override
	public void DeleteSerialnumberEmailsmtp(String id) 
	{
		SerialnumberEmailsmtp serialnumberEmailsmtpInfo = manager.find(SerialnumberEmailsmtp.class, id);
		
		manager.remove(serialnumberEmailsmtpInfo);
	}
	
	@Override
	public SerialnumberEmailsmtp findSerialnumberEmailsmtp(String id) 
	{
		SerialnumberEmailsmtp serialnumberEmailsmtpInfo = manager.find(SerialnumberEmailsmtp.class, id);
		return serialnumberEmailsmtpInfo;
	}
    
	private String GetWhere(HashMap<String, String> map) {
		String where = "";
		
		if(map!=null && map.size()>0)
		{	
			if(map.containsKey("FIsDefault") && map.get("FIsDefault")!=null && map.get("FIsDefault").toString().equals("1"))
			{
				where += " and a.FIsDefault = 1 ";
			}	
		}
		return where;
	}    
	
	@Override
	public int GetSerialnumberEmailsmtpCount(HashMap<String, String> map){
		
        String where = GetWhere(map);
        
		String hql = "select count(*) from SerialnumberEmailsmtp";	    
		Query query =manager.createQuery(hql);   
		int total = (new Integer(query.getSingleResult().toString()));	    
		return total;
	}	
	
	@Override 
	public List<SerialnumberEmailsmtp> ListSerialnumberEmailsmtp(int offset, int length,HashMap<String, String> map) {					
		
		String where = this.GetWhere(map);
		
	 	StringBuffer  sql = new StringBuffer();
        sql.append(" SELECT a.FSMtpRecID,a.FIncreaseID,a.FType,a.FAppId,a.FUserID,a.FName,a.FMailhost,a.FMailUserName,a.FMailPassword,a.FMailAddress,a.FMailFromName,a.FIsDefault,a.FDataStatus,a.FFieldStatus,a.FAddTime,a.FUpdateTime,a.FUpdateUser,a.FRemark ");
        sql.append(" FROM T_SERIALNUMBER_EMAILSMTP a ");
		sql.append(" WHERE 1 = 1 ");
		sql.append(  where);
		sql.append(" order by a.FUpdateTime desc ");
		sql.append(" limit "+offset+","+length+"");

		Query query = manager.createNativeQuery(sql.toString());

		List rows = query.getResultList();
		List<SerialnumberEmailsmtp> SerialnumberEmailsmtps = new ArrayList<SerialnumberEmailsmtp>();
		
		for (Object row : rows) {
			Object[] cells = (Object[]) row;
			
			SerialnumberEmailsmtp item = new SerialnumberEmailsmtp();	
            
            item.setFsmtprecid((String)cells[0]);            
            item.setFincreaseid((Integer)cells[1]);            
            item.setFtype((Integer)cells[2]);            
            item.setFappid((String)cells[3]);            
            item.setFuserid((String)cells[4]);            
            item.setFname((String)cells[5]);            
            item.setFmailhost((String)cells[6]);            
            item.setFmailusername((String)cells[7]);            
            item.setFmailpassword((String)cells[8]);            
            item.setFmailaddress((String)cells[9]);            
            item.setFmailfromname((String)cells[10]);            
            item.setFisdefault((Integer)cells[11]);            
            item.setFdatastatus((Integer)cells[12]);            
            item.setFfieldstatus((Integer)cells[13]);            
            item.setFaddtime((java.sql.Timestamp)cells[14]);            
            item.setFupdatetime((java.sql.Timestamp)cells[15]);            
            item.setFupdateuser((String)cells[16]);            
            item.setFremark((String)cells[17]);            
          			
			SerialnumberEmailsmtps.add(item);			
		}
		return SerialnumberEmailsmtps;	
	}
}