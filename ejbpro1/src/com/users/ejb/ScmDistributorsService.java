package com.users.ejb;

import java.util.HashMap;
import java.util.List;
import javax.ejb.Remote;




/**
 * <p>Title: ejb title </p>
 * <p>Description: t_scm_distributors EJB Interface 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-5-23 13:05:01
 */
@Remote
public interface ScmDistributorsService{

    public void Add(ScmDistributors scmDistributorsInfo);
	
	public void Update(ScmDistributors scmDistributorsInfo);
	
	public void Delete(String id) ;
	
	public ScmDistributors find(String id) ;
	
	public int GetCount(HashMap<String, String> map);
	
	public List<ScmDistributors> ListScmDistributors(int offset, int length,HashMap<String, String> map);
	
	public List<ScmDistributors> ListScmDistributors(String fid);
}
