/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Mundo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

/**
 *
 * @author Jhony
 */
public class Americano {


	/**
	 * Conexión a la base de datos
	 */
	private Connection conexion;

	/**
	 * Conjunto de propiedades que contienen la configuración de la aplicación
	 */
	private Properties config;


	private ArrayList <Estudiante> estudiantes;

	private ArrayList <Curso> cursos;

	private ArrayList <Profesor> profesores;

	private ArrayList <Materia> materias;

	public Americano () throws Exception{


		String archivoPropiedades = "./data/data.properties";

		FileInputStream fis = new FileInputStream( archivoPropiedades );
		config = new Properties( );
		config.load( fis );
		fis.close( );


		// Establecer la ruta donde va a estar la base de datos.
		// Derby utiliza la propiedad del sistema derby.system.home para saber donde están los datos
		File data = new File( config.getProperty( "admin.db.path" ) );
		System.setProperty( "derby.system.home", data.getAbsolutePath( ) );

		estudiantes = new ArrayList<>();

		cursos = new ArrayList<>();

		profesores = new ArrayList<>();

		materias = new ArrayList<>();

		agregarCursosNormales();
	}

	/**
     * Conecta el administrador a la base de datos
     * @throws SQLException Se lanza esta excepción si hay problemas realizando la operación
     * @throws Exception Se lanza esta excepción si hay problemas con los controladores
     */
    public void conectarABD( ) throws SQLException, Exception
    {
        String driver = config.getProperty( "admin.db.driver" );
        Class.forName( driver ).newInstance( );

        String url = config.getProperty( "admin.db.url" );
        conexion = DriverManager.getConnection( url );
        verificarInvariante();
    }

    /**
     * Desconecta el administrador de la base de datos y la detiene
     * @throws SQLException Se lanza esta excepción si hay problemas realizando la operación
     */
    public void desconectarBD( ) throws SQLException
    { 
        conexion.close( );
        String down = config.getProperty( "admin.db.shutdown" );
        try
        {
            DriverManager.getConnection( down );
        }
        catch( SQLException e )
        {
            // Al bajar la base de datos se produce siempre una excepción
        }
        verificarInvariante();
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

		Estudiante estudiante = new Estudiante(nombre, id);

		if ( buscarEstudiantePorId(id)!=null)
			throw new Exception("Ya existe un estudiante con los mismos datos");

		estudiantes.add(estudiante);
		cursoActual.agregarEstudiante(estudiante);
	}

	/**
	 * Busca un estudiante con el mismo id, retorna null si no lo encuentra
	 * @param id
	 * @return
	 */
	private Estudiante buscarEstudiantePorId(String id) {
	
		for (int i = 0; i < estudiantes.size(); i++) {
			
			if ( estudiantes.get(i).getId().equals(id))
				return estudiantes.get(i);
		}
		return null;
	}

	/**
	 * Busca un curso dado su nombre
	 * @param nombreCurso
	 * @return
	 */
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


	/**
	 * Retorna todos los estudiantes que se encuentren en un curso
	 * @return
	 */
	public ArrayList<String> buscarEstudiantesPorCurso(String nombreCurso) throws Exception{

		Curso curso = buscarCurso(nombreCurso);

		if ( curso == null)
			throw new Exception("No existe ese curso");

		ArrayList<String> respuesta = new ArrayList<String>();
		ArrayList<Estudiante> estudiantesPorCurso = curso.getEstudiantes();

		for (int i = 0; i < estudiantesPorCurso.size(); i++) {

			respuesta.add(estudiantesPorCurso.get(i).toString());
		}

		return respuesta;
	}



    // -----------------------------------------------------------------
    // Invariante
    // -----------------------------------------------------------------
    /**
     * Verifica el invariante de la clase <br>
     * <b>inv:</b><br>    
     * config!=null <br>
     */
    private void verificarInvariante( )
    {                
        assert config != null : "Conjunto de propiedades inválidas";                           
    }
}
