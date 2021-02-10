package com.alten.threads;

public class ProcesoEstados extends Thread{
	
	
	
	public ProcesoEstados (String msg){
		super(msg);
	}
	
	
	@Override
	public void run(){
		
		for (int i = 0; i <5; i++) {

			System.out.println(this.getName()+"----"+ i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}