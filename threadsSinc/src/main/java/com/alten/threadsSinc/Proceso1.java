package com.alten.threadsSinc;

public class Proceso1 extends Thread{
	
	public Proceso1 (String msg){
		super(msg);
	}
	@Override
	public void run(){
		
		for (int i = 0; i <10; i++) {
			System.out.print("AAAA");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}