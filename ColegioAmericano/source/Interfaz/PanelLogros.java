package Interfaz;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.*;
import java.awt.Color;

public class PanelLogros extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1889234042725987206L;

	private JComboBox <String> comboCursos; 

	private JComboBox <String> comboMaterias; 

	private JComboBox <String> comboPeriodos; 

	private JButton butBuscar;

	private JButton butAgregar;

	private JButton butImportar;

	private JButton butExportar;

	private JButton butImprimir;

	private InterfazPrincipal principal;

	public PanelLogros (InterfazPrincipal principal){

		this.principal = principal;

		setLayout( new BorderLayout());
		comboCursos = new JComboBox<>();
		
		
		for (int i = 0; i < principal.darCursos().size(); i++) {

			comboCursos.addItem(principal.darCursos().get(i).getNombre());
		}

		comboMaterias = new JComboBox<>();
		comboPeriodos = new JComboBox<>();

		comboPeriodos.addItem("PRIMERO");
		comboPeriodos.addItem("SEGUNDO");
		comboPeriodos.addItem("TERCERO");
		comboPeriodos.addItem("CUARTO");
		
		butBuscar = new JButton("BUSCAR");
		butAgregar = new JButton("AGREGAR");
		butExportar = new JButton("EXPORTAR");
		butImportar = new JButton("IMPORTAR");
		butImprimir = new JButton("IMPRIMIR");

		JPanel panelCentro = new JPanel();
		panelCentro.setBackground(Color.WHITE);

		panelCentro.setLayout(new BorderLayout());



		JPanel panelArriba = new JPanel();

		panelArriba.setLayout(new GridLayout(1,9));


		panelArriba.add(new JLabel("GRADOS"));
		panelArriba.add(comboCursos);
		panelArriba.add(new JLabel(""));
		panelArriba.add(new JLabel("MATERIAS"));
		panelArriba.add(comboMaterias);
		panelArriba.add(new JLabel(""));
		panelArriba.add(new JLabel("PERIODOS"));
		panelArriba.add(comboPeriodos);
		panelArriba.add(new JLabel(""));

		panelCentro.add(panelArriba, BorderLayout.NORTH);

		add( panelCentro, BorderLayout.CENTER);

		JPanel panelDerecha = new JPanel();

		panelDerecha.setLayout(new GridLayout(9,1));


		panelDerecha.add(butBuscar);
		panelDerecha.add(new JLabel(""));
		panelDerecha.add(butAgregar);
		panelDerecha.add(new JLabel(""));
		panelDerecha.add(butExportar);
		panelDerecha.add(new JLabel(""));
		panelDerecha.add(butImportar);
		panelDerecha.add(new JLabel(""));
		panelDerecha.add(butImprimir);		

		add( panelDerecha, BorderLayout.EAST);
	}

}
