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
/**
 * Esta clase es donde el usuario se registra en la base de datos y se le concede un usuario automático.
 * @author Juan Antonio Escribano Díaz
 * @version 1.0
 */
public class Registro extends JFrame {
	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textDNI;
	private JTextField textApellido;
	private JTextField textPasswd;
	private JTextField textPasswdConfirm;

	/**
	 * Create the frame.
	 */
	public Registro() {
		setTitle("Gecevos-Registro");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		
		//Panel principal
		contentPane = new JPanel();
		contentPane.setBackground(new java.awt.Color(45,118,116));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		
		//Panel central
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel.setBackground(new Color(118, 45, 47));
		panel.setBounds(45, 27, 500, 400);
		contentPane.add(panel);
		
		//Labels de información
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNombre.setBounds(10, 50, 70, 14);
		panel.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setForeground(Color.WHITE);
		lblApellidos.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblApellidos.setBounds(10, 119, 70, 14);
		panel.add(lblApellidos);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setForeground(Color.WHITE);
		lblDni.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblDni.setBounds(10, 189, 70, 14);
		panel.add(lblDni);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblContrasea.setBounds(280, 91, 93, 14);
		panel.add(lblContrasea);
		
		JLabel lblConfirmContrasea = new JLabel("Confirma la contrase\u00F1a");
		lblConfirmContrasea.setForeground(Color.WHITE);
		lblConfirmContrasea.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblConfirmContrasea.setBounds(280, 168, 170, 14);
		panel.add(lblConfirmContrasea);
		
		//Textos de escritura y lectura de datos
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(10, 75, 212, 30);
		panel.add(textNombre);
		
		textApellido = new JTextField();
		textApellido.setColumns(10);
		textApellido.setBounds(10, 144, 212, 30);
		panel.add(textApellido);
		
		textDNI = new JTextField();
		textDNI.setColumns(10);
		textDNI.setBounds(10, 214, 212, 30);
		panel.add(textDNI);
		
		textPasswd = new JTextField();
		textPasswd.setColumns(10);
		textPasswd.setBounds(278, 119, 212, 30);
		panel.add(textPasswd);
		
		textPasswdConfirm = new JTextField();
		textPasswdConfirm.setColumns(10);
		textPasswdConfirm.setBounds(278, 193, 212, 30);
		panel.add(textPasswdConfirm);
		
		//Boton registrarse
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setFont(new Font("Dialog", Font.PLAIN, 11));
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistrarse.setBounds(101, 328, 121, 30);
		panel.add(btnRegistrarse);

		//Boton para volver al login
		JButton btnVolverAlLogin = new JButton("Volver al login");
		btnVolverAlLogin.setFont(new Font("Dialog", Font.PLAIN, 11));
		btnVolverAlLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				Login frame = new Login();
			}
		});
		btnVolverAlLogin.setBounds(280, 328, 121, 30);
		panel.add(btnVolverAlLogin);
		
		//Selecciones para alumno o profesor
		JRadioButton rdbtnAlumno = new JRadioButton("Alumno");
		rdbtnAlumno.setFocusPainted(false);
		rdbtnAlumno.setFont(new Font("Dialog", Font.PLAIN, 15));
		rdbtnAlumno.setHorizontalAlignment(SwingConstants.RIGHT);
		rdbtnAlumno.setForeground(Color.WHITE);
		rdbtnAlumno.setBackground(new Color(118, 45, 47));
		rdbtnAlumno.setBounds(146, 22, 109, 23);
		panel.add(rdbtnAlumno);
		
		JRadioButton rdbtnProfesor = new JRadioButton("Profesor");
		rdbtnProfesor.setFocusPainted(false);
		rdbtnProfesor.setFont(new Font("Dialog", Font.PLAIN, 15));
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
