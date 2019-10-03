package com.flexon.corejava;

import java.io.DataInputStream;
import java.io.IOException;

public class BankingAccount
{
	
	int number , ans;
	static String name = "abc";
	String email;
	int mobilenum;
	static float bal=10000;
	float nb;
	
	int i;
	float depo,wd;
	

	public String details()
	{
		int number = 123456789;
		String name = "abc";
		String email ="abc@gmail.com";
		int mobilenum = 987654321;
		
		
		System.out.println( "Account number : "+number +"\nCustomername : "+name +"\nCustomer email : "+email+"\nMobile number : "+mobilenum);
		return name;
	}
	
	private float deposit(float depo)
	{
		
		this.depo=depo;
		nb =( depo + bal);
		System.out.println("your new balance is : "+nb);
		return nb;
	}
	
	float withdraw(float wd){
	{
		if(wd<=1000) {
			System.out.println("withdrawal in process");
		
			this.wd=wd;
			nb=(bal - wd);
			System.out.println("your new balance is : "+nb);
			
		}
		else {
			System.out.println("withdrawal amount exceeds");
			
			
	
		}
		   
	}
	 ///System.out.println("your account balance is "+bal);
	return nb;	
	
	
	}
	private void balance()
	{
		System.out.println("your balance is : "+bal);
	}
	
	
	private void exit()
	{
		System.out.println("logged out succesfully!!!");
	}
	
	
	
	
	public static void main(String args[])
	{
		BankingAccount acc =new BankingAccount();
		UserDetails det=new UserDetails();
			int i;
			int ans;
		float depo,wd;
		DataInputStream b=new DataInputStream(System.in);
		System.out.println("this gives to welcome message...");
		det.UserDetails(name);
		System.out.println(" Hi "+name);
		
		System.out.println("Please enter the number 1 to 5");
		System.out.println("1. Details");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Balance");
        System.out.println("5. Logout");
        System.out.print("Enter Selection: ");
		try {
			i = Integer.parseInt(b.readLine());
		
	      switch(i)
	      {
		 case 1:
			   System.out.println("Details: ");
			   acc.details();
			   break;
		 case 2:
			   System.out.println("deposit :");
			   System.out.println("please enter the amount to deposit");
				depo=Float.parseFloat(b.readLine());
			   acc.deposit(depo);
			 
			   break;
		 case 3:
			 	System.out.println("withdraw : ");
			 	System.out.println("please enter the amount to withdraw");
				wd=Float.parseFloat(b.readLine());
				if(wd<=bal) {
			 	acc.withdraw(wd);
				}else
				{
					System.out.println("your balance low");
				}
				System.out.println("do you want to continue withdraw..yes=1 or no=2");
				ans = Integer.parseInt(b.readLine());
				if (ans == 1 )
					
				{
					System.out.println("please enter the amount to withdraw");
					wd=Float.parseFloat(b.readLine());
					if(wd<=bal) {
					 	acc.withdraw(wd);
						}else
						{
							System.out.println("your balance low");
							
						}	
					
					
				}
				else if (ans==2){
					System.out.println("exited");
				}
			 	break;
		 case 4:
	           System.out.println("balance");
	           acc.balance();
	           break;
		 case 5:
	           System.out.println("exit");
	           acc.exit();
	           break;
		 default:
		   System.out.println("enter the number 1 to 5");
	      }
	      
	      
	      
	}
		
		
	      catch (NumberFormatException e) {
	    	   
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
