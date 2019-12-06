package com.bridgeLabz.factoryPattern;

public class Runner 
{
    public static void main(String args[])
    {
    	Computer pc = ComputerProduction.produser("pc","Apple","8","500");
    	Computer server = ComputerProduction.produser("server","mac","64","2500");
    	System.out.println(pc);
    	System.out.println(server);
    }
}
