package alten.ejJUnit;

import java.util.ArrayList;
import java.util.List;



public class Alumno {



	String nombre;
	String apelllido;

	String sexo;
	//getter y setter
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	int edad;
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	//Ctor
	public Alumno(String nombre,String apellido, String sexo, int edad) {
		this.nombre = nombre;
		this.apelllido=apellido;
		this.sexo = sexo;
		this.edad = edad;
	}
	//Ctor
	public Alumno(String nombre,String apellido) {
		this.nombre = nombre;
		this.apelllido=apellido;
	}

	//x defecto
	public Alumno() {
	}
	
	
	public String concatenaNomApe(String n, String a){
		return n.concat(a);
	}
	
	public Alumno creaAlumnoMale(){
		Alumno al=new Alumno();
		this.setSexo("Male");
		return al;
	}
	
	public Alumno creaAlumnoEdad(int edad){
		Alumno al=new Alumno();
		this.setEdad(edad);
		return al;
	}
	
	public static String[] generaArrayStrings(String ...strings){
		String [] array = new String [strings.length];
		for (int i = 0; i < strings.length; i++) {
			array[i]=strings[i];
			
		}
		
		return array; 
	}

}
