package org;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Horario extends JFrame {

	private JPanel contentPane;
	private JTable table;
	/**
	 * Create the frame.
	 */
	public Horario() {
		setTitle("Gecevos-Horario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);

		//Panel principal
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(118, 45, 47));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		//Label titulo horario de clase
		JLabel lblHorarioDeClase = new JLabel("Horario de Clase", SwingConstants.CENTER);
		lblHorarioDeClase.setOpaque(true);
		lblHorarioDeClase.setForeground(Color.WHITE);
		lblHorarioDeClase.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblHorarioDeClase.setBorder(new LineBorder(new Color(229,229,229), 2));
		lblHorarioDeClase.setBackground(new Color(59, 22, 24));
		lblHorarioDeClase.setBounds(54, 29, 476, 38);
		contentPane.add(lblHorarioDeClase);

		//Panel donde se muestra el horario
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(118, 45, 47));
		panel.setBounds(29, 94, 527, 317);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));

		//Tabla
		table = new JTable();
		table.setGridColor(Color.BLACK);
		table.setFont(new Font("Dialog", Font.PLAIN, 15));
		table.setForeground(Color.WHITE);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBackground(new Color(118, 45, 47));
		table.setModel(new DefaultTableModel(
				new Object[][] {
					{"8:30-9:30", "ACD"},
					{"9:30-10:30", "DIN"},
				},
				new String[] {
						"Horas", "Lunes", "Martes", "Miercoles", "Jueves", "Vienes"
				}
				));
		table.setDefaultEditor(Object.class, null);
		panel.add(table);

		//Boton para volver al menu de usuario
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
		btnVolver.setBounds(217, 425, 132, 25);
		contentPane.add(btnVolver);
	}
}
