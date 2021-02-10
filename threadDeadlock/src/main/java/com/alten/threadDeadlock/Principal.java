package com.alten.threadDeadlock;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Principal{
	
	
	public static void main(String[] args){
		
	Recurso a= new Recurso();
	Recurso b= new Recurso();
	
	//creacion de dos objetos thread que usan el mismo recurso 
	Deadlock1 hilo1 = new Deadlock1(a,b,"hilo1");
	Deadlock2 hilo2 = new Deadlock2(a,b,"hilo2");
	//hilo1 cogera el recurso a y 
	//hilo2 cogerá el recurso b 
	//duermen 10 segundos 
	//se despiertan e intentan coger el otro recurso 
	//hilo1 a la espera de coger el recurso b
	//hilo2 a la espera de coger el recurso a 
	hilo1.start();
	hilo2.start();
		
	}
	

}