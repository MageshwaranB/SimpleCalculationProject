package com.simplePrograms;

import java.util.Scanner;

public class SimpleCalculation
{
	public static void main(String[] args) {
		System.out.println("Please the enter the below numbers to perform the necessary Arithmetic operations with two numbers"+"\n" +
				"1. Add \n"
				+"2. Sub\n"+
				"3. Mul\n"
				+"4.Div");
		Scanner scan=new Scanner(System.in);
		int choice= scan.nextInt();
		int var1=scan.nextInt();
		int var2= scan.nextInt();
		int output=variousArithmeticOperations(choice, var1,var2);
		System.out.println(output);

	}

	public static int variousArithmeticOperations(int choice, int var1, int var2){
		int result=0;
		switch (choice){
			case 1:
				result= var1+var2;
				break;
			case 2:
				result=var1-var2;
				break;
			case 3:
				result=var1*var2;
				break;
			case 4:
				if(var1>var2){
					result=var1/var2;
				}
				else
					System.out.println("Value1 must be greater than value 2 to perform division");
					result=0;

					default:
				System.out.println("Invalid choice is entered");
		}
		return result;
	}
}
