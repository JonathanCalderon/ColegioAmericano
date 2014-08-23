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
	
	private JTabbedPane tabPesta�as;
	
	private PanelEstudiantes panelEstudiantes;
	
	private PanelNotas panelNotas;
	
	private PanelLogros panelLogros;
	
	private PanelConsolidados panelConsolidados;
	
	private PanelBoletines panelBoletines;
	
	
	public InterfazPrincipal (){
		setSize(new Dimension(1016, 388));
		
		mundo = new Americano();
		tabPesta�as = new JTabbedPane();
		tabPesta�as.setBackground(Color.WHITE);
		setLocationRelativeTo(null);
		setPreferredSize(new Dimension(500, 200));
		getContentPane().setLayout(new BorderLayout());
		
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
		
		getContentPane().add(tabPesta�as, BorderLayout.NORTH);
		
	}
	
	public static void main (String args[]){
		
		InterfazPrincipal in = new InterfazPrincipal();
		
		in.setVisible(true);
		
	}
	
	public ArrayList<Curso> darCursos(){
		
		
		return mundo.getCursos();
	}
}
