package Principal;

import java.util.Scanner;

public class AlturaDe10Pessoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);

		double altura = 0;
		double media = 0;

		for (int contador = 1; contador < 11; contador++) {
			System.out.println("digite sua altura: ");

			altura = Sc.nextDouble();
			media = media + altura;
		}
		System.out.println("A media das alturas é: " + (media / 10));
	}

}
