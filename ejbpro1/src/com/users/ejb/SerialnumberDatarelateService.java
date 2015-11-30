package com.users.ejb;

import java.util.HashMap;
import java.util.List;
import javax.ejb.Remote;

/**
 * <p>Title: ejb title </p>
 * <p>Description: t_serialnumber_datarelate EJB Interface 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-11-29 15:59:45
 */
@Remote
public interface SerialnumberDatarelateService{

    public void AddSerialnumberDatarelate(SerialnumberDatarelate serialnumberDatarelateInfo) ;
	
	public void UpdateSerialnumberDatarelate(SerialnumberDatarelate serialnumberDatarelateInfo) ;
    
    public void UpdateSerialnumberDatarelate(SerialnumberDatarelate serialnumberDatarelateInfo,HashMap<String, String> map) ;
	
	public void DeleteSerialnumberDatarelate(String id) ;
	
	public SerialnumberDatarelate findSerialnumberDatarelate(String id) ;
	
	public int GetSerialnumberDatarelateCount(HashMap<String, String> map);
	
	public List<SerialnumberDatarelate> ListSerialnumberDatarelate(int offset, int length,HashMap<String, String> map);
}
