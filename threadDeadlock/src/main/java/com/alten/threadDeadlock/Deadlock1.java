package com.alten.threadDeadlock;

public class Deadlock1 extends Thread {

	Recurso a;
	Recurso b;
	String msg;

	// constructor
	public Deadlock1(Recurso a, Recurso b, String msg) {
		super(msg);
		this.a = a;
		this.b = b;
		this.msg = msg;
	}

	// implementación run
	public void run() {
		synchronized (a) {
			try {
				System.out.println(this.msg + " Cojo el recurso primero ");
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(this.msg + " esperando a coger el recurso segundo ");
			synchronized (b) {
				System.out.println(this.msg + "Cojo el recurso segundo  ");
			}

			System.out.println(" hilo " + this.msg + " acabado "); // nunca se
																	// llega a
																	// esta
																	// línea de
																	// código
		}
	}

}