package com.basics;

public class student {

	String firstname;
	String lastname;
	int age;
	
	student(){
		firstname="kiruba";
		lastname="karan";
		age=31;
	}

	public static void main(String[] args) {
		student student1=new student();
		System.out.println(student1.age);
	}
}
