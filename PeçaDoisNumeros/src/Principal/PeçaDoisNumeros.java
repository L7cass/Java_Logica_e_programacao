package Principal;

import java.util.Scanner;

public class Pe�aDoisNumeros {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		//Fa�a um Programa que pe�a dois n�meros e imprima a soma;

		int numero1;
		int numero2;
		System.out.println("digite o primeiro numero: ");
		numero1 = leia.nextInt();

		System.out.println("digite o segundo numero: ");
		numero2 = leia.nextInt();

		int soma = numero1 + numero2;

		System.out.println("o resultado da soma �; " + (numero1 + numero2));

		leia.close();

	}

}
