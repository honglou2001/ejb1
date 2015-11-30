package com.watch.ejb;


import java.util.HashMap;
import java.util.List;
import javax.ejb.Remote;

/**
 * <p>Title: ejb title </p>
 * <p>Description: t_reward_list EJB Interface 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-8-8 17:35:25
 */
@Remote
public interface RewardListService{

    public void AddRewardList(RewardList rewardListInfo) ;
	
	public void UpdateRewardList(RewardList rewardListInfo) ;
	
	public void DeleteRewardList(String id) ;
	
	public RewardList findRewardList(String id) ;
	
	public int GetRewardListCount(HashMap<String, String> map);
	
	public List<RewardList> ListRewardList(int offset, int length,HashMap<String, String> map);
}
