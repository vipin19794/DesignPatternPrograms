package com.bridgeLabz.creationalDesign;

class StaticBlockSingleton 
{
    private static StaticBlockSingleton instance;
    
    private StaticBlockSingleton(){}
    
    //static block initialization for exception handling
    static
    {
        try
        {
            instance = new StaticBlockSingleton();
        }
        catch(Exception e)
        {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    
    public static StaticBlockSingleton getInstance()
    {
        return instance;
    }
}

public class StaticBlockInitialization
{
	public static void main()
	{
	    StaticBlockSingleton obj = StaticBlockSingleton.getInstance();
	    System.out.println(obj.hashCode());
	    StaticBlockSingleton obj1 = StaticBlockSingleton.getInstance();
	    System.out.println(obj1.hashCode());
	}    
	
}
