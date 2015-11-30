package com.watch.ejb;

import java.util.HashMap;
import java.util.List;
import javax.ejb.Remote;

/**
 * <p>Title: ejb title </p>
 * <p>Description: t_serialnumber_feepacket EJB Interface 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-11-7 14:16:40
 */
@Remote
public interface SerialnumberFeepacketService{

    public void AddSerialnumberFeepacket(SerialnumberFeepacket serialnumberFeepacketInfo) ;
	
	public void UpdateSerialnumberFeepacket(SerialnumberFeepacket serialnumberFeepacketInfo) ;
	
	public void DeleteSerialnumberFeepacket(String id) ;
	
	public SerialnumberFeepacket findSerialnumberFeepacket(String id) ;
	
	public int GetSerialnumberFeepacketCount(HashMap<String, String> map);
	
	public List<SerialnumberFeepacket> ListSerialnumberFeepacket(int offset, int length,HashMap<String, String> map);
}
