package com.msi.functionalInterface.lambdaexpression;

public class Main {

	public static void main(String[] args) {
	
		TestFunctionalInterface obj=()->{
				System.out.println("Printing something from annonymous inner class ");
				};
		
		
		obj.printSomething();
	}

}
