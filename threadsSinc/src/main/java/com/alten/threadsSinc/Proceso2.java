package com.alten.threadsSinc;

public class Proceso2 extends Thread{
	
	public Proceso2 (String msg){
		super(msg);
	}
	@Override
	public void run(){
		
		for (int i = 0; i <10; i++) {
			System.out.print("BBBB");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
}