package com.alten.threads;

public class Proceso extends Thread{
	
	public Proceso (String msg){
		super(msg);
	}
	@Override
	public void run(){
		
		
		for (int i = 0; i <10; i++) {
			System.out.println("Ejecución del proceso "+this.getName());
			
		}
		
	}
	
}