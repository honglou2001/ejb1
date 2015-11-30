package com.watch.ejb;


import java.util.HashMap;
import java.util.List;
import javax.ejb.Remote;

/**
 * <p>Title: ejb title </p>
 * <p>Description: t_friend_relation EJB Interface 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-7-22 16:04:36
 */
@Remote
public interface FriendRelationService{

    public void Add(FriendRelation friendRelationInfo) ;
	
	public void Update(FriendRelation friendRelationInfo) ;
	
	public void Delete(String id) ;
	
	public FriendRelation find(String id) ;
	
	public int GetCount(HashMap<String, String> map);
	
	public List<FriendRelation> ListFriendRelation(int offset, int length,HashMap<String, String> map);
}
