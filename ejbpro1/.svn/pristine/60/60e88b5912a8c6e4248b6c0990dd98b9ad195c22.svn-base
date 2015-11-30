package com.users.ejb;

import java.util.HashMap;
import java.util.List;
import javax.ejb.Remote;

/**
 * <p>Title: ejb title </p>
 * <p>Description: t_serialnumber_jpush EJB Interface 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-9-21 17:45:34
 */
@Remote
public interface SerialnumberJpushService{

    public void AddSerialnumberJpush(SerialnumberJpush serialnumberJpushInfo) ;
	
	public void UpdateSerialnumberJpush(SerialnumberJpush serialnumberJpushInfo) ;
	
	public void DeleteSerialnumberJpush(String id) ;
	
	public SerialnumberJpush findSerialnumberJpush(String id) ;
	
	public int GetSerialnumberJpushCount(HashMap<String, String> map);
	
	public List<SerialnumberJpush> ListSerialnumberJpush(int offset, int length,HashMap<String, String> map);
}
