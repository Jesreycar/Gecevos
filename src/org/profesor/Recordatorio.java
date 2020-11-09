package org.profesor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextArea;
import javax.swing.JTable;

public class Recordatorio extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Create the frame.
	 */
	public Recordatorio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(new Color(118, 45, 47));
		contentPane.setLayout(null);
		

		JLabel lblEtiquetaTarea = new JLabel("Tarea:");
		lblEtiquetaTarea.setOpaque(true);
		lblEtiquetaTarea.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtiquetaTarea.setForeground(Color.WHITE);
		lblEtiquetaTarea.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblEtiquetaTarea.setBorder(new LineBorder(new Color(229, 229, 229), 2, true));
		lblEtiquetaTarea.setBackground(new Color(59, 22, 24));
		lblEtiquetaTarea.setBounds(10, 26, 287, 40);
		contentPane.add(lblEtiquetaTarea);
		
		JTextArea textArea = new JTextArea();
		textArea.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		textArea.setFont(new Font("Dialog", Font.PLAIN, 15));
		textArea.setBounds(10, 65, 566, 114);
		contentPane.add(textArea);
		
		table = new JTable();
		table.setBounds(10, 209, 566, 202);
		contentPane.add(table);
		
		JButton btnCrearTarea = new JButton("Crear tarea");
		btnCrearTarea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnCrearTarea.setForeground(Color.WHITE);
		btnCrearTarea.setFont(new Font("Dialog", Font.PLAIN, 11));
		btnCrearTarea.setFocusPainted(false);
		btnCrearTarea.setBorder(new LineBorder(new Color(229,229,229), 2));
		btnCrearTarea.setBackground(new Color(45, 118, 116));
		btnCrearTarea.setBounds(307, 27, 269, 40);
		contentPane.add(btnCrearTarea);
		

		JButton btnVolver = new JButton("Volver al Menú");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				MenuProfesor menu = new MenuProfesor();
				menu.setVisible(true);
			}
		});
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setFont(new Font("Dialog", Font.PLAIN, 11));
		btnVolver.setFocusPainted(false);
		btnVolver.setBorder(new LineBorder(new Color(229,229,229), 2));
		btnVolver.setBackground(new Color(45, 118, 116));
		btnVolver.setBounds(152, 422, 269, 40);
		contentPane.add(btnVolver);
	}
}
