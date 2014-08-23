package Mundo;

import java.util.ArrayList;

public class Materia {

	
	private ArrayList<Logro> logros;
	
	private String nombre;
	
	private Profesor profesor;

	/**
	 * @param nombre
	 * @param profesor
	 */
	public Materia(String nombre, Profesor profesor) {
		super();
		this.nombre = nombre;
		this.profesor = profesor;
		
		logros = new ArrayList<>();
	}

	/**
	 * @return the logros
	 */
	public ArrayList<Logro> getLogros() {
		return logros;
	}

	/**
	 * @param logros the logros to set
	 */
	public void agregarLogros(Logro logro) {
		
		logros.add(logro);
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the profesor
	 */
	public Profesor getProfesor() {
		return profesor;
	}

	/**
	 * @param profesor the profesor to set
	 */
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	
	
	
	
}
