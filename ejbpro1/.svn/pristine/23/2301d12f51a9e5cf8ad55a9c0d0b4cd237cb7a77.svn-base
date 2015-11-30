package com.users.ejb;

import java.util.HashMap;
import java.util.List;
import javax.ejb.Remote;

/**
 * <p>Title: ejb title </p>
 * <p>Description: t_serialnumber_detach EJB Interface 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-8-31 14:33:33
 */
@Remote
public interface SerialnumberDetachService{

    public void AddSerialnumberDetach(SerialnumberDetach serialnumberDetachInfo) ;
	
	public void UpdateSerialnumberDetach(SerialnumberDetach serialnumberDetachInfo) ;
	
	public void DeleteSerialnumberDetach(String id) ;
	
	public SerialnumberDetach findSerialnumberDetach(String id) ;
	
	public int GetSerialnumberDetachCount(HashMap<String, String> map);
	
	public List<SerialnumberDetach> ListSerialnumberDetach(int offset, int length,HashMap<String, String> map);
}
