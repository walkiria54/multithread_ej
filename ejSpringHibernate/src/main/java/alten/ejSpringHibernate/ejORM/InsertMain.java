package alten.ejSpringHibernate.ejORM;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InsertMain {
	public static void main(String[] args){
		
//		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Alumno.class).buildSessionFactory();
//	Session session=factory.openSession();
	//INSERCION CUANDO YA TENGO LA RELACION ENTRE ALUMNO E INFOALUMNO 
	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
			.addAnnotatedClass(Alumno.class)
			.addAnnotatedClass(Infoalumno.class)
			.buildSessionFactory();
	Session session=factory.openSession();
	
	try{
//		//INSERCION
//		Alumno alumno1= new Alumno("Patricia", "M30", 80);
//		session.beginTransaction();
//		session.save(alumno1);
//		session.getTransaction().commit();
//		System.out.println("Registro "+alumno1.toString()+" insertado");
//		
//		//OBTENCION
//		session.beginTransaction();
//		Alumno alumnoLeido = (Alumno) session.get(Alumno.class, alumno1.getId());
//		session.getTransaction().commit();
//		System.out.println("Leido registro: "+alumnoLeido.toString());
		
		//INSERCION CUANDO YA TENGO LA RELACION ENTRE ALUMNO E INFOALUMNO 
		//crear los dos objetos
		Alumno alumno1= new Alumno("Antonio", "ccc", 15);
		Infoalumno infoalumno1 = new Infoalumno("antonio@kk.es", "666666666", "info de antonio");
		alumno1.setInfoalumno(infoalumno1);//establecer la relacion entre los dos objetos
		session.beginTransaction();
		session.save(alumno1);
		session.getTransaction().commit();
		System.out.println("Registro "+alumno1.toString()+" insertado");
		
		
		
	}catch(Exception e){
		System.out.println(e.getStackTrace());
		System.out.println("Error "+e.getMessage());
		
	}finally{
		session.close();
		factory.close();
	}
	
	}

}
