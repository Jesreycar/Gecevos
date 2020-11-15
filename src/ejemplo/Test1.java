package ejemplo;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import org.componente.Acordeon;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Test1 extends JFrame {

	private JPanel contentPane;
	private ArrayList<JPanel> acordeon = new ArrayList<JPanel>();

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
		acc.setBounds(0, 0, 100, 100);
		contentPane.add(acc);

		for(int i = 0; i<10; i++) {
			acordeon.add(new JPanel());
			acordeon.get(i).setName("panel " + i);
			acordeon.get(i).add(new JButton("Eliminar"));
			acordeon.get(i).getComponent(0).setBounds(5, 5, 100, 50);
			JPanel panel =  acordeon.get(i);
			JButton boton = (JButton) acordeon.get(i).getComponent(0);
			boton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					acc.eliminar(acordeon.indexOf(boton.getParent()));
					acordeon.remove(acordeon.indexOf(boton.getParent()));
					
				}
			});
		}

		for (JPanel panel : acordeon) {
			acc.annadir(panel,panel.getName());
		}
	}

}
