package com.msi.supplier;

import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		supplier();

	}
	
	public static void supplier(){
	    Supplier<Double> doubleSupplier1 = () -> Math.random();
	    DoubleSupplier doubleSupplier2 = Math::random;

	    System.out.println(doubleSupplier1.get());
	    System.out.println(doubleSupplier2.getAsDouble());
	}

}
