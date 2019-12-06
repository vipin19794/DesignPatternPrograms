package com.bridgeLabz.creationalDesign;

class EagerInitializedSingleton 
{
    
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
    
    //private constructor to avoid client applications to use constructor obj
    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance()
    { 
        return instance;
    }
}

public class EagerInitialization
{
     public static void main(String args[])
     {
    	 EagerInitializedSingleton obj = EagerInitializedSingleton.getInstance();
    	 System.out.println( obj.hashCode());
    	 EagerInitializedSingleton obj1 = EagerInitializedSingleton.getInstance();
    	 System.out.println( obj.hashCode());
     }
}
