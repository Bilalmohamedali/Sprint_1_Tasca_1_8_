package ejercicio7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		ArrayList ordenar = new ArrayList<>();
		ArrayList<String> resultado = new ArrayList<>();

		ordenar.add(1);
		ordenar.add(2);
		ordenar.add("Hernan");
		ordenar.add(3);
		ordenar.add("Bill");
		ordenar.add(4);
		ordenar.add("Ali");


		ordenar.forEach((n) -> {
			if (n.getClass().getSimpleName().equalsIgnoreCase("String")) {
				resultado.add((String) n);
			}
		});

        Collections.sort(resultado,Collections.reverseOrder( Comparator.comparing(String::length)));
        System.out.println(resultado);

	}

}
