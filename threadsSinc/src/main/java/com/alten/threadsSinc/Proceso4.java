package com.alten.threadsSinc;

public class Proceso4 extends Thread{
	
	public Proceso4 (String msg){
		super(msg);
	}
	@Override
	public void run(){
		
		for (int i = 0; i <10; i++) {
			System.out.println("DDDD");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}