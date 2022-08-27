package com.basics;

public class Meethodsdemo2 {

	public int method1(int a,int b) {
		
		int c=a*b;
		return c;
	}
	
	public static void main(String[] args) {
            Meethodsdemo2 m=new Meethodsdemo2();
            int result=m.method1(20, 30);
            System.out.println(result);
            }
}
