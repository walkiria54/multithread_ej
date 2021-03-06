package com.alten.threadsSinc;

import java.util.List;

public class Consumidor extends Thread{
	

	private List<String> productos;
	
	public Consumidor (List<String> productos){
		this.productos=productos;
	}

	public void run(){
		
		while(true){
			try {
				Thread.sleep(4000);
				synchronized(productos){
					if (productos.isEmpty()){
						System.out.println("----a  la espera-----"); 
						productos.wait(); //se queda a la espera hasta q notifiquen
					}
					productos.remove(0);//coge el primero
			
					System.out.println(this.getName()+" consume!");
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		
	}}
	
}