package com.alten.threadCallable;

import java.util.concurrent.Callable;

public class Proceso1 implements Callable{
	int contador=0;

	public Integer call() throws Exception {
		for (int i = 0; i <1000; i++) {
			contador++;
		}
		return contador;
	}
	
	
	
}