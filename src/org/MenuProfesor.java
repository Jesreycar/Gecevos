package org;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
/**
 * Esta clase contiene el menú con todas las opciones del profesorado
 * @author Juan Antonio Escribano Díaz
 * @version 1.0
 */
public class MenuProfesor extends JFrame {

	private JPanel contentPane;


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


	}
}
