/**
 * 
 */
package alten.ejSpringHibernate.ejORM;


import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
@Table(name="escuela")
public class Escuela {


	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY) 
	int id;
	@Column(name="descrip")
	String descrip;
	@Column(name="nombre")
	String nombre;
	
	@JoinTable(name="relescuelacurso",
			joinColumns=@JoinColumn(name ="escuelaId", nullable=false),
			inverseJoinColumns = @JoinColumn(name="cursoId",nullable = false)
			)
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Curso> cursos;
	//metodo para añadir
	public void addCurso(Curso curso){
		if (this.cursos == null){
			this.cursos=new ArrayList<Curso>();
		}
		this.cursos.add(curso);
	}



	//ctor
	public Escuela(String nombre, String descrip) {
		super();
		this.nombre = nombre;
		this.descrip = descrip;
	}
	
	//x dfault
		public Escuela() {
		super();
	}
	//gtters-setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescrip() {
		return descrip;
	}
	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

}
