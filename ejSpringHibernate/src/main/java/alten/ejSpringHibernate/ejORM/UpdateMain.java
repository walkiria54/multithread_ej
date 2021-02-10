package alten.ejSpringHibernate.ejORM;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateMain {
	public static void main(String[] args){
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Alumno.class).buildSessionFactory();
	Session session=factory.openSession();
	try{
		//UPDATE ORM
		int alumnoId=1;
		session.beginTransaction();
		Alumno alumno = (Alumno) session.get(Alumno.class, alumnoId);
		//setters y getters de la clase me serviran para actuar sobre la bbdd
		alumno.setNombre("Daniel");
		session.getTransaction().commit();
		System.out.println("Registro "+alumno.toString()+" actualizado");
		
		
		
		
		

		
		
		
	}catch(Exception e){
		System.out.println(e.getStackTrace());
		System.out.println("Error "+e.getMessage());
		
	}finally{
		session.close();
		factory.close();
	}
	
	}

}
