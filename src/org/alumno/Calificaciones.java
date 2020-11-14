package org.alumno;

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
import java.awt.CardLayout;
import javax.swing.JScrollPane;

/**
 * Clase para mostrar las calificaciones del alumno por asignatura
 * @author Jesus Reyes
 * @version 1.0
 */
public class Calificaciones extends JFrame {

	private JPanel contentPane;
	private JTable table, table1, table2;

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
		btnPrimerTrimestre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
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
		contentPane.add(panel);

		//Tabla Primer Trimestre
		table = new JTable();
		table.setBounds(0, 0, 527, 317);
		table.setGridColor(Color.BLACK);
		table.setFont(new Font("Dialog", Font.PLAIN, 15));
		table.setForeground(Color.WHITE);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBackground(new Color(118, 45, 47));
		table.setModel(new DefaultTableModel(
				new Object[][] {
					{"Matematicas", "6"},
					{"Física", "4"},
					{"Física", "5"},
					{"Física", "6"},
					{"Física", "7"},
				},
				new String[] {
						"Asignatura", "Nota"
				}
				));
		table.setDefaultEditor(Object.class, null);
		panel.setLayout(new CardLayout(0, 0));
		table.setRowHeight(50);

		//Tabla Segundo Trimestre
		table1 = new JTable();
		table1.setBounds(0, 0, 150, 80);
		table1.setGridColor(Color.BLACK);
		table1.setFont(new Font("Dialog", Font.PLAIN, 15));
		table1.setForeground(Color.WHITE);
		table1.setBorder(new LineBorder(new Color(0, 0, 0)));
		table1.setBackground(new Color(118, 45, 47));
		table1.setModel(new DefaultTableModel(
				new Object[][] {
					{"Matematicas", "5"},
					{"Física", "5"},
					{"Física", "6"},
					{"Física", "9"},
					{"Física", "8"},
				},
				new String[] {
						"Asignatura", "Nota"
				}
				));
		table.setDefaultEditor(Object.class, null);
		panel.setLayout(new CardLayout(0, 0));
		table.setRowHeight(50);

		//Tabla Tercer Trimestre
		table2 = new JTable();
		table2.setGridColor(Color.BLACK);
		table2.setFont(new Font("Dialog", Font.PLAIN, 15));
		table2.setForeground(Color.WHITE);
		table2.setBorder(new LineBorder(new Color(0, 0, 0)));
		table2.setBackground(new Color(118, 45, 47));
		table2.setModel(new DefaultTableModel(
				new Object[][] {
					{"Matematicas", "9"},
					{"Física", "6"},
					{"Física", "7"},
					{"Física", "8"},
					{"Física", "9"},
				},
				new String[] {
						"Asignatura", "Nota"
				}
				));
		table.setDefaultEditor(Object.class, null);
		panel.setLayout(new CardLayout(0, 0));
		table.setRowHeight(50);

		JPanel panelHorario = new JPanel();
		panelHorario.setBackground(new Color(118, 45, 47));
		panel.add(panelHorario, "name_91741926888100");

		JPanel panelHorario_1 = new JPanel();
		panelHorario_1.setBackground(new Color(118, 45, 47));
		panel.add(panelHorario_1, "name_91847347236600");

		JPanel panelHorario_2 = new JPanel();
		panelHorario_2.setBackground(new Color(118, 45, 47));
		panel.add(panelHorario_2, "name_91858126663200");
		panelHorario.setLayout(null);

		panelHorario.add(table);
		panelHorario_1.setLayout(null);
		panelHorario_1.add(table1);
		panelHorario_2.add(table2);

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
		
		//Scroll para la lista
		JScrollPane scrollPane = new JScrollPane(table);
		panel.add(scrollPane);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	}
}