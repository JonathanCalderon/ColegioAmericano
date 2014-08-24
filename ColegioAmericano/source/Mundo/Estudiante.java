package Mundo;

import java.util.ArrayList;

public class Estudiante {

	
	private String nombre;
	
	
	
	private String id;
	
	private ArrayList<Nota> notas;

	/**
	 * @param nombre
	 * @param curso
	 */
	public Estudiante(String nombre, String id) {
		super();
		this.nombre = nombre;
		
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
	
	
	public String toString(){
		
		return nombre+ " - "+id;
	}
	
	
}
