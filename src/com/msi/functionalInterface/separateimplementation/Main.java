package com.msi.functionalInterface.separateimplementation;

public class Main {

	public static void main(String[] args) {
		TestFunctionalInterface.printHelloWorldFromStaticMethod();
		TestFunctionalInterface.printHiFromStaticMethod();
		
		TestFunctionalInterface obj=new TestFunctionalInterfaceImplementation();
		obj.printHelloWorld();
		obj.printSomething();
		obj.printHi();
	}

}
