package com.basics;

import java.util.Scanner;

public class validation2 {

	public static void main(String[] args) {
//		integer.parseint
//		Scanner.hasnextint
//		character.nextint
		
	Scanner sc=new Scanner(System.in);
	if(sc.hasNextInt()) {
		System.out.println(sc.nextInt()+" is a valid integer");
	}
	else
	{
		System.out.println(sc.nextInt()+" is not a valid integer");
	}
	}

}
