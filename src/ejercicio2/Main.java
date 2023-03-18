package ejercicio2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> palabras = new ArrayList<>();
		ArrayList<String> resultado = new ArrayList<>();
		palabras.add("Amor");
		palabras.add("Sol");
		palabras.add("Paz");
		palabras.add("Fiel");
		palabras.add("Oro");
		palabras.add("Sincero");
		palabras.add("Maravilla");
		palabras.add("Comunidad");
		palabras.add("Perseverancia");
		palabras.add("Inconsciente");
		palabras.forEach((n) ->{
			if(n.length()>5) {
				if(n.contains("o")) {
				resultado.add(n);
				}
			}});
		resultado.forEach((n) -> {System.out.println(n);}); 
	}

}