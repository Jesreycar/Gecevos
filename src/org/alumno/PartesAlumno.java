package org.alumno;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import org.componente.Acordeon;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JScrollPane;
/**
 * Informaci�n de partes para los alumnos
 * @author Jesus Reyes
 * @version 1.0
 */
public class PartesAlumno extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public PartesAlumno() {
		setTitle("Gecevos-PartesAlumno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);

		//Panel principal
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(118, 45, 47));
		contentPane.setLayout(null);
		setResizable(false);
		setContentPane(contentPane);

		//Labels de informaci�n
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
		lblnombre.setBounds(173, 26, 379, 38);
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
		lblapellidos.setBounds(173, 63, 379, 38);
		contentPane.add(lblapellidos);

		JLabel lblcurso = new JLabel("\"Curso\"", SwingConstants.CENTER);
		lblcurso.setOpaque(true);
		lblcurso.setForeground(Color.WHITE);
		lblcurso.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblcurso.setBorder(new LineBorder(new Color(229,229,229), 2));
		lblcurso.setBackground(new Color(59, 22, 24));
		lblcurso.setBounds(173, 100, 379, 38);
		contentPane.add(lblcurso);
		
		Acordeon acc = new Acordeon();
		JScrollPane scrollPane = new JScrollPane(acc,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED
				,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		acc.setBounds(27, 177, 522, 200);
		scrollPane.setBounds(27, 177, 525, 221);
		contentPane.add(scrollPane);
		
		ArrayList<JPanel> acordeon = new ArrayList<JPanel>();
		for(int i = 0; i<5; i++) {
			acordeon.add(new JPanel());
			acordeon.get(i).setName("panel " + i);
			acordeon.get(i).add(new JButton("Eliminar"));
			acordeon.get(i).getComponent(0).setBounds(5, 5, 100, 20);
			JPanel panel1 =  acordeon.get(i);
			JButton boton = (JButton) acordeon.get(i).getComponent(0);
			boton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					acc.eliminar(acordeon.indexOf(boton.getParent()));
					acordeon.remove(acordeon.indexOf(boton.getParent()));
					
				}
			});
		}

		for (JPanel panel1 : acordeon) {
			acc.setAltoContenido(50);
			acc.setAltoBotones(30);
			acc.annadir(panel1,panel1.getName());
		}
		
		//Boton volver al menu del usuario
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				MenuAlumno menuAlumno = new MenuAlumno();
				menuAlumno.setVisible(true);
			}
		});
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnVolver.setFocusPainted(false);
		btnVolver.setBorder(new LineBorder(new Color(229,229,229), 2));
		btnVolver.setBackground(new Color(45, 118, 116));
		btnVolver.setBounds(215, 425, 132, 25);
		contentPane.add(btnVolver);
		
		
	}
}
