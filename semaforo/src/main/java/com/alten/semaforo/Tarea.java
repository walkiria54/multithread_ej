package com.alten.semaforo;

import java.util.concurrent.Semaphore;

class Tarea implements Runnable {
	
	int permits=2;
	Semaphore semaphore = new Semaphore(permits);

	public void run() {
		// TODO Auto-generated method stub
		try {
		semaphore.acquire();
			System.out.println("---Comienzo de ejecución de tarea "+ Thread.currentThread().getName());
			for (int i = 0; i < 5; i++) {
				System.out.println("Ejecutando tarjea " + Thread.currentThread().getName());

				Thread.sleep(2000);

			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			semaphore.release();
		}

	}

}
