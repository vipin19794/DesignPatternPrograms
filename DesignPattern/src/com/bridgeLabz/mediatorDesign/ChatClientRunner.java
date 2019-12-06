package com.bridgeLabz.mediatorDesign;

public class ChatClientRunner
{
	public static void main(String[] args) 
	{
		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl(mediator, "vipin");
		User user2 = new UserImpl(mediator, "Manoj");
		User user3 = new UserImpl(mediator, "Shubhas");
		User user4 = new UserImpl(mediator, "nanda");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		
		user1.send("hello friends");
		
	}
}
