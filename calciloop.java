package com.simplilearn.projecttest1.datatypes;
import java.util.Scanner;
import java.lang.*;
public class calciloop
{
	public static void main(String[] args) 
	{
		calciop obj1=new calciop();
		
		for(;;)
		{
			obj1.operations();
		}
	}

}



 class calciop 
 {

	void operations()
	{
		// TODO Auto-generated method stub
		int a,b;
		System.out.println("Enter the operation to be performed\n"+
		                    "1.Addition\n"+
				            "2.Subtraction\n"+
		                    "3.Multiplication\n"+
				            "4.Division\n"+
		                    "5.Modulus\n"
		                    );
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//System.out.println(" the operation is " +n);
		if((n==1)||(n==2)||(n==3||(n==4))||(n==5))
		{
		
		System.out.println("Enter the 1st number");
		 a=sc.nextInt();
		System.out.println("Enter the 2nd number");
		b=sc.nextInt();
		
		switch(n)
		{
		case 1: System.out.println("result of addition is:"+(a+b));
		         break;
		case 2: System.out.println("result of subtraction is:"+(a-b));
                 break;
		case 3: System.out.println("result of multiplication is:"+(a*b));
                 break;
		case 4: System.out.println("result of division is:"+(a/b));
                break;
		case 5: System.out.println("result of modulus operation is:"+(a%b));
                break;
                
        default:System. exit(0);       
                
        
		}    
		
		}
		else
			
			System. exit(0);      
			   
		
	}
 }


	

