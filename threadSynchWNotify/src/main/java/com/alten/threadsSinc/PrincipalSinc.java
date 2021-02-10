package com.alten.threadsSinc;

import java.util.ArrayList;
import java.util.List;

public class PrincipalSinc{
	
	public static void main(String[] args){

		List<String> productos = new ArrayList<String>();
		Productor p= new Productor (productos);
		
		//genero 3 hilos de tipo consumidor 
		Consumidor c =  new Consumidor(productos);
		Thread c1= new Thread(c);
		Thread c2= new Thread(c);
		Thread c3= new Thread(c);
		
		//un hilo de tipo productor 
		Thread philo= new Thread(p);
		
		c1.start();
		c2.start();
		c3.start();
		philo.start();
		
	}
}