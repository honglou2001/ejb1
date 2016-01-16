package com.device.ejb;

import java.util.HashMap;
import java.util.List;
import javax.ejb.Remote;

/**
 * <p>Title: ejb title </p>
 * <p>Description: t_serialnumber_emailsmtp EJB Interface 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2016-1-16 13:38:13
 */
@Remote
public interface SerialnumberEmailsmtpService{

    public void AddSerialnumberEmailsmtp(SerialnumberEmailsmtp serialnumberEmailsmtpInfo) ;
	
	public void UpdateSerialnumberEmailsmtp(SerialnumberEmailsmtp serialnumberEmailsmtpInfo) ;
    
    public void UpdateSerialnumberEmailsmtp(SerialnumberEmailsmtp serialnumberEmailsmtpInfo,HashMap<String, String> map) ;
	
	public void DeleteSerialnumberEmailsmtp(String id) ;
	
	public SerialnumberEmailsmtp findSerialnumberEmailsmtp(String id) ;
	
	public int GetSerialnumberEmailsmtpCount(HashMap<String, String> map);
	
	public List<SerialnumberEmailsmtp> ListSerialnumberEmailsmtp(int offset, int length,HashMap<String, String> map);
}
