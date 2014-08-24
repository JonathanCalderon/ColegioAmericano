package Interfaz;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.SystemColor;

public class PanelConsolidados extends JPanel implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1889234042725987206L;

	public static final String BUSCAR_CONSOLIDADOS = "Buscar Consolidados";

	private JComboBox <String> comboCursos; 

	private JComboBox <String> comboPeriodos; 

	private JButton butBuscar;

	private InterfazPrincipal principal;

	public PanelConsolidados (InterfazPrincipal principal){
		setBackground(Color.WHITE);

		this.principal = principal;

		setLayout( new BorderLayout());

		comboCursos = new JComboBox<>();
		comboCursos.setBackground(Color.LIGHT_GRAY);

		for (int i = 0; i < this.principal.darCursos().size(); i++) {

			comboCursos.addItem(this.principal.darCursos().get(i).getNombre());
		}

		comboPeriodos = new JComboBox<>();
		comboPeriodos.setBackground(Color.LIGHT_GRAY);
		
		comboPeriodos.addItem("PRIMERO");
		comboPeriodos.addItem("SEGUNDO");
		comboPeriodos.addItem("TERCERO");
		comboPeriodos.addItem("CUARTO");

		butBuscar = new JButton("BUSCAR");
		butBuscar.setBackground(SystemColor.textHighlight);
		butBuscar.setActionCommand(BUSCAR_CONSOLIDADOS);
		butBuscar.addActionListener(this);
		
		
		JPanel panelArriba = new JPanel();
		panelArriba.setBackground(Color.WHITE);

		panelArriba.setLayout(new GridLayout(1,7));


		panelArriba.add(new JLabel("GRADOS"));
		panelArriba.add(comboCursos);
		panelArriba.add(new JLabel(""));
		panelArriba.add(new JLabel("PERIODOS"));
		panelArriba.add(comboPeriodos);
		panelArriba.add(new JLabel(""));
		panelArriba.add(butBuscar);


		add( panelArriba, BorderLayout.NORTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
