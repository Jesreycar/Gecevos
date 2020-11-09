package org.profesor;

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
import javax.swing.table.DefaultTableModel;

import org.Login;
import org.general.Horario;
import org.general.MisClases;
import org.general.Perfil;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
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
		setResizable(false);
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

		//Barra de menus

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
				setVisible(false);
				Recordatorio recor = new Recordatorio();
				recor.setVisible(true);
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

		/*
		 * Botones de los menus  
		 */
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
				setVisible(false);
				PartesProfesor parte = new PartesProfesor();
				parte.setVisible(true);
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
				setVisible(false);
				MisClases clase = new MisClases();
				clase.setVisible(true);
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

		
		/*
		 * Zona de informacion del profesor 
		 */
		JLabel lblNombreCompleto = new JLabel("Nombre Completo");
		lblNombreCompleto.setForeground(Color.WHITE);
		lblNombreCompleto.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNombreCompleto.setBounds(314, 56, 128, 20);
		contentPane.add(lblNombreCompleto);
		JCheckBox jcHecho = new JCheckBox();
		jcHecho.setSize(20, 20);


		table = new JTable();
		table.setBackground(Color.WHITE);
		table.setFont(new Font("Dialog", Font.PLAIN, 15));
		table.setBounds(314, 125, 262, 284);
		table.setModel(new DefaultTableModel(
				new Object[][] {
					{"Hablar con el jefe de departamento"},
					{"Explicar los arrays en 1 DAM"},
				},
				new String[] {
						"Recordatorio", "Hecho"
				}));

		table.getColumn("Hecho").setCellEditor(table.getDefaultEditor(Boolean.class));
		table.getColumn("Hecho").setCellRenderer(table.getDefaultRenderer(Boolean.class));
		contentPane.add(table);
		
		/*
		 * Asigna en false todos los checkbox de la tabla
		 */
		DefaultTableModel df = (DefaultTableModel) table.getModel();
		
		for (int i=0;i<df.getRowCount(); i++) {
			df.setValueAt(false, i, 1);
		}
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
						df.removeRow(i);
					}
				}
			}
		});

	}
}
