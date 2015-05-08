package com.example.cli1;

import java.util.List;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import com.example.ejb.Hello;

import com.example.ejb.UserServiceR;
import com.users.ejb.User;
import com.users.ejb.UserService;


public class cliclass {
	
	public String testEJB() throws NamingException{
		
		  Context weblogicContext = getInitialConnection();
		  Hello h1 = (Hello)weblogicContext.lookup("HelloBean/remote");
		  
		  UserServiceR service = (UserServiceR)weblogicContext.lookup("UserServiceBeanR/remote");
		  service.AddUser();		
		  
		  UserService serviceList = (UserService)weblogicContext.lookup("UserServiceBean/remote");
		  List<User> users = serviceList.ListUser();	
		 		  
		  System.err.println("users size()：" + users.size());
		  
		  return h1.hello("EJB");
				  
		 }
	
	private Context getInitialConnection() {
		  final String INIT_FACTORY = "org.jnp.interfaces.NamingContextFactory";
		  final String SERVER_URL = "jnp://localhost:1099";
		  Context ctx = null;
		  try {
		   Properties props = new Properties();
		   
		   props.put(Context.INITIAL_CONTEXT_FACTORY, INIT_FACTORY);
		   props.put(Context.PROVIDER_URL, SERVER_URL);
		   ctx = new InitialContext(props);
		  } catch (NamingException ne) {
		   // TODO: handle exception
		   System.err.println("不能连接WebLogic Server在：" + SERVER_URL);
		   ne.printStackTrace();
		  }
		  return ctx;
		 }


}
