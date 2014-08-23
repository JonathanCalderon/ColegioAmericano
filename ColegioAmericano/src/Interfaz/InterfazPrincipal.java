package Interfaz;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import Mundo.Americano;
import Mundo.Curso;

import java.awt.Color;
import java.util.ArrayList;

public class InterfazPrincipal extends JFrame {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5047363876068567006L;

	private Americano mundo;
	
	private JTabbedPane tabPestañas;
	
	private PanelEstudiantes panelEstudiantes;
	
	private PanelNotas panelNotas;
	
	private PanelLogros panelLogros;
	
	private PanelConsolidados panelConsolidados;
	
	private PanelBoletines panelBoletines;
	
	
	public InterfazPrincipal (){
		setSize(new Dimension(1016, 388));
		
		mundo = new Americano();
		tabPestañas = new JTabbedPane();
		tabPestañas.setBackground(Color.WHITE);
		setLocationRelativeTo(null);
		setPreferredSize(new Dimension(500, 200));
		getContentPane().setLayout(new BorderLayout());
		
		panelEstudiantes = new PanelEstudiantes(this);
		
		tabPestañas.addTab("Estudiantes", panelEstudiantes);
		
		panelNotas = new PanelNotas(this);
		
		tabPestañas.addTab("Notas", panelNotas);
		
		panelLogros = new PanelLogros(this);
		
		tabPestañas.addTab("Logros", panelLogros);
		
		panelConsolidados = new PanelConsolidados(this);
		
		tabPestañas.addTab("Consolidados", panelConsolidados);
		
		panelBoletines = new PanelBoletines();
		
		tabPestañas.addTab("Boletines", panelBoletines);
		
		getContentPane().add(tabPestañas, BorderLayout.NORTH);
		
	}
	
	public static void main (String args[]){
		
		InterfazPrincipal in = new InterfazPrincipal();
		
		in.setVisible(true);
		
	}
	
	public ArrayList<Curso> darCursos(){
		
		
		return mundo.getCursos();
	}
}
