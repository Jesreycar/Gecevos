package org;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTable;
/**
 * Esta clase contiene el menú con todas las opciones del profesorado
 * @author Juan Antonio Escribano Díaz
 * @version 1.0
 */
public class MenuProfesor extends JFrame {

	private JPanel contentPane;
	private JTable table;


	/**
	 * Create the frame.
	 */
	public MenuProfesor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		setTitle("Menu Profesor");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(118, 45, 47));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(Color.WHITE);
		separator.setBounds(302, 10, 2, 421);
		contentPane.add(separator);

		//Barra de menús
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
		JMenuItem mntmRecordatorio = new JMenuItem("Recordatorio");
		mntmRecordatorio.setFont(new Font("Dialog", Font.PLAIN, 12));
		mntmRecordatorio.setForeground(Color.WHITE);
		mntmRecordatorio.setBackground(new Color(72,75,156));
		mnOpciones.add(mntmRecordatorio);
		mntmRecordatorio.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		JMenuItem mntmCerrarSesin = new JMenuItem("Cerrar Sesi\u00F3n");
		mntmCerrarSesin.setFont(new Font("Dialog", Font.PLAIN, 12));
		mntmCerrarSesin.setForeground(Color.WHITE);
		mntmCerrarSesin.setBackground(new Color(72,75,156));
		mnOpciones.add(mntmCerrarSesin);
		mntmCerrarSesin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Login login = new Login();
				login.setVisible(true);
			}
		});

		JMenuItem mntmCerrarVentana = new JMenuItem("Cerrar Ventana");
		mntmCerrarVentana.setFont(new Font("Dialog", Font.PLAIN, 12));
		mntmCerrarVentana.setForeground(Color.WHITE);
		mntmCerrarVentana.setBackground(new Color(72,75,156));
		mnOpciones.add(mntmCerrarVentana);
		mntmCerrarVentana.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		JMenu mnAyuda = new JMenu("Ayuda");
		mnAyuda.setBackground(new Color(72,75,156));
		mnAyuda.setForeground(Color.WHITE);
		mnAyuda.setFont(new Font("Dialog", Font.BOLD, 12));
		menu.add(mnAyuda);
		
		JButton btnPerfil = new JButton("Perfil");
		btnPerfil.setFocusPainted(false);
		btnPerfil.setBorder(new LineBorder(new Color(229,229,229), 2));
		btnPerfil.setForeground(Color.WHITE);
		btnPerfil.setBackground(new Color(45,118,116));
		btnPerfil.setFont(new Font("Dialog", Font.PLAIN, 11));
		btnPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				Perfil perfil = new Perfil();
				perfil.setVisible(true);
			}
		});
		btnPerfil.setBounds(24, 70, 249, 45);
		contentPane.add(btnPerfil);
		
		JButton btnPartes = new JButton("Partes");
		btnPartes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPartes.setForeground(Color.WHITE);
		btnPartes.setFont(new Font("Dialog", Font.PLAIN, 11));
		btnPartes.setFocusPainted(false);
		btnPartes.setBorder(new LineBorder(new Color(229,229,229), 2));
		btnPartes.setBackground(new Color(45, 118, 116));
		btnPartes.setBounds(24, 125, 249, 45);
		contentPane.add(btnPartes);


		JButton btnClases = new JButton("Mis Clases");
		btnClases.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClases.setForeground(Color.WHITE);
		btnClases.setFont(new Font("Dialog", Font.PLAIN, 11));
		btnClases.setFocusPainted(false);
		btnClases.setBorder(new LineBorder(new Color(229,229,229), 2));
		btnClases.setBackground(new Color(45, 118, 116));
		btnClases.setBounds(24, 180, 249, 45);
		contentPane.add(btnClases);
		

		JButton btnHorario = new JButton("Horario");
		btnHorario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Horario horario = new Horario();
				horario.setVisible(true);
			}
		});
		btnHorario.setForeground(Color.WHITE);
		btnHorario.setFont(new Font("Dialog", Font.PLAIN, 11));
		btnHorario.setFocusPainted(false);
		btnHorario.setBorder(new LineBorder(new Color(229,229,229), 2));
		btnHorario.setBackground(new Color(45, 118, 116));
		btnHorario.setBounds(24, 235, 249, 45);
		contentPane.add(btnHorario);
		

		JButton btnCerrarSesion = new JButton("Cerrar Sesión");
		btnCerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Login login = new Login();
				login.setVisible(true);
			}
		});
		btnCerrarSesion.setForeground(Color.WHITE);
		btnCerrarSesion.setFont(new Font("Dialog", Font.PLAIN, 11));
		btnCerrarSesion.setFocusPainted(false);
		btnCerrarSesion.setBorder(new LineBorder(new Color(229,229,229), 2));
		btnCerrarSesion.setBackground(new Color(45, 118, 116));
		btnCerrarSesion.setBounds(24, 290, 249, 45);
		contentPane.add(btnCerrarSesion);
		

		JLabel lblImg = new JLabel("img");
		lblImg.setBounds(new Rectangle(33, 20, 124, 105));
		Icon icono = new ImageIcon(new ImageIcon("img/ImgPerfil.png").getImage().getScaledInstance(lblImg.getWidth(), lblImg.getHeight(), Image.SCALE_REPLICATE));
		lblImg.setIcon(icono);
		lblImg.setBounds(452, 10, 124, 105);
		lblImg.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		contentPane.add(lblImg);
		
		JLabel lblNombreCompleto = new JLabel("Nombre Completo");
		lblNombreCompleto.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNombreCompleto.setBounds(314, 56, 128, 20);
		contentPane.add(lblNombreCompleto);
		
		table = new JTable();
		table.setBackground(Color.WHITE);
		table.setFont(new Font("Dialog", Font.PLAIN, 15));
		table.setBounds(314, 125, 262, 284);
		contentPane.add(table);
	}
}
