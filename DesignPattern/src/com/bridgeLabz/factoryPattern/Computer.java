package com.bridgeLabz.factoryPattern;

public abstract class Computer
{
	
	public abstract String getName();
	public abstract String getRam();
	public abstract String getHdd();
	@Override
	public String toString() {
		return "Computer [getName()=" + getName() + ", getRam()=" + getRam() + ", getHdd()=" + getHdd() + "]";
	}
     
}  
