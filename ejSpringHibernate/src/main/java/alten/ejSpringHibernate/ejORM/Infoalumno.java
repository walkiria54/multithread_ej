package alten.ejSpringHibernate.ejORM;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="infoalumno")
public class Infoalumno {


	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY) 
	int id;
	@Column(name="correo")
	String correo;
	@Column(name="tfno")
	String tfno;
	@Column(name="descrip")
	String descrip;
	
	
	//RELACION CON Alumno 
	@OneToOne(mappedBy="infoalumno", cascade=CascadeType.ALL)
	private Alumno alumno;
	
	//getter-setter de alumno
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}


	//x defecto
	public Infoalumno() {
		super();
	}

	//ctor
	public Infoalumno(String correo, String tfno, String descrip) {
		super();
		this.correo = correo;
		this.tfno = tfno;
		this.descrip = descrip;
	}
	
	
	//getters y setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTfno() {
		return tfno;
	}
	public void setTfno(String tfno) {
		this.tfno = tfno;
	}
	public String getDescrip() {
		return descrip;
	}
	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	
	//para poder imprimir toda la info
	@Override
	public String toString() {
		return "Infoalumno [id=" + id + ", correo=" + correo + ", tfno=" + tfno + ", descrip=" + descrip + "]";
	}
	
	
}
