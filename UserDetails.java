package com.flexon.corejava;

public class UserDetails extends BankingAccount {
	
	
	int number;
	String name;
	String email;
	int mobilenum;
	int age;
	
	public UserDetails() 
	{
		
		this.number = number;
		this.name=name;
		this.email=email;
		this.mobilenum= mobilenum;
		
	}
	
	public String UserDetails( String name) 
	{
		
		this.name= name;
		return name;
		
	}
	
	public   UserDetails(String email,String name)
	{
		this.email = email;
	}
	
	
	public String details()
	{
		int number = 123456789;
		String name = "abc";
		String email ="abc@gmail.com";
		int mobilenum = 987654321;
		
		
		System.out.println( "Account number : "+number +"\nCustomername : "+name +"\nCustomer email : "+email+"\nMobile number : "+mobilenum);
		return name;
	}

	
	
	 

}
