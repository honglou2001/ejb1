package com.example.cli1;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import com.example.ejb.Hello;


public class cliclass {
	
	public String testEJB() throws NamingException{
		  Context weblogicContext = getInitialConnection();
		  Hello h1 = (Hello)weblogicContext.lookup("HelloBean/remote");
		  return h1.hello("EJB");
				  
		 }
	
	private Context getInitialConnection() {
		  final String INIT_FACTORY = "org.jnp.interfaces.NamingContextFactory";
		  final String SERVER_URL = "jnp://127.0.0.1:1099";
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
