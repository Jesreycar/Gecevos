package org;

import java.awt.Color;
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
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Rectangle;
import java.awt.Font;
import javax.swing.border.LineBorder;
/**
 * Menu principal para alumnos
 * @author Jesus Reyes
 * @version 1.0
 */
public class MenuAlumno extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Create the frame.
	 */
	public MenuAlumno() {
		setTitle("Gecevos-Alumno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		
		//Menu superior
		JMenuBar menu = new JMenuBar();
		menu.setBorderPainted(false);
		menu.setBackground(new Color(72,75,156));
		setJMenuBar(menu);
		
		JMenu mnOpciones = new JMenu("Opciones");
		menu.add(mnOpciones);
		
		JMenuItem mntmCerrarSesin = new JMenuItem("Cerrar Sesi\u00F3n");
		mnOpciones.add(mntmCerrarSesin);
		
		JMenuItem mntmCerrarVentana = new JMenuItem("Cerrar Ventana");
		mnOpciones.add(mntmCerrarVentana);
		
		JMenuItem mntmAyuda = new JMenuItem("Ayuda");
		menu.add(mntmAyuda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(118, 45, 47));
		setContentPane(contentPane);
		
		//Botones usuario
		JButton btnPerfil = new JButton("Perfil");
		JButton btnCerrarSesin = new JButton("Cerrar Sesi\u00F3n");
		
		//Perfil Usuario
		JLabel lblNombre = new JLabel("Nombre Completo");
		lblNombre.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNombre.setForeground(Color.WHITE);
		
		JLabel lblCurso = new JLabel("Curso");
		lblCurso.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblCurso.setForeground(Color.WHITE);
		
		JLabel lblImg = new JLabel("");
		lblImg.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblImg.setBounds(new Rectangle(0, 0, 128, 128));
		Icon icono = new ImageIcon(new ImageIcon("img/ImgPerfil.png").getImage().getScaledInstance(lblImg.getWidth(), lblImg.getHeight(), Image.SCALE_DEFAULT));
		lblImg.setIcon(icono);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblImg, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(72)
							.addComponent(lblNombre))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(111)
							.addComponent(lblCurso)))
					.addGap(83)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnCerrarSesin, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnPerfil, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
					.addGap(43))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(lblImg, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(26)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnPerfil)
								.addComponent(lblNombre))
							.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnCerrarSesin)
								.addComponent(lblCurso))
							.addGap(28)))
					.addGap(278))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
