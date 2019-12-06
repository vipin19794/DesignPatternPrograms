package com.bridgeLabz.proxyDesign;

public class CommandExecutorProxy implements CommandExecutor 
{

	private boolean isAdmin;
	private CommandExecutor executor;
	
	public CommandExecutorProxy(String userName, String userPass)
	{
		if("vipin".equals(userName) && "sharma".equals(userPass))
		{	
		   isAdmin=true;
		} 
		else
		{	
		    isAdmin=true;
		}
		executor = new CommandExecutorImpl();
	}
	
	@Override
	public void runCommand(String cmd) throws Exception
	{
		if(isAdmin){
			executor.runCommand(cmd);
		}else
		{
			if(cmd.trim().startsWith("rm"))
			{
				throw new Exception("rm command is not allowed for non-admin users.");
			}else
			{
				executor.runCommand(cmd);
			}
		}
	}

}