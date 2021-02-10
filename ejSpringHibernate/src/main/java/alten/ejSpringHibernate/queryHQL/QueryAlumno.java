package alten.ejSpringHibernate.queryHQL;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import alten.ejSpringHibernate.ejORM.Alumno;

public class QueryAlumno {




static List<Alumno> obtenerTodosAlumnos(Session session) {
	//return  session.createQuery("from Alumno").list();
	return session.createQuery("from "+Alumno.class.getName()).list();
}

	static Alumno obtenerAlumnoPorId(int id, Session session){
		Alumno alId = (Alumno)session.createQuery("from Alumno a where a.id=1").uniqueResult();
		return alId;
	}

	
	static List<Alumno> obtenerAlumnosMariaYPepe(Session session) {
		return session.createQuery("from Alumno a where a.nombre='Maria' or a.nombre='Pepe' " ).list();
	}

	static List<Alumno> obtenerAlumnosMaria(Session session) {
		return session.createQuery("from Alumno a where a.nombre='Maria'" ).list();
	}
	
//	private static List<Alumno> queryParametrizada(Session session,   String tabla, String param1WhereCampo, String param1WhereValor ){
//		String query = "from "+ tabla+ " a where a."+param1WhereCampo+"='"+param1WhereValor+"'";
//		System.out.println("query "+query);
//		return session.createQuery(query).list();
//	}
//	
	
	public static List<Alumno> obtieneAlumnoPorId(Session session, int idAlumno){
	//obtencion con HQL
			//List<Alumno> dameCursosAl=session.createQuery("SELECT a FROM alumno a JOIN FETCH a.cursos WHERE a.id=:idParam").list();
			Query dameCursosAl = session.createQuery("SELECT a FROM Alumno a JOIN FETCH a.cursos WHERE a.id=:idParam");
			dameCursosAl.setParameter("idParam", idAlumno);
			
			List<Alumno> listaAlumnos=dameCursosAl.list();
			return listaAlumnos;
	
	}

}
