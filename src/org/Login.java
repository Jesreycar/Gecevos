package org;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.TextLayout;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPasswordField;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
/**
 * 
 * @author Jesus Reyes
 * @version 1.0
 */
public class Login extends JFrame {
	private JPanel contentPane;
	private static String tipoUsuario;
	private JTextField txtfUsuario;
	private JPasswordField pfContra;
	private static boolean mostrar = true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login login = new Login();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static String getTipoUsuario() {
		return tipoUsuario;
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setVisible(true);
		setTitle("Gecevos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(45,118,116));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);

		JPanel panel = new JPanel();
		panel.setForeground(Color.BLACK);
		panel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel.setBounds(70, 55, 450, 350);
		panel.setBackground(new Color(118,45,47));
		contentPane.add(panel);

		JLabel lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel.setForeground(Color.WHITE);

		txtfUsuario = new JTextField();
		txtfUsuario.setFont(new Font("Dialog", Font.PLAIN, 15));

		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setFont(new Font("Dialog", Font.PLAIN, 15));

		JButton btnAcceder = new JButton("Acceder");
		btnAcceder.setFont(new Font("Dialog", Font.PLAIN, 11));
		btnAcceder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				if(txtfUsuario.getText().equals("Alumno")) {
					MenuAlumno menuAlumno = new MenuAlumno();
					menuAlumno.setVisible(true);
					tipoUsuario=txtfUsuario.getText();
				}else if (txtfUsuario.getText().equals("Profesor")){
					MenuProfesor menuProfesor = new MenuProfesor();
					menuProfesor.setVisible(true);
					tipoUsuario=txtfUsuario.getText();
				} else JOptionPane.showMessageDialog(new Login(), "Por favor escriba \"Profesor\" o \"Alumno\" como nombre de usuario");
			}
		});

		JTextPane txtpntodavaNoTienes = new JTextPane();
		txtpntodavaNoTienes.setBackground(new Color(118,45,47));
		txtpntodavaNoTienes.setEditable(false);
		txtpntodavaNoTienes.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtpntodavaNoTienes.setForeground(Color.WHITE);
		txtpntodavaNoTienes.setText("\u00BFTodav\u00EDa no tienes cuenta?");

		JLabel lblRegistreseAqu = new JLabel();
		lblRegistreseAqu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		//"Registrese Aqu\u00ED
		lblRegistreseAqu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setVisible(false);
				Registro registro = new Registro();
			}
		});
		lblRegistreseAqu.setForeground(new Color(12,124,186));
		lblRegistreseAqu.setText("<html>Registrese <u>Aqui</u></html>");

		pfContra = new JPasswordField();
		pfContra.setFont(new Font("Dialog", Font.PLAIN, 15));
		pfContra.setEchoChar('*');

		JLabel lblImg = new JLabel("");
		lblImg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(mostrar) {
					Icon icono = new ImageIcon(new ImageIcon("img/Mostrar.png").getImage().getScaledInstance(lblImg.getWidth(), lblImg.getHeight(), Image.SCALE_AREA_AVERAGING));
					lblImg.setIcon(icono);
					pfContra.setEchoChar((char)0);
					mostrar = false;
				}else {
					Icon icono = new ImageIcon(new ImageIcon("img/Ocultar.png").getImage().getScaledInstance(lblImg.getWidth(), lblImg.getHeight(), Image.SCALE_AREA_AVERAGING));
					lblImg.setIcon(icono);
					pfContra.setEchoChar('*');
					mostrar = true;
				}
			}
		});
		lblImg.setBounds(new Rectangle(0, 0, 20, 20));
		Icon icono = new ImageIcon(new ImageIcon("img/Mostrar.png").getImage().getScaledInstance(lblImg.getWidth(), lblImg.getHeight(), Image.SCALE_AREA_AVERAGING));
		lblImg.setIcon(icono);
		lblImg.setForeground(Color.WHITE);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
				gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
										.addContainerGap()
										.addComponent(btnAcceder, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
										.addGap(122))
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_panel.createSequentialGroup()
												.addContainerGap()
												.addComponent(lblImg, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel.createSequentialGroup()
														.addGap(41)
														.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
																.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
																.addComponent(txtfUsuario, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE)))
												.addGroup(gl_panel.createSequentialGroup()
														.addGap(41)
														.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
																.addComponent(pfContra, GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
																.addComponent(lblContrasea, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)))
												.addGroup(gl_panel.createSequentialGroup()
														.addGap(129)
														.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
																.addGroup(gl_panel.createSequentialGroup()
																		.addGap(40)
																		.addComponent(lblRegistreseAqu, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
																.addComponent(txtpntodavaNoTienes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))))
						.addGap(138))
				);
		gl_panel.setVerticalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
										.addGap(54)
										.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(txtfUsuario, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
										.addGap(36)
										.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblContrasea, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblImg, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(pfContra, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
										.addGap(38)
										.addComponent(txtpntodavaNoTienes, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
										.addGap(254)
										.addComponent(lblRegistreseAqu)))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btnAcceder, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(39, Short.MAX_VALUE))
				);
		/*
		 * Eventos para leer el enter
		 */
		panel.setLayout(gl_panel);
		txtfUsuario.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (KeyEvent.VK_ENTER==e.getExtendedKeyCode()) {
					setVisible(false);
					if(txtfUsuario.getText().equals("Alumno")) {
						MenuAlumno menuAlumno = new MenuAlumno();
						menuAlumno.setVisible(true);
						tipoUsuario=txtfUsuario.getText();
					}else if (txtfUsuario.getText().equals("Profesor")){
						MenuProfesor menuProfesor = new MenuProfesor();
						menuProfesor.setVisible(true);
						tipoUsuario=txtfUsuario.getText();
					} else JOptionPane.showMessageDialog(new Login(), "Por favor escriba \"Profesor\" o \"Alumno\" como nombre de usuario");
				
				}
			}
		});
		pfContra.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (KeyEvent.VK_ENTER==e.getExtendedKeyCode()) {
					setVisible(false);
					if(txtfUsuario.getText().equals("Alumno")) {
						MenuAlumno menuAlumno = new MenuAlumno();
						menuAlumno.setVisible(true);
						tipoUsuario=txtfUsuario.getText();
					}else if (txtfUsuario.getText().equals("Profesor")){
						MenuProfesor menuProfesor = new MenuProfesor();
						menuProfesor.setVisible(true);
						tipoUsuario=txtfUsuario.getText();
					} else JOptionPane.showMessageDialog(new Login(), "Por favor escriba \"Profesor\" o \"Alumno\" como nombre de usuario");
				
				}
			}
		});
	}
}
