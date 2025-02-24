package controller;

public class StringInvertida {

	public StringInvertida() {
		super();
	}
	public String StringInv(String palavra) {
		if (palavra == "") {
			return ""; /* Condicao de parada quando a palavra for "", ou seja, já tera sido 
			realizada todas as validacoes de caracteres. */
		}
		return palavra.charAt(palavra.length() - 1) + StringInv(palavra.substring(0, palavra.length() - 1));
		/* Irá retornar o ultimo caractere da palavra + uma nova palavra com os caracteres 
		restantes. */
	}
}