package com.bridgeLabz.mediatorDesign;

public interface ChatMediator 
{
	public void sendMessage(String msg, User user);
	void addUser(User user);
}
