package com.watch.ejb;


import java.util.HashMap;
import java.util.List;
import javax.ejb.Remote;

/**
 * <p>Title: ejb title </p>
 * <p>Description: t_serialnumber_emailtemplate EJB Interface 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-12-20 11:55:42
 */
@Remote
public interface SerialnumberEmailtemplateService{

    public void AddSerialnumberEmailtemplate(SerialnumberEmailtemplate serialnumberEmailtemplateInfo) ;
	
	public void UpdateSerialnumberEmailtemplate(SerialnumberEmailtemplate serialnumberEmailtemplateInfo) ;
    
    public void UpdateSerialnumberEmailtemplate(SerialnumberEmailtemplate serialnumberEmailtemplateInfo,HashMap<String, String> map) ;
	
	public void DeleteSerialnumberEmailtemplate(String id) ;
	
	public SerialnumberEmailtemplate findSerialnumberEmailtemplate(String id) ;
	
	public int GetSerialnumberEmailtemplateCount(HashMap<String, String> map);
	
	public List<SerialnumberEmailtemplate> ListSerialnumberEmailtemplate(int offset, int length,HashMap<String, String> map);
}
