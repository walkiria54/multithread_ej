package com.alten.threadCallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Vector;
import java.util.concurrent.Future;

public class PrincipalSinc{
	
	public static void main(String[] args){
		Runtime runtime =Runtime.getRuntime();
		int n = runtime.availableProcessors(); 
		System.out.println("Procesadores disponibles"+n);
		int contador=0;
		//creamos el pool de hilos - 8 procesadores
		ExecutorService executor = Executors.newFixedThreadPool(n);
		Vector<Future<Integer>> vector = new Vector(); //recordar vector similar a array pero creciendo
		for (int i = 0; i < n; i++) { //lanzare tantos hilos como tenga mi procesador 
			//submit pide un Callable - mi clase Proceso1 es de ese tipo
			Future<Integer> future = executor.submit(new Proceso1());
			vector.add(future);
		}
		executor.shutdown();// no añadir más hilos 
		
		//obtencion de los resultados de cada uno de esos hilos anotados en un Vector con Future.get
		for (int i = 0; i < n; i++) {
			Future<Integer>future=vector.get(i);
			try {
				contador +=future.get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println("Resultado de de contador "+contador); //esperamos que sea 1000*hilos lanzados
	}
	

}