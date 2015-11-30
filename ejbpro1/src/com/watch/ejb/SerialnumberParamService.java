package com.watch.ejb;


import java.util.HashMap;
import java.util.List;
import javax.ejb.Remote;

/**
 * <p>Title: ejb title </p>
 * <p>Description: t_serialnumber_param EJB Interface 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-8-19 9:17:27
 */
@Remote
public interface SerialnumberParamService{

    public void AddSerialnumberParam(SerialnumberParam serialnumberParamInfo) ;
	
	public void UpdateSerialnumberParam(SerialnumberParam serialnumberParamInfo) ;
	
	public void DeleteSerialnumberParam(String id) ;
	
	public SerialnumberParam findSerialnumberParam(String id) ;
	
	public int GetSerialnumberParamCount(HashMap<String, String> map);
	
	public List<SerialnumberParam> ListSerialnumberParam(int offset, int length,HashMap<String, String> map);
}
