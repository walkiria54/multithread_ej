package com.alten.threadPool;


public class Proceso1 implements Runnable{

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Nombre de hilo:"+Thread.currentThread().getName());
	}
	
}