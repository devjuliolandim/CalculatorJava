package apresentacao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class Botao extends JButton  {
	
	
	public Botao (String texto, Color cor) {
		setText(texto);
		setOpaque(true);
		setBackground(cor);
		setFont(new Font("Calibri", Font.BOLD, 50));
	}

}
