package ejemplo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.componente.Acordeon;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.Rectangle;

public class Test1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test1 frame = new Test1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Test1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Acordeon acc = new Acordeon();
		contentPane.add(acc);
		
		JPanel pane = new JPanel();
		JButton boton = new JButton();
		boton.setSize(100,100);
		boton.setText("Hola");
		pane.add(boton);
		JLabel label = new JLabel();
		label.setOpaque(true);
		label.setBackground(Color.BLACK);
		label.setBounds(150,0,100,100);
		label.setText("Hola buenos días señor Juan Antonio");
		pane.add(label);
		pane.setBackground(Color.BLUE);
		pane.setLayout(null);
		
		JPanel pane1 = new JPanel();
		JButton boton1 = new JButton();
		boton1.setSize(50, 20);
		pane1.add(boton1);
		pane1.setBackground(Color.BLACK);
		
		JPanel pane2 = new JPanel();
		JButton boton2 = new JButton();
		boton2.setSize(50, 20);
		pane2.add(boton2);
		pane2.setBackground(Color.YELLOW);
		
		acc.annadir(pane, "hola mundo");
		acc.annadir(pane1,"hola planeta");
		acc.annadir(pane2,"hola caracola");
		
	}
	
}
