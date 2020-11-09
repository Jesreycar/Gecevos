package org.alumno;

import java.awt.Color;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.Rectangle;
import java.awt.Font;
import javax.swing.border.LineBorder;

import org.Login;
import org.general.Horario;
import org.general.Perfil;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * Menu principal para alumnos
 * @author Jesus Reyes
 * @version 1.0
 */
public class MenuAlumno extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Create the frame.
	 */
	public MenuAlumno() {
		setTitle("Gecevos-Alumno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		
		//Menu superior
		JMenuBar menu = new JMenuBar();
		menu.setForeground(Color.WHITE);
		menu.setBorderPainted(false);
		menu.setBackground(new Color(72,75,156));
		setJMenuBar(menu);
		
		JMenu mnOpciones = new JMenu("Opciones");
		mnOpciones.setFont(new Font("Dialog", Font.BOLD, 12));
		mnOpciones.setForeground(Color.WHITE);
		mnOpciones.setBackground(new Color(72,75,156));
		menu.add(mnOpciones);
		
		JMenuItem mntmCerrarSesin = new JMenuItem("Cerrar Sesi\u00F3n");
		mntmCerrarSesin.setFont(new Font("Dialog", Font.PLAIN, 12));
		mntmCerrarSesin.setForeground(Color.WHITE);
		mntmCerrarSesin.setBackground(new Color(72,75,156));
		mnOpciones.add(mntmCerrarSesin);
		
		JMenuItem mntmCerrarVentana = new JMenuItem("Cerrar Ventana");
		mntmCerrarVentana.setFont(new Font("Dialog", Font.PLAIN, 12));
		mntmCerrarVentana.setForeground(Color.WHITE);
		mntmCerrarVentana.setBackground(new Color(72,75,156));
		mnOpciones.add(mntmCerrarVentana);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		mnAyuda.setBackground(new Color(72,75,156));
		mnAyuda.setForeground(Color.WHITE);
		mnAyuda.setFont(new Font("Dialog", Font.BOLD, 12));
		menu.add(mnAyuda);
		
		//Panel principal
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(118, 45, 47));
		contentPane.setLayout(null);
		setResizable(false);
		setContentPane(contentPane);
		
		//Botones usuario
		JButton btnPerfil = new JButton("Perfil");
		btnPerfil.setFocusPainted(false);
		btnPerfil.setBorder(new LineBorder(new Color(229,229,229), 2));
		btnPerfil.setForeground(Color.WHITE);
		btnPerfil.setBackground(new Color(45,118,116));
		btnPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Perfil frame = new Perfil();
			}
		});
		btnPerfil.setFont(new Font("Dialog", Font.PLAIN, 11));
		btnPerfil.setBounds(332, 62, 104, 29);
		contentPane.add(btnPerfil);
		
		JButton btnCerrarSesin = new JButton("Cerrar Sesi\u00F3n");
		btnCerrarSesin.setFocusPainted(false);
		btnCerrarSesin.setBorder(new LineBorder(new Color(229,229,229), 2));
		btnCerrarSesin.setForeground(Color.WHITE);
		btnCerrarSesin.setBackground(new Color(45,118,116));
		btnCerrarSesin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Login frame = new Login();
			}
		});
		btnCerrarSesin.setFont(new Font("Dialog", Font.PLAIN, 11));
		btnCerrarSesin.setBounds(458, 62, 104, 29);
		contentPane.add(btnCerrarSesin);
		
		//Perfil Usuario
		JLabel lblNombre = new JLabel("Nombre Completo");
		lblNombre.setBounds(181, 46, 113, 19);
		lblNombre.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNombre.setForeground(Color.WHITE);
		
		JLabel lblCurso = new JLabel("Curso");
		lblCurso.setBounds(214, 86, 38, 19);
		lblCurso.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblCurso.setForeground(Color.WHITE);
		
		JLabel lblImg = new JLabel("");
		lblImg.setBorder(new LineBorder(new Color(229,229,229), 2));
		lblImg.setBounds(new Rectangle(15, 26, 128, 100));
		Icon icono = new ImageIcon(new ImageIcon("img/ImgPerfil.png").getImage().getScaledInstance(lblImg.getWidth(), lblImg.getHeight(), Image.SCALE_DEFAULT));
		
		lblImg.setIcon(icono);
		contentPane.add(lblImg);
		contentPane.add(lblNombre);
		contentPane.add(lblCurso);
		
		
		//Se�rador
		JSeparator separator = new JSeparator();
		separator.setBounds(15, 137, 547, 2);
		contentPane.add(separator);
		
		//Menu Usuario
		JButton btnPartes = new JButton("Partes");
		btnPartes.setFocusPainted(false);
		btnPartes.setBorder(new LineBorder(new Color(229,229,229), 2));
		btnPartes.setForeground(Color.WHITE);
		btnPartes.setBackground(new Color(45,118,116));
		btnPartes.setFont(new Font("Dialog", Font.PLAIN, 11));
		btnPartes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				PartesAlumno partesAlumno = new PartesAlumno();
				partesAlumno.setVisible(true);
			}
		});
		btnPartes.setBounds(72, 184, 440, 45);
		contentPane.add(btnPartes);
		
		JButton btnCalificaciones = new JButton("Calificaciones");
		btnCalificaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Calificaciones calificacion = new Calificaciones();
				calificacion.setVisible(true);
			}
		});
		btnCalificaciones.setFocusPainted(false);
		btnCalificaciones.setBorder(new LineBorder(new Color(229,229,229), 2));
		btnCalificaciones.setForeground(Color.WHITE);
		btnCalificaciones.setBackground(new Color(45,118,116));
		btnCalificaciones.setFont(new Font("Dialog", Font.PLAIN, 11));
		btnCalificaciones.setBounds(72, 276, 440, 45);
		contentPane.add(btnCalificaciones);
		
		JButton btnHorario = new JButton("Horario");
		btnHorario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Horario horario = new Horario();
				horario.setVisible(true);
			}
		});
		btnHorario.setFocusPainted(false);
		btnHorario.setBorder(new LineBorder(new Color(229,229,229), 2));
		btnHorario.setForeground(Color.WHITE);
		btnHorario.setBackground(new Color(45,118,116));
		btnHorario.setFont(new Font("Dialog", Font.PLAIN, 11));
		btnHorario.setBounds(72, 368, 440, 45);
		contentPane.add(btnHorario);
	}
}
