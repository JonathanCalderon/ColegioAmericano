package Interfaz;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
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
	
	
	public InterfazPrincipal (){
		
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBackground(Color.WHITE);
		setSize(new Dimension(1016, 388));
		
		mundo = new Americano();
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
		
		add(tabPesta�as, BorderLayout.CENTER);
		
	}
	
	public static void main (String args[]){
		
		InterfazPrincipal in = new InterfazPrincipal();
		
		in.setVisible(true);
		
	}
	
	public ArrayList<Curso> darCursos(){
		
		
		return mundo.getCursos();
	}
	
	
}
