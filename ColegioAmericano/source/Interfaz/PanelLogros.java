package Interfaz;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.*;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.SystemColor;

public class PanelLogros extends JPanel implements ActionListener{

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
		setAlignmentY(Component.BOTTOM_ALIGNMENT);

		this.principal = principal;

		setLayout( new BorderLayout());
		comboCursos = new JComboBox<>();
		comboCursos.setBackground(Color.LIGHT_GRAY);
		
		
		for (int i = 0; i < principal.darCursos().size(); i++) {

			comboCursos.addItem(principal.darCursos().get(i).getNombre());
		}

		comboMaterias = new JComboBox<>();
		comboMaterias.setBackground(Color.LIGHT_GRAY);
		comboPeriodos = new JComboBox<>();
		comboPeriodos.setBackground(Color.LIGHT_GRAY);

		comboPeriodos.addItem("PRIMERO");
		comboPeriodos.addItem("SEGUNDO");
		comboPeriodos.addItem("TERCERO");
		comboPeriodos.addItem("CUARTO");
		
		butBuscar = new JButton("BUSCAR");
		butBuscar.setBackground(SystemColor.textHighlight);
		butAgregar = new JButton("AGREGAR");
		butAgregar.setBackground(new Color(255, 140, 0));
		butExportar = new JButton("EXPORTAR");
		butExportar.setBackground(SystemColor.textHighlight);
		butImportar = new JButton("IMPORTAR");
		butImportar.setBackground(new Color(255, 140, 0));
		butImprimir = new JButton("IMPRIMIR");
		butImprimir.setBackground(SystemColor.textHighlight);

		JPanel panelCentro = new JPanel();
		panelCentro.setBackground(Color.WHITE);

		panelCentro.setLayout(new BorderLayout());



		JPanel panelArriba = new JPanel();
		panelArriba.setBackground(Color.WHITE);

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
		panelDerecha.setBackground(Color.WHITE);

		panelDerecha.setLayout(new GridLayout(9,1));


		panelDerecha.add(butBuscar);
		JLabel label = new JLabel("");
		label.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		panelDerecha.add(label);
		panelDerecha.add(butAgregar);
		panelDerecha.add(new JLabel(""));
		panelDerecha.add(butExportar);
		panelDerecha.add(new JLabel(""));
		panelDerecha.add(butImportar);
		panelDerecha.add(new JLabel(""));
		panelDerecha.add(butImprimir);		

		add( panelDerecha, BorderLayout.EAST);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
