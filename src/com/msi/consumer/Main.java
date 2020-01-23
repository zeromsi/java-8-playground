package com.msi.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		printUsingAcceptMethod();
		printUsingAndTherMethod();

	}
	
	public static void printUsingAcceptMethod(){
		
		// Create a function that prints what ever is passed through accept method of consumer interface.
	    Consumer<String> printConsumer = t -> System.out.println(t);
	    
	    // Create a stream of string
	    Stream<String> cities = Stream.of("Sydney", "Dhaka", "New York", "London");
	    
	    // foreach method of stream interface takes a consumer through parameter.
	    cities.forEach(printConsumer);
	}
	
	public static void printUsingAndTherMethod(){
	    List<String> cities = Arrays.asList("Sydney", "Dhaka", "New York", "London");

	// This consumer converts an string list into upper case.
	    Consumer<List<String>> upperCaseConsumer = list -> {
	        for(int i=0; i< list.size(); i++){
	            list.set(i, list.get(i).toUpperCase());
	        }
	    };
	    
	// This Consumer print list of string 
	    Consumer<List<String>> printConsumer = list -> list.stream().forEach(System.out::println);

	// Chaining consumers using andThen
	    upperCaseConsumer.andThen(printConsumer).accept(cities);
	}

}
