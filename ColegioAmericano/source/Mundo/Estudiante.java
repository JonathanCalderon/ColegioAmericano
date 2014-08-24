package Mundo;

import java.util.ArrayList;

public class Estudiante {

	
	private String nombre;
	
	private Curso curso;
	
	private String id;
	
	private ArrayList<Nota> notas;

	/**
	 * @param nombre
	 * @param curso
	 */
	public Estudiante(String nombre, Curso curso, String id) {
		super();
		this.nombre = nombre;
		this.curso = curso;
		this.id = id;
		notas = new ArrayList<>();
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
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the curso
	 */
	public Curso getCurso() {
		return curso;
	}

	/**
	 * @param curso the curso to set
	 */
	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	/**
	 * @return the notas
	 */
	public ArrayList<Nota> getNotas() {
		return notas;
	}

	/**
	 * @param notas the notas to set
	 */
	public void agregarNota(Nota nota) {
		
		notas.add(nota);
	}
	
	
	
	
}
