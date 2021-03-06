package org.general;

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.Login;
import org.alumno.MenuAlumno;
import org.profesor.MenuProfesor;

import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

/**
 * Esta clase es el perfil del usuario logueado, tambien se podra modificar los datos de este usuario
 * @author Juan Antonio Escribano Díaz
 * @version 1.0
 */
public class Perfil extends JFrame {

	private JPanel contentPane;
	private JTextField txtfUsuario;
	private JTextField txtfNombre;
	private JTextField txtfEmail;
	private JTextField txtfDNI;
	private static JPasswordField jpContra;
	private static boolean mostrar=true;
	private static JPasswordField jpContra_1;
	private static JPasswordField jpContra_2;
	private JTextField txtfRuta;

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
		setTitle("Perfil");

		JLabel lblImg = new JLabel("img");
		lblImg.setBounds(new Rectangle(33, 20, 165, 104));
		Icon icono = new ImageIcon(new ImageIcon("img/ImgPerfil.png").getImage().getScaledInstance(lblImg.getWidth(), lblImg.getHeight(), Image.SCALE_REPLICATE));
		lblImg.setIcon(icono);
		lblImg.setBounds(43, 21, 165, 104);
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
		lblEtiquetaUsuario.setBounds(242, 21, 150, 37);
		contentPane.add(lblEtiquetaUsuario);


		JLabel lblUsuario= new JLabel("\"Nombre de Usuario\"");
		lblUsuario.setOpaque(true);
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setBackground(new Color(59,22,24));
		lblUsuario.setBorder(new LineBorder(new Color(229, 229, 229), 2, true));
		lblUsuario.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblUsuario.setBounds(390, 21, 150, 37);
		lblUsuario.setAlignmentX(Component.RIGHT_ALIGNMENT);
		contentPane.add(lblUsuario);

		JLabel lblEtiquetaNombre = new JLabel("Nombre:");
		lblEtiquetaNombre.setOpaque(true);
		lblEtiquetaNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtiquetaNombre.setForeground(Color.WHITE);
		lblEtiquetaNombre.setBackground(new Color(59,22,24));
		lblEtiquetaNombre.setBorder(new LineBorder(new Color(229, 229, 229), 2, true));
		lblEtiquetaNombre.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblEtiquetaNombre.setBounds(242, 56, 150, 37);
		contentPane.add(lblEtiquetaNombre);

		JLabel lblNombre = new JLabel("\"Nombre\"");
		lblNombre.setOpaque(true);
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setBackground(new Color(59,22,24));
		lblNombre.setBorder(new LineBorder(new Color(229, 229, 229), 2, true));
		lblNombre.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNombre.setBounds(390, 56, 150, 37);
		contentPane.add(lblNombre);

		JLabel lblEtiquetaApellidos = new JLabel("Apellidos:");
		lblEtiquetaApellidos.setOpaque(true);
		lblEtiquetaApellidos.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtiquetaApellidos.setForeground(Color.WHITE);
		lblEtiquetaApellidos.setBackground(new Color(59,22,24));
		lblEtiquetaApellidos.setBorder(new LineBorder(new Color(229, 229, 229), 2, true));
		lblEtiquetaApellidos.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblEtiquetaApellidos.setBounds(242, 91, 150, 37);
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
		lblApellidos.setBounds(390, 91, 150, 37);
		contentPane.add(lblApellidos);

		JLabel lblEtiquetaEmail = new JLabel("Email:");
		lblEtiquetaEmail.setOpaque(true);
		lblEtiquetaEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtiquetaEmail.setForeground(Color.WHITE);
		lblEtiquetaEmail.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblEtiquetaEmail.setBorder(new LineBorder(new Color(229, 229, 229), 2, true));
		lblEtiquetaEmail.setBackground(new Color(59, 22, 24));
		lblEtiquetaEmail.setBounds(43, 127, 250, 40);
		contentPane.add(lblEtiquetaEmail);

		JLabel lblEmail = new JLabel("\"Email\"");
		lblEmail.setOpaque(true);
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblEmail.setBorder(new LineBorder(new Color(229, 229, 229), 2, true));
		lblEmail.setBackground(new Color(59, 22, 24));
		lblEmail.setBounds(290, 127, 250, 40);
		contentPane.add(lblEmail);

		JLabel lblEtiquetaDNI = new JLabel("DNI:");
		lblEtiquetaDNI.setOpaque(true);
		lblEtiquetaDNI.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtiquetaDNI.setForeground(Color.WHITE);
		lblEtiquetaDNI.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblEtiquetaDNI.setBorder(new LineBorder(new Color(229, 229, 229), 2, true));
		lblEtiquetaDNI.setBackground(new Color(59, 22, 24));
		lblEtiquetaDNI.setBounds(43, 166, 250, 40);
		contentPane.add(lblEtiquetaDNI);

		JLabel lblDNI = new JLabel("\"DNI\"");
		lblDNI.setOpaque(true);
		lblDNI.setHorizontalAlignment(SwingConstants.CENTER);
		lblDNI.setForeground(Color.WHITE);
		lblDNI.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblDNI.setBorder(new LineBorder(new Color(229, 229, 229), 2, true));
		lblDNI.setBackground(new Color(59, 22, 24));
		lblDNI.setBounds(290, 166, 250, 40);
		contentPane.add(lblDNI);

		/*
		 * Creaci�n del TabbedPanel
		 */

		UIManager.put("TabbedPane.selected", new Color(119,55,57));
		UIManager.put("TabbedPane.contentAreaColor", new Color(119,55,57));
		JTabbedPane tbModificar = new JTabbedPane(JTabbedPane.TOP);
		tbModificar.setFocusable(false);
		tbModificar.setBorder(null);
		tbModificar.setRequestFocusEnabled(false);
		tbModificar.setForeground(Color.white);
		tbModificar.setFont(new Font("Dialog", Font.PLAIN, 15));
		tbModificar.setBackground(new Color(59, 22, 24));
		tbModificar.setBounds(43, 216, 497, 221);
		contentPane.add(tbModificar);
		JPanel jpEditarPerfil = new JPanel();
		jpEditarPerfil.setBorder(null);
		jpEditarPerfil.setBackground(new Color(119,55,57));
		tbModificar.addTab("Editar Perfil", null, jpEditarPerfil, null);
		jpEditarPerfil.setLayout(null);

		JLabel lblEtiquetaUsuario_1 = new JLabel("Usuario:");
		lblEtiquetaUsuario_1.setBounds(10, 10, 197, 24);
		lblEtiquetaUsuario_1.setOpaque(true);
		lblEtiquetaUsuario_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtiquetaUsuario_1.setForeground(Color.WHITE);
		lblEtiquetaUsuario_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblEtiquetaUsuario_1.setBorder(new LineBorder(new Color(229, 229, 229), 2, true));
		lblEtiquetaUsuario_1.setBackground(new Color(59, 22, 24));
		jpEditarPerfil.add(lblEtiquetaUsuario_1);

		txtfUsuario = new JTextField();
		txtfUsuario.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtfUsuario.setBounds(233, 10, 249, 24);
		jpEditarPerfil.add(txtfUsuario);
		txtfUsuario.setColumns(10);

		JLabel lblEtiquetaNombre_1 = new JLabel("Nombre:");
		lblEtiquetaNombre_1.setOpaque(true);
		lblEtiquetaNombre_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtiquetaNombre_1.setForeground(Color.WHITE);
		lblEtiquetaNombre_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblEtiquetaNombre_1.setBorder(new LineBorder(new Color(229, 229, 229), 2, true));
		lblEtiquetaNombre_1.setBackground(new Color(59, 22, 24));
		lblEtiquetaNombre_1.setBounds(10, 44, 197, 24);
		jpEditarPerfil.add(lblEtiquetaNombre_1);

		JLabel lblEtiquetaEmail_1 = new JLabel("Email:");
		lblEtiquetaEmail_1.setOpaque(true);
		lblEtiquetaEmail_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtiquetaEmail_1.setForeground(Color.WHITE);
		lblEtiquetaEmail_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblEtiquetaEmail_1.setBorder(new LineBorder(new Color(229, 229, 229), 2, true));
		lblEtiquetaEmail_1.setBackground(new Color(59, 22, 24));
		lblEtiquetaEmail_1.setBounds(10, 78, 197, 24);
		jpEditarPerfil.add(lblEtiquetaEmail_1);

		JLabel lblEtiquetaDNI_1 = new JLabel("DNI:");
		lblEtiquetaDNI_1.setOpaque(true);
		lblEtiquetaDNI_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtiquetaDNI_1.setForeground(Color.WHITE);
		lblEtiquetaDNI_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblEtiquetaDNI_1.setBorder(new LineBorder(new Color(229, 229, 229), 2, true));
		lblEtiquetaDNI_1.setBackground(new Color(59, 22, 24));
		lblEtiquetaDNI_1.setBounds(10, 112, 197, 24);
		jpEditarPerfil.add(lblEtiquetaDNI_1);

		txtfNombre = new JTextField();
		txtfNombre.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtfNombre.setColumns(10);
		txtfNombre.setBounds(233, 44, 249, 24);
		jpEditarPerfil.add(txtfNombre);

		txtfEmail = new JTextField();
		txtfEmail.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtfEmail.setColumns(10);
		txtfEmail.setBounds(233, 78, 249, 24);
		jpEditarPerfil.add(txtfEmail);

		txtfDNI = new JTextField();
		txtfDNI.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtfDNI.setColumns(10);
		txtfDNI.setBounds(233, 112, 249, 24);
		jpEditarPerfil.add(txtfDNI);

		JButton btnAplicarPerfil = new JButton("Aplicar Cambios");
		btnAplicarPerfil.setFocusPainted(false);
		btnAplicarPerfil.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnAplicarPerfil.setForeground(Color.WHITE);
		btnAplicarPerfil.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnAplicarPerfil.setBounds(10, 156, 163, 21);
		btnAplicarPerfil.setBackground(new Color(45,118,116));
		jpEditarPerfil.add(btnAplicarPerfil);

		JButton btnVolverMenu = new JButton("Volver al Men\u00FA");
		btnVolverMenu.setFocusPainted(false);
		btnVolverMenu.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnVolverMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				if (Login.getTipoUsuario().equals("Alumno")) {
					MenuAlumno menu = new MenuAlumno();
					menu.setVisible(true);					
				}else {
					MenuProfesor menu = new MenuProfesor();
					menu.setVisible(true);
				}
			}
		});
		btnVolverMenu.setForeground(Color.WHITE);
		btnVolverMenu.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnVolverMenu.setBackground(new Color(45, 118, 116));
		btnVolverMenu.setBounds(319, 156, 163, 21);
		jpEditarPerfil.add(btnVolverMenu);

		JPanel jpCambiarContra= new JPanel();
		jpCambiarContra.setBackground(new Color(119,55,57));
		tbModificar.addTab("Cambiar Contraseña", null, jpCambiarContra, null);
		jpCambiarContra.setLayout(null);

		JLabel lblEtiquetaContrasena = new JLabel("Contrase\u00F1a Actual");
		lblEtiquetaContrasena.setOpaque(true);
		lblEtiquetaContrasena.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtiquetaContrasena.setForeground(Color.WHITE);
		lblEtiquetaContrasena.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblEtiquetaContrasena.setBorder(new LineBorder(new Color(229, 229, 229), 2, true));
		lblEtiquetaContrasena.setBackground(new Color(59, 22, 24));
		lblEtiquetaContrasena.setBounds(10, 25, 197, 24);
		jpCambiarContra.add(lblEtiquetaContrasena);

		JLabel lblEtiquetaContrasenaNueva = new JLabel("Nueva Contrase\u00F1a:\r\n");
		lblEtiquetaContrasenaNueva.setOpaque(true);
		lblEtiquetaContrasenaNueva.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtiquetaContrasenaNueva.setForeground(Color.WHITE);
		lblEtiquetaContrasenaNueva.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblEtiquetaContrasenaNueva.setBorder(new LineBorder(new Color(229, 229, 229), 2, true));
		lblEtiquetaContrasenaNueva.setBackground(new Color(59, 22, 24));
		lblEtiquetaContrasenaNueva.setBounds(10, 59, 197, 24);
		jpCambiarContra.add(lblEtiquetaContrasenaNueva);

		JLabel lblNuevaContrasea = new JLabel("Nueva Contrase\u00F1a:");
		lblNuevaContrasea.setOpaque(true);
		lblNuevaContrasea.setHorizontalAlignment(SwingConstants.CENTER);
		lblNuevaContrasea.setForeground(Color.WHITE);
		lblNuevaContrasea.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNuevaContrasea.setBorder(new LineBorder(new Color(229, 229, 229), 2, true));
		lblNuevaContrasea.setBackground(new Color(59, 22, 24));
		lblNuevaContrasea.setBounds(10, 93, 197, 24);
		jpCambiarContra.add(lblNuevaContrasea);
		
		jpContra = new JPasswordField();
		jpContra.setFont(new Font("Dialog", Font.PLAIN, 15));
		jpContra.setColumns(10);
		jpContra.setBounds(217, 25, 249, 24);
		jpCambiarContra.add(jpContra);

		jpContra_1 = new JPasswordField();
		jpContra_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		jpContra_1.setColumns(10);
		jpContra_1.setBounds(218, 59, 249, 24);
		jpCambiarContra.add(jpContra_1);

		jpContra_2 = new JPasswordField();
		jpContra_2.setFont(new Font("Dialog", Font.PLAIN, 15));
		jpContra_2.setColumns(10);
		jpContra_2.setBounds(218, 93, 249, 24);
		jpCambiarContra.add(jpContra_2);
		
		JLabel lblImgM = new JLabel("");
		lblImgM.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(mostrar) {
					Icon iconoM = new ImageIcon(new ImageIcon("img/Ocultar.png").getImage().getScaledInstance(lblImgM.getWidth(), lblImgM.getHeight(), Image.SCALE_AREA_AVERAGING));
					lblImgM.setIcon(iconoM);
					jpContra.setEchoChar((char)0);
					mostrar = false;
				}else {
					Icon iconoM = new ImageIcon(new ImageIcon("img/Mostrar.png").getImage().getScaledInstance(lblImgM.getWidth(), lblImgM.getHeight(), Image.SCALE_AREA_AVERAGING));
					lblImgM.setIcon(iconoM);
					jpContra.setEchoChar('*');
					mostrar = true;
				}
			}
		});
		lblImgM.setBounds(new Rectangle(471, 27, 20, 20));
		Icon iconoM = new ImageIcon(new ImageIcon("img/Mostrar.png").getImage().getScaledInstance(lblImgM.getWidth(), lblImgM.getHeight(), Image.SCALE_AREA_AVERAGING));
		lblImgM.setIcon(iconoM);
		lblImgM.setForeground(Color.WHITE);
		jpCambiarContra.add(lblImgM);
		
		JLabel lblImgM1 = new JLabel("");
		lblImgM1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(mostrar) {
					Icon iconoM = new ImageIcon(new ImageIcon("img/Ocultar.png").getImage().getScaledInstance(lblImgM1.getWidth(), lblImgM1.getHeight(), Image.SCALE_AREA_AVERAGING));
					lblImgM1.setIcon(iconoM);
					jpContra_1.setEchoChar((char)0);
					mostrar = false;
				}else {
					Icon iconoM = new ImageIcon(new ImageIcon("img/Mostrar.png").getImage().getScaledInstance(lblImgM1.getWidth(), lblImgM1.getHeight(), Image.SCALE_AREA_AVERAGING));
					lblImgM1.setIcon(iconoM);
					jpContra_1.setEchoChar('*');
					mostrar = true;
				}
			}
		});
		lblImgM1.setBounds(new Rectangle(471, 60, 20, 20));
		Icon iconoM1 = new ImageIcon(new ImageIcon("img/Mostrar.png").getImage().getScaledInstance(lblImgM1.getWidth(), lblImgM1.getHeight(), Image.SCALE_AREA_AVERAGING));
		lblImgM1.setIcon(iconoM1);
		lblImgM1.setForeground(Color.WHITE);
		jpCambiarContra.add(lblImgM1);
		
		JLabel lblImgM2 = new JLabel("");
		lblImgM2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(mostrar) {
					Icon iconoM = new ImageIcon(new ImageIcon("img/Ocultar.png").getImage().getScaledInstance(lblImgM2.getWidth(), lblImgM2.getHeight(), Image.SCALE_AREA_AVERAGING));
					lblImgM2.setIcon(iconoM);
					jpContra_2.setEchoChar((char)0);
					mostrar = false;
				}else {
					Icon iconoM = new ImageIcon(new ImageIcon("img/Mostrar.png").getImage().getScaledInstance(lblImgM2.getWidth(), lblImgM2.getHeight(), Image.SCALE_AREA_AVERAGING));
					lblImgM2.setIcon(iconoM);
					jpContra_2.setEchoChar('*');
					mostrar = true;
				}
			}
		});
		lblImgM2.setBounds(new Rectangle(471, 96, 20, 20));
		Icon iconoM2 = new ImageIcon(new ImageIcon("img/Mostrar.png").getImage().getScaledInstance(lblImgM2.getWidth(), lblImgM2.getHeight(), Image.SCALE_AREA_AVERAGING));
		lblImgM2.setIcon(iconoM2);
		lblImgM2.setForeground(Color.WHITE);
		jpCambiarContra.add(lblImgM2);
		
		JButton btnCambiarContrasea = new JButton("Cambiar Contrase\u00F1a");
		btnCambiarContrasea.setFocusPainted(false);
		btnCambiarContrasea.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnCambiarContrasea.setForeground(Color.WHITE);
		btnCambiarContrasea.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnCambiarContrasea.setBackground(new Color(45, 118, 116));
		btnCambiarContrasea.setBounds(10, 156, 163, 21);
		jpCambiarContra.add(btnCambiarContrasea);

		JButton btnVolverMenu_1 = new JButton("Volver al Men\u00FA");
		btnVolverMenu_1.setFocusPainted(false);
		btnVolverMenu_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnVolverMenu_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				if (Login.getTipoUsuario().equals("Alumno")) {
					MenuAlumno menu = new MenuAlumno();
					menu.setVisible(true);					
				}else {
					MenuProfesor menu = new MenuProfesor();
					menu.setVisible(true);
				}
			}
		});
		btnVolverMenu_1.setForeground(Color.WHITE);
		btnVolverMenu_1.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnVolverMenu_1.setBackground(new Color(45, 118, 116));
		btnVolverMenu_1.setBounds(319, 156, 163, 21);
		jpCambiarContra.add(btnVolverMenu_1);

		JPanel jpCambiarFoto = new JPanel();
		jpCambiarFoto.setBackground(new Color(119,55,57));
		tbModificar.addTab("Cambiar Foto de Perfil", null, jpCambiarFoto, null);
		jpCambiarFoto.setLayout(null);

		JButton btnVolverMenu_1_1 = new JButton("Volver al Men\u00FA");
		btnVolverMenu_1_1.setFocusPainted(false);
		btnVolverMenu_1_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnVolverMenu_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				if (Login.getTipoUsuario().equals("Alumno")) {
					MenuAlumno menu = new MenuAlumno();
					menu.setVisible(true);					
				}else {
					MenuProfesor menu = new MenuProfesor();
					menu.setVisible(true);
				}
			}
		});
		btnVolverMenu_1_1.setForeground(Color.WHITE);
		btnVolverMenu_1_1.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnVolverMenu_1_1.setBackground(new Color(45, 118, 116));
		btnVolverMenu_1_1.setBounds(319, 156, 163, 21);
		jpCambiarFoto.add(btnVolverMenu_1_1);

		JButton btnCambiarFoto = new JButton("Cambiar Foto Perfil");
		btnCambiarFoto.setFocusPainted(false);
		btnCambiarFoto.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnCambiarFoto.setForeground(Color.WHITE);
		btnCambiarFoto.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnCambiarFoto.setBackground(new Color(45, 118, 116));
		btnCambiarFoto.setBounds(10, 156, 163, 21);
		jpCambiarFoto.add(btnCambiarFoto);

		JLabel lblEtiquetaRuta = new JLabel("Ruta de la Foto");
		lblEtiquetaRuta.setOpaque(true);
		lblEtiquetaRuta.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtiquetaRuta.setForeground(Color.WHITE);
		lblEtiquetaRuta.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblEtiquetaRuta.setBorder(new LineBorder(new Color(229, 229, 229), 2, true));
		lblEtiquetaRuta.setBackground(new Color(59, 22, 24));
		lblEtiquetaRuta.setBounds(10, 46, 209, 45);
		jpCambiarFoto.add(lblEtiquetaRuta);

		txtfRuta = new JTextField();
		txtfRuta.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtfRuta.setColumns(10);
		txtfRuta.setBounds(217, 46, 265, 46);
		jpCambiarFoto.add(txtfRuta);

		JFileChooser fc = new JFileChooser();
		fc.setFileFilter(new FileNameExtensionFilter("*.JPG & *.PNG", "jpg", "png"));
		JButton btnArchivo = new JButton("Archivos");
		btnArchivo.setFocusPainted(false);
		btnArchivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int seleccion =fc.showSaveDialog(btnArchivo);
				if (seleccion==JFileChooser.APPROVE_OPTION)
					txtfRuta.setText(fc.getSelectedFile().getAbsoluteFile().toString());
				if (seleccion==JFileChooser.CANCEL_OPTION)
					txtfRuta.setText("");
				
			}
		});
		btnArchivo.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnArchivo.setForeground(Color.WHITE);
		btnArchivo.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnArchivo.setBackground(new Color(45, 118, 116));
		btnArchivo.setBounds(319, 97, 163, 21);
		jpCambiarFoto.add(btnArchivo);





	}
}
