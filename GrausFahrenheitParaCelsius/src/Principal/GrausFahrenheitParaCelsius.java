package Principal;

import java.util.Scanner;

public class GrausFahrenheitParaCelsius {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int Fahrenheit;
		int Celsius;

		System.out.println("qual a temperatura em Fahrenheit: ");
		Fahrenheit = leia.nextInt();

		double media = 5 * ((Fahrenheit - 32) / 9);
		System.out.println("total de grus celsius � de: " + media + "�C");

	}

}
