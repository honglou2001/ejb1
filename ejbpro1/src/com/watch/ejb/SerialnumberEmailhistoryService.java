package com.watch.ejb;


import java.util.HashMap;
import java.util.List;
import javax.ejb.Remote;

/**
 * <p>Title: ejb title </p>
 * <p>Description: t_serialnumber_emailhistory EJB Interface 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-12-20 11:58:57
 */
@Remote
public interface SerialnumberEmailhistoryService{

    public void AddSerialnumberEmailhistory(SerialnumberEmailhistory serialnumberEmailhistoryInfo) ;
	
	public void UpdateSerialnumberEmailhistory(SerialnumberEmailhistory serialnumberEmailhistoryInfo) ;
    
    public void UpdateSerialnumberEmailhistory(SerialnumberEmailhistory serialnumberEmailhistoryInfo,HashMap<String, String> map) ;
	
	public void DeleteSerialnumberEmailhistory(String id) ;
	
	public SerialnumberEmailhistory findSerialnumberEmailhistory(String id) ;
	
	public int GetSerialnumberEmailhistoryCount(HashMap<String, String> map);
	
	public List<SerialnumberEmailhistory> ListSerialnumberEmailhistory(int offset, int length,HashMap<String, String> map);
}
