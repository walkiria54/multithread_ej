package com.alten.threads;

public class Principal{
	
	public static void main(String[] args){
		
//		Proceso hilo1 = new Proceso ("proceso1");
//		Proceso hilo2 = new Proceso("proceso2");
//		Thread hilo3 = new Thread(new OtroModo());
//		hilo1.start();
//		hilo2.start(); 
//		hilo3.start();
		
//		
//		Thread hilo1 = new Proceso ("busqueda de muestras");
//		Thread hilo2 = new Proceso("busqueda de dispositivos");
//		hilo1.start();
//		hilo2.start(); 
//		
//		ProcesoParams hilox=new ProcesoParams("procesoparametrosX");
//		ProcesoParams hiloy=new ProcesoParams("procesoparametrosY");
//		hilox.obtenerVeces(8);
//		hiloy.obtenerVeces(10);
//		hilox.escribirUnaCosa("hola");
//		hiloy.escribirUnaCosa("adios");
//		hilox.start();
//		hiloy.start();
//		
		
		ProcesoEstados hiloestados1 = new ProcesoEstados("hilo de estados1");
		ProcesoEstados hiloestados2 = new ProcesoEstados("hilo de estados2");
		hiloestados1.start();
		try {
			hiloestados1.sleep(3000);
		} catch (InterruptedException e) {
		}
		;
		hiloestados2.start();
		try {
			hiloestados2.sleep(2000);
			hiloestados2.stop();
		} catch (InterruptedException e) {
		}
		;
	
	}
}