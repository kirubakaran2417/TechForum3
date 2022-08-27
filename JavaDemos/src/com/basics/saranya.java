package com.basics;

public class saranya {
	//data members of class
	double interestrate;
	//constructor would initialize data member
	public saranya(int i) {
		
		interestrate=i;
	}
	public saranya(int i,int j) {
		
		interestrate=i;
	}

}
class kiruthiga{
	int interestrate=25;
	int balance=225;
	saranya s=new saranya(interestrate);
	saranya s2=new saranya(interestrate,balance);
}