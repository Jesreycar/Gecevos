package org;

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTree;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;
import javax.swing.JTabbedPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
 * Esta clase es el perfil del usuario logueado, tambien se podra modificar los datos de este usuario
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
		contentPane.setForeground(Color.WHITE);
		contentPane.setFont(new Font("Dialog", Font.PLAIN, 15));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(118, 45, 47));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblImg = new JLabel("img");
		lblImg.setBounds(new Rectangle(33, 20, 165, 136));
		Icon icono = new ImageIcon(new ImageIcon("img/ImgPerfil.png").getImage().getScaledInstance(lblImg.getWidth(), lblImg.getHeight(), Image.SCALE_AREA_AVERAGING));
		lblImg.setIcon(icono);
		lblImg.setBounds(33, 20, 165, 136);
		lblImg.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		contentPane.add(lblImg);

		/*
		 * Los labels llamados etiquetas son los labels estaticos 
		 * los demas son labels que se adaptaran a los dartos del usuario.
		 */
		JLabel lblEtiquetaUsuario = new JLabel("Usuario:");
		lblEtiquetaUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtiquetaUsuario.setForeground(Color.WHITE);
		lblEtiquetaUsuario.setBackground(new Color(59,22,24));
		lblEtiquetaUsuario.setOpaque(true);
		lblEtiquetaUsuario.setBorder(new LineBorder(new Color(229, 229, 229), 2, true));
		lblEtiquetaUsuario.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblEtiquetaUsuario.setBounds(232, 20, 150, 50);
		contentPane.add(lblEtiquetaUsuario);
		

		JLabel lblUsuario= new JLabel("\"Nombre de Usuario\"");
		lblUsuario.setOpaque(true);
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setBackground(new Color(59,22,24));
		lblUsuario.setBorder(new LineBorder(new Color(229, 229, 229), 2, true));
		lblUsuario.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblUsuario.setBounds(380, 20, 150, 50);
		lblUsuario.setAlignmentX(Component.RIGHT_ALIGNMENT);
		contentPane.add(lblUsuario);
		
		JLabel lblEtiquetaNombre = new JLabel("Nombre:");
		lblEtiquetaNombre.setOpaque(true);
		lblEtiquetaNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtiquetaNombre.setForeground(Color.WHITE);
		lblEtiquetaNombre.setBackground(new Color(59,22,24));
		lblEtiquetaNombre.setBorder(new LineBorder(new Color(229, 229, 229), 2, true));
		lblEtiquetaNombre.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblEtiquetaNombre.setBounds(232, 67, 150, 50);
		contentPane.add(lblEtiquetaNombre);

		JLabel lblNombre = new JLabel("\"Nombre\"");
		lblNombre.setOpaque(true);
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setBackground(new Color(59,22,24));
		lblNombre.setBorder(new LineBorder(new Color(229, 229, 229), 2, true));
		lblNombre.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNombre.setBounds(380, 67, 150, 50);
		contentPane.add(lblNombre);
		
		JLabel lblEtiquetaApellidos = new JLabel("Apellidos:");
		lblEtiquetaApellidos.setOpaque(true);
		lblEtiquetaApellidos.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtiquetaApellidos.setForeground(Color.WHITE);
		lblEtiquetaApellidos.setBackground(new Color(59,22,24));
		lblEtiquetaApellidos.setBorder(new LineBorder(new Color(229, 229, 229), 2, true));
		lblEtiquetaApellidos.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblEtiquetaApellidos.setBounds(232, 115, 150, 50);
		lblEtiquetaApellidos.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblEtiquetaApellidos.setAlignmentX(Component.RIGHT_ALIGNMENT);
		contentPane.add(lblEtiquetaApellidos);
		
		JLabel lblApellidos = new JLabel("\"Apellidos\"");
		lblApellidos.setOpaque(true);
		lblApellidos.setHorizontalAlignment(SwingConstants.CENTER);
		lblApellidos.setForeground(Color.WHITE);
		lblApellidos.setBackground(new Color(59,22,24));
		lblApellidos.setBorder(new LineBorder(new Color(229, 229, 229), 2, true));
		lblApellidos.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblApellidos.setBounds(380, 115, 150, 50);
		contentPane.add(lblApellidos);
		
		JLabel lblEtiquetaEmail = new JLabel("Email:");
		lblEtiquetaEmail.setOpaque(true);
		lblEtiquetaEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtiquetaEmail.setForeground(Color.WHITE);
		lblEtiquetaEmail.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblEtiquetaEmail.setBorder(new LineBorder(new Color(229, 229, 229), 2, true));
		lblEtiquetaEmail.setBackground(new Color(59, 22, 24));
		lblEtiquetaEmail.setBounds(33, 164, 250, 40);
		contentPane.add(lblEtiquetaEmail);
		
		JLabel lblEmail = new JLabel("\"Email\"");
		lblEmail.setOpaque(true);
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblEmail.setBorder(new LineBorder(new Color(229, 229, 229), 2, true));
		lblEmail.setBackground(new Color(59, 22, 24));
		lblEmail.setBounds(280, 164, 250, 40);
		contentPane.add(lblEmail);
		
		JLabel lblEtiquetaDNI = new JLabel("DNI:");
		lblEtiquetaDNI.setOpaque(true);
		lblEtiquetaDNI.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtiquetaDNI.setForeground(Color.WHITE);
		lblEtiquetaDNI.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblEtiquetaDNI.setBorder(new LineBorder(new Color(229, 229, 229), 2, true));
		lblEtiquetaDNI.setBackground(new Color(59, 22, 24));
		lblEtiquetaDNI.setBounds(33, 203, 250, 40);
		contentPane.add(lblEtiquetaDNI);

		JLabel lblDNI = new JLabel("\"DNI\"");
		lblDNI.setOpaque(true);
		lblDNI.setHorizontalAlignment(SwingConstants.CENTER);
		lblDNI.setForeground(Color.WHITE);
		lblDNI.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblDNI.setBorder(new LineBorder(new Color(229, 229, 229), 2, true));
		lblDNI.setBackground(new Color(59, 22, 24));
		lblDNI.setBounds(280, 203, 250, 40);
		contentPane.add(lblDNI);
		
		JTabbedPane tbModificar = new JTabbedPane(JTabbedPane.TOP);
		tbModificar.setBorder(null);
		tbModificar.setRequestFocusEnabled(false);
		tbModificar.setForeground(Color.white);
		tbModificar.setFont(new Font("Dialog", Font.PLAIN, 15));
		tbModificar.setBackground(new Color(59, 22, 24));
		tbModificar.setBounds(33, 253, 497, 200);
		contentPane.add(tbModificar);
		
		JPanel jpEditarPerfil = new JPanel();
		jpEditarPerfil.setBorder(null);
		jpEditarPerfil.setBackground(new Color(118, 45, 47));
		tbModificar.addTab("Editar Perfil", null, jpEditarPerfil, null);
		
		JPanel jpCambiarContra= new JPanel();
		jpCambiarContra.setBackground(new Color(118, 45, 47));
		tbModificar.addTab("New tab", null, jpCambiarContra, null);
		
		JPanel jpCambiarFoto = new JPanel();
		jpCambiarFoto.setBackground(new Color(118, 45, 47));
		tbModificar.addTab("New tab", null, jpCambiarFoto, null);
		
		tbModificar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tbModificar.setBackgroundAt(tbModificar.getSelectedIndex(), new Color(119, 55, 57));
			}
		});
		
	}
}
