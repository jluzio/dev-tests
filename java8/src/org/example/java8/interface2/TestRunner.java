package org.example.java8.interface2;

public class TestRunner {
	
	public static void main(String[] args) {
		new DefaultImpl().defaultMethod();
		new OverrideDefaultImpl().defaultMethod();
	}

}
