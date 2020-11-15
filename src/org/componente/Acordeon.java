package org.componente;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.border.EmptyBorder;
/**
 * Clase que define un componente para la utilización de un acordeón
 * @author Jesús Reyes Carrillo y Juan Antonio Escribano
 * @version 1.0
 */
public class Acordeon extends JPanel {

	private ArrayList<JToggleButton> barras = new ArrayList<JToggleButton>();
	private ArrayList<JPanel> contenido = new ArrayList<JPanel>();
	private int altoContenido = 100;
	private int altoBotones = 40;

	/**
	 * Constructor del acordeon con sus parámetros
	 */
	public Acordeon() {

		setBounds(0, 0, 600, 500);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);

	}

	/**
	 * Método que añade componentes al acordeon
	 * @param Panel , contenido de la barra
	 * @param titulo para la barra
	 */
	public void annadir (JPanel panel, String titulo) {
		JToggleButton boton = new JToggleButton(titulo);
		/*
		 * Asignación de elementos al acordeon
		 */
		if(barras.size()>0)
			boton.setBounds(0,barras.get(barras.size()-1).getY()+barras.get(barras.size()-1).getHeight()
					,getWidth(),getAltoBotones());
		else
			boton.setBounds(0,0,getWidth(),getAltoBotones());
		
		//Se añade el panel
		add(panel);
		contenido.add(panel);
		//Se le quita el layout y se pone en invisible
		for (JPanel Jpanel : contenido) {
			Jpanel.setVisible(false);
			Jpanel.setLayout(null);
		}
		/*
		 * Evento del botón 
		 */
		boton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				/*
				 * Reorganización de las barras y contenidos del acordeon
				 * A la hora de accionar una de las barras.
				 */
				if(boton.isSelected()) {
					contenido.get(barras.indexOf(boton)).setBounds(0,boton.getY()+boton.getHeight()
					,boton.getWidth(),getAltoContenido());

					contenido.get(barras.indexOf(boton)).setVisible(true);

					for (int i = barras.indexOf(boton)+1; i < barras.size(); i++) {
						if(barras.get(i-1).isSelected())
							barras.get(i).setLocation(contenido.get(i-1).getX()
									, contenido.get(i-1).getHeight()+contenido.get(i-1).getY());
						else
							barras.get(i).setLocation(barras.get(i-1).getX()
									, barras.get(i-1).getHeight()+barras.get(i-1).getY());
						if(barras.get(i).isSelected())
							contenido.get(i).setLocation(barras.get(i).getX()
									, barras.get(i).getHeight()+barras.get(i).getY());

					}
				}else {
					contenido.get(barras.indexOf(boton)).setVisible(false);

					for (int i = barras.indexOf(boton)+1; i < barras.size(); i++) {
						if(barras.get(i-1).isSelected())
							barras.get(i).setLocation(contenido.get(i-1).getX()
									, contenido.get(i-1).getHeight()+contenido.get(i-1).getY());
						else 
							barras.get(i).setLocation(barras.get(i-1).getX()
									, barras.get(i-1).getHeight()+barras.get(i-1).getY());
						if(barras.get(i).isSelected())
							contenido.get(i).setLocation(barras.get(i).getX()
									, barras.get(i).getHeight()+barras.get(i).getY());
					}

				}
				
			}
		});
		
		//Se añaden los botones
		add(boton);
		barras.add(boton);
		
		//Arreglos del problema scroll
		int alto = 0;
		for (JToggleButton jToggleButton : barras) {
			alto+=jToggleButton.getHeight();
		}
		for (JPanel jPanel : contenido) {
			alto+=jPanel.getHeight();
		}
		setPreferredSize(new Dimension(getWidth(), alto));
	
	}

	/**
	 * Elimina un componente del acordeon
	 * @param índice del componente
	 */
	public void eliminar(int indice) {
		/*
		 * Eliminación del elemento del acordeon
		 */
		barras.get(indice).setVisible(false);
		contenido.get(indice).setVisible(false);
		barras.remove(indice);
		contenido.remove(indice);
		/*
		 * Reorganización tras la eliminación del elemento
		 */
		if(indice == 0) {
			barras.get(indice).setLocation(0,0);
			contenido.get(indice).setLocation(0, barras.get(indice).getY()+barras.get(indice).getHeight());
			for (int i = indice+1; i < barras.size(); i++) {
				if(barras.get(i-1).isSelected()) {
					barras.get(i).setLocation(0, contenido.get(i-1).getY()+contenido.get(i-1).getHeight());
					contenido.get(i).setLocation(0, barras.get(i).getY()+barras.get(i).getHeight());
				}else {
					barras.get(i).setLocation(0, barras.get(i-1).getY()+barras.get(i-1).getHeight());
					contenido.get(i).setLocation(0, barras.get(i).getY()+barras.get(i).getHeight());
				}	
			}
		}else {
			for (int i = indice; i < barras.size(); i++) {
				if(barras.get(i-1).isSelected()) {
					barras.get(i).setLocation(0, contenido.get(i-1).getY()+contenido.get(i-1).getHeight());
					contenido.get(i).setLocation(0, barras.get(i).getY()+barras.get(i).getHeight());
				}else {
					barras.get(i).setLocation(0, barras.get(i-1).getY()+barras.get(i-1).getHeight());
					contenido.get(i).setLocation(0, barras.get(i).getY()+barras.get(i).getHeight());
				}
			}
		}
		
	}

	/**
	 * Devuelve el alto del contenido
	 * @return el alto del contenido
	 */
	public int getAltoContenido() {
		return this.altoContenido;
	}

	/**
	 * Asigna el alto del contenido
	 * @param alto del contenido
	 */
	public void setAltoContenido(int alto) {
		this.altoContenido = alto;
	}
	/**
	 * Devuelve el alto del botones
	 * @return el alto del botones
	 */
	public int getAltoBotones() {
		return this.altoBotones;
	}

	/**
	 * Asigna el alto del botones
	 * @param alto del botones
	 */
	public void setAltoBotones(int alto) {
		this.altoBotones = alto;
	}

}
