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
	public void agregarEstudiante(Estudiante estudiante) {
		
		estudiantes.add(estudiante);
	}

	/**
	 * @return the cursos
	 */
	public ArrayList<Curso> getCursos() {
		return cursos;
	}

	/**
	 * @param cursos the cursos to set
	 */
	public void agregarCurso(Curso curso) {
		
		cursos.add(curso);
	}

	/**
	 * @return the profesores
	 */
	public ArrayList<Profesor> getProfesores() {
		return profesores;
	}

	/**
	 * @param profesores the profesores to set
	 */
	public void agregarProfesore(Profesor profesor) {

		profesores.add(profesor);
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
	public void agregarMaterias(Materia materia) {

		materias.add(materia);
	}



}
