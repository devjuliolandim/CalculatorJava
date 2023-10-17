package negocio;

import java.util.ArrayList;

import apresentacao.Display;

public class Memoria {

	private ArrayList<String> numeros;
	private String operador;
	private double primeiraParcela;
	private double segundaParcela;
	private double resposta;
	private Display display;
	private String numeroTemporario;

	public Memoria(Display display) {
		this.display = display;
		numeros = new ArrayList<String>();
		numeroTemporario = "";
	}

	public String getNumeros() {
		String resultado = "";

		for (String num : numeros) {
			resultado += "" + num;
		}

		return resultado;
	}

	public void realizarOperacao() {

		switch (operador) {

		case "+":

			resposta = primeiraParcela + segundaParcela;
			break;

		case "-":

			resposta = primeiraParcela - segundaParcela;
			break;

		case "*":

			resposta = primeiraParcela * segundaParcela;
			break;

		case "/":

			resposta = primeiraParcela / segundaParcela;
			break;

		}

		display.setLabel(Double.toString(resposta));

	}

	public void setNumero(String numero) {

		if ("+".equals(numero) || "-".equals(numero) || "*".equals(numero) || "/".equals(numero)) {

			operador = numero;

			primeiraParcela = Double.parseDouble(numeroTemporario);
			numeroTemporario = "";

		} else if ("=".equals(numero)) {

			segundaParcela = Double.parseDouble(numeroTemporario);
			realizarOperacao();
			numeroTemporario = Double.toString(resposta);
		} else {
			numeroTemporario += numero;

		}

		numeros.add(numero);

	}

}
