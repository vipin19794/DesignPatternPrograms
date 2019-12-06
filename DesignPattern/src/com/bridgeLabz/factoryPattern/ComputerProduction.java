package com.bridgeLabz.factoryPattern;

public class ComputerProduction
{

	
		public static Computer produser(String type, String name, String ram, String hdd)
		{
			if(type.equalsIgnoreCase("pc"))
			{
				return new PersonalComputer(name,ram,hdd);
			}
			
			else if(type.equalsIgnoreCase("server"))
			{
				return new Server( name,ram,hdd);
			}
			return null;
		}

	

}
