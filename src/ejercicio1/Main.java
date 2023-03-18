package ejercicio1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> palabras = new ArrayList<>();
		ArrayList<String> resultado = new ArrayList<>();
		palabras.add("prodigioso");
		palabras.add("ambiguo");
		palabras.add("soberbio");
		palabras.add("holgazán");
		palabras.add("anhelo");
		palabras.add("obsoleto");
		palabras.add("hostil");
		palabras.add("jovial");
		palabras.add("oprobio");
		palabras.add("melancolía");
		palabras.forEach((n) ->{
			if(n.contains("o")) {
				resultado.add(n);
			}});
		resultado.forEach((n) -> {System.out.println(n);}); 
	}

}
