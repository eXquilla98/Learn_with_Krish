package com.threadsExample1;

public class Application {

	public static void main(String[] args) {
		
		Printer printer = new Printer();
		printer.start();
		System.out.println("This is from main thread");
		

	}

}
