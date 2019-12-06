package com.bridgeLabz.creationalDesign;

public class BillPughSingletonImplementation 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		BillPughSingleton obj = BillPughSingleton.getInstance();
	    System.out.println(obj.hashCode());
	    BillPughSingleton obj1 = BillPughSingleton.getInstance();
	    System.out.println(obj1.hashCode());

	}
}
class BillPughSingleton 
{

    private BillPughSingleton()
    {
    	
    }
    
    private static class SingletonHelper
    {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    
    public static BillPughSingleton getInstance()
    {
        return SingletonHelper.INSTANCE;
    }
}