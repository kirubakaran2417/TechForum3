package com.basics;

import java.util.Scanner;

public class Inputfromuser {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=s.nextInt();
		String name=s.next();
		System.out.println("The value of a is: "+a);
		System.out.println("The name is: "+name);
		
		
	}

}
