package com.ControlStatements;

import java.util.Scanner;

public class Decision {

	/*
	 * Sequential
	 * conditional
	 * Looping
	 */
	/*
	 * if statement or if else or else if 
	 */
	/*
	 * a=25
	 * b=45
	 * c=65
	 * 
	 * get input from user check that number is even or not
	 */
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the day");
		int a=s.nextInt();		
		if(a==1) {
			System.out.println("Monday");
		}
		else if(a==2){
			System.out.println("Tuesday");
		}
		else if(a==3){
			System.out.println("Wednesday");
		}
		else if(a==4){
			System.out.println("Thursday");
		}
		else if(a==5){
			System.out.println("Friday");
		}
		else if(a==6){
			System.out.println("Saturday");
		}
		else if(a==7){
			System.out.println("Sunday");
		}
		else {
			System.out.println("enter valid day");
		}
		
	}
}
