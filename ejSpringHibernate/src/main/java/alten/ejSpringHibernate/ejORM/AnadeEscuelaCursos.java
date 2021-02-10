package alten.ejSpringHibernate.ejORM;


import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.FetchType;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class AnadeEscuelaCursos {
	public static void main(String[] args){

	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
			.addAnnotatedClass(Curso.class)
			.addAnnotatedClass(Escuela.class)
			.buildSessionFactory();
	Session session=factory.openSession();
	
	try{
		session.beginTransaction();
		
				Curso curso1 = new Curso();
				curso1.setDescrip("ingles");
			
				Curso curso2 = new Curso();
				curso2.setDescrip("frances");
				Curso curso3 = new Curso();
				curso3.setDescrip("portugues");
//Escuelas
			Escuela escuela1 = new Escuela();
			escuela1.setDescrip("escuela de Valladolid");
			escuela1.addCurso(curso1);
			escuela1.addCurso(curso2);
			escuela1.addCurso(curso3);
			
			Escuela escuela2 = new Escuela();
			escuela2.setDescrip("escuela de Bilbao");
			escuela2.addCurso(curso1);
			escuela2.addCurso(curso2);
			escuela2.addCurso(curso3);
			
			Escuela escuela3 = new Escuela();
			escuela3.setDescrip("escuela de Madrid");
			escuela3.addCurso(curso1);
			escuela3.addCurso(curso2);
			escuela3.addCurso(curso3);
			
			//save en BBDD del ORM
			session.save(escuela1);
			session.save(escuela2);
			session.save(escuela3);
			session.getTransaction().commit();
		
			System.out.println("Hecho!");
		
	}catch(Exception e){
		System.out.println(e.getStackTrace());
		System.out.println("Error "+e.getMessage());
		
	}finally{
		
		factory.close();
	}
	
	}

}
