package com.users.ejb;

import java.util.HashMap;
import java.util.List;

import javax.ejb.Remote;

/**
 * <p>Title: ejb title </p>
 * <p>Description: t_scm_salesdata EJB Interface 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-5-29 13:55:03
 */
@Remote
public interface ScmSalesdataService{

    public void Add(ScmSalesdata scmSalesdataInfo) ;
	
	public void Update(ScmSalesdata scmSalesdataInfo) ;
	
	public void Delete(String id) ;
	
	public ScmSalesdata find(String id) ;
	
	public int GetCount(HashMap<String, String> map);
	
	public List<ScmSalesdata> ListScmSalesdata(int offset, int length,HashMap<String, String> map);
}
