package Interfaz;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

import Mundo.Americano;
import Mundo.Curso;

import java.awt.Color;
import java.util.ArrayList;
import java.awt.Component;

public class InterfazPrincipal extends JFrame {


	/**
	 * 
	 */
	private static final long serialVersionUID = 5047363876068567006L;

	private Americano mundo;

	private JTabbedPane tabPesta�as;

	private PanelEstudiantes panelEstudiantes;

	private PanelNotas panelNotas;

	private PanelLogros panelLogros;

	private PanelConsolidados panelConsolidados;

	private PanelBoletines panelBoletines;

	private PanelAcciones panelAcciones;

	public InterfazPrincipal (){


		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBackground(Color.WHITE);
		setSize(new Dimension(1316, 450));

		try {
			mundo = new Americano();
		} catch (Exception e) {

			JOptionPane.showMessageDialog(this, "Error cargando la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
		}
		setTitle("Colegio Americano");
		tabPesta�as = new JTabbedPane();
		tabPesta�as.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		tabPesta�as.setBackground(Color.WHITE);
		setLocationRelativeTo(null);
		setPreferredSize(new Dimension(500, 200));
		setLayout(new BorderLayout());

		panelEstudiantes = new PanelEstudiantes(this);

		tabPesta�as.addTab("Estudiantes", panelEstudiantes);

		panelNotas = new PanelNotas(this);

		tabPesta�as.addTab("Notas", panelNotas);

		panelLogros = new PanelLogros(this);

		tabPesta�as.addTab("Logros", panelLogros);

		panelConsolidados = new PanelConsolidados(this);

		tabPesta�as.addTab("Consolidados", panelConsolidados);

		panelBoletines = new PanelBoletines();

		tabPesta�as.addTab("Boletines", panelBoletines);

		panelAcciones = new PanelAcciones(this);

		tabPesta�as.addTab("Acciones", panelAcciones);

		add(tabPesta�as, BorderLayout.CENTER);

	}

	/**
	 * Se encarga del principal hilo de ejecuci�n
	 * @param args
	 */
	public static void main (String args[]){

		InterfazPrincipal in = new InterfazPrincipal();

		in.setVisible(true);

	}

	/**
	 * Retorna la lista de cursos del sistema
	 * @return
	 */
	public ArrayList<Curso> darCursos(){


		return mundo.getCursos();
	}

	/**
	 * Invoca al mundo, y agrega un nuevo estudiante al sistema
	 */
	public boolean agregarEstudiante(String nombre, String nombreCurso, String id){

		try {

			if ( nombre.equals("")||nombreCurso.equals("")||id.equals(""))
				JOptionPane.showMessageDialog(this, "Falta informaci�n", "Advertencia", JOptionPane.WARNING_MESSAGE);

			else{
				mundo.agregarEstudiante(nombre, nombreCurso, id);
				return true;
			}
		} catch (Exception e) {

			JOptionPane.showMessageDialog(this, e.getMessage(), "Error agregando estudiante", JOptionPane.ERROR_MESSAGE);
		}
		
		return false;
	}

	public ArrayList<String> buscarEstudiantesPorCurso(String curso) {
		
		try {
			return mundo.buscarEstudiantesPorCurso(curso);
		} catch (Exception e) {

			JOptionPane.showMessageDialog(this,	e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			return new ArrayList<String>();
		}
		
	}
}
