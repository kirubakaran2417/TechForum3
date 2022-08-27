package com.ControlStatements;

import java.util.Scanner;

public class switchcase {
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the day");
		int a=s.nextInt();	
		switch (a) {
		case 1: {
			System.out.println("monday");
			break;
		}
		case 2: {
			System.out.println("tuesday");
			break;
		}
		case 3: {
			System.out.println("wednesday");
			break;
		}
		default:
			System.out.println("enter valid day");
		}
	}

}