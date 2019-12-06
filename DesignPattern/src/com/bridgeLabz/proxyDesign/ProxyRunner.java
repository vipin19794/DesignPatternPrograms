package com.bridgeLabz.proxyDesign;
import com.bridgeLabz.utility.*;
public class ProxyRunner
{
	public static void main(String[] args)
	{
		System.out.println("Enter the user name");
		String userName = Util.next();
		System.out.println("Enter the password");
		String userPass = Util.next();
		
		CommandExecutor executor = new CommandExecutorProxy(userName, userPass);
		try
		{
			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf abc.pdf");
		} 
		catch (Exception e) 
		{
			System.out.println("Exception Message::"+e.getMessage());
		}	
	}
}
