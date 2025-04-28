package controller;

public class StringInvertida {

	public StringInvertida() {
		super();
	}
	
	public String stringInv(String palavra) {
		if (palavra.isEmpty()) {
			return "";
		}
		return palavra.charAt(palavra.length() - 1) + stringInv(palavra.substring(0, palavra.length() - 1));
	}
}