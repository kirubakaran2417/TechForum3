package com.basics;

public class validation {

	public static void main(String[] args) {
//		integer.parseint
//		Scanner.hasnextint
//		character.nextint
		
		String input="abc";
		try {
			Integer.parseInt(input);
			System.out.println(input+" is a valid integer");
		}
		catch(NumberFormatException e){
			System.out.println(input+ " is not a valid integer");
		}
	}

}
