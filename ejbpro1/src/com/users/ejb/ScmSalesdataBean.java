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
import com.common.ejb.EJBTools;

/**
 * <p>
 * Title: ejb title
 * </p>
 * <p>
 * Description: t_scm_salesdata EJB Interface Bean 处理类
 * </p>
 * 
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间 2015-5-29 13:55:51
 */
@Stateless(mappedName = "ScmSalesdataService")
public class ScmSalesdataBean implements ScmSalesdataService {

	@PersistenceContext(unitName = "ejbpro1")
	private EntityManager manager;

	@Override
	public void Add(ScmSalesdata scmSalesdataInfo) {
		scmSalesdataInfo.setFsaledataid(UUID.randomUUID().toString());

		Timestamp datetime = EJBTime.getTimeStamp();

		scmSalesdataInfo.setFaddtime(datetime);
		scmSalesdataInfo.setFupdatetime(datetime);

		manager.persist(scmSalesdataInfo);
	}

	@Override
	public void Update(ScmSalesdata scmSalesdataInfo) {

		Timestamp datetime = EJBTime.getTimeStamp();
		scmSalesdataInfo.setFupdatetime(datetime);

		StringBuffer sql = new StringBuffer();

		sql.append(" UPDATE T_SCM_SALESDATA SET ");
		// TODO:注意,需要删除最后的 更新语句的逗号
		sql.append(" FDISTRIBUTORID = :FDISTRIBUTORID ,");
		sql.append(" FPRICE = :FPRICE ,");
		sql.append(" FAMOUNT = :FAMOUNT ,");
		sql.append(" FTYPE = :FTYPE ,");
		sql.append(" FDATE = :FDATE ,");
		sql.append(" FUPDATETIME = :FUPDATETIME ");
		// TODO:栓查自动产生的脚本是否多主键，多主键不参采用这个方式
		sql.append(" WHERE  FSALEDATAID= :FSALEDATAID ");

		Query query = manager.createNativeQuery(sql.toString());

		// / 需要更新的字段：
		query.setParameter("FDISTRIBUTORID",
				scmSalesdataInfo.getFdistributorid());
		query.setParameter("FPRICE", scmSalesdataInfo.getFprice());
		query.setParameter("FAMOUNT", scmSalesdataInfo.getFamount());
		query.setParameter("FTYPE", scmSalesdataInfo.getFtype());
		query.setParameter("FDATE", scmSalesdataInfo.getFdate());
		query.setParameter("FUPDATETIME", scmSalesdataInfo.getFupdatetime());

		// / 输入条件：主键
		// TODO:栓查自动产生的脚本是否多主键，多主键不参采用这个方式
		query.setParameter("FSALEDATAID", scmSalesdataInfo.getFsaledataid());

		query.executeUpdate();
		// manager.merge(scmSalesdataInfo);
	}

	@Override
	public void Delete(String id) {
		ScmSalesdata scmSalesdataInfo = manager.find(ScmSalesdata.class, id);

		manager.remove(scmSalesdataInfo);
	}

	@Override
	public ScmSalesdata find(String id) {
		ScmSalesdata scmSalesdataInfo = manager.find(ScmSalesdata.class, id);
		return scmSalesdataInfo;
	}

	@Override
	public int GetCount(HashMap<String, String> map) {

		// String hql = "select count(*) from ScmSalesdata";
		// Query query = manager.createQuery(hql);
		// int total = (new Integer(query.getSingleResult().toString()));

		String where = GetWhere(map);

		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT count(*) ");
		sql.append(" from t_scm_salesdata a inner join t_scm_distributors b on a.FDistributorID=b.FDistributorID  ");
		sql.append(" WHERE 1 = 1 ");
		sql.append(where);

		Query query = manager.createNativeQuery(sql.toString());
		int total = (new Integer(query.getSingleResult().toString()));

		return total;
	}

	private String GetWhere(HashMap<String, String> map) {
		String where = "";

		if (map != null && map.size() > 0) {
			if (map.containsKey("fdatebegin") && map.get("fdatebegin") != null && !map.get("fdatebegin").toString().equals("")) {
				where += " and a.FDate >= '" + map.get("fdatebegin") + "' ";
			}
			if (map.containsKey("fdateend") && map.get("fdateend") != null && !map.get("fdateend").toString().equals("")) {
				where += " and a.FDate <= '" + map.get("fdateend") + "' ";
			}
			if (map.containsKey("fdistributor")
					&& map.get("fdistributor") != null && !map.get("fdistributor").toString().equals("")) {
				where += " and b.Fname like '%" + map.get("fdistributor")
						+ "%' ";
			}
			if (map.containsKey("fparentid")
					&& map.get("fparentid") != null && !map.get("fparentid").toString().equals("")) {
				where += " and b.fparentid = '" + map.get("fparentid")+ "' ";
			}
			
		}
		return where;
	}

	@Override
	public List<ScmSalesdata> ListScmSalesdata(int offset, int length,
			HashMap<String, String> map) {
		// String hql = "from ScmSalesdata";
		// Query query =manager.createQuery(hql);
		// query.setFirstResult(offset);
		// query.setMaxResults(length);
		// @SuppressWarnings("unchecked")
		// List<ScmSalesdata> ScmSalesdatas = query.getResultList();
		// return ScmSalesdatas;

		String where = GetWhere(map);

		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT a.FSaleDataID,a.FDistributorID,a.FIncreaseID,a.FPrice,a.FAmount,a.FType,a.FDate, ");
		sql.append(" a.FAddTime,a.FUpdateTime,b.FName, ifnull(c.FName,'') as Fintroducer, d.FValue1 ");
		sql.append(" from t_scm_salesdata a inner join t_scm_distributors b on a.FDistributorID=b.FDistributorID  ");
		sql.append(" left join t_scm_distributors c on b.fparentid=c.fdistributorid  ");
        sql.append(" , t_base_typecode d ");   		
		sql.append(" WHERE 1 = 1  and d.FCode='001' and d.FCategory=1 ");
		sql.append(where);
		sql.append(" order by a.FIncreaseID desc");
		sql.append(" limit " + offset + "," + length + "");

		Query query = manager.createNativeQuery(sql.toString());

		@SuppressWarnings("rawtypes")
		List rows = query.getResultList();
		List<ScmSalesdata> ScmSalesdatas = new ArrayList<ScmSalesdata>();

		//提成比例
		String FPercent = "";
		
		for (Object row : rows) {
			Object[] cells = (Object[]) row;

			ScmSalesdata item = new ScmSalesdata();

			item.setFsaledataid((String) cells[0]);
			item.setFdistributorid((String) cells[1]);
			item.setFincreaseid((Integer) cells[2]);
			item.setFprice((BigDecimal) cells[3]);
			item.setFamount((Integer) cells[4]);
			item.setFtype((Integer) cells[5]);
			item.setFdate((java.sql.Timestamp) cells[6]);
			item.setFaddtime((java.sql.Timestamp) cells[7]);
			item.setFupdatetime((java.sql.Timestamp) cells[8]);
			item.setFdistributor((String) cells[9]);
			item.setFintroducer((String) cells[10]);
			
			FPercent = (String) cells[11];
					
			BigDecimal price = (BigDecimal) cells[3];
			Integer amount = (Integer) cells[4];

			if (price != null && amount != null) {
				BigDecimal total = price.multiply(new BigDecimal(amount));
				item.setFtotal(total);
			}
			
			BigDecimal decipercent = new BigDecimal(0.00);			
			if (FPercent != null && FPercent.length() >0) {
				if(EJBTools.CheckIsNumber(FPercent))
				{
					decipercent = new BigDecimal(FPercent);
				}
			}

			// 设定分成比例
			item.setFsplit(decipercent.multiply(new BigDecimal(100)));

			if (item.getFtotal() != null) {
				BigDecimal fsplittotal = item.getFtotal().multiply(decipercent);
				item.setFsplittoal(fsplittotal.setScale(2, BigDecimal.ROUND_HALF_UP));
			}

			ScmSalesdatas.add(item);
		}
		return ScmSalesdatas;
	}
}
