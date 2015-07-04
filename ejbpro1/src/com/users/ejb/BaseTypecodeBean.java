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
 * <p>Description: t_base_typecode EJB Interface Bean 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-6-5 14:45:20
 */
@Stateless(mappedName="BaseTypecodeService")
public class BaseTypecodeBean  implements BaseTypecodeService {
    
    @PersistenceContext(unitName = "ejbpro1")	
    private EntityManager manager;

	@Override
	public void Add(BaseTypecode baseTypecodeInfo) {  
       
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("FCode", baseTypecodeInfo.getFcode());
		if(baseTypecodeInfo.getFcategory()!=null ){
			map.put("FCategory", baseTypecodeInfo.getFcategory().toString());
		}
		
		List<BaseTypecode> listType =  this.ListBaseTypecode(map);
		
		if(listType.size()>0)
		{
			throw new RuntimeException("此类别及对应的参数代码已经存在。");
		}
		 
		String distributorid = UUID.randomUUID().toString();

		baseTypecodeInfo.setFtypeid(distributorid);
		baseTypecodeInfo.setFincreaseid((Integer) null);
		
		Timestamp datetime = EJBTime.getTimeStamp();

		baseTypecodeInfo.setFaddtime(datetime);
		baseTypecodeInfo.setFupdatetime(datetime);
		
		baseTypecodeInfo.setFcategory(EjbEnum.ParaCategory.Distributor.value());
		baseTypecodeInfo.setFisdelete(EjbEnum.ParaState.IsChecked.value());
				
		
		manager.persist(baseTypecodeInfo);		
	}
	
	@Override
	public void Update(BaseTypecode baseTypecodeInfo) 
	{
		Timestamp datetime = EJBTime.getTimeStamp();
		baseTypecodeInfo.setFupdatetime(datetime);		
		
//		manager.merge(baseTypecodeInfo);	
		
		StringBuffer  sql = new StringBuffer();
		
		sql.append(" UPDATE T_BASE_TYPECODE SET ");
		// TODO:注意,需要删除最后的 更新语句的逗号

		sql.append(" FNAME = :FNAME ,");
		sql.append(" FCODE = :FCODE ,");
		sql.append(" FVALUE1 = :FVALUE1 ,");
		sql.append(" FVALUE2 = :FVALUE2 ,");
		sql.append(" FVALUE3 = :FVALUE3 ,");
		sql.append(" FVALUE4 = :FVALUE4 ,");
		sql.append(" FVALUE5 = :FVALUE5 ,");
		sql.append(" FISDELETE = :FISDELETE ,");
		//sql.append(" FCATEGORY = :FCATEGORY ,");
		sql.append(" FREMARK = :FREMARK ,");
		sql.append(" FUPDATETIME = :FUPDATETIME ");
		// TODO:栓查自动产生的脚本是否多主键，多主键不参采用这个方式
		sql.append(" WHERE  FTYPEID= :FTYPEID ");
		Query query = manager.createNativeQuery(sql.toString());
		/// 需要更新的字段：

		query.setParameter("FNAME", baseTypecodeInfo.getFname());
		query.setParameter("FCODE", baseTypecodeInfo.getFcode());
		query.setParameter("FVALUE1", baseTypecodeInfo.getFvalue1());
		query.setParameter("FVALUE2", baseTypecodeInfo.getFvalue2());
		query.setParameter("FVALUE3", baseTypecodeInfo.getFvalue3());
		query.setParameter("FVALUE4", baseTypecodeInfo.getFvalue4());
		query.setParameter("FVALUE5", baseTypecodeInfo.getFvalue5());
		query.setParameter("FISDELETE", baseTypecodeInfo.getFisdelete());
		//query.setParameter("FCATEGORY", baseTypecodeInfo.getFcategory());
		query.setParameter("FREMARK", baseTypecodeInfo.getFremark());
		//query.setParameter("FORDER", baseTypecodeInfo.getForder());
		query.setParameter("FUPDATETIME", baseTypecodeInfo.getFupdatetime());		
		/// 输入条件：主键
		// TODO:栓查自动产生的脚本是否多主键，多主键不参采用这个方式
		query.setParameter("FTYPEID", baseTypecodeInfo.getFtypeid());
		
		query.executeUpdate();
	}
	
	@Override
	public void Delete(String id) 
	{
		BaseTypecode baseTypecodeInfo = manager.find(BaseTypecode.class, id);
		
		manager.remove(baseTypecodeInfo);
	}
	
	@Override
	public BaseTypecode find(String id) 
	{
		BaseTypecode baseTypecodeInfo = manager.find(BaseTypecode.class, id);
		return baseTypecodeInfo;
	}
    
	
	
	
	private String GetWhere(HashMap<String, String> map) {
		String where = "";
		
		if(map!=null && map.size()>0)
		{
//			if(map.containsKey("FTypeID") && map.get("FTypeID")!=null && !map.get("FTypeID").toString().equals(""))
//			{
//				where += " and a.FTypeID like '%"+map.get("FTypeID")+"%' ";
//			}	
//			if(map.containsKey("FIncreaseID") && map.get("FIncreaseID")!=null && !map.get("FIncreaseID").toString().equals(""))
//			{
//				where += " and a.FIncreaseID like '%"+map.get("FIncreaseID")+"%' ";
//			}	
//			if(map.containsKey("FName") && map.get("FName")!=null && !map.get("FName").toString().equals(""))
//			{
//				where += " and a.FName like '%"+map.get("FName")+"%' ";
//			}	
			if(map.containsKey("FCode") && map.get("FCode")!=null && !map.get("FCode").toString().equals(""))
			{
				where += " and a.FCode = '"+map.get("FCode")+"' ";
			}	
//			if(map.containsKey("FValue1") && map.get("FValue1")!=null && !map.get("FValue1").toString().equals(""))
//			{
//				where += " and a.FValue1 like '%"+map.get("FValue1")+"%' ";
//			}	
//			if(map.containsKey("FValue2") && map.get("FValue2")!=null && !map.get("FValue2").toString().equals(""))
//			{
//				where += " and a.FValue2 like '%"+map.get("FValue2")+"%' ";
//			}	
//			if(map.containsKey("FValue3") && map.get("FValue3")!=null && !map.get("FValue3").toString().equals(""))
//			{
//				where += " and a.FValue3 like '%"+map.get("FValue3")+"%' ";
//			}	
//			if(map.containsKey("FValue4") && map.get("FValue4")!=null && !map.get("FValue4").toString().equals(""))
//			{
//				where += " and a.FValue4 like '%"+map.get("FValue4")+"%' ";
//			}	
//			if(map.containsKey("FValue5") && map.get("FValue5")!=null && !map.get("FValue5").toString().equals(""))
//			{
//				where += " and a.FValue5 like '%"+map.get("FValue5")+"%' ";
//			}	
//			if(map.containsKey("FIsDelete") && map.get("FIsDelete")!=null && !map.get("FIsDelete").toString().equals(""))
//			{
//				where += " and a.FIsDelete like '%"+map.get("FIsDelete")+"%' ";
//			}	
			if(map.containsKey("FCategory") && map.get("FCategory")!=null && !map.get("FCategory").toString().equals(""))
			{
				where += " and a.FCategory = "+map.get("FCategory")+" ";
			}	
//			if(map.containsKey("FRemark") && map.get("FRemark")!=null && !map.get("FRemark").toString().equals(""))
//			{
//				where += " and a.FRemark like '%"+map.get("FRemark")+"%' ";
//			}	
//			if(map.containsKey("FOrder") && map.get("FOrder")!=null && !map.get("FOrder").toString().equals(""))
//			{
//				where += " and a.FOrder like '%"+map.get("FOrder")+"%' ";
//			}	
//			if(map.containsKey("FAddTime") && map.get("FAddTime")!=null && !map.get("FAddTime").toString().equals(""))
//			{
//				where += " and a.FAddTime like '%"+map.get("FAddTime")+"%' ";
//			}	
//			if(map.containsKey("FUpdateTime") && map.get("FUpdateTime")!=null && !map.get("FUpdateTime").toString().equals(""))
//			{
//				where += " and a.FUpdateTime like '%"+map.get("FUpdateTime")+"%' ";
//			}	
			
		}
		return where;
	}    
	
	@Override
	public int GetCount(HashMap<String, String> map){
		
        String where = GetWhere(map);
        
		String hql = "select count(*) from BaseTypecode";	    
		Query query =manager.createQuery(hql);   
		int total = (new Integer(query.getSingleResult().toString()));	    
		return total;
	}	
	
	private List<BaseTypecode> ListBaseTypecode(HashMap<String, String> map) {

        String where = this.GetWhere(map);
		
	    StringBuffer  sql = new StringBuffer();
        sql.append(" SELECT a.FTypeID,a.FIncreaseID,a.FName,a.FCode,a.FValue1,a.FValue2,a.FValue3,a.FValue4,a.FValue5,a.FIsDelete,a.FCategory,a.FRemark,a.FOrder,a.FAddTime,a.FUpdateTime ");
        sql.append(" FROM T_BASE_TYPECODE a ");
		sql.append(" WHERE 1 = 1 ");
		sql.append(  where);

		Query query = manager.createNativeQuery(sql.toString());

		@SuppressWarnings("rawtypes")
		List rows = query.getResultList();
		List<BaseTypecode> BaseTypecodes = new ArrayList<BaseTypecode>();
		
		for (Object row : rows) {
			Object[] cells = (Object[]) row;
			
			BaseTypecode item = new BaseTypecode();	
            
            item.setFtypeid((String)cells[0]);            
            item.setFincreaseid((Integer)cells[1]);            
            item.setFname((String)cells[2]);            
            item.setFcode((String)cells[3]);            
            item.setFvalue1((String)cells[4]);            
            item.setFvalue2((String)cells[5]);            
            item.setFvalue3((String)cells[6]);            
            item.setFvalue4((String)cells[7]);            
            item.setFvalue5((String)cells[8]);            
            item.setFisdelete((Integer)cells[9]);            
            item.setFcategory((Integer)cells[10]);            
            item.setFremark((String)cells[11]);            
            item.setForder((Integer)cells[12]);            
            item.setFaddtime((java.sql.Timestamp)cells[13]);            
            item.setFupdatetime((java.sql.Timestamp)cells[14]);            
          			
			BaseTypecodes.add(item);			
		}
		return BaseTypecodes;
	}
	
	@Override 
	public List<BaseTypecode> ListBaseTypecode(int offset, int length,HashMap<String, String> map) {					
		
        String where = GetWhere(map);
        
        String hql = "from BaseTypecode";      
		Query query =manager.createQuery(hql);   
		query.setFirstResult(offset);
		query.setMaxResults(length);
		@SuppressWarnings("unchecked")
		List<BaseTypecode> BaseTypecodes = query.getResultList();   
		return BaseTypecodes;		
	}
}