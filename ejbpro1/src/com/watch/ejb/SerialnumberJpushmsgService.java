package com.watch.ejb;


import java.util.HashMap;
import java.util.List;
import javax.ejb.Remote;

/**
 * <p>Title: ejb title </p>
 * <p>Description: t_serialnumber_jpushmsg EJB Interface 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-12-12 17:16:45
 */
@Remote
public interface SerialnumberJpushmsgService{

    public void AddSerialnumberJpushmsg(SerialnumberJpushmsg serialnumberJpushmsgInfo) ;
	
	public void UpdateSerialnumberJpushmsg(SerialnumberJpushmsg serialnumberJpushmsgInfo) ;
    
    public void UpdateSerialnumberJpushmsg(SerialnumberJpushmsg serialnumberJpushmsgInfo,HashMap<String, String> map) ;
	
	public void DeleteSerialnumberJpushmsg(String id) ;
	
	public SerialnumberJpushmsg findSerialnumberJpushmsg(String id) ;
	
	public int GetSerialnumberJpushmsgCount(HashMap<String, String> map);
	
	public List<SerialnumberJpushmsg> ListSerialnumberJpushmsg(int offset, int length,HashMap<String, String> map);
}
