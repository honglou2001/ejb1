package com.common.ejb;

public class EJBTools {

	//检查是否为数字
	public static Boolean CheckIsNumber(String str)
	{
		Boolean boolResult = str.matches("^[1-9]\\d*$");	 	
		
		if(boolResult==true)
		{
			return boolResult;
		}
		
		boolResult = str.matches("^[1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*$");	 	    
	    return boolResult;
	}
}
