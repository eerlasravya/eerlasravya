package com.hcl.ebox;

public class CallbyValue {
public static void main(String[] args) {
	int originalvalue=25;
	System.out.println("The original value is "+originalvalue);
	display(originalvalue);
	System.out.println("The value of function display after execution is"+originalvalue);
}
public static int display(int num)
{
	num=33;
	System.out.println("The value is "+num);
	return num;

}
}
