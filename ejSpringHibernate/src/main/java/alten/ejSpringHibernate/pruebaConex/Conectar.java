package alten.ejSpringHibernate.pruebaConex;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class Conectar {
	public static void main(String[] args){
		
		String urlJDBC="jdbc:mysql://localhost:3308/pruebashibernate?useSSL=false"; //segun la config q tengo en WAMP

				String user="root"; String pass="";
				try{
					System.out.println("conectando a :"+urlJDBC);
					Connection conex=(Connection) DriverManager.getConnection(urlJDBC,user, pass);
					System.out.println("Hecho");
					
					//Consulta JDBC
						PreparedStatement stmt = (PreparedStatement) conex.prepareStatement("SELECT NOMBRE FROM ALUMNO WHERE direccion = ?");
						stmt.setString(1, "xxx");
						ResultSet rs=stmt.executeQuery();
						while(rs.next()){
						System.out.println("Nombre del alumno: "+rs.getString("nombre"));
						}
				}catch (SQLException s)
				{
					System.out.println(s.getErrorCode()+s.getMessage());
					
				}catch (Exception e){
					System.out.println(e);
				}
				
		 
				

	}

}
