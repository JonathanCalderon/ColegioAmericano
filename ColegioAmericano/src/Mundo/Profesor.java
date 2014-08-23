package Mundo;

import java.util.ArrayList;

public class Profesor {

	
	private ArrayList<Materia> materias;
	
	private String nombre;
	
	private String cedula;

	
	
	/**
	 * @param nombre
	 * @param cedula
	 */
	public Profesor(String nombre, String cedula) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		materias = new ArrayList<>();
	}
	
	public void agregarMateria ( Materia materia){
		
		materias.add(materia);
	}

	public ArrayList<Materia> getMaterias(){
		
		return materias;
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
	 * @return the cedula
	 */
	public String getCedula() {
		return cedula;
	}

	/**
	 * @param cedula the cedula to set
	 */
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	
	
}
