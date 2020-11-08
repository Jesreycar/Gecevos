package org;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
/**
 * Esta clase es el perfil del usuario logueado
 * @author Juan Antonio Escribano Díaz
 * @version 1.0
 */
public class Perfil extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Perfil() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(118, 45, 47));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblImg = new JLabel("img");
		lblImg.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblImg, 15, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblImg, 15, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblImg, 158, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblImg, 162, SpringLayout.WEST, contentPane);
		contentPane.add(lblImg);

		/*
		 * Los labels llamados etiquetas son los labels estaticos 
		 * los demas son labels que se adaptaran a los dartos del usuario.
		 */
		JLabel lblEtiquetaUsuario = new JLabel("Usuario:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblEtiquetaUsuario, 48, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblEtiquetaUsuario, 31, SpringLayout.EAST, lblImg);
		contentPane.add(lblEtiquetaUsuario);
		

		JLabel lblUsuario= new JLabel("\"Nombre de Usuario\"");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblUsuario, 48, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblUsuario, 31, SpringLayout.EAST, lblImg);
		contentPane.add(lblUsuario);
		
		JLabel lblEtiquetaNombre = new JLabel("Nombre:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblEtiquetaNombre, 48, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblEtiquetaNombre, 31, SpringLayout.EAST, lblImg);
		contentPane.add(lblEtiquetaNombre);

		JLabel lblNombre = new JLabel("\"Nombre\"");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNombre, 48, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNombre, 31, SpringLayout.EAST, lblImg);
		contentPane.add(lblNombre);
		
		JLabel lblEtiquetaApellidos = new JLabel("Apellidos:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblEtiquetaApellidos, 48, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblEtiquetaApellidos, 31, SpringLayout.EAST, lblImg);
		contentPane.add(lblEtiquetaApellidos);
		
		JLabel lblApellidos = new JLabel("\"Apellidos\"");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblApellidos, 48, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblApellidos, 31, SpringLayout.EAST, lblImg);
		contentPane.add(lblApellidos);
		
		JLabel lblEtiquetaEmail = new JLabel("Email:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblEtiquetaEmail, 48, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblEtiquetaEmail, 31, SpringLayout.EAST, lblImg);
		contentPane.add(lblEtiquetaApellidos);
		
		JLabel lblEmail = new JLabel("\"Email\"");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblEmail, 48, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblEmail, 31, SpringLayout.EAST, lblImg);
		contentPane.add(lblApellidos);
	}
}
