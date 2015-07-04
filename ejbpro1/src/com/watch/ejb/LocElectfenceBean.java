package com.watch.ejb;

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
 * Description: t_loc_electfence EJB Interface Bean 处理类
 * </p>
 * 
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间 2015-6-25 9:51:03
 */
@Stateless(mappedName = "LocElectfenceService")
public class LocElectfenceBean implements LocElectfenceService {

	@PersistenceContext(unitName = "ejbpro1")
	private EntityManager manager;

	@Override
	public void Add(LocElectfence locElectfenceInfo) {
		locElectfenceInfo.setFlocfenid(UUID.randomUUID().toString());
		manager.persist(locElectfenceInfo);
	}

	@Override
	public void Update(LocElectfence locElectfenceInfo) {
		manager.merge(locElectfenceInfo);
	}

	@Override
	public void Delete(String id) {
		LocElectfence locElectfenceInfo = manager.find(LocElectfence.class, id);

		manager.remove(locElectfenceInfo);
	}

	@Override
	public LocElectfence find(String id) {
		LocElectfence locElectfenceInfo = manager.find(LocElectfence.class, id);
		return locElectfenceInfo;
	}

	private String GetWhere(HashMap<String, String> map) {
		String where = "";

		// queryMap.put("serialNumber", serialNumber);
		// queryMap.put("areaNumber", areaNumber);
		// queryMap.put("areaName", areaName);

		if (map != null && map.size() > 0) {
			if (map.containsKey("serialNumber")
					&& map.get("serialNumber") != null
					&& !map.get("serialNumber").toString().equals("")) {
				where += " and a.FSerialnumber = '" + map.get("serialNumber")
						+ "' ";
			}
			if (map.containsKey("areaNumber") && map.get("areaNumber") != null
					&& !map.get("areaNumber").toString().equals("")) {
				where += " and b.id = " + map.get("areaNumber") + " ";
			}
			if (map.containsKey("areaName") && map.get("areaName") != null
					&& !map.get("areaName").toString().equals("")) {
				where += " and b.name like '%" + map.get("areaName") + "%' ";
			}
			// a.FUpdateTime>='2015-02-12 22:12:23'  and  FUpdateTime<='2015-08-12 22:12:23'
			 
			if (map.containsKey("startTime") && map.get("startTime") != null
					&& !map.get("startTime").toString().equals("")) {
				where += " and a.FUpdateTime >= '" + map.get("startTime") + "' ";
			}
			if (map.containsKey("endTime") && map.get("endTime") != null
					&& !map.get("endTime").toString().equals("")) {
				where += " and a.FUpdateTime <= '" + map.get("endTime") + "' ";
			}
			// if(map.containsKey("FSerialnumber") &&
			// map.get("FSerialnumber")!=null &&
			// !map.get("FSerialnumber").toString().equals(""))
			// {
			// where +=
			// " and a.FSerialnumber like '%"+map.get("FSerialnumber")+"%' ";
			// }
			// if(map.containsKey("FDataStatus") && map.get("FDataStatus")!=null
			// && !map.get("FDataStatus").toString().equals(""))
			// {
			// where +=
			// " and a.FDataStatus like '%"+map.get("FDataStatus")+"%' ";
			// }
			// if(map.containsKey("FFieldStatus") &&
			// map.get("FFieldStatus")!=null &&
			// !map.get("FFieldStatus").toString().equals(""))
			// {
			// where +=
			// " and a.FFieldStatus like '%"+map.get("FFieldStatus")+"%' ";
			// }
			// if(map.containsKey("FEltLongitude") &&
			// map.get("FEltLongitude")!=null &&
			// !map.get("FEltLongitude").toString().equals(""))
			// {
			// where +=
			// " and a.FEltLongitude like '%"+map.get("FEltLongitude")+"%' ";
			// }
			// if(map.containsKey("FEltLatitude") &&
			// map.get("FEltLatitude")!=null &&
			// !map.get("FEltLatitude").toString().equals(""))
			// {
			// where +=
			// " and a.FEltLatitude like '%"+map.get("FEltLatitude")+"%' ";
			// }
			// if(map.containsKey("FEltScope") && map.get("FEltScope")!=null &&
			// !map.get("FEltScope").toString().equals(""))
			// {
			// where += " and a.FEltScope like '%"+map.get("FEltScope")+"%' ";
			// }
			// if(map.containsKey("FEltAddress") && map.get("FEltAddress")!=null
			// && !map.get("FEltAddress").toString().equals(""))
			// {
			// where +=
			// " and a.FEltAddress like '%"+map.get("FEltAddress")+"%' ";
			// }
			// if(map.containsKey("FLongitude") && map.get("FLongitude")!=null
			// && !map.get("FLongitude").toString().equals(""))
			// {
			// where += " and a.FLongitude like '%"+map.get("FLongitude")+"%' ";
			// }
			// if(map.containsKey("FLatitude") && map.get("FLatitude")!=null &&
			// !map.get("FLatitude").toString().equals(""))
			// {
			// where += " and a.FLatitude like '%"+map.get("FLatitude")+"%' ";
			// }
			// if(map.containsKey("FAddress") && map.get("FAddress")!=null &&
			// !map.get("FAddress").toString().equals(""))
			// {
			// where += " and a.FAddress like '%"+map.get("FAddress")+"%' ";
			// }
			// if(map.containsKey("FDistance") && map.get("FDistance")!=null &&
			// !map.get("FDistance").toString().equals(""))
			// {
			// where += " and a.FDistance like '%"+map.get("FDistance")+"%' ";
			// }
			// if(map.containsKey("FAddTime") && map.get("FAddTime")!=null &&
			// !map.get("FAddTime").toString().equals(""))
			// {
			// where += " and a.FAddTime like '%"+map.get("FAddTime")+"%' ";
			// }
			// if(map.containsKey("FUpdateTime") && map.get("FUpdateTime")!=null
			// && !map.get("FUpdateTime").toString().equals(""))
			// {
			// where +=
			// " and a.FUpdateTime like '%"+map.get("FUpdateTime")+"%' ";
			// }
			// if(map.containsKey("FRemark") && map.get("FRemark")!=null &&
			// !map.get("FRemark").toString().equals(""))
			// {
			// where += " and a.FRemark like '%"+map.get("FRemark")+"%' ";
			// }
			//
		}
		return where;
	}

	@Override
	public int GetCount(HashMap<String, String> map) {

//		String where = GetWhere(map);

		String hql = "select count(*) from LocElectfence";
		Query query = manager.createQuery(hql);
		int total = (new Integer(query.getSingleResult().toString()));
		return total;
	}

//	private int GetSerialAreaCount(String serialnumber) {
//
//		String sql = "select count(*) from electfence where serialnumber='"
//				+ serialnumber + "'";
//		Query query = manager.createNativeQuery(sql);
//		int total = (new Integer(query.getSingleResult().toString()));
//		return total;
//	}

	private List<Electfence> GetSerialAreaList(HashMap<String, String> map) {

		//String where = "and a.serialnumber='" + serialnumber + "'";
		
		String where = "";

		if (map.containsKey("serialNumber") && map.get("serialNumber") != null
				&& !map.get("serialNumber").toString().equals("")) {
			where += " and a.serialnumber = '" + map.get("serialNumber")
					+ "' ";
		}
		if (map.containsKey("areaNumber") && map.get("areaNumber") != null
				&& !map.get("areaNumber").toString().equals("")) {
			where += " and a.id = " + map.get("areaNumber") + " ";
		}
		
		StringBuffer sql = new StringBuffer();

		sql.append(" SELECT a.id,a.serialnumber,a.areanum,a.name,a.locationbd,a.locationgd,a.model,a.scope,a.createtime,a.updatetime,a.status ");
		sql.append(" FROM ELECTFENCE a ");
		sql.append(" WHERE 1 = 1 ");
		sql.append(where);

		Query query = manager.createNativeQuery(sql.toString());

		List rows = query.getResultList();
		List<Electfence> LocElectfences = new ArrayList<Electfence>();

		for (Object row : rows) {
			Object[] cells = (Object[]) row;
			Electfence item = new Electfence();
			item.setAreanum((Integer) cells[0]);
			LocElectfences.add(item);
		}

		return LocElectfences;
	}


	private List<LocElectfence> getTop1ByElectfence(HashMap<String, String> map) {

		String where = "";

		if (map.containsKey("serialNumber") && map.get("serialNumber") != null
				&& !map.get("serialNumber").toString().equals("")) {
			where += " and a.FSerialnumber = '" + map.get("serialNumber")
					+ "' ";
		}
		if (map.containsKey("areaNumber") && map.get("areaNumber") != null
				&& !map.get("areaNumber").toString().equals("")) {
			where += " and b.id = " + map.get("areaNumber") + " ";
		}

		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT a.FLocFenID,a.FIncreaseID,a.FEltFenceID,a.FSerialnumber,a.FDataStatus,a.FFieldStatus,a.FEltLongitude,a.FEltLatitude,a.FEltScope,a.FEltAddress,a.FLongitude,a.FLatitude,a.FAddress,a.FDistance,a.FAddTime,a.FUpdateTime,a.FRemark ");
		sql.append(" ,a.FReadCount,b.id,b.name ");
//		sql.append(" ,IFNULL(b.areanum,0),IFNULL(b.name,'') ");

		sql.append(" FROM T_LOC_ELECTFENCE a inner join electfence b on a.FEltFenceID = b.id ");
		sql.append(" WHERE 1 = 1 ");

		sql.append(where);
		sql.append(" order by a.FIncreaseID desc ");
		sql.append("limit 0,1");

		Query query = manager.createNativeQuery(sql.toString());

		List rows = query.getResultList();
		List<LocElectfence> LocElectfences = new ArrayList<LocElectfence>();

		for (Object row : rows) {
			Object[] cells = (Object[]) row;

			LocElectfence item = new LocElectfence();

			item.setFlocfenid((String) cells[0]);
			item.setFincreaseid((Integer) cells[1]);
			item.setFeltfenceid((Integer) cells[2]);
			item.setFserialnumber((String) cells[3]);
			item.setFdatastatus((Integer) cells[4]);
			item.setFfieldstatus((Integer) cells[5]);
			item.setFeltlongitude((String) cells[6]);
			item.setFeltlatitude((String) cells[7]);
			item.setFeltscope((Double) cells[8]);
			item.setFeltaddress((String) cells[9]);
			item.setFlongitude((String) cells[10]);
			item.setFlatitude((String) cells[11]);
			item.setFaddress((String) cells[12]);
			item.setFdistance((Double) cells[13]);
			item.setFaddtime((java.sql.Timestamp) cells[14]);
			item.setFupdatetime((java.sql.Timestamp) cells[15]);
			item.setFremark((String) cells[16]);
			
//			if(cells[17]!=null && !cells[17].toString().equals(""))
//			{
//				
//			}
			item.setFreadCount((Integer) cells[17]);
			item.setFareanumber((Integer) cells[18]);
			item.setFareaname((String) cells[19]);

			LocElectfences.add(item);
			
			
			//更新读写次数
			String updateSql = "update T_LOC_ELECTFENCE set FReadCount=FReadCount+1  WHERE  FLocFenID= :FLocFenID ";
			Query updateQuery = manager.createNativeQuery(updateSql);
			updateQuery.setParameter("FLocFenID", item.getFlocfenid());
			updateQuery.executeUpdate();
			
		}
		return LocElectfences;
	}

	@Override
	public List<LocElectfence> ListLocElectfenceTop1(int offset, int length,
			HashMap<String, String> map) {

		List<LocElectfence> locEltReturn = new ArrayList<LocElectfence>();
		if(map == null || map.size()==0)
		{
			return locEltReturn;
		}
		
		if(map.get("serialNumber") ==null || map.get("serialNumber").toString().equals(""))
		{
			return locEltReturn;
		}
		
		List<Electfence> elct = this.GetSerialAreaList(map);

		
		if (elct != null && elct.size() > 0) {
			for (int i = 0; i < elct.size(); i++) {
				
				Electfence item = elct.get(i);

				HashMap<String, String> map1 = new HashMap<String, String>();
				map1.put("serialNumber", map.get("serialNumber"));
				map1.put("areaNumber", item.getAreanum().toString());

				List<LocElectfence> locelts = this.getTop1ByElectfence(map1);
				if (locelts != null && locelts.size() > 0) {
					locEltReturn.add(locelts.get(0));
				}

			}
		}

		return locEltReturn;

	}

	@Override
	public List<LocElectfence> ListLocElectfence(int offset, int length,
			HashMap<String, String> map) {

		String where = GetWhere(map);
//		int count = 1;
//
//		if (map != null && map.size() > 0) {
//			if (map.containsKey("serialNumber")
//					&& map.get("serialNumber") != null
//					&& !map.get("serialNumber").toString().equals("")) {
//				count = GetSerialAreaCount(map.get("serialNumber"));
//			}
//		}

		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT a.FLocFenID,a.FIncreaseID,a.FEltFenceID,a.FSerialnumber,a.FDataStatus,a.FFieldStatus,a.FEltLongitude,a.FEltLatitude,a.FEltScope,a.FEltAddress,a.FLongitude,a.FLatitude,a.FAddress,a.FDistance,a.FAddTime,a.FUpdateTime,a.FRemark ");
//		sql.append(" ,IFNULL(b.areanum,0),IFNULL(b.name,'') ");
		sql.append(" ,b.id,b.name ");
		sql.append(" FROM T_LOC_ELECTFENCE a left join electfence b on a.FEltFenceID = b.id ");
		

//		sql.append(" FROM T_LOC_ELECTFENCE a  ");
		
		sql.append(" WHERE 1 = 1 ");

		sql.append(where);
		sql.append(" order by a.FIncreaseID desc ");
		sql.append("limit "+offset+"," + length + "");

		Query query = manager.createNativeQuery(sql.toString());

		List rows = query.getResultList();
		List<LocElectfence> LocElectfences = new ArrayList<LocElectfence>();

		for (Object row : rows) {
			Object[] cells = (Object[]) row;

			LocElectfence item = new LocElectfence();

			item.setFlocfenid((String) cells[0]);
			item.setFincreaseid((Integer) cells[1]);
			item.setFeltfenceid((Integer) cells[2]);
			item.setFserialnumber((String) cells[3]);
			item.setFdatastatus((Integer) cells[4]);
			item.setFfieldstatus((Integer) cells[5]);
			item.setFeltlongitude((String) cells[6]);
			item.setFeltlatitude((String) cells[7]);
			item.setFeltscope((Double) cells[8]);
			item.setFeltaddress((String) cells[9]);
			item.setFlongitude((String) cells[10]);
			item.setFlatitude((String) cells[11]);
			item.setFaddress((String) cells[12]);
			item.setFdistance((Double) cells[13]);
			item.setFaddtime((java.sql.Timestamp) cells[14]);
			item.setFupdatetime((java.sql.Timestamp) cells[15]);
			item.setFremark((String) cells[16]);			
			item.setFareanumber((Integer) cells[17]);
			item.setFareaname((String) cells[18]);

			LocElectfences.add(item);
		}
		return LocElectfences;
	}
}