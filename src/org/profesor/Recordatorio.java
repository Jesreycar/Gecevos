package org.profesor;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import org.Login;
import org.alumno.MenuAlumno;

import javax.swing.JTextArea;
import javax.swing.JTable;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Recordatorio extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private static Object[][] tarea= {{"Hablar con el jefe de departamento"},{"Explicar los arrays en 1 DAM"}}; 

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

		JTextArea txtaTarea = new JTextArea();
		txtaTarea.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		txtaTarea.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtaTarea.setBounds(10, 65, 566, 114);
		contentPane.add(txtaTarea);


		table = new JTable();
		table.setBounds(10, 209, 566, 202);
		table.setModel(new DefaultTableModel(
				getTareas(),
				new String[] {"Recordatorio", "Hecho"}
				));

		table.getColumn("Hecho").setCellEditor(table.getDefaultEditor(Boolean.class));
		table.getColumn("Hecho").setCellRenderer(table.getDefaultRenderer(Boolean.class));
		table.setRowHeight(50);
		contentPane.add(table);

		DefaultTableModel df = (DefaultTableModel) table.getModel();
		/*
		 * Asigna en false todos los checkbox de la tabla
		 */
		for (int i=0;i<df.getRowCount(); i++)
			df.setValueAt(false, i, 1);

		/*
		 * En caso de que se pulse el checkbox se elimina el elmento de la tabla 
		 * Este evento se activa cada vez que se realiza algún cambio en la tabla 
		 * si se pulsa el checkbox entra en este evento, busca la fila que se ha 
		 * marcado como hecho y se elimina.
		 */
		table.addPropertyChangeListener(new PropertyChangeListener() {

			@Override
			public void propertyChange(PropertyChangeEvent evt) {

				for (int i=0;i<df.getRowCount(); i++) {
					if(df.getDataVector().elementAt(i).elementAt(1).toString().contentEquals("true")) {
						System.out.println("Se ha eliminado "+df.getDataVector().elementAt(i).elementAt(0).toString()+" con exito");
						eliminarTarea(df.getDataVector().elementAt(i).elementAt(0).toString());
						df.removeRow(i);
					}
				}
			}
		});

		JButton btnCrearTarea = new JButton("Crear tarea");
		btnCrearTarea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				añadirTarea(txtaTarea.getText());

				System.out.println(tarea.length);
				df.addRow(new Object[] {txtaTarea.getText()});
				table.getColumn("Hecho").setCellEditor(table.getDefaultEditor(Boolean.class));
				table.getColumn("Hecho").setCellRenderer(table.getDefaultRenderer(Boolean.class));
				/*
				 * Asigna en false todos los checkbox de la tabla
				 */
				for (int i=0;i<df.getRowCount(); i++)
					df.setValueAt(false, i, 1);
				txtaTarea.setText("");
			}
		});
		
		txtaTarea.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (KeyEvent.VK_ENTER==e.getExtendedKeyCode()) {
					añadirTarea(txtaTarea.getText());

					df.addRow(new Object[] {txtaTarea.getText()});
					table.getColumn("Hecho").setCellEditor(table.getDefaultEditor(Boolean.class));
					table.getColumn("Hecho").setCellRenderer(table.getDefaultRenderer(Boolean.class));
					/*
					 * Asigna en false todos los checkbox de la tabla
					 */
					for (int i=0;i<df.getRowCount(); i++)
						df.setValueAt(false, i, 1);
					txtaTarea.setText("");
				}
					
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

	public static Object[][] getTareas(){
		return tarea;
	}
	/**
	 * Este metodo se encarga de añadir una nueva tarea al array bidimensional
	 * @param recordatorio Es un String que contiene el recordatorio o tarea que el usuario ha introducido
	 */
	public void añadirTarea(String recordatorio) {
		Object[][] nuevasTareas= new Object[tarea.length+1][1];

		for (int i=0;i<tarea.length; i++) {
			nuevasTareas[i][0]=tarea[i][0];
		}
		nuevasTareas[tarea.length][0]=recordatorio;
		tarea=nuevasTareas.clone();
	}  
	/**
	 * Este metodo se encarga de eliminar una tarea del array bidimensional
	 * @param recordatorio es la tarea que se quiere eliminar
	 */
	public static void eliminarTarea(String recordatorio) {
		Object[][] nuevasTareas= new Object[tarea.length-1][1];
		System.out.println(nuevasTareas.length);
		String tareaEliminada="";
		int j=0;
		System.out.println(tarea[j][0]);
		for (int i=0;i<nuevasTareas.length;i++) {
			if (tarea[j][0]!=null) {
				if(tarea[j][0].toString().equals(recordatorio)&&!tarea[j][0].toString().equals(tareaEliminada)) {
					tareaEliminada=tarea[j][0].toString();
					j++;
				}else {
					nuevasTareas[i][0]=tarea[j][0];
					j++;
				}
			}
		}
		tarea=nuevasTareas.clone();
		System.out.println(tarea.length);
	}
}
