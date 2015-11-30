package com.users.ejb;

import java.util.HashMap;
import java.util.List;
import javax.ejb.Remote;

/**
 * <p>Title: ejb title </p>
 * <p>Description: t_serialnumber_datauser EJB Interface 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-11-29 12:22:48
 */
@Remote
public interface SerialnumberDatauserService{

    public void AddSerialnumberDatauser(SerialnumberDatauser serialnumberDatauserInfo) ;
	
	public void UpdateSerialnumberDatauser(SerialnumberDatauser serialnumberDatauserInfo) ;
    
    public void UpdateSerialnumberDatauser(SerialnumberDatauser serialnumberDatauserInfo,HashMap<String, String> map) ;
	
	public void DeleteSerialnumberDatauser(String id) ;
	
	public SerialnumberDatauser findSerialnumberDatauser(String id) ;
	
	public int GetSerialnumberDatauserCount(HashMap<String, String> map);
	
	public List<SerialnumberDatauser> ListSerialnumberDatauser(int offset, int length,HashMap<String, String> map);
}
