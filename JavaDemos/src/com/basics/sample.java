package com.basics;

import java.util.Scanner;

public class sample {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String ss=s.next();
		student3 s2=new student3(ss,"karan",31);
		System.out.println(s2.firstname);
	}
}
