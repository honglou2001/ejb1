package com.watch.ejb;

import java.util.HashMap;
import java.util.List;
import javax.ejb.Remote;

/**
 * <p>Title: ejb title </p>
 * <p>Description: t_friend_contact EJB Interface 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-8-19 9:41:23
 */
@Remote
public interface FriendContactService{

    public void AddFriendContact(FriendContact friendContactInfo) ;
	
	public void UpdateFriendContact(FriendContact friendContactInfo) ;
	
	public void DeleteFriendContact(String id) ;
	
	public FriendContact findFriendContact(String id) ;
	
	public int GetFriendContactCount(HashMap<String, String> map);
	
	public List<FriendContact> ListFriendContact(int offset, int length,HashMap<String, String> map);
}
