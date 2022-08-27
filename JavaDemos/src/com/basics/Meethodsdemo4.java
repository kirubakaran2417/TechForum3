package com.basics;

import java.util.Scanner;

public class Meethodsdemo4 {

	public int method1(int a) {
	
		int fact=1;
		for(int i=1;i<=a;i++) {
			fact=fact*i;
		}
		return fact;
		
	}
	
	public static void main(String[] args) {
            Meethodsdemo4 m=new Meethodsdemo4();
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the value");
            int val=s.nextInt();
            System.out.println(m.method1(val));
	}
}
