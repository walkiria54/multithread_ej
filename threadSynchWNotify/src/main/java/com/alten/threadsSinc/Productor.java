package com.alten.threadsSinc;

import java.util.List;

public class Productor implements Runnable{
	
	private List<String> productos;
	
	public Productor (List<String> productos){
		this.productos=productos;
	}

	public void run(){
		
		while(true){
			try {
				Thread.sleep(4000);
				synchronized(productos){
					productos.add("producto");
					productos.notify();
					System.out.println("Aniadido producto a lista");
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		
	}}
	
}