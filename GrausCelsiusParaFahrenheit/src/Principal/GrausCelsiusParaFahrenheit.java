package Principal;

import java.util.Scanner;

public class GrausCelsiusParaFahrenheit {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int Fahrenheit;
		int Celsius;

		System.out.println("qual a temperatura em Celsius? ");
		Celsius = leia.nextInt();

		double media = (Celsius * 9 / 5) + 32;
		System.out.println("o total de graus, em Fahrenheit é: " + media + "°F");

	}

}
