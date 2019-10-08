package com.flexon.corejava;

import java.io.DataInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class BankingAccount
{
	
	int number , ans;
	static String name = "abc";
	String email;
	int mobilenum;
	static float  bal= 10000;
	float nb;
	float limit_depo=0;
	int i;
	float depo,wd;
	
	
	
	private void balance()
	{
		System.out.println("your balance is : "+bal);
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
	public String showbalance()
	{
		String firstname="Dhivya";
		String lastname="Sekaran";
		String acc_type="savings";
		float acc_bal= bal;
		
		
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
	    Date dateobj = new Date();
	    System.out.println("First name is "+firstname);
	    System.out.println("Last name is "+lastname);
	    System.out.println("Account type is "+acc_type);
	    System.out.println("Account balance  is "+acc_bal);
	    System.out.println(df.format(dateobj));
		
		
		//Date date = new Date();
		//long time = date.getTime();
		
		//Timestamp ts =new Timestamp(time);
		
		//System.out.println("time is"+ts);
		
		return firstname;
	}
	
	
	private float deposit(float depo)
	{
		
		this.depo=depo;
		limit_depo=(limit_depo+depo);
		if(limit_depo<=1500)
		{
			nb =( depo + bal);
			bal = nb;
			System.out.println("your new balance is : "+bal);
		}
		else
			System.out.println("transaction limit exceeded");
		return nb;
		
	} 
	
	float withdraw(float wd)
	{
		{
		if(wd<=1000) 
			{
			System.out.println("withdrawal in process");					
			this.wd=wd;
			nb=(bal - wd);
			bal = nb;
			System.out.println("your new balance is : "+bal);			
		
			}
			else 
			{
			System.out.println("withdrawal amount exceeds");	
			}
		   
		}
	 ///System.out.println("your account balance is "+bal);
		return nb;	
	
	
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
			int x;
			int ans;
		float depo,wd;
		DataInputStream b=new DataInputStream(System.in);
		System.out.println("this gives to welcome message...");
		det.UserDetails(name);
		System.out.println(" Hi "+name);
		
		System.out.println("Please enter the number 1 to 6");
		System.out.println("1. Details");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Balance");
        System.out.println("5. Logout");
        System.out.println("6.show balnce");
        
        System.out.print("Enter Selection: ");
		try 
		{
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
				   if(depo<=500 && depo >= 50) 
				   {		
					   acc.deposit(depo);
					}
					else 
					{
						System.out.println("amonut limit is 50 to 500");	
					}
					for(x=1;x<3;x++) 
					{
						System.out.println("do you want to continue withdraw..yes=1 or no=2");
						ans = Integer.parseInt(b.readLine());
						{
							if(ans==1)
						
							{
								System.out.println("please enter the amount to deposit");
								depo=Float.parseFloat(b.readLine());
								if(depo<=500 && depo >= 50) 
								{
							
						
										acc.deposit(depo);
								}
								else 
								{
									System.out.println("amonut limit is 50 to 500");	
								}
							}
						}
					}
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
				do {
				System.out.println("do you want to continue withdraw..yes=1 or no=2");
				ans = Integer.parseInt(b.readLine());
				
				
				
				if(ans==1)
					
				 {
					System.out.println("please enter the amount to withdraw");
					wd=Float.parseFloat(b.readLine());
						if(wd<=bal) {
					 	acc.withdraw(wd);
						} 
						else
						{
							System.out.println("your balance low");
							
						}
				}}while(ans==1);
				
				
				{
				 if (ans==2){
					System.out.println("exited");
				}
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
		 case 6:
			 	System.out.println("show balance");
			 	acc.showbalance();
			 	break;
		 default:
		   System.out.println("enter the number 1 to 6");
	      }
	      
	      
	      
	}
		
		
	      catch (NumberFormatException e) {
	    	   
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("error occured");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("error occured");
			}
		
	}
}
