package org.alumno;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.UIManager;
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
		btnPrimerTrimestre.setEnabled(false);
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

		//Panel donde se muestra la tabla
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBounds(27, 94, 527, 317);
		panel.setBackground(new Color(118, 45, 47));
		CardLayout cardLayout = new CardLayout(0, 0);
		panel.setLayout(cardLayout);
		contentPane.add(panel);

		//Tabla Primer Trimestre
		JTable table = new JTable();
		table.setBounds(0, 0, 527, 317);
		table.setGridColor(Color.BLACK);
		table.setFont(new Font("Dialog", Font.PLAIN, 15));
		table.setForeground(Color.WHITE);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBackground(new Color(118, 45, 47));
		table.setModel(new DefaultTableModel(
				new Object[][] {
					{"PSP", "6"},
					{"ACD", "4"},
					{"DIN", "5"},
					{"HLC", "6"},
				},
				new String[] {
						"Asignatura", "Nota"
				}
				));
		table.setDefaultEditor(Object.class, null);
		table.setRowHeight(50);

		//Tabla Segundo Trimestre
		JTable table1 = new JTable();
		table1.setBounds(0, 0, 150, 80);
		table1.setGridColor(Color.BLACK);
		table1.setFont(new Font("Dialog", Font.PLAIN, 15));
		table1.setForeground(Color.WHITE);
		table1.setBorder(new LineBorder(new Color(0, 0, 0)));
		table1.setBackground(new Color(118, 45, 47));
		table1.setModel(new DefaultTableModel(
				new Object[][] {
					{"PSP1", "6"},
					{"ACD1", "4"},
					{"DIN1", "5"},
					{"HLC1", "6"},
					{"PMDM1", "7"},
					{"EIE1", "7"},
					{"SGE1", "7"},
				},
				new String[] {
						"Asignatura", "Nota"
				}
				));
		table1.setDefaultEditor(Object.class, null);
		table1.setRowHeight(50);

		//Tabla Tercer Trimestre
		JTable table2 = new JTable();
		table2.setGridColor(Color.BLACK);
		table2.setFont(new Font("Dialog", Font.PLAIN, 15));
		table2.setForeground(Color.WHITE);
		table2.setBorder(new LineBorder(new Color(0, 0, 0)));
		table2.setBackground(new Color(118, 45, 47));
		table2.setModel(new DefaultTableModel(
				new Object[][] {
					{"PSP2", "6"},
					{"ACD2", "4"},
					{"DIN2", "5"},
					{"HLC2", "6"},
					{"PMDM2", "7"},
					{"EIE2", "7"},
					{"SGE2", "7"},
				},
				new String[] {
						"Asignatura", "Nota"
				}
				));
		table2.setDefaultEditor(Object.class, null);
		table2.setRowHeight(50);

		//Scroll Primer Trimestre
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBorder(null);
		scrollPane.getViewport().setBackground(new Color(118, 45, 47));
		panel.add(scrollPane, "PrimerTrim");
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		//Scroll Segundo Trimestre
		JScrollPane scrollPane1 = new JScrollPane(table1);
		scrollPane1.getViewport().setBackground(new Color(118, 45, 47));
		panel.add(scrollPane1, "SegundoTrim");
		scrollPane1.setVisible(false);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		//Scroll Tercer Trimestre
		JScrollPane scrollPane2 = new JScrollPane(table2);
		scrollPane2.getViewport().setBackground(new Color(118, 45, 47));
		panel.add(scrollPane2, "TercerTrim");
		scrollPane2.setVisible(false);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		
		//Eventos de los botones
		btnPrimerTrimestre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPrimerTrimestre.setEnabled(false);
				btnSegundoTrimestre.setEnabled(true);
				btnTercerTrimestre.setEnabled(true);
				cardLayout.show(panel, "PrimerTrim");
				scrollPane.setVisible(true);
				scrollPane1.setVisible(false);
				scrollPane2.setVisible(false);
			}
		});
		btnSegundoTrimestre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPrimerTrimestre.setEnabled(true);
				btnSegundoTrimestre.setEnabled(false);
				btnTercerTrimestre.setEnabled(true);
				cardLayout.show(panel, "SegundoTrim");
				scrollPane.setVisible(false);
				scrollPane1.setVisible(true);
				scrollPane2.setVisible(false);
			}
		});
		btnTercerTrimestre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPrimerTrimestre.setEnabled(true);
				btnSegundoTrimestre.setEnabled(true);
				btnTercerTrimestre.setEnabled(false);
				cardLayout.show(panel, "TercerTrim");
				scrollPane.setVisible(false);
				scrollPane1.setVisible(false);
				scrollPane2.setVisible(true);
			}
		});
	}
}