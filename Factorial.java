package com.hcl.ebox;

public class Factorial {
public static void main(String[] args) {
	int fact=1;
	int n=5;
	fact=factorial(n);
	System.out.println("The factorial of a number is "+fact);
}
public static int factorial(int n) {
	if(n==0)
	{
		return 1;
	}
	else
	{
		return (n*factorial(n-1));
	}
}
}
