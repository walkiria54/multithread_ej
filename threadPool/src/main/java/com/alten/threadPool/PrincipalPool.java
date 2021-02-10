package com.alten.threadPool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class PrincipalPool{
	
	
	public static void main(String[] args){
		
		for (int i = 0; i < args.length; i++) {
			
		}
		//pondre como número fijo de hilos los que tiene mi procesador por ejemplo 
		Runtime runtime =Runtime.getRuntime();
		int n = runtime.availableProcessors(); //8
		ExecutorService pool = Executors.newFixedThreadPool(n);//creación del pool
		
		//lanzar los hilos 
		
		for (int i = 0; i < 100; i++) {
			
			pool.execute(new Proceso1());
			
		}
		System.out.println(" Thread name:"+Thread.currentThread().getName());
		
		
	}
	

}