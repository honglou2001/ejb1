package com.users.ejb;

import java.util.HashMap;
import java.util.List;
import javax.ejb.Remote;

/**
 * <p>Title: ejb title </p>
 * <p>Description: t_serialnumber_weight EJB Interface 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-11-30 22:42:43
 */
@Remote
public interface SerialnumberWeightService{

    public void AddSerialnumberWeight(SerialnumberWeight serialnumberWeightInfo) ;
	
	public void UpdateSerialnumberWeight(SerialnumberWeight serialnumberWeightInfo) ;
    
    public void UpdateSerialnumberWeight(SerialnumberWeight serialnumberWeightInfo,HashMap<String, String> map) ;
	
	public void DeleteSerialnumberWeight(String id) ;
	
	public SerialnumberWeight findSerialnumberWeight(String id) ;
	
	public int GetSerialnumberWeightCount(HashMap<String, String> map);
	
	public List<SerialnumberWeight> ListSerialnumberWeight(int offset, int length,HashMap<String, String> map);
}
