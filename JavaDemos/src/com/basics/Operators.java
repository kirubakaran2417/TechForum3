package com.basics;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     /*
      * Arithmetic operators= +,-,*,/,%
      * Assignment=  =
      * Relational= <,>,<=,>=,==,!=
      * Logical
      * unary
      */
		int a=12;
		int b=5;
		System.out.println("a+b="+(a+b));
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println("Assignment operator");
		System.out.println(a+=8);//a+=b===>a=a+b
		System.out.println("Relationl operators");
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println("Logical");
		System.out.println((a>b) && (a!=b));
		System.out.println((a>b) || (a<b));
		System.out.println(!(a>b));
		System.out.println("unary");
		System.out.println(-a);
		System.out.println(++a);
		System.out.println(a);
		System.out.println(--a);
		
//		student name
//		student marks for 5 subjects
//		expected op
//		he/she grand total score is 'total'
//		The average is 'avg'

	}

}
