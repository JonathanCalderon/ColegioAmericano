package Interfaz;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PanelNotas extends JPanel implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1889234042725987206L;

	private JComboBox <String> comboCursos; 

	private JComboBox <String> comboMaterias; 

	private JComboBox <String> comboPeriodos; 

	private JButton buscar;

	private InterfazPrincipal principal;

	public PanelNotas (InterfazPrincipal principal){

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

		buscar = new JButton("BUSCAR");

		JPanel panelArriba = new JPanel();

		panelArriba.setLayout(new GridLayout(1,10));


		panelArriba.add(new JLabel("GRADOS"));
		panelArriba.add(comboCursos);
		panelArriba.add(new JLabel(""));
		panelArriba.add(new JLabel("MATERIAS"));
		panelArriba.add(comboMaterias);
		panelArriba.add(new JLabel(""));
		panelArriba.add(new JLabel("PERIODOS"));
		panelArriba.add(comboPeriodos);
		panelArriba.add(new JLabel(""));
		panelArriba.add(buscar);


		add( panelArriba, BorderLayout.NORTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
