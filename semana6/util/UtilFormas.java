package util;

import java.util.List;
import java.util.Scanner;

import entidades.*;

public final class UtilFormas {
	public static Scanner teclado = new Scanner(System.in);

	public static void imprimir(List<Forma> formas)
	{
		//percorrer a lista
		System.out.println("Areas de Formas Geométricas");
		for (Forma forma : formas) {
			
			if(forma instanceof Circulo )
				System.out.println("Area do Círculo = " + forma.getArea());
			else if(forma instanceof Quadrado)
				System.out.println("Area do Quadrado = " + forma.getArea());
		}
	}

	public static Circulo ler(Circulo circulo)
	{
		System.out.println("Entre com o valor do raio:");
		Circulo circuloOut = new Circulo(teclado.nextDouble());
		return circuloOut;
	}

	public static Quadrado ler(Quadrado quadrado)
	{
		System.out.println("Entre com o valor do lado:");
		Quadrado quadradoOut = new Quadrado(teclado.nextDouble());
		return quadradoOut;
	}

	public static void imprimir(Circulo circulo) {
		System.out.println("Círculo");
		System.out.println("Area = " + circulo.getArea());
	}

	public static void imprimir(Quadrado quadrado) {
		System.out.println("Quadrado");
		System.out.println("Area = " + quadrado.getArea());
	}
}
