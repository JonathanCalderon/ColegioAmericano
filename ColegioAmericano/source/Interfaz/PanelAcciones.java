package Interfaz;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Mundo.Curso;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Color;

public class PanelAcciones extends JPanel implements ActionListener{

	
	
	/**
	 * ID serial 
	 */
	private static final long serialVersionUID = -3936522224953097566L;

	public static final String AGREGAR_ESTUDIANTE = "Agregar Estudiante";
	
	private InterfazPrincipal principal;
	
	private JTextField txtNombreEstudiante;
	
	private JTextField txtIdEstudiante;
	
	private JComboBox<String> comboCursos;
	
	private JButton butAgregarEstudiante;
	
	public PanelAcciones (InterfazPrincipal in){
		setBackground(Color.WHITE);
		setSize(new Dimension(450, 50));
		
		principal = in;
		
		setLayout(new BorderLayout());
		
		JPanel contenedor = new JPanel();
		contenedor.setLayout(new GridLayout(1,1));
		
		
		JPanel panelAgregarEst = new JPanel();
		panelAgregarEst.setBackground(Color.WHITE);
		panelAgregarEst.setSize(new Dimension(0, 10));
		panelAgregarEst.setMaximumSize(new Dimension(32767, 100));
		panelAgregarEst.setAlignmentY(Component.TOP_ALIGNMENT);
		
		panelAgregarEst.setLayout(new GridLayout(1,8));
		
		txtNombreEstudiante = new JTextField();
		txtIdEstudiante = new JTextField();
		comboCursos = new JComboBox<String>();
		butAgregarEstudiante = new JButton("Agregar");
		butAgregarEstudiante.setActionCommand(AGREGAR_ESTUDIANTE);
		butAgregarEstudiante.addActionListener(this);
		
		
		//Agrega todos los cursos al combo box
		ArrayList<Curso>cursos = principal.darCursos();
		for (int i = 0; i < principal.darCursos().size(); i++) {
			
			comboCursos.addItem(cursos.get(i).getNombre());
		}
		
		JLabel label = new JLabel("AGREGAR ESTUDIANTE ");
		label.setBackground(new Color(0, 153, 204));
		panelAgregarEst.add(label);
		JLabel label_1 = new JLabel(" Nombre: ");
		label_1.setBackground(new Color(0, 153, 204));
		panelAgregarEst.add(label_1);
		panelAgregarEst.add(txtNombreEstudiante);
		JLabel label_2 = new JLabel(" Identificación: ");
		label_2.setBackground(new Color(0, 153, 204));
		panelAgregarEst.add(label_2);
		panelAgregarEst.add(txtIdEstudiante);
		JLabel label_3 = new JLabel(" Curso: ");
		label_3.setBackground(new Color(0, 153, 204));
		panelAgregarEst.add(label_3);
		panelAgregarEst.add(comboCursos);
		panelAgregarEst.add(butAgregarEstudiante);
		
		contenedor.add ( panelAgregarEst);
		add(contenedor, BorderLayout.NORTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String command = e.getActionCommand();
		
		if ( command.equals(AGREGAR_ESTUDIANTE)){
			
			principal.agregarEstudiante(txtNombreEstudiante.getText().trim(), comboCursos.getSelectedItem().toString().trim()
					, txtIdEstudiante.getText().trim());
		}
	}
}
