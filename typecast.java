package com.simplilearn.projecttest1.datatypes;

import java.util.Scanner;

public class typecast {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("ENTER 1 FOR IMPLICIT TYPE CHECKING AND OTHERS FOR EXPLICIT");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		
		
		
		if( num==1)
		{
			
			//code for implicit code coversion
		char c='A';
		System.out.println("c in char is "+c);
		//now implicit conversion from char to int
		int i=c;
		System.out.println("c in  int is " +i);
		//now implicit conversion from int to float
		float f=i;
		System.out.println("c in  float is " +f);
		//now implicit conversion from float to double
		double d=f;
		System.out.println("c in  double is " +d);
		
		
	
		}
		
		else
		{
			
			//now explicit conversion from double to float
			
			double d=80;
			float f=(float)d;
			System.out.println("c in  float is " +d);
			
			//now explicit conversion from float to int
			int i=(int)f;
			System.out.println("c in  integer is " +i);
			
			//now explicit conversion from int to char
			char c=(char)i;
			System.out.println("c in  character is " +c);
			
			
			
			
			
		
		}

	}

}
