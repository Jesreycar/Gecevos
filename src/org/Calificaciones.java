package org;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Calificaciones extends JFrame {

	private JPanel contentPane;
	private JTable table;
	
	/**
	 * Create the frame.
	 */
	public Calificaciones() {
		setTitle("Gecevos-Calificaciones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.setBackground(new Color(118, 45, 47));
		contentPane.setLayout(null);
		setResizable(false);
		setContentPane(contentPane);
		
		//Botones trimestres
		JButton btnPrimerTrimestre = new JButton("Primer Trimestre");
		btnPrimerTrimestre.setFocusPainted(false);
		btnPrimerTrimestre.setForeground(Color.WHITE);
		btnPrimerTrimestre.setFont(new Font("Dialog", Font.PLAIN, 11));
		btnPrimerTrimestre.setBorder(new LineBorder(new Color(229,229,229), 2));
		btnPrimerTrimestre.setBackground(new Color(45, 118, 116));
		btnPrimerTrimestre.setBounds(27, 38, 161, 29);
		contentPane.add(btnPrimerTrimestre);
		
		JButton btnSegundoTrimestre = new JButton("Segundo Trimestre");
		btnSegundoTrimestre.setForeground(Color.WHITE);
		btnSegundoTrimestre.setFont(new Font("Dialog", Font.PLAIN, 11));
		btnSegundoTrimestre.setFocusPainted(false);
		btnSegundoTrimestre.setBorder(new LineBorder(new Color(229,229,229), 2));
		btnSegundoTrimestre.setBackground(new Color(45, 118, 116));
		btnSegundoTrimestre.setBounds(211, 39, 161, 29);
		contentPane.add(btnSegundoTrimestre);
		
		JButton btnTercerTrimestre = new JButton("Tercer Trimestre");
		btnTercerTrimestre.setForeground(Color.WHITE);
		btnTercerTrimestre.setFont(new Font("Dialog", Font.PLAIN, 11));
		btnTercerTrimestre.setFocusPainted(false);
		btnTercerTrimestre.setBorder(new LineBorder(new Color(229,229,229), 2));
		btnTercerTrimestre.setBackground(new Color(45, 118, 116));
		btnTercerTrimestre.setBounds(393, 39, 161, 29);
		contentPane.add(btnTercerTrimestre);
		
		//Panel donde se muestra la tabla
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBounds(27, 94, 527, 317);
		panel.setBackground(new Color(118, 45, 47));
		panel.setLayout(new BorderLayout(0, 0));
		contentPane.add(panel);
		
		//Tabla
		table = new JTable();
		table.setGridColor(Color.BLACK);
		table.setFont(new Font("Dialog", Font.PLAIN, 15));
		table.setForeground(Color.WHITE);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBackground(new Color(118, 45, 47));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Matematicas", "6"},
				{"Física", "8"},
			},
			new String[] {
				"Asignatura", "Nota"
			}
		));
		table.setDefaultEditor(Object.class, null);
		panel.add(table);
		
		//Boton volver al menu del usuario
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				MenuAlumno menuAlumno = new MenuAlumno();
				menuAlumno.setVisible(true);
			}
		});
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnVolver.setFocusPainted(false);
		btnVolver.setBorder(new LineBorder(new Color(229,229,229), 2));
		btnVolver.setBackground(new Color(45, 118, 116));
		btnVolver.setBounds(215, 425, 132, 25);
		contentPane.add(btnVolver);
	}

}