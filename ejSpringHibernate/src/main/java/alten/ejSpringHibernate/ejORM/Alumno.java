package alten.ejSpringHibernate.ejORM;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="alumno")
public class Alumno {


	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY) 
	int id;
	@Column(name="nombre")
	String nombre;
	@Column(name="direccion")
	String direccion;
	@Column(name="edad")
	int edad;

	
	//RELACION CON Infoalumno 
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private Infoalumno infoalumno;
	
	//comented use anadeescuelacursos
//	//RELACION con Curso
//	@OneToMany(fetch=FetchType.LAZY, mappedBy="alumno",cascade={CascadeType.PERSIST, CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
//	private List<Curso> cursos;
//	
//	
	
	//Ctor
	public Alumno(String nombre, String direccion, int edad) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.edad = edad;
	}
	//x defecto
	public Alumno() {
	}
	
	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", edad=" + edad + "]";
	}
//getters-setters 
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	

	
	public Infoalumno getInfoalumno() {
		return infoalumno;
	}
	public void setInfoalumno(Infoalumno infoalumno) {
		this.infoalumno = infoalumno;
	}
	
	//comented use anadeescuelacursos
//	
//	public void apuntaAlCurso(Curso curso){
//		if (cursos==null){
//			cursos=new ArrayList<Curso>();
//		}
//		cursos.add(curso);
//		curso.setAlumno(this);
//	}
//
//	
//	//getter-setter de la lista de cursos
//	public List<Curso> getCursos() {
//		return cursos;
//	}
//	public void setCursos(List<Curso> cursos) {
//		this.cursos = cursos;
	}
//}
