package Principal;

import java.util.Scanner;

public class PeçaDoisNumeros {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		//Faça um Programa que peça dois números e imprima a soma;

		int numero1;
		int numero2;
		System.out.println("digite o primeiro numero: ");
		numero1 = leia.nextInt();

		System.out.println("digite o segundo numero: ");
		numero2 = leia.nextInt();

		int soma = numero1 + numero2;

		System.out.println("o resultado da soma é; " + (numero1 + numero2));

		leia.close();

	}

}
