package com.users.ejb;

import com.common.ejb.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * <p>
 * Title: ejb title
 * </p>
 * <p>
 * Description: t_scm_distributors EJB Interface Bean 处理类
 * </p>
 * 
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间 2015-5-23 13:04:25
 */
@Stateless(mappedName = "ScmDistributorsService")
public class ScmDistributorsBean implements ScmDistributorsService {

	@PersistenceContext(unitName = "ejbpro1")
	private EntityManager manager;

	@Override
	public void Add(ScmDistributors scmDistributorsInfo) {

		List<ScmDistributors> lists = ListScmDistributors(scmDistributorsInfo
				.getFname());

		if (lists.size() > 0) {

			throw new RuntimeException("分销商名称已经存在。");
		}

		String distributorid = UUID.randomUUID().toString();

		scmDistributorsInfo.setFdistributorid(distributorid);
		scmDistributorsInfo.setFincreaseid((Integer) null);

		Timestamp datetime = EJBTime.getTimeStamp();

		scmDistributorsInfo.setFaddtime(datetime);
		scmDistributorsInfo.setFupdatetime(datetime);

//		if (scmDistributorsInfo.getFintroducer() != null
//				&& scmDistributorsInfo.getFintroducer().length() > 0) {
//			lists = ListScmDistributors(scmDistributorsInfo.getFintroducer());
//
//			if (lists.size() == 0) {
//				throw new RuntimeException("介绍人不存在。");
//
//			} else {
//				ScmDistributors introducer = lists.get(0);
//
//				scmDistributorsInfo.setFintroducer(introducer.getFname());
//				scmDistributorsInfo.setFparentid(distributorid);
//			}
//		}

		manager.persist(scmDistributorsInfo);

	}

	// private int CheckExists(String name){
	//
	// String hql = "select count(*) from ScmDistributors where fname = :fname";
	// Query query =manager.createQuery(hql);
	// query.setParameter("fname", name);
	// int total = (new Integer(query.getSingleResult().toString()));
	// return total;
	// }

	@Override
	public void Update(ScmDistributors scmDistributorsInfo) {

		Timestamp datetime = EJBTime.getTimeStamp();
		scmDistributorsInfo.setFupdatetime(datetime);

		if (scmDistributorsInfo.getFintroducer() != null
				&& scmDistributorsInfo.getFintroducer().length() > 0) {

			List<ScmDistributors> introducers = ListScmDistributors(scmDistributorsInfo
					.getFintroducer());

			if (introducers.size() == 0) {
				throw new RuntimeException("介绍人不存在。");

			}
			ScmDistributors introducer = introducers.get(0);
			scmDistributorsInfo.setFparentid(introducer.getFdistributorid());
		}

		StringBuffer sql = new StringBuffer();

		sql.append(" UPDATE T_SCM_DISTRIBUTORS SET ");
		// TODO:注意,需要删除最后的 更新语句的逗号
		sql.append(" FPARENTID = :FPARENTID ,");
		sql.append(" FINTRODUCER = :FINTRODUCER ,");
		sql.append(" FNAME = :FNAME ,");
		sql.append(" FPHONE = :FPHONE ,");
		sql.append(" FMOBILE = :FMOBILE ,");
		sql.append(" FADDRESS = :FADDRESS ,");
		sql.append(" FZIPCODE = :FZIPCODE ,");
		sql.append(" FSEX = :FSEX ,");
		sql.append(" FBIRTHDAY = :FBIRTHDAY ,");
		sql.append(" FREMARK = :FREMARK ,");
		sql.append(" FUPDATETIME = :FUPDATETIME ");
		// TODO:栓查自动产生的脚本是否多主键，多主键不参采用这个方式
		sql.append(" WHERE  FDISTRIBUTORID= :FDISTRIBUTORID ");

		Query query = manager.createNativeQuery(sql.toString());

		query.setParameter("FPARENTID", scmDistributorsInfo.getFparentid());
		query.setParameter("FINTRODUCER", scmDistributorsInfo.getFintroducer());
		query.setParameter("FNAME", scmDistributorsInfo.getFname());
		query.setParameter("FPHONE", scmDistributorsInfo.getFphone());
		query.setParameter("FMOBILE", scmDistributorsInfo.getFmobile());
		query.setParameter("FADDRESS", scmDistributorsInfo.getFaddress());
		query.setParameter("FZIPCODE", scmDistributorsInfo.getFzipcode());
		query.setParameter("FSEX", scmDistributorsInfo.getFsex());
		query.setParameter("FBIRTHDAY", scmDistributorsInfo.getFbirthday());
		query.setParameter("FREMARK", scmDistributorsInfo.getFremark());
		query.setParameter("FUPDATETIME", scmDistributorsInfo.getFupdatetime());
		query.setParameter("FDISTRIBUTORID",scmDistributorsInfo.getFdistributorid());
		query.executeUpdate();

		// manager.merge(scmDistributorsInfo);
	}

	@Override
	public void Delete(String id) {
		ScmDistributors scmDistributorsInfo = manager.find(
				ScmDistributors.class, id);

		manager.remove(scmDistributorsInfo);
	}

	@Override
	public ScmDistributors find(String id) {
		ScmDistributors scmDistributorsInfo = manager.find(
				ScmDistributors.class, id);
		return scmDistributorsInfo;
	}

	@Override
	public int GetCount(HashMap<String, String> map) {

//		String hql = "select count(*) from ScmDistributors";
//		Query query = manager.createQuery(hql);
//		int total = (new Integer(query.getSingleResult().toString()));
//		return total;
		
		String where = GetWhere(map);

		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT count(*) ");
		sql.append(" from t_scm_distributors a   ");
		sql.append(" left join t_scm_distributors b on a.fparentid=b.fdistributorid  ");
		sql.append(" WHERE 1 = 1 ");
		sql.append(where);

		Query query = manager.createNativeQuery(sql.toString());
		int total = (new Integer(query.getSingleResult().toString()));

		return total;
	}


	private String GetWhere(HashMap<String, String> map) {
		String where = "";
		
		if(map!=null && map.size()>0)
		{
			if(map.containsKey("fname") && map.get("fname")!=null && !map.get("fname").toString().equals(""))
			{
				where += " and a.FName like '%"+map.get("fname")+"%' ";
			}
			if(map.containsKey("faddress") && map.get("faddress")!=null && !map.get("faddress").toString().equals(""))
			{
				where += " and a.FAddress like '%"+map.get("faddress")+"%' ";
			}
			if(map.containsKey("fmobile") && map.get("fmobile")!=null && !map.get("fmobile").toString().equals(""))
			{
				where += " and a.FMobile like '%"+map.get("fmobile")+"%' ";
			}
			if(map.containsKey("fintroducer") && map.get("fintroducer")!=null && !map.get("fintroducer").toString().equals(""))
			{
				where += " and b.FName like '%"+map.get("fintroducer")+"%' ";
			}			
			
		}
		return where;
	}

	
	@Override
	public List<ScmDistributors> ListScmDistributors(int offset, int length,HashMap<String, String> map) {
//		String hql = "from ScmDistributors order by fincreaseid desc ";
//		Query query = manager.createQuery(hql);
//		query.setFirstResult(offset);
//		query.setMaxResults(length);
//		@SuppressWarnings("unchecked")
//		List<ScmDistributors> ScmDistributorss = query.getResultList();
//		return ScmDistributorss;
		
		String where = GetWhere(map);
		
		StringBuffer  sql = new StringBuffer();
        sql.append(" SELECT a.FDistributorID,a.FParentID,a.FIncreaseID,ifnull(b.FName,'') as FIntroducer,a.FIntroerType,a.FName,a.FPhone,a.FMobile,a.FAddress,a.FZipCode,a.fsex,a.FBirthday,a.FWeight,a.FHeight,a.FRemark,a.FPicture,a.FRelativeURL,a.FRank,a.FOrder,a.FAddTime,a.FUpdateTime ");
        sql.append(" FROM T_SCM_DISTRIBUTORS a ");  
        sql.append(" left join t_scm_distributors b on a.fparentid=b.fdistributorid  ");                    		
		sql.append(" WHERE 1 = 1 ");
		sql.append(  where);		
		sql.append(" order by a.FIncreaseID desc ");
		sql.append(  "limit "+offset+","+length+"");

		Query query = manager.createNativeQuery(sql.toString());

		List rows = query.getResultList();
		List<ScmDistributors> ScmDistributorss = new ArrayList<ScmDistributors>();
		
		for (Object row : rows) {
			Object[] cells = (Object[]) row;
			
			ScmDistributors item = new ScmDistributors();	
            
            item.setFdistributorid((String)cells[0]);            
            item.setFparentid((String)cells[1]);            
            item.setFincreaseid((Integer)cells[2]);            
            item.setFintroducer((String)cells[3]);            
            item.setFintroertype((Integer)cells[4]);            
            item.setFname((String)cells[5]);            
            item.setFphone((String)cells[6]);            
            item.setFmobile((String)cells[7]);            
            item.setFaddress((String)cells[8]);            
            item.setFzipcode((String)cells[9]);            
            item.setFsex((Integer)cells[10]);            
            item.setFbirthday((java.sql.Timestamp)cells[11]);            
            item.setFweight((Integer)cells[12]);            
            item.setFheight((Integer)cells[13]);            
            item.setFremark((String)cells[14]);            
            item.setFpicture((String)cells[15]);            
            item.setFrelativeurl((String)cells[16]);            
            item.setFrank((Integer)cells[17]);            
            item.setForder((Integer)cells[18]);            
            item.setFaddtime((java.sql.Timestamp)cells[19]);            
            item.setFupdatetime((java.sql.Timestamp)cells[20]);            
          			
			ScmDistributorss.add(item);			
		}
		return ScmDistributorss;
	}

	@Override
	public List<ScmDistributors> ListScmDistributors(String fname) {
		// String hql =
		// " select fdistributorid, fname from ScmDistributors where fname = :fname ";
		String hql = "  from ScmDistributors where fname = :fname ";
		Query query = manager.createQuery(hql);
		query.setParameter("fname", fname);
		@SuppressWarnings("unchecked")
		List<ScmDistributors> ScmDistributorss = query.getResultList();
		return ScmDistributorss;
	}
}
