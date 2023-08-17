package Principal;

import java.util.Scanner;

public class NotasBimestrais {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		//Faça um Programa que peça as 4 notas bimestrais e mostre a média.

		double nota1;
		double nota2;
		double nota3;
		double nota4;

		System.out.println("digite a nota do 1° bimestre: ");
		nota1 = leia.nextDouble();

		System.out.println("digite a nota do 2° bimestre: ");
		nota2 = leia.nextDouble();

		System.out.println("digite a nota do 3° bimestre: ");
		nota3 = leia.nextDouble();

		System.out.println("digite a nota do 4° bimestre: ");
		nota4 = leia.nextDouble();

		double soma = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("a sua media é: " + soma);

		leia.close();

	}

}
