package org;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class MenuAlumno extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Create the frame.
	 */
	public MenuAlumno() {
		setTitle("Gecevos-Alumno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(118, 45, 47));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		
		JLabel lblAsd = new JLabel("asd");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(83)
							.addComponent(lblAsd)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(33)
					.addComponent(lblAsd)
					.addContainerGap(373, Short.MAX_VALUE))
		);
		
		JMenu mnNewMenu_1 = new JMenu("Opciones");
		mnNewMenu_1.setBounds(10, 5, 99, 22);
		panel.setLayout(null);
		panel.add(mnNewMenu_1);
		
		JMenuItem mntmAyuda = new JMenuItem("Ayuda");
		mntmAyuda.setBounds(119, 5, 129, 22);
		panel.add(mntmAyuda);
		contentPane.setLayout(gl_contentPane);
	}
}
