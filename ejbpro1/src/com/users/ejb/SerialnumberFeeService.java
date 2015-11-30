package com.users.ejb;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import javax.ejb.Remote;

/**
 * <p>Title: ejb title </p>
 * <p>Description: t_serialnumber_fee EJB Interface 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-8-31 11:08:31
 */
@Remote
public interface SerialnumberFeeService{

    public void AddSerialnumberFee(SerialnumberFee serialnumberFeeInfo) ;
	
	public void UpdateSerialnumberFee(SerialnumberFee serialnumberFeeInfo) ;
	
	public void DeleteSerialnumberFee(String id) ;
	
	public SerialnumberFee findSerialnumberFee(String id) ;
	
	public int GetSerialnumberFeeCount(HashMap<String, String> map);
	
	public BigDecimal GetSerialnumberFeeBalance(HashMap<String, String> map);
	
	public List<SerialnumberFee> ListSerialnumberFee(int offset, int length,HashMap<String, String> map);
}
