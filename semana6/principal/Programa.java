package principal;

import java.util.ArrayList;
import java.util.List;

import entidades.*;
import util.UtilFormas;

public class Programa {

	public static void main(String[] args) {
		
		Circulo circulo = new Circulo();
		circulo = UtilFormas.ler(circulo);

		Quadrado quadrado = new Quadrado();
		quadrado = UtilFormas.ler(quadrado);
		
		List<Forma> formas = new ArrayList<>();
		
		formas.add(circulo);
		formas.add(quadrado);
		
		UtilFormas.imprimir(formas);
		UtilFormas.imprimir(circulo);
		UtilFormas.imprimir(quadrado);
		UtilFormas.teclado.close();
	}

}
