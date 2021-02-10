package alten.ejSpringHibernate.ejORM;


import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import alten.ejSpringHibernate.queryHQL.QueryAlumno;

public class AnadeCursosAlumno {
	public static void main(String[] args){
		//comented use anadeescuelacursos
//
//	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
//			.addAnnotatedClass(Alumno.class)
//			.addAnnotatedClass(Infoalumno.class)
//			.addAnnotatedClass(Curso.class)
//			.buildSessionFactory();
//	Session session=factory.openSession();
//	
//	try{
//		
//		//INSERCION CUANDO YA TENGO LA RELACION ENTRE ALUMNO E INFOALUMNO 
//		//crear los dos objetos
//		Alumno alumno1= new Alumno("Rosa", "xxx", 12);
//		Infoalumno infoalumno1 = new Infoalumno("rosa@kk.es", "666666666", "info de rosa");
//		alumno1.setInfoalumno(infoalumno1);//establecer la relacion entre los dos objetos
//		session.beginTransaction();
//		session.save(alumno1);
//		session.getTransaction().commit();
//		System.out.println("Registro "+alumno1.toString()+" insertado con id "+alumno1.getId());
//			
//		//apuntar a ese alumno a un curso 
//		session.beginTransaction();
//		Alumno alumnoIns=(Alumno) session.get(Alumno.class, alumno1.getId());
//		System.out.println("Obtencion del alumno  con id "+alumnoIns.getId());
//		Curso curso1= new Curso(new GregorianCalendar(2020, 10, 5), "curso de html");
//		Curso curso2= new Curso(new GregorianCalendar(2020, 8, 10), "curso de spring");
//		Curso curso3= new Curso(new GregorianCalendar(2019, 12, 10), "curso de hibernate");
//
//		//Añadir relacion orm alumno y 3 cursos
//		alumnoIns.apuntaAlCurso(curso1);
//		alumnoIns.apuntaAlCurso(curso2);
//		alumnoIns.apuntaAlCurso(curso3);
//		
//		//save en BBDD del ORM
//		session.save(curso1);
//		session.save(curso2);
//		session.save(curso3);
//				session.getTransaction().commit();
//
//	
//				System.out.println("Apunte a cursos para el alumno "+alumnoIns.toString()+" correcto");
//				List<Curso> listaCursos=alumnoIns.getCursos();
//
//				System.out.println("El alumnno "+alumnoIns.getNombre()+" se ha inscrito a:");
//	
//				for (Curso curso : listaCursos) {
//					System.out.println(curso.descrip);
//				}
//		
//		
//				//obtencion de datos 1-n con LAZY y HQL
//				//	
//				// a pesar de RELACION Alumno con Curso @OneToMany(fetch=FetchType.LAZY,
//				//  el objeto obtenido en HQL es integro
//		List<Alumno> listaAlumnos=QueryAlumno.obtieneAlumnoPorId(session, alumnoIns.getId());//se q tiene q ser uno solo
//		Alumno alHQL= listaAlumnos.get(0);
//		//objeto alHQL tendrá informacion de todo el objeto aunque sea LAZY
//		
//		session.close(); //CIERRE DE LA CONEXION ANTES DE OBTENER EL DATO DE CURSOS 
//		
//		//obtencion de los cursos de un determinado alumno una vez insertado
//		List<Curso>listaCursosHQL=alHQL.getCursos(); //con HQL a pesar de ser lazy los tengo
//		System.out.println("HQL_El alumnno "+alumnoIns.getNombre()+" se ha inscrito a:");
//		
//		for (Curso curso : listaCursos) {
//			System.out.println("HQL_"+curso.descrip);
//		}
//
//				
//		
//	
//		
//	}catch(Exception e){
//		System.out.println(e.getStackTrace());
//		System.out.println("Error "+e.getMessage());
//		
//	}finally{
//		
//		factory.close();
//	}
//	
	}

}
