package com.example.ejb;


import javax.ejb.Remote;  
import javax.ejb.Stateless;  


@Stateless(mappedName="Hello")
@Remote
public class HelloBean implements Hello {

	@Override
	public String hello(String name) {
		// TODO Auto-generated method stub
		return name+"����ã�����ʱ����"+ new java.util.Date();
	}

}
