package Interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class PanelEstudiantes extends JPanel implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1889234042725987206L;

	public static final String BUSCAR_ESTUDIANTES_CURSO = "Buscar Estudiantes por Curso";
	
	
	private JComboBox <String> comboCursos; 
	
	private JButton butBuscarEstudiantes;
	
	private InterfazPrincipal principal;

	private JList<String> listaEstudiantesPorCurso;

	private JScrollPane scrollPaneListaEstudiantes;
	
	public PanelEstudiantes (InterfazPrincipal principal){
		setBackground(Color.WHITE);
		
		
		this.principal = principal;
		
		setLayout( new BorderLayout());
		comboCursos = new JComboBox<>();
		comboCursos.setBackground(Color.LIGHT_GRAY);
		
		for (int i = 0; i < principal.darCursos().size(); i++) {
			
			comboCursos.addItem(principal.darCursos().get(i).getNombre());
		}
		butBuscarEstudiantes = new JButton("BUSCAR");
		butBuscarEstudiantes.setBackground(SystemColor.textHighlight);
		butBuscarEstudiantes.setActionCommand(BUSCAR_ESTUDIANTES_CURSO);
		butBuscarEstudiantes.addActionListener(this);
		
		JPanel panelArriba = new JPanel();
		panelArriba.setBackground(Color.WHITE);
		
		panelArriba.setLayout(new GridLayout(1,6));
		
		
		panelArriba.add(new JLabel("GRADOS"));
		panelArriba.add(comboCursos);
		panelArriba.add(new JLabel(""));
		panelArriba.add(new JLabel(""));
		panelArriba.add(new JLabel(""));
		panelArriba.add(butBuscarEstudiantes);
		
		JPanel panelRespuestas = new JPanel();
		panelRespuestas.setLayout(new BorderLayout());
		
		JPanel respuestasAcciones = new JPanel();
		respuestasAcciones.setLayout(new GridLayout(1,2));
		
		respuestasAcciones.add(new JLabel("Ver"));
		respuestasAcciones.add(new JLabel("accion 2"));
		panelRespuestas.add(respuestasAcciones, BorderLayout.SOUTH);
		
		
		add ( panelRespuestas, BorderLayout.CENTER);
		
		scrollPaneListaEstudiantes = new JScrollPane();
		panelRespuestas.add(scrollPaneListaEstudiantes, BorderLayout.CENTER);
		
		
		listaEstudiantesPorCurso = new JList<String>();
		scrollPaneListaEstudiantes.setViewportView(listaEstudiantesPorCurso);
		
		
		add( panelArriba, BorderLayout.NORTH);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		String command = arg0.getActionCommand();
		
		if ( command.equals(BUSCAR_ESTUDIANTES_CURSO)){
			
			ArrayList <String> estudiantes = principal.buscarEstudiantesPorCurso(comboCursos.getSelectedItem().toString());
			
			DefaultListModel<String> listModel = new DefaultListModel<String>();	
			
			for (int i = 0; i < estudiantes.size(); i++) {
				listModel.addElement((i+1)+". "+estudiantes.get(i));
				System.out.println(estudiantes.get(i));
			}
			
			listaEstudiantesPorCurso = new JList<>(listModel);
			scrollPaneListaEstudiantes.setViewportView(listaEstudiantesPorCurso);
			
			
		}
		
	}
	
}
