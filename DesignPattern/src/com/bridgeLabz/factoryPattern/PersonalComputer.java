package com.bridgeLabz.factoryPattern;

public class PersonalComputer extends Computer
{   
	private String name;
	private String ram;
	private String hdd;
	

	public PersonalComputer(String name, String ram, String hdd)
	{
		this.name = name;
		this.ram = ram;
		this.hdd = hdd;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getRam()
	{
		return ram;
	}
	
	public String getHdd()
	{
		return hdd;
	}

}
