package com.alten.threadsSinc;

public class PrincipalSinc{
	
	public static void main(String[] args){

		//GENERACION DE LOS 4 HILOS
		Proceso1 hilo1 = new Proceso1("");
		Proceso2 hilo2 = new Proceso2("");
		Proceso3 hilo3 = new Proceso3("");
		Proceso4 hilo4 = new Proceso4("");
		
		//ARRANQUE DE LOS 4 HILOS 
		try {
			hilo1.start();
			hilo1.sleep(10);
			hilo2.start();
			hilo1.sleep(10);
			hilo3.start();
			hilo1.sleep(10);
			hilo4.start();
			hilo1.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}