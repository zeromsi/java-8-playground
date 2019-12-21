package com.msi.functionalInterface.annonymousInnerClass;

public class Main {

	public static void main(String[] args) {
	
		TestFunctionalInterface obj=new TestFunctionalInterface() {
			
			@Override
			public void printSomething() {
				System.out.println("Printing something from annonymous inner class ");
				
			}
		};
		
		obj.printSomething();
	}

}
