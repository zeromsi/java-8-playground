package com.msi.functionalInterface.separateimplementation;

@FunctionalInterface
public interface TestFunctionalInterface {
	public abstract void printSomething();
	
	public default void printHelloWorld() {
		System.out.println("Hello World");
	}
	
	public default void printHi() {
		System.out.println("Hi");
	}
	
	public static void printHelloWorldFromStaticMethod() {
		System.out.println("Hello world from static method");
	}
	
	public static void printHiFromStaticMethod() {
		System.out.println("Hi from static method");
	}
	
}
