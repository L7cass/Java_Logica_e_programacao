package Principal;

import java.util.Scanner;

public class CalcularMetroQuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// crie um programa que receba os valores
		// de largura e comprimento do terreno
		// e informe quantos metros quadrados ele tem
		// utilize função

		Scanner Sc = new Scanner(System.in);

		System.out.println("Digite a Largura: ");
		double Largura = Sc.nextDouble();
		System.out.println("Digite o Comprimento: ");
		double Comprimento = Sc.nextDouble();

		System.out.printf("O terreno tem %.2f metros quadrados", calcularAreaTerreno(Largura, Comprimento));

		Sc.close();

	}

	static double calcularAreaTerreno(double Largura, double Comprimento) {
		return Largura * Comprimento;

	}

}
