/**
 * 
 */
package alten.ejSpringHibernate.ejORM;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author rocio.dedios
 *
 */
@Entity
@Table(name="curso")
public class Curso {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY) 
	int id;
	@Column(name="fecha")
	@Temporal(TemporalType.TIMESTAMP)
	Calendar fecha;
	@Column(name="descrip")
	String descrip;
	
	//comment use anadeescuelacursos
//	@ManyToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
//	@JoinColumn(name="alumnoId")
//	private Alumno alumno;
	
	
    @ManyToMany(mappedBy = "cursos")
    private List<Escuela> escuelas;


	//ctor
	public Curso(GregorianCalendar gregorianCalendar, String descrip) {
		super();
		this.fecha = gregorianCalendar;
		this.descrip = descrip;
	}
	
	//x dfault
		public Curso() {
		super();
	}
	//gtters-setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Calendar getFecha() {
		return fecha;
	}
	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
	}
	public String getDescrip() {
		return descrip;
	}
	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	
	//comment use anadeescuelacursos
//	public Alumno getAlumno() {
//		return alumno;
//	}
//
//	public void setAlumno(Alumno alumno) {
//		this.alumno = alumno;
//	}
//	

//	@Override
//	public String toString() {
//		return "Curso [id=" + id + ", fecha=" + fecha + ", descrip=" + descrip + ", alumno=" + alumno.toString() + "]";
//	}
	
	
	
}
