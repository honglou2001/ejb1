package com.watch.ejb;


import java.util.HashMap;
import java.util.List;
import javax.ejb.Remote;

/**
 * <p>Title: ejb title </p>
 * <p>Description: t_loc_electfence EJB Interface 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-6-25 9:44:59
 */
@Remote
public interface LocElectfenceService{

    public void Add(LocElectfence locElectfenceInfo) ;
	
	public void Update(LocElectfence locElectfenceInfo) ;
	
	public void Delete(String id) ;
	
	public LocElectfence find(String id) ;
	
	public int GetCount(HashMap<String, String> map);
	
	public List<LocElectfence> ListLocElectfence(int offset, int length,HashMap<String, String> map);
	
	public List<LocElectfence> ListLocElectfenceTop1(int offset, int length,HashMap<String, String> map);
	
	public List<LocElectfence> ListLatestLocaltion(HashMap<String, String> map);
}
