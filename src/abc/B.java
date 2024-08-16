package abc;

import java.util.Scanner;

public class B {

	int a;
	public static void main(String[]args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter your first number:");
		 int a=sc.nextInt();
		
		System.out.println("enter your second number:");
		int b=sc.nextInt();
		System.out.println("Enter your choice");
		
		
		System.out.println("1.addition");
		System.out.println("2.substraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			int result1=a+b;
		    System.out.println(result1);
		    break;
		    
		    case 2:
		    	int result2=a-b;
		    System.out.println(result2);
		    break;
		    
		    case 3:
		    	int result3=a*b;
		    System.out.println(result3);
		    break;
		    
		    case 4:
		    	int result4=a/b;
		    System.out.println(result4);
		    break;
		    default:
		    	System.out.println("invalid choice....");
		}
	}
}
