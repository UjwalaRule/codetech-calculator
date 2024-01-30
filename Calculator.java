
package com.tka.calculator;

import java.util.Scanner;

public class Calculator {
		public static void main(String[] args) 
	{
		char operator;
		Double no1, no2, result;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Select an operator: +, -, *, or /");
		operator = input.next().charAt(0);
		
	    System.out.println("Enter First Number");
	    no1 = input.nextDouble();
	    
	    System.out.println("Enter Second Number");
	    no2 = input.nextDouble();
	    switch(operator)
	    {
	    //Addition between two numbers 
	    case '+':
	        result = no1 + no2;
	        System.out.println(no1 + " + " + no2 + " = " + result);
	        break;
	     
	     //Subtraction between two numbers
	    case '-':
	        result = no1 - no2;
	        System.out.println(no1 + " - " + no2 + " = " + result);
	        break;  
	        
	    //Multiplication between two numbers 
	    case '*':
	        result = no1 * no2;
	        System.out.println(no1 + " * " + no2 + " = " + result);
	        break;
	        
	    //Division between two numbers    
	    case '/':
	        result = no1 / no2;
	        System.out.println(no1 + " / " + no2 + " = " + result);
	        break;
	    }
	    
	    input.close();
	    
	}
}
	    
 