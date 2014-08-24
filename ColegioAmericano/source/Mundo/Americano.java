/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Mundo;

import java.util.ArrayList;

/**
 *
 * @author Jhony
 */
public class Americano {


	private ArrayList <Estudiante> estudiantes;

	private ArrayList <Curso> cursos;

	private ArrayList <Profesor> profesores;

	private ArrayList <Materia> materias;

	public Americano (){

		estudiantes = new ArrayList<>();

		cursos = new ArrayList<>();

		profesores = new ArrayList<>();

		materias = new ArrayList<>();

		agregarCursosNormales();
	}


	public void agregarCursosNormales(){

		cursos.add(new Curso("Kinder"));
		cursos.add(new Curso("Transición"));
		cursos.add(new Curso("Primero"));
		cursos.add(new Curso("Segundo"));
		cursos.add(new Curso("Tercero"));
		cursos.add(new Curso("Cuarto"));
		cursos.add(new Curso("Quinto"));
		cursos.add(new Curso("Sexto"));
		cursos.add(new Curso("Séptimo"));
		cursos.add(new Curso("Octavo"));
		cursos.add(new Curso("Noveno"));
		cursos.add(new Curso("Décimo"));
		cursos.add(new Curso("Undécimo"));


	}
	/**
	 * @return the estudiantes
	 */
	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	/**
	 * @param estudiantes the estudiantes to set
	 */
	public void agregarEstudiante(String nombre, String nombreCurso, String id) throws Exception {

		Curso cursoActual = buscarCurso (nombreCurso);

		if ( cursoActual == null)
			throw new Exception("No existe ese curso");

		Estudiante estudiante = new Estudiante(nombre, cursoActual, id);

		if ( estudiantes.contains(estudiante))
			throw new Exception("Ya existe un estudiante con los mismos datos");

		estudiantes.add(estudiante);
	}

	public Curso buscarCurso(String nombreCurso) {

		for (int i = 0; i < cursos.size(); i++) {

			if ( cursos.get(i).getNombre().equals(nombreCurso))
				return cursos.get(i);

		}		
		return null;
	}


	/**
	 * @return the cursos
	 */
	public ArrayList<Curso> getCursos() {
		return cursos;
	}

	/**
	 * Agrega un nuevo curso al sistema
	 * @param cursos the cursos to set
	 */
	public void agregarCurso(String nombreCurso) throws Exception {

		Curso cursoNuevo = new Curso(nombreCurso);

		if ( cursos.contains(cursoNuevo))
			throw new Exception("Ya existe un curso con el mismo nombre");

		cursos.add(cursoNuevo);
	}

	/**
	 * @return the profesores
	 */
	public ArrayList<Profesor> getProfesores() {
		return profesores;
	}

	/**
	 * Agrega un nuevo profesor al sistema
	 * @param profesores the profesores to set
	 */
	public void agregarProfesor(String nombre, String cedula) throws Exception{


		//Busca que no haya un profesor con esa cédula
		if ( buscarProfesorPorCedula(cedula)!=null)
			throw new Exception("Ya existe una persona con esa cédula");

		Profesor pNuevo = new Profesor(nombre, cedula);

		profesores.add(pNuevo);
	}

	/**
	 * @return the materias
	 */
	public ArrayList<Materia> getMaterias() {
		return materias;
	}

	/**
	 * @param materias the materias to set
	 */
	public void agregarMaterias(String nombre, String nomProfesor) {

		Profesor profesor = buscarProfesorPorNombre( nomProfesor);
		Materia mNueva = new Materia(nombre, profesor);
		materias.add(mNueva);
	}

	/**
	 * Busca un profesor por el nombre
	 * @param nomProfesor
	 * @return
	 */
	private Profesor buscarProfesorPorNombre(String nomProfesor) {

		for (int i = 0; i < profesores.size(); i++) {

			if ( profesores.get(i).getNombre().equals(nomProfesor))
				return profesores.get(i);
		}
		return null;
	}

	/**
	 * Busca un profesor por su cédula
	 * @param cedula
	 * @return
	 */
	private Profesor buscarProfesorPorCedula(String cedula) {

		for (int i = 0; i < profesores.size(); i++) {

			if ( profesores.get(i).getCedula().equals(cedula))
				return profesores.get(i);
		}
		return null;
	}


}
