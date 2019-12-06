package com.bridgeLabz.creationalDesign;

import java.io.Serializable;

public class SerializationAndSingleton
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SerializedSingleton obj = SerializedSingleton.getInstance();
		System.out.println(obj.hashCode());
		SerializedSingleton obj1 = SerializedSingleton.getInstance();
		System.out.println(obj1.hashCode());
	}
}

class SerializedSingleton implements Serializable
{

    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton()
    {
    	
    }
    
    private static class SingletonHelper
    {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }
    
    public static SerializedSingleton getInstance()
    {
        return SingletonHelper.instance;
    }   
}
