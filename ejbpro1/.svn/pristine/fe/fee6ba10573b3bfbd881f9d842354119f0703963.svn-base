package com.users.ejb;


import java.math.BigDecimal;
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
 * <p>Description: t_serialnumber_fee EJB Interface Bean 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-8-31 11:09:30
 */
@Stateless(mappedName="SerialnumberFeeService")
public class SerialnumberFeeBean  implements SerialnumberFeeService {
    
    @PersistenceContext(unitName = "ejbpro1")	
    private EntityManager manager;

	@Override
	public void AddSerialnumberFee(SerialnumberFee serialnumberFeeInfo) { 
		
		if(serialnumberFeeInfo.getFfeeid()==null || serialnumberFeeInfo.getFfeeid().equals(""))
		{
			serialnumberFeeInfo.setFfeeid(UUID.randomUUID().toString());
		}
        
		Timestamp datetime = EJBTime.getTimeStamp();

		serialnumberFeeInfo.setFaddtime(datetime);
		serialnumberFeeInfo.setFupdatetime(datetime);
		
		manager.persist(serialnumberFeeInfo);		
	}
	
	@Override
	public void UpdateSerialnumberFee(SerialnumberFee serialnumberFeeInfo) 
	{
		Timestamp datetime = EJBTime.getTimeStamp();
		serialnumberFeeInfo.setFupdatetime(datetime);
		
		manager.merge(serialnumberFeeInfo);		
	}
	
	@Override
	public void DeleteSerialnumberFee(String id) 
	{
		SerialnumberFee serialnumberFeeInfo = manager.find(SerialnumberFee.class, id);
		
		manager.remove(serialnumberFeeInfo);
	}
	
	@Override
	public SerialnumberFee findSerialnumberFee(String id) 
	{
		SerialnumberFee serialnumberFeeInfo = manager.find(SerialnumberFee.class, id);
		return serialnumberFeeInfo;
	}
    
	private String GetWhere(HashMap<String, String> map) {
		String where = "";
		
		if(map!=null && map.size()>0)
		{
			
			
		}
		return where;
	}    
	
	@Override
	public int GetSerialnumberFeeCount(HashMap<String, String> map){
		
//        String where = GetWhere(map);
//        
//		String hql = "select count(*) from SerialnumberFee";	    
//		Query query =manager.createQuery(hql);   
//		int total = (new Integer(query.getSingleResult().toString()));	    
//		return total;
		
		String where=" ";
		
		if(map.containsKey("FSNID") && map.get("FSNID")!=null && !map.get("FSNID").toString().equals(""))
		{
			where += " and a.FSNID = '"+map.get("FSNID")+"' ";
		};
		
		if(where.equals(""))
		{
			where = " and 1=0 ";
		}

		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT count(*) ");
		sql.append(" from t_serialnumber_fee a   ");
		sql.append(" WHERE 1 = 1 ");
		sql.append(where);

		Query query = manager.createNativeQuery(sql.toString());
		int total = (new Integer(query.getSingleResult().toString()));

		return total;
	}	
	
	@Override
	public BigDecimal GetSerialnumberFeeBalance(HashMap<String, String> map)
	{
		BigDecimal balance = new BigDecimal(0.00); 
		String where=" ";
		
		if(map.containsKey("FSNID") && map.get("FSNID")!=null && !map.get("FSNID").toString().equals(""))
		{
			where += " and a.FSNID = '"+map.get("FSNID")+"' ";
		}	
				
		if(where.equals(""))
		{
			where = " and 1=0 ";
		}
		
		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT sum(ifnull(a.FDeposit,0)) - sum(ifnull(a.FSpending,0)) ");
		sql.append(" from t_serialnumber_fee a   ");
		sql.append(" WHERE 1 = 1 ");
		sql.append(where);

		Query query = manager.createNativeQuery(sql.toString());
		Object obj = query.getSingleResult();
		if(obj!=null){		
			if(!obj.toString().equals("")){
				balance  = (new BigDecimal(obj.toString()));
			}
		}
		
		return balance;
	}
	
	@Override 
	public List<SerialnumberFee> ListSerialnumberFee(int offset, int length,HashMap<String, String> map) {					
		
		String where=" ";
		
		if(map.containsKey("FSNID") && map.get("FSNID")!=null && !map.get("FSNID").toString().equals(""))
		{
			where += " and a.FSNID = '"+map.get("FSNID")+"' ";
		}	
	 	StringBuffer  sql = new StringBuffer();
        sql.append(" SELECT a.FFeeID,a.FIncreaseID,a.FTitle,a.FDescription,a.FUserID,a.FSNID,a.FFeeType,a.FDeposit,a.FSpending,a.FBalance,a.FValidStatus,a.FDataStatus,a.FFieldStatus,a.FAddTime,a.FUpdateTime,a.FRemark,a.FRelTable,a.FRelVal,a.FOperator,a.FOperateState,a.FOperateTime ");
        sql.append(" FROM T_SERIALNUMBER_FEE a ");
		sql.append(" WHERE 1 = 1 ");
		sql.append(where);
		sql.append(" order by a.FIncreaseID desc ");
		sql.append(" limit "+offset+","+length+"");

		Query query = manager.createNativeQuery(sql.toString());

		List rows = query.getResultList();
		List<SerialnumberFee> SerialnumberFees = new ArrayList<SerialnumberFee>();
		
		for (Object row : rows) {
			Object[] cells = (Object[]) row;
			
			SerialnumberFee item = new SerialnumberFee();	
            
            item.setFfeeid((String)cells[0]);            
            item.setFincreaseid((Integer)cells[1]);            
            item.setFtitle((String)cells[2]);            
            item.setFdescription((String)cells[3]);            
            item.setFuserid((String)cells[4]);            
            item.setFsnid((String)cells[5]);            
            item.setFfeetype((Integer)cells[6]);            
            item.setFdeposit((java.math.BigDecimal)cells[7]);            
            item.setFspending((java.math.BigDecimal)cells[8]);            
            item.setFbalance((java.math.BigDecimal)cells[9]);            
            item.setFvalidstatus((Integer)cells[10]);            
            item.setFdatastatus((Integer)cells[11]);            
            item.setFfieldstatus((Integer)cells[12]);            
            item.setFaddtime((java.sql.Timestamp)cells[13]);            
            item.setFupdatetime((java.sql.Timestamp)cells[14]);            
            item.setFremark((String)cells[15]);            
            item.setFreltable((String)cells[16]);            
            item.setFrelval((String)cells[17]);            
            item.setFoperator((String)cells[18]);            
            item.setFoperatestate((Integer)cells[19]);            
            item.setFoperatetime((java.sql.Timestamp)cells[20]);            
          			
			SerialnumberFees.add(item);			
		}
		return SerialnumberFees;
	}
}