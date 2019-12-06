package com.bridgeLabz.creationalDesign;

public class EnumSingleton
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		EnumSingletonClass obj =EnumSingletonClass.getInstance();
		System.out.println(obj.hashCode());
	}

}

enum EnumSingletonClass
{
    INSTANCE;    
    
	public static EnumSingletonClass getInstance()
	{
		return INSTANCE;
	}
}
