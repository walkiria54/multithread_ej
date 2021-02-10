package alten.ejSpringHibernate.ejORM;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;

public class SelectMain {
	public static void main(String[] args){
		

	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
			.addAnnotatedClass(Alumno.class)
			.addAnnotatedClass(Infoalumno.class)
			.buildSessionFactory();
	Session session=factory.openSession();
		try{

			session.beginTransaction();
	//obtencion de alumno con info 

			Infoalumno infoalumno = (Infoalumno) session.get(Infoalumno.class, 1);
			Alumno al=infoalumno.getAlumno();
			System.out.println("Obtencion de "+al.toString()+ "para la informacion "+infoalumno.toString());
			
			
			
//			//ejemplo con Criteria (para ejecución dejar solamente la Entity Alumno)
//			
//			Criteria miCriteria=session.createCriteria(Alumno.class);
//			miCriteria.setMaxResults(2);
//			@SuppressWarnings("unchecked")
//			List<Alumno> alumnos = miCriteria.list();
//			for (Alumno alumno : alumnos) {
//				System.out.println(alumno.getNombre());
//			}
//			
//			//con restricciones y ordenado
//			List<Alumno> alBeginA = session.createCriteria(Alumno.class)
//					.add(Restrictions.like("nombre","A%"))
//					.addOrder(Property.forName("nombre").desc())		
//					.list();
//			for (Alumno alumno : alBeginA) {
//				System.out.println(alumno.toString());
//			}
		
			
			
		
		session.getTransaction().commit();
		

	}catch(Exception e){
		System.out.println(e.getStackTrace().toString());
		System.out.println("Error "+e.getMessage());
		
	}finally{
		session.close();
		factory.close();
	}
	
	}

}
