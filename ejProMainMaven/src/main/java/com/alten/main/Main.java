package com.alten.main;

import com.alten.simple.Alumno;

public class Main{
	public static void main(String[] args){
		System.out.println("Este es un programa Main simple");
		generaAlumno("Pepe");
		
	}
	public static void generaAlumno(String nombre){
		Alumno alumno = new Alumno();
		alumno.setNombre(nombre);
		System.out.println("Llamada al proyecto de dependencia");
		System.out.println("El alumno es "+nombre);
	}
	
	
}