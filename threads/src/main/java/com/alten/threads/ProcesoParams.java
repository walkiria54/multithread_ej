package com.alten.threads;

public class ProcesoParams extends Thread{
	
	int num_veces;
	String palabra;
	
	public ProcesoParams (String msg){
		super(msg);
	}
	
	
	@Override
	public void run(){
		
		//imprimire n veces viene por parametro la ejecución del hilo
		for (int i = 0; i <num_veces; i++) {
			System.out.println(this.getName()+"----"+ palabra);
			
		}
		
	}
	
	public void obtenerVeces(int n){
		this.num_veces=n;
	}
	
	public void escribirUnaCosa(String cadena){
		this.palabra=cadena;
	}
}