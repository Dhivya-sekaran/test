package com.flexon.corejava;

public class FirstProgram {

	public static void main(String[] args)
	{
		
		double kg;
		float pounds =20;
		
		
		kg = pounds * 0.453;
		System.out.println("ans is "+kg);
		
		
		{
		int value = 1;
		 if (value ==1)
			 System.out.println("value is equal to 1");
		}
		
		
		{
			for(int i1=0; i1<=10; i1++)
			{
				System.out.println(i1);
			}
			
		}
		
		
		//* switch case *//
		char ch= 'a';
		switch(ch)
		{
		
		case 'a':
			System.out.println("apple");
			break;
		case 'b':
			System.out.println("bannana");
			break;
		case 'c':
			System.out.println("cherry");
			break;
		case 'd':
			System.out.println("dragon fruit");
			break;
		default:
			System.out.println("it is not a fruit");
			
		}
				String st= "c";
				switch(st)
				{
				
				case "a":
					System.out.println("apple");
					break;
				case "b":
					System.out.println("bannana");
					break;
				case "c":
					System.out.println("cherry");
					break;
				case "d":
					System.out.println("dragon fruit");
					break;
				default:
					System.out.println("it is not a fruit");
				
				}
		
		 
		 
		 
	}

}
