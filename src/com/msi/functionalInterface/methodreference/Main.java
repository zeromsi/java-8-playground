package com.msi.functionalInterface.methodreference;

public class Main {

	public static void main(String[] args) {
	
		TestFunctionalInterface obj=Printer::print;		
		obj.printSomething("Printing");
	}

}
