package com.msi.functionalInterface;

public interface TestFunctionalInterface {
	public abstract void printSomething();
	
	public default void printHelloWorld() {
		System.out.println("Hello World");
	}
	
	public default void printHi() {
		System.out.println("Hi");
	}
	
	public static void printHelloWorldFromStaticMethod() {
		System.out.print("Hello world from static method");
	}
	
	public static void printHiFromStaticMethod() {
		System.out.print("Hi from static method");
	}
	
	
}
