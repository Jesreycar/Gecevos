package org;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.TextAttribute;
import java.util.Map;
import java.awt.SystemColor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPasswordField;
import java.awt.Rectangle;

public class Login extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private static boolean mostrar = false;

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
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.BLACK);
		panel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel.setBounds(70, 55, 450, 350);
		panel.setBackground(new Color(118,45,47));
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel.setForeground(Color.WHITE);
		
		textField = new JTextField();
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setFont(new Font("Dialog", Font.PLAIN, 15));
		
		JButton btnAcceder = new JButton("Acceder");
		btnAcceder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {			
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
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		
		JLabel lblImg = new JLabel("");
		lblImg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(mostrar) {
					Icon icono = new ImageIcon(new ImageIcon("img/Mostrar.png").getImage().getScaledInstance(lblImg.getWidth(), lblImg.getHeight(), Image.SCALE_AREA_AVERAGING));
					lblImg.setIcon(icono);
					passwordField.setEchoChar((char)0);
					mostrar = false;
				}else {
					Icon icono = new ImageIcon(new ImageIcon("img/Ocultar.png").getImage().getScaledInstance(lblImg.getWidth(), lblImg.getHeight(), Image.SCALE_AREA_AVERAGING));
					lblImg.setIcon(icono);
					passwordField.setEchoChar('*');
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
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(41)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
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
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addGap(36)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblContrasea, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblImg, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addGap(38)
							.addComponent(txtpntodavaNoTienes, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(254)
							.addComponent(lblRegistreseAqu)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAcceder, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(39, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}
}
