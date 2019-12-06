package com.bridgeLabz.adapterDesign;

public class AdapterRunner 
{

	public static void main(String[] args) 
	{
		
		testClassAdapter();
		System.out.println();
		testObjectAdapter();
	}

	private static void testClassAdapter()
	{
		SocketAdapter sockAdapter = new SocketClassAdapterImpl();
		Volt v3 = getVolt(sockAdapter,3);
		Volt v12 = getVolt(sockAdapter,12);
		Volt v120 = getVolt(sockAdapter,120);
		System.out.println("Using class............");
		System.out.println("v3 volts Adapter="+v3.getVolts());
		System.out.println("v12 volts Adapter="+v12.getVolts());
		System.out.println("v120 volts Adapter="+v120.getVolts());
	}
	
	private static void testObjectAdapter()
	{
		SocketAdapter sockAdapter = new SocketObjectAdapterImpl();
		Volt v3 = getVolt(sockAdapter,3);
		Volt v12 = getVolt(sockAdapter,12);
		Volt v120 = getVolt(sockAdapter,120);
		System.out.println("using Object........");
		System.out.println("v3 volts Adapter="+v3.getVolts());
		System.out.println("v12 volts Adapter="+v12.getVolts());
		System.out.println("v120 volts Adapter="+v120.getVolts());
	}
	
	private static Volt getVolt(SocketAdapter sockAdapter, int i) 
	{
		
		if(i == 3)
		{
			return sockAdapter.get3Volt();
		}
		
		if(i == 12)
		{
			return sockAdapter.get12Volt();
		}
		
		if(i == 120)
		{
			return sockAdapter.get120Volt();
		}
		
		return null;	
	}
}
