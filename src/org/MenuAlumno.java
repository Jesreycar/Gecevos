package org;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import java.awt.Insets;
import javax.swing.JSeparator;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JDesktopPane;
import javax.swing.JToolBar;

public class MenuAlumno extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Create the frame.
	 */
	public MenuAlumno() {
		setTitle("Gecevos-Alumno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorderPainted(false);
		menuBar.setBackground(new Color(72,75,156));
		setJMenuBar(menuBar);
		
		JMenu mnOpciones = new JMenu("Opciones");
		menuBar.add(mnOpciones);
		
		JMenuItem mntmCerrarSesin = new JMenuItem("Cerrar Sesi\u00F3n");
		mnOpciones.add(mntmCerrarSesin);
		
		JMenuItem mntmCerrarVentana = new JMenuItem("Cerrar Ventana");
		mnOpciones.add(mntmCerrarVentana);
		
		JMenuItem mntmAyuda = new JMenuItem("Ayuda");
		menuBar.add(mntmAyuda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(118, 45, 47));
		setContentPane(contentPane);
		
		JSeparator separator = new JSeparator();
		
		JLabel lblImg = new JLabel("");
		Icon icono = new ImageIcon(new ImageIcon("img/ImgPerfil.png").getImage().getScaledInstance(lblImg.getWidth(), lblImg.getHeight(), Image.SCALE_AREA_AVERAGING));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblImg, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
						.addComponent(separator, GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblImg, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 4, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(287, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
