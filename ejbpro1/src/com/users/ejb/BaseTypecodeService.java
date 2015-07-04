package com.users.ejb;

import java.util.HashMap;
import java.util.List;
import javax.ejb.Remote;

/**
 * <p>Title: ejb title </p>
 * <p>Description: t_base_typecode EJB Interface 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-6-5 14:43:01
 */
@Remote
public interface BaseTypecodeService{

    public void Add(BaseTypecode baseTypecodeInfo) ;
	
	public void Update(BaseTypecode baseTypecodeInfo) ;
	
	public void Delete(String id) ;
	
	public BaseTypecode find(String id) ;
	
	public int GetCount(HashMap<String, String> map);
	
	public List<BaseTypecode> ListBaseTypecode(int offset, int length,HashMap<String, String> map);
}
