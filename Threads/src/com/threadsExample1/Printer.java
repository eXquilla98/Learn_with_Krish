package com.threadsExample1;

class Printer implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			
			
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}*/
			//Thread.yield();
			System.out.println("this is form child thread"+i);
		}
		
	}
	

}
