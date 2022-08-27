package com.basics;

import java.util.Scanner;

public class Meethodsdemo3 {

	public  int method1(int a,int b) {
	
		int c=a+b;
		return c;
		
	}
	
	public static void main(String[] args) {
            Meethodsdemo3 m=new Meethodsdemo3();
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the value of a and b");
            int v1=s.nextInt();
            int v2=s.nextInt();
            System.out.println(m.method1(20, 30));
            
	}
}
