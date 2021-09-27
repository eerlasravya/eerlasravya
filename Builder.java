package com.hcl.ebox;

public class Builder {
	public static void main(String[] args) {
		StringBuilder str=new StringBuilder("Hello");
		str.append(" world");
		System.out.println(str);
		str.insert(5,"_Java");
		System.out.println(str);
		str.replace(5,6," ");
		System.out.println(str);

	}

}
