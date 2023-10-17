package apresentacao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

import negocio.Memoria;

public class Calculadora extends JFrame {
	
	
	public Calculadora() {				
	
		organizador();
		setSize(300,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false); 
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void organizador() {
		Display display = new Display();
				
		Memoria memoria=  new Memoria(display);
		Teclado teclado = new Teclado(memoria, display);
		
		setLayout(new BorderLayout());
			
		display.setPreferredSize(new Dimension(200,60));		
	    add(display, BorderLayout.NORTH);		
		add(teclado, BorderLayout.CENTER);
		
	}
	

}
