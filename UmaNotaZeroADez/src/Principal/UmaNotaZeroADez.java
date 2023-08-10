package Principal;

import java.util.Scanner;

public class UmaNotaZeroADez {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int nota;
		System.out.println("digite a nota (0 a 10): ");
		nota = leia.nextInt();

		boolean resultado = nota >= 0 && nota <= 10;
		if (nota >= 0 && nota <= 10) {
			System.out.println("sua nota é: " + nota);
		} else {

		}
		leia.close();

	}

}
