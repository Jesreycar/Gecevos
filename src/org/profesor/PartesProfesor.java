package org.profesor;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import org.componente.Acordeon;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * Clase para asignar y poner partes a los alumnos
 * @author Jesus Reyes
 * @version 1.0
 */
public class PartesProfesor extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textApellidos;
	private JTextField textGravedad;
	private JTextField textDescrip;
	/**
	 * Create the frame.
	 */
	public PartesProfesor() {
		setTitle("Gecevos-PartesProfesor");
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
		
		//Labels y texto de informaci�n y escritura
		JLabel lblNombre = new JLabel("Nombre", SwingConstants.CENTER);
		lblNombre.setOpaque(true);
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNombre.setBorder(new LineBorder(new Color(229,229,229), 2));
		lblNombre.setBackground(new Color(59, 22, 24));
		lblNombre.setBounds(20, 21, 197, 31);
		contentPane.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos\r\n", SwingConstants.CENTER);
		lblApellidos.setOpaque(true);
		lblApellidos.setForeground(Color.WHITE);
		lblApellidos.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblApellidos.setBorder(new LineBorder(new Color(229,229,229), 2));
		lblApellidos.setBackground(new Color(59, 22, 24));
		lblApellidos.setBounds(20, 50, 197, 31);
		contentPane.add(lblApellidos);
		
		JLabel lblNivelDeGravedad = new JLabel("Nivel de Gravedad\r\n", SwingConstants.CENTER);
		lblNivelDeGravedad.setOpaque(true);
		lblNivelDeGravedad.setForeground(Color.WHITE);
		lblNivelDeGravedad.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNivelDeGravedad.setBorder(new LineBorder(new Color(229,229,229), 2));
		lblNivelDeGravedad.setBackground(new Color(59, 22, 24));
		lblNivelDeGravedad.setBounds(20, 79, 197, 31);
		contentPane.add(lblNivelDeGravedad);
		
		JLabel lblDescripcion = new JLabel("Descripcion", SwingConstants.CENTER);
		lblDescripcion.setOpaque(true);
		lblDescripcion.setForeground(Color.WHITE);
		lblDescripcion.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblDescripcion.setBorder(new LineBorder(new Color(229,229,229), 2));
		lblDescripcion.setBackground(new Color(59, 22, 24));
		lblDescripcion.setBounds(20, 108, 540, 31);
		contentPane.add(lblDescripcion);
		
		textNombre = new JTextField();
		textNombre.setFont(new Font("Dialog", Font.PLAIN, 15));
		textNombre.setColumns(10);
		textNombre.setBounds(227, 23, 197, 24);
		contentPane.add(textNombre);
		
		textApellidos = new JTextField();
		textApellidos.setFont(new Font("Dialog", Font.PLAIN, 15));
		textApellidos.setColumns(10);
		textApellidos.setBounds(227, 52, 197, 24);
		contentPane.add(textApellidos);
		
		textGravedad = new JTextField();
		textGravedad.setFont(new Font("Dialog", Font.PLAIN, 15));
		textGravedad.setColumns(10);
		textGravedad.setBounds(227, 81, 197, 24);
		contentPane.add(textGravedad);
		
		textDescrip = new JTextField();
		textDescrip.setFont(new Font("Dialog", Font.PLAIN, 15));
		textDescrip.setColumns(10);
		textDescrip.setBounds(20, 145, 540, 57);
		contentPane.add(textDescrip);
		
		//Botones para asignar o eliminar partes
		JButton btnAsignarParte = new JButton("Asignar Parte");
		btnAsignarParte.setForeground(Color.WHITE);
		btnAsignarParte.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnAsignarParte.setFocusPainted(false);
		btnAsignarParte.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnAsignarParte.setBackground(new Color(45, 118, 116));
		btnAsignarParte.setBounds(434, 26, 126, 21);
		contentPane.add(btnAsignarParte);
		
		JButton btnEliminarParte = new JButton("Eliminar Parte");
		btnEliminarParte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnEliminarParte.setForeground(Color.WHITE);
		btnEliminarParte.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnEliminarParte.setFocusPainted(false);
		btnEliminarParte.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnEliminarParte.setBackground(new Color(45, 118, 116));
		btnEliminarParte.setBounds(434, 57, 126, 42);
		contentPane.add(btnEliminarParte);
		
		//Boton para volver al menu del usuario
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				MenuProfesor menuProfe = new MenuProfesor();
				menuProfe.setVisible(true);
			}
		});
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnVolver.setFocusPainted(false);
		btnVolver.setBorder(new LineBorder(new Color(229,229,229), 2));
		btnVolver.setBackground(new Color(45, 118, 116));
		btnVolver.setBounds(218, 425, 132, 25);
		contentPane.add(btnVolver);
		
		//Scroll panel donde se muestra la lista de clases
		Acordeon acc = new Acordeon();
		acc.setBounds(25, 243, 500, 200);
		JScrollPane scroll = new JScrollPane(acc);
		scroll.setBounds(25, 210, 533, 200);
		contentPane.add(scroll);

		btnAsignarParte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel panel = new JPanel();
				panel.setBackground(Color.BLACK);
				JLabel lblDni= new JLabel();
				lblDni.setBounds(20, 20, 20, 100);
				panel.add(lblDni);
				acc.annadir(panel, textNombre.getText());
				acc.setBounds(0, 0, 0, 0);
			}
		});
	
	}

}
