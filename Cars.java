package com.flexon.corejava;

import java.io.DataInputStream;
import java.io.IOException;

public class Cars {
	
	int speed;
	int wheels;
	static String name;
	static String color;
	Boolean music=true;
	int power;
	
	public Cars(String name, String color)
	{
		name= name;
		color=color;
		
	}
	
	public void start()
	
	{
		if(power>0)
		System.out.println("car is started now");
		else 
			System.out.println("please start power");	
	}
	
	
	
	private  void stop()
	{
		System.out.println("car is stoped now");
	}
	
	private  void accelerate()
	{
		if(speed>=5)
		System.out.println("car is moving");
		else
			System.out.println("please give some speed");
			
	}
	
	public static void main(String[] args) 
	{
		DataInputStream c=new DataInputStream(System.in);
		System.out.println("car name ");
		try {
			name=c.readLine();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Cars honda=new Cars(name,color);
		honda.start();
		honda.accelerate();
		
		
		honda.stop();
		
		
		
	}

}
