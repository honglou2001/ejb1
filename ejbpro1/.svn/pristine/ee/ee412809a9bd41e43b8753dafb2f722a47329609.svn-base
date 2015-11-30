package com.common.ejb;

public class EjbCmdData {

//	http://120.24.176.185:8087/sw/serialnum/serialNumAction?serialnumid=3&action=4&type=1
//	操作指令：发送通讯录是普通拨号还是回拨的全局参数
//	serialnumid 为序列号id，action固定此值，type为0表示普通直接拨号，1表示回拨—-如果是回拨使用，则使用号码本身属性判断同网或者异网；
		
	private static String[] yidong = {"134","135","136","137","138","139","147","150","151","152","157","158","159","182","183","187","188"};
	private static String[] liantong ={"130","131","132","155","156","185","186","145"};
	private static String[] dianxin ={"133","153","180","189"};
//	判断是否同网络
//	移动：134、135、136、137、138、139、147、150、151、152、157、158、159、182、183、187、188。
//	联通：130、131、132、155、156、185、186、145。
//	电信：133、153、180、189。 
	
	
	/**
	 * 检查两个号码是否同网段
	 * @param 号码1
	 * @param 号码2
	 * @return
	 */
	public static boolean checkNetworkSegment(String number1,String number2)
	{
		if(number1==null || number2==null)
		{
			return false;
		}
		
		if(number1.length()<10 || number2.length()<10 )
		{
			return false;
		}

		String num1Begin = number1.substring(0, 3);
		String num2Begin = number2.substring(0, 3);
		
		boolean[] bNum1 = {false,false,false};
		bNum1[0] = checkYidong(num1Begin);
		bNum1[1] = checkLiantong(num1Begin);
		bNum1[2] = checkDianxin(num1Begin);
		
		boolean[] bNum2 = {false,false,false};
		bNum2[0] = checkYidong(num2Begin);
		bNum2[1] = checkLiantong(num2Begin);
		bNum2[2] = checkDianxin(num2Begin);
		
		boolean bSame = true;
		
		for(int i=0;i<3;i++)
		{
			if(bNum1[i]!=bNum2[i])
			{
				bSame = false;
			}
		}
					
		return bSame;
	}
	
	private static boolean checkYidong(String numBegin)
	{
		for(int i=0;i<yidong.length;i++)
		{
			if(numBegin.equals(yidong[i]))
			{
				return true;
			}
		}
		return false;
	}
	private static boolean checkLiantong(String numBegin)
	{
		for(int i=0;i<dianxin.length;i++)
		{
			if(numBegin.equals(dianxin[i]))
			{
				return true;
			}
		}
		return false;
	}
	private static boolean checkDianxin(String numBegin)
	{
		for(int i=0;i<liantong.length;i++)
		{
			if(numBegin.equals(liantong[i]))
			{
				return true;
			}
		}
		return false;
	}
	public static String getCmdNameByCmd(String cmd)
	{
		if(cmd.equals("7103"))
		{
			return "下发发送通讯录";
		}
		else if(cmd.equals("7200"))
		{
			return "下发远程关机";
		}
		else if(cmd.equals("7106"))
		{
			return "下发查找手机";
		}
		else if(cmd.equals("2002"))
		{
			return "下发设置静默时间";
		}
		else if(cmd.equals("7104"))
		{
			return "下发全局拨打模式";
		}
		else if(cmd.equals("7108"))
		{
			return "下发小红花数";
		}
		else if(cmd.equals("7109"))
		{
			return "下发短信";
		}
		else if(cmd.equals("4102"))
		{
			return "下发定位模式及频率";
		}
		else if(cmd.equals("0001"))
		{
			return "下发心跳包";
		}		
		else if(cmd.equals("9991"))
		{
			return "下发同步时间";
		}
		else if(cmd.equals("9982"))
		{
			return "上传手动定位";
		}	
		else if(cmd.equals("4130"))
		{
			return "上传监听";
		}	
		else if(cmd.equals("7101"))
		{
			return "上传计步器";
		}	
		else if(cmd.equals("7200"))
		{
			return "上传设备下线";
		}	
		else if(cmd.equals("9955"))
		{
			return "上传位置信息";
		}	
		else if(cmd.equals("7102"))
		{
			return "上传脱落";
		}	
		else if(cmd.equals("7105"))
		{
			return "上传通知服务器回拨";
		}	
		else if(cmd.equals("7111"))
		{
			return "设置服务器IP及端口";
		}
		return "";
	}
}
