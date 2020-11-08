package org;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.JTable;
import javax.swing.JSlider;
import javax.swing.JList;
import java.awt.ScrollPane;
import java.awt.Choice;
import java.awt.Panel;
import java.awt.Button;
/**
 * Información de partes para los alumnos
 * @author Jesus Reyes
 * @version 1.0
 */
public class PartesAlumno extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public PartesAlumno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		
		//Panel principal
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(118, 45, 47));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		//Labels de información
		JLabel lblNombreTut = new JLabel("Nombre Tutor", SwingConstants.CENTER);
		lblNombreTut.setBorder(new LineBorder(new Color(229,229,229), 2));
		lblNombreTut.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNombreTut.setForeground(Color.WHITE);
		lblNombreTut.setOpaque(true);
		lblNombreTut.setBackground(new Color(59, 22, 24));
		lblNombreTut.setBounds(27, 26, 147, 38);
		contentPane.add(lblNombreTut);
		
		JLabel lblnombre = new JLabel("\"Nombre\"", SwingConstants.CENTER);
		lblnombre.setOpaque(true);
		lblnombre.setForeground(Color.WHITE);
		lblnombre.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblnombre.setBorder(new LineBorder(new Color(229,229,229), 2));
		lblnombre.setBackground(new Color(59, 22, 24));
		lblnombre.setBounds(173, 26, 366, 38);
		contentPane.add(lblnombre);
		
		JLabel lblApellidosTutor = new JLabel("Apellidos Tutor", SwingConstants.CENTER);
		lblApellidosTutor.setOpaque(true);
		lblApellidosTutor.setForeground(Color.WHITE);
		lblApellidosTutor.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblApellidosTutor.setBorder(new LineBorder(new Color(229,229,229), 2));
		lblApellidosTutor.setBackground(new Color(59, 22, 24));
		lblApellidosTutor.setBounds(27, 63, 147, 38);
		contentPane.add(lblApellidosTutor);
		
		JLabel lblCurso = new JLabel("Curso", SwingConstants.CENTER);
		lblCurso.setOpaque(true);
		lblCurso.setForeground(Color.WHITE);
		lblCurso.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblCurso.setBorder(new LineBorder(new Color(229,229,229), 2));
		lblCurso.setBackground(new Color(59, 22, 24));
		lblCurso.setBounds(27, 100, 147, 38);
		contentPane.add(lblCurso);
		
		JLabel lblapellidos = new JLabel("\"Apellidos\"", SwingConstants.CENTER);
		lblapellidos.setOpaque(true);
		lblapellidos.setForeground(Color.WHITE);
		lblapellidos.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblapellidos.setBorder(new LineBorder(new Color(229,229,229), 2));
		lblapellidos.setBackground(new Color(59, 22, 24));
		lblapellidos.setBounds(173, 63, 366, 38);
		contentPane.add(lblapellidos);
		
		JLabel lblcurso = new JLabel("\"Curso\"", SwingConstants.CENTER);
		lblcurso.setOpaque(true);
		lblcurso.setForeground(Color.WHITE);
		lblcurso.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblcurso.setBorder(new LineBorder(new Color(229,229,229), 2));
		lblcurso.setBackground(new Color(59, 22, 24));
		lblcurso.setBounds(173, 100, 366, 38);
		contentPane.add(lblcurso);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(567, 0, 17, 461);
		contentPane.add(scrollBar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 185, 512, 265);
		contentPane.add(scrollPane);
		
	}
}
