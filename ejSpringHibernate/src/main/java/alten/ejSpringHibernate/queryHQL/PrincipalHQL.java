/**
 * 
 */
package alten.ejSpringHibernate.queryHQL;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import alten.ejSpringHibernate.ejORM.Alumno;
/**
 * @author rocio.dedios
 *
 */
public class PrincipalHQL {
	



public static void main(String[] args){
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Alumno.class).buildSessionFactory();
	Session session=factory.openSession();
	try{
		
		session.beginTransaction();
		
	
	
		List<Alumno> todos = QueryAlumno.obtenerTodosAlumnos(session);
		muestraConsulta(todos);
		
		muestraConsulta(QueryAlumno.obtenerAlumnosMaria(session));
		
		
		muestraConsulta(QueryAlumno.obtenerAlumnosMariaYPepe(session));
		
//		
//		muestraConsulta(queryParametrizada(	session, Alumno.class.getName(), "direccion", "M30") );
//			

		
		//1 solo
		System.out.println(QueryAlumno.obtenerAlumnoPorId(1, session).toString());
		
	
		
		//UPDATE HQL
		UpdateDeleteAlumno.updateNombreWhereBeginM("Maria",session);
		
		//DELETE HQL 
		UpdateDeleteAlumno.deleteRegistroWhereEdadMayor(18, session);
		
		

		
		
		session.getTransaction().commit();
	
		
		
	}catch(Exception e){
		System.out.println(e.getStackTrace());
		System.out.println("Error "+e.getMessage());
		
	}finally{
		session.close();
		factory.close();
	}




}
private static void muestraConsulta(List<Alumno> registrosPepeOrMaria) {
	System.out.println("----------------");
	for (Alumno alumnoObtenido : registrosPepeOrMaria) {
		System.out.println(alumnoObtenido);

	}
}


}
