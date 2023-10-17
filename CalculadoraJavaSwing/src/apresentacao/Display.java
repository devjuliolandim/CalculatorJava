package apresentacao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class Display extends JPanel{

	private JLabel label;
		
	public Display() {
		
		label = new JLabel();
		label.setBackground(Color.LIGHT_GRAY);
		label.setFont(new Font("Calibri", Font.BOLD, 40));
		this.setBackground(Color.GRAY);
		add(label);
	}
	
	public void setLabel(String texto) {
		label.setText(texto);
	}
	
}
