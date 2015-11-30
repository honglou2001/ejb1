package com.users.ejb;

import java.util.HashMap;
import java.util.List;
import javax.ejb.Remote;

/**
 * <p>Title: ejb title </p>
 * <p>Description: t_serialnumber_sport EJB Interface 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-11-9 9:56:51
 */
@Remote
public interface SerialnumberSportService{

    public void AddSerialnumberSport(SerialnumberSport serialnumberSportInfo) ;
	
	public void UpdateSerialnumberSport(SerialnumberSport serialnumberSportInfo) ;
	
	public void DeleteSerialnumberSport(String id) ;
	
	public SerialnumberSport findSerialnumberSport(String id) ;
	
	public int GetSerialnumberSportCount(HashMap<String, String> map);
	
	public List<SerialnumberSport> ListSerialnumberSport(int offset, int length,HashMap<String, String> map);
}
