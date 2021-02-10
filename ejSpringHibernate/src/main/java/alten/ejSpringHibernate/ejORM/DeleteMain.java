package alten.ejSpringHibernate.ejORM;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteMain {
	public static void main(String[] args){
		

	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
			.addAnnotatedClass(Alumno.class)
			.addAnnotatedClass(Infoalumno.class)
			.buildSessionFactory();
	Session session=factory.openSession();
		try{

	//borrado de dato de una tabla relacionado con otro (cascada) 
		session.beginTransaction();
		Alumno alABorrar=(Alumno) session.get(Alumno.class, 3);
		if (alABorrar !=null){
			session.delete(alABorrar);
			System.out.println("Registro "+alABorrar.toString()+" borrado");
		}else{
			
			System.out.println("Registro no encontrado");
		}
		
		//borrado de datos de la tabla infoalumno incluidos los datos de tabla referenciada alumno , en cascada
//		Infoalumno infoalumno = (Infoalumno) session.get(Infoalumno.class, 1);
//		if(infoalumno !=null){
//			System.out.println("Borrado del alumno en casacada desde infoAlumno "+infoalumno.toString());
//		session.delete(infoalumno);
//		
//		}else{
//			System.out.println("No encontrado");
//		}
	
		
		//borrado de datos de tabla infoalumno sin borrar datos de la tabla referenciada alumno
		Infoalumno infoAlumno = (Infoalumno) session.get(Infoalumno.class, 1);
		if (infoAlumno !=null){
			session.delete(infoAlumno);
			System.out.println("Registro "+infoAlumno.toString()+" borrado");
		}else{
			
			System.out.println("Registro no encontrado");
		}

	}catch(Exception e){
		System.out.println(e.getStackTrace());
		System.out.println("Error "+e.getMessage());
		
	}finally{
		session.close();
		factory.close();
	}
	
	}

}
