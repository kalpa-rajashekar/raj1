package com.simplilearn.projecttest1.datatypes;

import java.util.Scanner;

public class calci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 1st number");
		int a=sc.nextInt();
		System.out.println("enter the 2nd number");
		int b=sc.nextInt();
		System.out.println("enter the 2nd number"+
		                    "1.Addition\n"+
				            "2.Subtraction\n"+
		                    "3.Multiplication\n"+
				            "4.Division\n"+
		                    "5.Modulus\n"
		                    );
		int n=sc.nextInt();
		System.out.println(" the operation is " +n);
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
                
        default:break;       
                
        
                
		
			   
			   
			   
		}


	}

}
