package Principal;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		final Locale ponto = new Locale("en", "us");
		Scanner leia = new Scanner(System.in);

		double altura = 0;
		double decimal = 10.333333;
		int numero = (int) decimal;

		// potencia
		System.out.println(Math.pow(2, 5));
		// maior numero entre 2 numeros ou variaveis
		System.out.println(Math.max(2, 10));
		// menor numero entre 2 numeros ou variaveis
		System.out.println(Math.min(2, 10));
		// obter raiz quadrada
		System.out.println(Math.sqrt(16));
		// arrendondar numero
		System.out.println(Math.round(decimal));
		// numero PI arrendodado
		System.out.println(Math.PI);

		System.out.printf("resultado: %.2f", decimal);

		System.out.println("resultado: " + (decimal + numero));

		System.out.println("entre com sua altura: ");
		altura = leia.useLocale(ponto).nextDouble();

		System.out.println("A altura digitada foi: " + altura);

		leia.close();

	}

}
