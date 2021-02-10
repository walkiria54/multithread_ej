package com.alten.semaforo;
import java.util.concurrent.*;


public class Principal{

	
	public static void main(String[] args){
		
		Tarea tarea = new Tarea();
		Thread t1= new Thread(tarea);
		Thread t2= new Thread(tarea);
		Thread t3= new Thread(tarea);
		t1.setName("Tarea1");
		t2.setName("Tarea2");
		t3.setName("Tarea3");
		t1.start();
		t2.start();
		t3.start();
	
	}
	

}