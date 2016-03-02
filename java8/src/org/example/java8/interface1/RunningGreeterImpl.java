package org.example.java8.interface1;

public class RunningGreeterImpl implements Greeter, Runner {
	
	@Override
	public void execute() {
		Greeter.super.execute();
	}

	@Override
	public void evaluate() {
		System.out.println("scanning");
		
	}

	public static void main(String[] args) {
		RunningGreeterImpl instance = new RunningGreeterImpl();
		instance.execute();
		instance.sayHello();
	}

}
