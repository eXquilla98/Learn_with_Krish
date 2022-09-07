package com.threadsExample1;

public class Application {

	public static void main(String[] args) throws InterruptedException {
		
		Printer printer = new Printer();
		Thread thread=new Thread(printer);
		//thread.setPriority(1);
		thread.start();
		thread.interrupt();
		//thread.join();
		for (int i = 0; i < 100; i++) {
			System.out.println("This is from main thread"+i);
		}
		

	}

}
