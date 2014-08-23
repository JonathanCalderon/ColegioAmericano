package Interfaz;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.*;
import java.awt.Color;

public class PanelConsolidados extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1889234042725987206L;



	private JComboBox <String> comboCursos; 

	private JComboBox <String> comboPeriodos; 

	private JButton buscar;

	private InterfazPrincipal principal;

	public PanelConsolidados (InterfazPrincipal principal){
		setBackground(Color.WHITE);

		this.principal = principal;

		setLayout( new BorderLayout());

		comboCursos = new JComboBox<>();

		for (int i = 0; i < principal.darCursos().size(); i++) {

			comboCursos.addItem(principal.darCursos().get(i).getNombre());
		}

		comboPeriodos = new JComboBox<>();
		
		comboPeriodos.addItem("PRIMERO");
		comboPeriodos.addItem("SEGUNDO");
		comboPeriodos.addItem("TERCERO");
		comboPeriodos.addItem("CUARTO");

		buscar = new JButton("BUSCAR");

		JPanel panelArriba = new JPanel();

		panelArriba.setLayout(new GridLayout(1,7));


		panelArriba.add(new JLabel("GRADOS"));
		panelArriba.add(comboCursos);
		panelArriba.add(new JLabel(""));
		panelArriba.add(new JLabel("PERIODOS"));
		panelArriba.add(comboPeriodos);
		panelArriba.add(new JLabel(""));
		panelArriba.add(buscar);


		add( panelArriba, BorderLayout.NORTH);
	}

}
