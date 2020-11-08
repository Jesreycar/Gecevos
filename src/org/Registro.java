package org;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class Registro extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the frame.
	 */
	public Registro() {
		setTitle("Gecevos-Registro");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new java.awt.Color(45,118,116));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel.setBackground(new Color(118, 45, 47));
		panel.setBounds(45, 27, 500, 400);
		contentPane.add(panel);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNombre.setBounds(10, 50, 70, 14);
		panel.add(lblNombre);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 75, 212, 30);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 214, 212, 30);
		panel.add(textField_1);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistrarse.setBounds(101, 328, 121, 30);
		panel.add(btnRegistrarse);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 144, 212, 30);
		panel.add(textField_2);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setForeground(Color.WHITE);
		lblApellidos.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblApellidos.setBounds(10, 119, 70, 14);
		panel.add(lblApellidos);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setForeground(Color.WHITE);
		lblDni.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblDni.setBounds(10, 189, 70, 14);
		panel.add(lblDni);
		
		JButton btnVolverAlLogin = new JButton("Volver al login");
		btnVolverAlLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				Login frame = new Login();
			}
		});
		btnVolverAlLogin.setBounds(280, 328, 121, 30);
		panel.add(btnVolverAlLogin);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(278, 119, 212, 30);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(278, 193, 212, 30);
		panel.add(textField_4);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblContrasea.setBounds(280, 91, 93, 14);
		panel.add(lblContrasea);
		
		JLabel lblConfirmaLaContrasea = new JLabel("Confirma la contrase\u00F1a");
		lblConfirmaLaContrasea.setForeground(Color.WHITE);
		lblConfirmaLaContrasea.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblConfirmaLaContrasea.setBounds(280, 168, 170, 14);
		panel.add(lblConfirmaLaContrasea);
		
		JRadioButton rdbtnAlumno = new JRadioButton("Alumno");
		rdbtnAlumno.setHorizontalAlignment(SwingConstants.RIGHT);
		rdbtnAlumno.setForeground(Color.WHITE);
		rdbtnAlumno.setBackground(new Color(118, 45, 47));
		rdbtnAlumno.setBounds(146, 22, 109, 23);
		panel.add(rdbtnAlumno);
		
		JRadioButton rdbtnProfesor = new JRadioButton("Profesor");
		rdbtnProfesor.setForeground(Color.WHITE);
		rdbtnProfesor.setBackground(new Color(118, 45, 47));
		rdbtnProfesor.setBounds(257, 22, 109, 23);
		panel.add(rdbtnProfesor);

		rdbtnProfesor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnAlumno.setSelected(false);
			}
		});
		rdbtnAlumno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnProfesor.setSelected(false);
			}
		});
	}
}
