package org;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
/**
 * Clase para ver el listado de los alumnos por curso y asignarlos
 * @author Jesus Reyes
 * @version 1.0
 */
public class MisClases extends JFrame {

	private JPanel contentPane;
	private JTextField textDNI;
	private JTextField textCurso;
	private JTextField textObsev;
	private JTextField textDNI_1;
	/**
	 * Create the frame.
	 */
	public MisClases() {
		setTitle("Gecevos-MisClases");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		
		//Panel principal
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setFont(new Font("Dialog", Font.PLAIN, 15));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(118, 45, 47));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Tabla donde se muestran las diferentes pestañas
		JTabbedPane tbModificar = new JTabbedPane(JTabbedPane.TOP);
		tbModificar.setRequestFocusEnabled(false);
		tbModificar.setForeground(Color.WHITE);
		tbModificar.setFont(new Font("Dialog", Font.PLAIN, 15));
		tbModificar.setFocusable(false);
		tbModificar.setBorder(null);
		tbModificar.setBackground(new Color(59, 22, 24));
		tbModificar.setBounds(25, 11, 533, 232);
		contentPane.add(tbModificar);
		
		//Panel para matricular
		JPanel jpMatricular = new JPanel();
		jpMatricular.setLayout(null);
		jpMatricular.setBorder(null);
		jpMatricular.setBackground(new Color(119, 55, 57));
		tbModificar.addTab("Matriculaci\u00F3n Alumno", null, jpMatricular, null);
		
		//Labels y texto del panel matricular
		JLabel lblCurso = new JLabel("Curso");
		lblCurso.setOpaque(true);
		lblCurso.setHorizontalAlignment(SwingConstants.CENTER);
		lblCurso.setForeground(Color.WHITE);
		lblCurso.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblCurso.setBorder(new LineBorder(new Color(229, 229, 229), 2, true));
		lblCurso.setBackground(new Color(59, 22, 24));
		lblCurso.setBounds(20, 61, 197, 24);
		jpMatricular.add(lblCurso);
		
		textDNI = new JTextField();
		textDNI.setFont(new Font("Dialog", Font.PLAIN, 15));
		textDNI.setColumns(10);
		textDNI.setBounds(227, 26, 280, 24);
		jpMatricular.add(textDNI);
		
		JLabel lblDNI = new JLabel("DNI:");
		lblDNI.setOpaque(true);
		lblDNI.setHorizontalAlignment(SwingConstants.CENTER);
		lblDNI.setForeground(Color.WHITE);
		lblDNI.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblDNI.setBorder(new LineBorder(new Color(229, 229, 229), 2, true));
		lblDNI.setBackground(new Color(59, 22, 24));
		lblDNI.setBounds(20, 26, 197, 24);
		jpMatricular.add(lblDNI);
		
		textCurso = new JTextField();
		textCurso.setFont(new Font("Dialog", Font.PLAIN, 15));
		textCurso.setColumns(10);
		textCurso.setBounds(227, 61, 280, 24);
		jpMatricular.add(textCurso);
		
		//Botones panel matricular
		JButton btnMatricularAlumno = new JButton(" Matricular Alumno");
		btnMatricularAlumno.setForeground(Color.WHITE);
		btnMatricularAlumno.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnMatricularAlumno.setFocusPainted(false);
		btnMatricularAlumno.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnMatricularAlumno.setBackground(new Color(45, 118, 116));
		btnMatricularAlumno.setBounds(10, 156, 163, 21);
		jpMatricular.add(btnMatricularAlumno);
		
		JButton btnVolverMenu = new JButton("Volver al Men\u00FA");
		btnVolverMenu.setForeground(Color.WHITE);
		btnVolverMenu.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnVolverMenu.setFocusPainted(false);
		btnVolverMenu.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnVolverMenu.setBackground(new Color(45, 118, 116));
		btnVolverMenu.setBounds(353, 156, 163, 21);
		jpMatricular.add(btnVolverMenu);
		
		//Panel de observaciones
		JPanel jpObserv = new JPanel();
		jpObserv.setLayout(null);
		jpObserv.setBackground(new Color(119, 55, 57));
		tbModificar.addTab("Observaciones", null, jpObserv, null);
		
		//Labels y texto del panel de observaciones
		JLabel lblDNI_1 = new JLabel("DNI");
		lblDNI_1.setOpaque(true);
		lblDNI_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDNI_1.setForeground(Color.WHITE);
		lblDNI_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblDNI_1.setBorder(new LineBorder(new Color(229, 229, 229), 2, true));
		lblDNI_1.setBackground(new Color(59, 22, 24));
		lblDNI_1.setBounds(20, 26, 197, 24);
		jpObserv.add(lblDNI_1);
		
		JLabel lblObsevacin = new JLabel("Obsevaci\u00F3n");
		lblObsevacin.setOpaque(true);
		lblObsevacin.setHorizontalAlignment(SwingConstants.CENTER);
		lblObsevacin.setForeground(Color.WHITE);
		lblObsevacin.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblObsevacin.setBorder(new LineBorder(new Color(229, 229, 229), 2, true));
		lblObsevacin.setBackground(new Color(59, 22, 24));
		lblObsevacin.setBounds(20, 58, 487, 24);
		jpObserv.add(lblObsevacin);
		
		textObsev = new JTextField();
		textObsev.setFont(new Font("Dialog", Font.PLAIN, 15));
		textObsev.setColumns(10);
		textObsev.setBounds(20, 93, 487, 62);
		jpObserv.add(textObsev);
		
		textDNI_1 = new JTextField();
		textDNI_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		textDNI_1.setColumns(10);
		textDNI_1.setBounds(227, 26, 280, 26);
		jpObserv.add(textDNI_1);
		
		//Botones del panel observacion
		JButton btnAsignarObservacin = new JButton("Asignar Observaci\u00F3n");
		btnAsignarObservacin.setForeground(Color.WHITE);
		btnAsignarObservacin.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnAsignarObservacin.setFocusPainted(false);
		btnAsignarObservacin.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnAsignarObservacin.setBackground(new Color(45, 118, 116));
		btnAsignarObservacin.setBounds(10, 166, 163, 21);
		jpObserv.add(btnAsignarObservacin);
		
		JButton btnVolverMenu_1 = new JButton("Volver al Men\u00FA");
		btnVolverMenu_1.setForeground(Color.WHITE);
		btnVolverMenu_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnVolverMenu_1.setFocusPainted(false);
		btnVolverMenu_1.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnVolverMenu_1.setBackground(new Color(45, 118, 116));
		btnVolverMenu_1.setBounds(355, 166, 163, 21);
		jpObserv.add(btnVolverMenu_1);
		
		//Scroll panel donde se muestra la lista de clases
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(Color.BLACK, 2));
		scrollPane.setBackground(new Color(118, 45, 47));
		scrollPane.setBounds(25, 254, 533, 196);
		contentPane.add(scrollPane);
		
	}
}
