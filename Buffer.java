package com.hcl.ebox;
import java.util.*;
public class Buffer{
		public static void main(String[] args) {
			StringBuffer str=new StringBuffer("Hello");
			str.append(" world");
			System.out.println(str);
			str.insert(5,"_Java");
			System.out.println(str);
			str.replace(5,6," ");
			System.out.println(str);
			System.out.println(str.charAt(6));
			str.delete(3,4);
			System.out.println(str);
			System.out.println(str.capacity());
			str.reverse();
			System.out.println(str);
		}

	}

