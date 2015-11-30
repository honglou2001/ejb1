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
 * <p>Description: t_serialnumber_sport EJB Interface Bean 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-11-9 9:57:34
 */
@Stateless(mappedName="SerialnumberSportService")
public class SerialnumberSportBean  implements SerialnumberSportService {
    
    @PersistenceContext(unitName = "ejbpro1")	
    private EntityManager manager;

	@Override
	public void AddSerialnumberSport(SerialnumberSport serialnumberSportInfo) {  
        serialnumberSportInfo.setFsportrecid(UUID.randomUUID().toString());
        
		Timestamp datetime = EJBTime.getTimeStamp();

		serialnumberSportInfo.setFaddtime(datetime);
		serialnumberSportInfo.setFupdatetime(datetime);
		manager.persist(serialnumberSportInfo);		
	}
	
	@Override
	public void UpdateSerialnumberSport(SerialnumberSport serialnumberSportInfo) 
	{
		Timestamp datetime = EJBTime.getTimeStamp();
		serialnumberSportInfo.setFupdatetime(datetime);		
		manager.merge(serialnumberSportInfo);		
	}
	
	@Override
	public void DeleteSerialnumberSport(String id) 
	{
		SerialnumberSport serialnumberSportInfo = manager.find(SerialnumberSport.class, id);		
		manager.remove(serialnumberSportInfo);
	}
	
	@Override
	public SerialnumberSport findSerialnumberSport(String id) 
	{
		SerialnumberSport serialnumberSportInfo = manager.find(SerialnumberSport.class, id);
		return serialnumberSportInfo;
	}
    
	private String GetWhere(HashMap<String, String> map) {
		String where = "";
		
		if(map!=null && map.size()>0)
		{
			//if(map.containsKey("FSportRecID") && map.get("FSportRecID")!=null && !map.get("FSportRecID").toString().equals(""))
			//{
			//	where += " and a.FSportRecID like '%"+map.get("FSportRecID")+"%' ";
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
			//if(map.containsKey("FSNNumber") && map.get("FSNNumber")!=null && !map.get("FSNNumber").toString().equals(""))
			//{
			//	where += " and a.FSNNumber like '%"+map.get("FSNNumber")+"%' ";
			//}	
			//if(map.containsKey("FDevType") && map.get("FDevType")!=null && !map.get("FDevType").toString().equals(""))
			//{
			//	where += " and a.FDevType like '%"+map.get("FDevType")+"%' ";
			//}	
			//if(map.containsKey("FMeterInfo") && map.get("FMeterInfo")!=null && !map.get("FMeterInfo").toString().equals(""))
			//{
			//	where += " and a.FMeterInfo like '%"+map.get("FMeterInfo")+"%' ";
			//}	
			//if(map.containsKey("FVal1") && map.get("FVal1")!=null && !map.get("FVal1").toString().equals(""))
			//{
			//	where += " and a.FVal1 like '%"+map.get("FVal1")+"%' ";
			//}	
			//if(map.containsKey("FVa2") && map.get("FVa2")!=null && !map.get("FVa2").toString().equals(""))
			//{
			//	where += " and a.FVa2 like '%"+map.get("FVa2")+"%' ";
			//}	
			//if(map.containsKey("FChar1") && map.get("FChar1")!=null && !map.get("FChar1").toString().equals(""))
			//{
			//	where += " and a.FChar1 like '%"+map.get("FChar1")+"%' ";
			//}	
			//if(map.containsKey("FChar2") && map.get("FChar2")!=null && !map.get("FChar2").toString().equals(""))
			//{
			//	where += " and a.FChar2 like '%"+map.get("FChar2")+"%' ";
			//}	
			//if(map.containsKey("FDataStatus") && map.get("FDataStatus")!=null && !map.get("FDataStatus").toString().equals(""))
			//{
			//	where += " and a.FDataStatus like '%"+map.get("FDataStatus")+"%' ";
			//}	
			//if(map.containsKey("FFieldStatus") && map.get("FFieldStatus")!=null && !map.get("FFieldStatus").toString().equals(""))
			//{
			//	where += " and a.FFieldStatus like '%"+map.get("FFieldStatus")+"%' ";
			//}	
			//if(map.containsKey("FSportTime") && map.get("FSportTime")!=null && !map.get("FSportTime").toString().equals(""))
			//{
			//	where += " and a.FSportTime like '%"+map.get("FSportTime")+"%' ";
			//}	
			//if(map.containsKey("FBleId") && map.get("FBleId")!=null && !map.get("FBleId").toString().equals(""))
			//{
			//	where += " and a.FBleId like '%"+map.get("FBleId")+"%' ";
			//}	
			//if(map.containsKey("FSportdate") && map.get("FSportdate")!=null && !map.get("FSportdate").toString().equals(""))
			//{
			//	where += " and a.FSportdate like '%"+map.get("FSportdate")+"%' ";
			//}	
			//if(map.containsKey("FStep") && map.get("FStep")!=null && !map.get("FStep").toString().equals(""))
			//{
			//	where += " and a.FStep like '%"+map.get("FStep")+"%' ";
			//}	
			//if(map.containsKey("FDistance") && map.get("FDistance")!=null && !map.get("FDistance").toString().equals(""))
			//{
			//	where += " and a.FDistance like '%"+map.get("FDistance")+"%' ";
			//}	
			//if(map.containsKey("FCal") && map.get("FCal")!=null && !map.get("FCal").toString().equals(""))
			//{
			//	where += " and a.FCal like '%"+map.get("FCal")+"%' ";
			//}	
			//if(map.containsKey("FFloor") && map.get("FFloor")!=null && !map.get("FFloor").toString().equals(""))
			//{
			//	where += " and a.FFloor like '%"+map.get("FFloor")+"%' ";
			//}	
			//if(map.containsKey("FHeartRate") && map.get("FHeartRate")!=null && !map.get("FHeartRate").toString().equals(""))
			//{
			//	where += " and a.FHeartRate like '%"+map.get("FHeartRate")+"%' ";
			//}	
			//if(map.containsKey("FHeartrateMin") && map.get("FHeartrateMin")!=null && !map.get("FHeartrateMin").toString().equals(""))
			//{
			//	where += " and a.FHeartrateMin like '%"+map.get("FHeartrateMin")+"%' ";
			//}	
			//if(map.containsKey("FHeartRateMax") && map.get("FHeartRateMax")!=null && !map.get("FHeartRateMax").toString().equals(""))
			//{
			//	where += " and a.FHeartRateMax like '%"+map.get("FHeartRateMax")+"%' ";
			//}	
			//if(map.containsKey("FHeartStr") && map.get("FHeartStr")!=null && !map.get("FHeartStr").toString().equals(""))
			//{
			//	where += " and a.FHeartStr like '%"+map.get("FHeartStr")+"%' ";
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
	public int GetSerialnumberSportCount(HashMap<String, String> map){
		
        String where = GetWhere(map);
        
		String hql = "select count(*) from SerialnumberSport";	    
		Query query =manager.createQuery(hql);   
		int total = (new Integer(query.getSingleResult().toString()));	    
		return total;
	}	
	
	@Override 
	public List<SerialnumberSport> ListSerialnumberSport(int offset, int length,HashMap<String, String> map) {					
		
//      String where = GetWhere(map);
//        
//      String hql = "from SerialnumberSport";      
//		Query query =manager.createQuery(hql);   
//		query.setFirstResult(offset);
//		query.setMaxResults(length);
//		@SuppressWarnings("unchecked")
//		List<SerialnumberSport> SerialnumberSports = query.getResultList();   
//		return SerialnumberSports;	
		
		String where=" ";
		
		if(map.containsKey("userid") && map.get("userid")!=null && !map.get("userid").toString().equals(""))
		{
			where += " and a.FUserID = '"+map.get("userid")+"' ";
		}	
		if(map.containsKey("serialnumid") && map.get("serialnumid")!=null && !map.get("serialnumid").toString().equals(""))
		{
			where += " and a.FSNID = '"+map.get("serialnumid")+"' ";
		}	
		
		if(map.containsKey("sportdate") && map.get("sportdate")!=null && !map.get("sportdate").toString().equals(""))
		{
			where += " and a.FSportdate like '"+map.get("sportdate")+"%' ";
		}	
		
		if(where.equals(""))
		{
			where +="and 1=0";
		}		
		
	  	StringBuffer  sql = new StringBuffer();
        sql.append(" SELECT a.FSportRecID,a.FIncreaseID,a.FUserID,a.FSNID,a.FSNNumber,a.FDevType,a.FMeterInfo,a.FVal1,a.FVa2,a.FChar1,a.FChar2,a.FDataStatus,a.FFieldStatus,a.FSportTime,a.FBleId,a.FSportdate,a.FStep,a.FDistance,a.FCal,a.FFloor,a.FHeartRate,a.FHeartrateMin,a.FHeartRateMax,a.FHeartStr,a.FAddTime,a.FUpdateTime,a.FRemark ");
        sql.append(" FROM T_SERIALNUMBER_SPORT a ");
		sql.append(" WHERE 1 = 1 ");

		Query query = manager.createNativeQuery(sql.toString());

		List rows = query.getResultList();
		List<SerialnumberSport> SerialnumberSports = new ArrayList<SerialnumberSport>();
		
		for (Object row : rows) {
			Object[] cells = (Object[]) row;
			
			SerialnumberSport item = new SerialnumberSport();	
            
            item.setFsportrecid((String)cells[0]);            
            item.setFincreaseid((Integer)cells[1]);            
            item.setFuserid((String)cells[2]);            
            item.setFsnid((String)cells[3]);            
            item.setFsnnumber((String)cells[4]);            
            item.setFdevtype((Integer)cells[5]);            
            item.setFmeterinfo((String)cells[6]);            
            item.setFval1((Integer)cells[7]);            
            item.setFva2((Integer)cells[8]);            
            item.setFchar1((String)cells[9]);            
            item.setFchar2((String)cells[10]);            
            item.setFdatastatus((Integer)cells[11]);            
            item.setFfieldstatus((Integer)cells[12]);            
            item.setFsporttime((java.sql.Timestamp)cells[13]);            
            item.setFbleid((String)cells[14]);            
            item.setFsportdate((String)cells[15]);            
            item.setFstep((Integer)cells[16]);            
            item.setFdistance((Integer)cells[17]);            
            item.setFcal((Integer)cells[18]);            
            item.setFfloor((Integer)cells[19]);            
            item.setFheartrate((Integer)cells[20]);            
            item.setFheartratemin((Integer)cells[21]);            
            item.setFheartratemax((Integer)cells[22]);            
            item.setFheartstr((String)cells[23]);            
            item.setFaddtime((java.sql.Timestamp)cells[24]);            
            item.setFupdatetime((java.sql.Timestamp)cells[25]);            
            item.setFremark((String)cells[26]);            
          			
			SerialnumberSports.add(item);			
		}
		return SerialnumberSports;
	}
}
