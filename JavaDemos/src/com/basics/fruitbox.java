package com.basics;

public class fruitbox {//classesandobjects demo

   
	//access_specifier return_type method name(){
	
	
//}
    int a=60;
    int b=70;//global variables
    
	public int add() {
		int a=25;
		int b=35;//local variables
		int c=a+b;
		return c;
	}
	
	public int sub() {
		int c=a-b;
		System.out.println(c);
		return c;
		
	}
	
    public int mul() {
		int c=a*b;
		return c;
	}
	
	public static void main(String[] args) {
		
		//how to create object in java
		//classname objectname=new classname();
		
      fruitbox objectname=new fruitbox();
      int result=objectname.add();
      System.out.println(result);
      objectname.sub();
		
	}
	
	
}
