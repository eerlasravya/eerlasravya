package com.hcl.ebox;

public class UserDefinedFunction {
	public static void main(String[] args)
	{
		double n=6,res=0;
		UserDefinedFunction uobj=new UserDefinedFunction();
		res=uobj.findCube(n);//fun calling
		System.out.println("the cube of the numberis " +res);
	}
	public static double findCube(double n)//fun definig
	{
	 double Cube=n*n*n;
	 return Cube;
	}

}
