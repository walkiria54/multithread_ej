package alten.ejSpringHibernate.queryHQL;

import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import alten.ejSpringHibernate.ejORM.Alumno;

public class UpdateDeleteAlumno {
	
	static void updateNombreWhereBeginM(String name, Session session){
		session.createQuery("update Alumno set nombre='Marta' where nombre like 'M%'").executeUpdate();
	}
	
	
	static void deleteRegistroWhereEdadMayor(int  edad, Session session){
		session.createQuery("delete Alumno  where edad>"+edad).executeUpdate();
	}
}
