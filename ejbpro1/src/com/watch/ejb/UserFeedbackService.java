package com.watch.ejb;

import java.util.HashMap;
import java.util.List;
import javax.ejb.Remote;

/**
 * <p>Title: ejb title </p>
 * <p>Description: t_user_feedback EJB Interface 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-7-22 14:55:39
 */
@Remote
public interface UserFeedbackService{

    public void Add(UserFeedback userFeedbackInfo) ;
	
	public void Update(UserFeedback userFeedbackInfo) ;
	
	public void Delete(String id) ;
	
	public UserFeedback find(String id) ;
	
	public int GetCount(HashMap<String, String> map);
	
	public List<UserFeedback> ListUserFeedback(int offset, int length,HashMap<String, String> map);
}
