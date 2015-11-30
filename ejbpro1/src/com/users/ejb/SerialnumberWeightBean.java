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
 * <p>Description: t_serialnumber_weight EJB Interface Bean 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-11-30 22:43:45
 */
@Stateless(mappedName="SerialnumberWeightService")
public class SerialnumberWeightBean  implements SerialnumberWeightService {
    
    @PersistenceContext(unitName = "ejbpro1")	
    private EntityManager manager;

	@Override
	public void AddSerialnumberWeight(SerialnumberWeight serialnumberWeightInfo) {  
        serialnumberWeightInfo.setFwuniqueid(UUID.randomUUID().toString());
		manager.persist(serialnumberWeightInfo);		
	}
	
	@Override
	public void UpdateSerialnumberWeight(SerialnumberWeight serialnumberWeightInfo) 
	{
		manager.merge(serialnumberWeightInfo);		
	}
	
	@Override
	public void UpdateSerialnumberWeight(SerialnumberWeight serialnumberWeightInfo,HashMap<String, String> map) 
	{
    	if(map!=null && map.size()>0){
			if(map.containsKey("actionType")){
				String actionType = map.get("actionType");
				
				if(actionType.equals("1"))
				{    		    										   					
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
	public void DeleteSerialnumberWeight(String id) 
	{
		SerialnumberWeight serialnumberWeightInfo = manager.find(SerialnumberWeight.class, id);
		
		manager.remove(serialnumberWeightInfo);
	}
	
	@Override
	public SerialnumberWeight findSerialnumberWeight(String id) 
	{
		SerialnumberWeight serialnumberWeightInfo = manager.find(SerialnumberWeight.class, id);
		return serialnumberWeightInfo;
	}
    
	private String GetWhere(HashMap<String, String> map) {
		String where = "";
		
		if(map!=null && map.size()>0)
		{
			//if(map.containsKey("FWUniqueID") && map.get("FWUniqueID")!=null && !map.get("FWUniqueID").toString().equals(""))
			//{
			//	where += " and a.FWUniqueID like '%"+map.get("FWUniqueID")+"%' ";
			//}	
			//if(map.containsKey("FIncreaseID") && map.get("FIncreaseID")!=null && !map.get("FIncreaseID").toString().equals(""))
			//{
			//	where += " and a.FIncreaseID like '%"+map.get("FIncreaseID")+"%' ";
			//}	
			//if(map.containsKey("FSndusrid") && map.get("FSndusrid")!=null && !map.get("FSndusrid").toString().equals(""))
			//{
			//	where += " and a.FSndusrid like '%"+map.get("FSndusrid")+"%' ";
			//}	
			//if(map.containsKey("FSerialnumid") && map.get("FSerialnumid")!=null && !map.get("FSerialnumid").toString().equals(""))
			//{
			//	where += " and a.FSerialnumid like '%"+map.get("FSerialnumid")+"%' ";
			//}	
			//if(map.containsKey("FAppcountid") && map.get("FAppcountid")!=null && !map.get("FAppcountid").toString().equals(""))
			//{
			//	where += " and a.FAppcountid like '%"+map.get("FAppcountid")+"%' ";
			//}	
			//if(map.containsKey("FIsDelete") && map.get("FIsDelete")!=null && !map.get("FIsDelete").toString().equals(""))
			//{
			//	where += " and a.FIsDelete like '%"+map.get("FIsDelete")+"%' ";
			//}	
			//if(map.containsKey("FIsLock") && map.get("FIsLock")!=null && !map.get("FIsLock").toString().equals(""))
			//{
			//	where += " and a.FIsLock like '%"+map.get("FIsLock")+"%' ";
			//}	
			//if(map.containsKey("Fweight") && map.get("Fweight")!=null && !map.get("Fweight").toString().equals(""))
			//{
			//	where += " and a.Fweight like '%"+map.get("Fweight")+"%' ";
			//}	
			//if(map.containsKey("FHeight") && map.get("FHeight")!=null && !map.get("FHeight").toString().equals(""))
			//{
			//	where += " and a.FHeight like '%"+map.get("FHeight")+"%' ";
			//}	
			//if(map.containsKey("FBMI") && map.get("FBMI")!=null && !map.get("FBMI").toString().equals(""))
			//{
			//	where += " and a.FBMI like '%"+map.get("FBMI")+"%' ";
			//}	
			//if(map.containsKey("FCalorie") && map.get("FCalorie")!=null && !map.get("FCalorie").toString().equals(""))
			//{
			//	where += " and a.FCalorie like '%"+map.get("FCalorie")+"%' ";
			//}	
			//if(map.containsKey("FFatContent") && map.get("FFatContent")!=null && !map.get("FFatContent").toString().equals(""))
			//{
			//	where += " and a.FFatContent like '%"+map.get("FFatContent")+"%' ";
			//}	
			//if(map.containsKey("FBoneContent") && map.get("FBoneContent")!=null && !map.get("FBoneContent").toString().equals(""))
			//{
			//	where += " and a.FBoneContent like '%"+map.get("FBoneContent")+"%' ";
			//}	
			//if(map.containsKey("FMuscleContent") && map.get("FMuscleContent")!=null && !map.get("FMuscleContent").toString().equals(""))
			//{
			//	where += " and a.FMuscleContent like '%"+map.get("FMuscleContent")+"%' ";
			//}	
			//if(map.containsKey("FWaterContent") && map.get("FWaterContent")!=null && !map.get("FWaterContent").toString().equals(""))
			//{
			//	where += " and a.FWaterContent like '%"+map.get("FWaterContent")+"%' ";
			//}	
			//if(map.containsKey("FVisceralFatContent") && map.get("FVisceralFatContent")!=null && !map.get("FVisceralFatContent").toString().equals(""))
			//{
			//	where += " and a.FVisceralFatContent like '%"+map.get("FVisceralFatContent")+"%' ";
			//}	
			//if(map.containsKey("FDataStatus") && map.get("FDataStatus")!=null && !map.get("FDataStatus").toString().equals(""))
			//{
			//	where += " and a.FDataStatus like '%"+map.get("FDataStatus")+"%' ";
			//}	
			//if(map.containsKey("FRemark") && map.get("FRemark")!=null && !map.get("FRemark").toString().equals(""))
			//{
			//	where += " and a.FRemark like '%"+map.get("FRemark")+"%' ";
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
	public int GetSerialnumberWeightCount(HashMap<String, String> map){
		
        String where = GetWhere(map);
        
		String hql = "select count(*) from SerialnumberWeight";	    
		Query query =manager.createQuery(hql);   
		int total = (new Integer(query.getSingleResult().toString()));	    
		return total;
	}	
	
	@Override 
	public List<SerialnumberWeight> ListSerialnumberWeight(int offset, int length,HashMap<String, String> map) {					
		
//        String where = GetWhere(map);
//        
//        String hql = "from SerialnumberWeight";      
//		Query query =manager.createQuery(hql);   
//		query.setFirstResult(offset);
//		query.setMaxResults(length);
//		@SuppressWarnings("unchecked")
//		List<SerialnumberWeight> SerialnumberWeights = query.getResultList();   
//		return SerialnumberWeights;	
		
		StringBuffer  sql = new StringBuffer();
        sql.append(" SELECT a.FWUniqueID,a.FIncreaseID,a.FSndusrid,a.FSerialnumid,a.FAppcountid,a.FIsDelete,a.FIsLock,a.Fweight,a.FHeight,a.FBMI,a.FCalorie,a.FFatContent,a.FBoneContent,a.FMuscleContent,a.FWaterContent,a.FVisceralFatContent,a.FDataStatus,a.FRemark,a.FAddTime,a.FUpdateTime ");
        sql.append(" FROM T_SERIALNUMBER_WEIGHT a ");
		sql.append(" WHERE 1 = 1 ");

		Query query = manager.createNativeQuery(sql.toString());

		List rows = query.getResultList();
		List<SerialnumberWeight> SerialnumberWeights = new ArrayList<SerialnumberWeight>();
		
		for (Object row : rows) {
			Object[] cells = (Object[]) row;
			
			SerialnumberWeight item = new SerialnumberWeight();	
            
            item.setFwuniqueid((String)cells[0]);            
            item.setFincreaseid((Integer)cells[1]);            
            item.setFsndusrid((String)cells[2]);            
            item.setFserialnumid((String)cells[3]);            
            item.setFappcountid((String)cells[4]);            
            item.setFisdelete((Integer)cells[5]);            
            item.setFislock((Integer)cells[6]);            
            item.setFweight((java.math.BigDecimal)cells[7]);            
            item.setFheight((java.math.BigDecimal)cells[8]);            
            item.setFbmi((java.math.BigDecimal)cells[9]);            
            item.setFcalorie((java.math.BigDecimal)cells[10]);            
            item.setFfatcontent((java.math.BigDecimal)cells[11]);            
            item.setFbonecontent((java.math.BigDecimal)cells[12]);            
            item.setFmusclecontent((java.math.BigDecimal)cells[13]);            
            item.setFwatercontent((java.math.BigDecimal)cells[14]);            
            item.setFvisceralfatcontent((java.math.BigDecimal)cells[15]);            
            item.setFdatastatus((Integer)cells[16]);            
            item.setFremark((String)cells[17]);            
            item.setFaddtime((java.sql.Timestamp)cells[18]);            
            item.setFupdatetime((java.sql.Timestamp)cells[19]);            
          			
			SerialnumberWeights.add(item);			
		}
		return SerialnumberWeights;
	}
}