package com.bridgeLabz.creationalDesign;



class LazyInitializedSingleton
{

    private static LazyInitializedSingleton instance;
    
    private LazyInitializedSingleton(){}
    
    public static LazyInitializedSingleton getInstance()
    {
        if(instance == null)
        {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}

public class LazyInitialization
{
	public static void main(String[] args) 
	{
		LazyInitializedSingleton obj = LazyInitializedSingleton.getInstance();
		    System.out.println(obj.hashCode());
		LazyInitializedSingleton obj1 = LazyInitializedSingleton.getInstance();
		    System.out.println(obj1.hashCode());
	}

}
