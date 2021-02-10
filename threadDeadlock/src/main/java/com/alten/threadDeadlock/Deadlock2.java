package com.alten.threadDeadlock;

public class Deadlock2 extends Thread {

	Recurso a;
	Recurso b;
	String msg;

	// constructor
	public Deadlock2(Recurso a, Recurso b, String msg) {
		super(msg);
		this.a = a;
		this.b = b;
		this.msg = msg;
	}

	// implementación run
	public void run() {
		// secuencialmente este hilo es justo al contrario
		synchronized (b) {
			try {
				System.out.println(this.msg + " Cojo el recurso segundo ");
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(this.msg + "Esperando a coger el recurso primero");
			synchronized (a) {
				System.out.println(this.msg + "Cojo el recurso primero  ");
			}
		}
		System.out.println(" hilo " + this.msg + " acabado "); // nunca se llega
																// a esta línea
																// de código

	}

}