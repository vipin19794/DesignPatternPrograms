package com.bridgeLabz.creationalDesign;

class ThreadSafeSingleton 
{
    private static ThreadSafeSingleton instance;
    
    private ThreadSafeSingleton(){}
    
    public static synchronized ThreadSafeSingleton getInstance()
    {
        if(instance == null)
        {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }    
}

public class ThreadSafe
{
	public static void main(String[] args) 
	{
		ThreadSafeSingleton obj = ThreadSafeSingleton.getInstance();
	    System.out.println(obj.hashCode());
	    ThreadSafeSingleton obj1 = ThreadSafeSingleton.getInstance();
	    System.out.println(obj1.hashCode());
	}

}
