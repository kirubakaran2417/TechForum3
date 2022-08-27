package com.basics;

import java.util.Scanner;

public class student2 {
	String firstname;
	String lastname;
	int age;
	

	
	student2(String fname,String lname,int sage){
			     firstname=fname;
			     lastname=lname;
			     age=sage;
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String ss=s.next();
		student2 s2=new student2(ss,"karan",31);
		System.out.println(s2.firstname);
	}
}
