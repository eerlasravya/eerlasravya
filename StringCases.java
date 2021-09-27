package com.hcl.ebox;

public class StringCases {
	public static void main(String[] args)
	{
		String s1="sravya";
		String s2="eerla";
		System.out.println(s1.charAt(2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.equalsIgnoreCase(s1));
		System.out.println(s2.indexOf('e'));
		System.out.println(s2.length());
		System.out.println(s1.concat(s2));
		System.out.println(s1.replace('a','r'));
		System.out.println(s1.substring(0,4));
		
	}

}
