package com.example.ejb;


import javax.ejb.Local;
import javax.ejb.Remote;  
import javax.ejb.Stateless;  
import javax.naming.InitialContext;
import javax.naming.NamingException;



@Stateless(mappedName="Hello")
@Remote
public class HelloBean implements Hello {

	@Override
	public String hello(String name) throws NamingException {

		String addstring = "OK";
		try {
			  addstring = "try1";
			  InitialContext ctx = new InitialContext();				  
			  UserServiceL service = (UserServiceL)ctx.lookup("UserServiceBeanL/local");		  		  
			  addstring =service.AddUser();		
			  
		  } catch (NamingException ne) {
			  addstring = "NamingException";
			   ne.printStackTrace();
			 }
		
		return name+"，你好，现在时间是"+ new java.util.Date()+addstring;
	}

}
