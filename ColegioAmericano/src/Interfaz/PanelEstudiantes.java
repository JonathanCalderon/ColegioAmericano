package Interfaz;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.*;
import java.awt.Color;

public class PanelEstudiantes extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1889234042725987206L;

	private JComboBox <String> comboCursos; 
	
	private JButton butBuscarEstudiantes;
	
	private InterfazPrincipal principal;
	
	public PanelEstudiantes (InterfazPrincipal principal){
		setBackground(Color.WHITE);
		
		
		this.principal = principal;
		
		setLayout( new BorderLayout());
		comboCursos = new JComboBox<>();
		
		for (int i = 0; i < principal.darCursos().size(); i++) {
			
			comboCursos.addItem(principal.darCursos().get(i).getNombre());
		}
		butBuscarEstudiantes = new JButton("BUSCAR");
		
		JPanel panelArriba = new JPanel();
		
		panelArriba.setLayout(new GridLayout(1,4));
		
		
		panelArriba.add(new JLabel("GRADOS"));
		panelArriba.add(comboCursos);
		panelArriba.add(new JLabel(""));
		panelArriba.add(butBuscarEstudiantes);
		
		
		add( panelArriba, BorderLayout.NORTH);
	}
	
}
