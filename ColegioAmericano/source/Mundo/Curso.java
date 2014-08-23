package Mundo;

import java.util.ArrayList;

public class Curso {

	
	private ArrayList<Materia> materias;
	
	private ArrayList<Estudiante> estudiantes;
	
	private String nombre;
	
	public Curso ( String nombre){
		
		this.nombre = nombre;
		
		estudiantes = new ArrayList<>();
		
		materias = new ArrayList<>();
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	public void agregarMateria (Materia materia){
		
		materias.add(materia);
	}
	
	public void agregarEstudiante (Estudiante estudiante){
		
		estudiantes.add(estudiante);
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the materias
	 */
	public ArrayList<Materia> getMaterias() {
		return materias;
	}

	/**
	 * @return the estudiantes
	 */
	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}
	
	
}
