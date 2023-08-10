package Principal;

import java.util.Scanner;

public class EscolhaUmOperadorEUmNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);

		System.out.println("digite o operador (+, -, /, *): ");
		char operador = Sc.next().charAt(0);

		System.out.println("insira um numero entre 0 e 10: ");
		int numero = Sc.nextInt();

		if (numero < 0 || numero > 10) {
			System.out.println("numero invalido.insira um numero entre 0 e 10");
			return;
		}

		System.out.println("tabuada:");
		for (int i = 1; i <= 10; i++) {
			double resultado = 0;
			switch (operador) {
			case '+':
				resultado = numero + i;
				break;
			case '-':
				resultado = numero - i;
				break;
			case '*':
				resultado = numero * i;
				break;
			case '/':
				if (i == 0) {
					System.out.println("divisão por zero");
					continue;
				}
				resultado = (double) numero / i;

				break;
			default:
				System.out.println("operador invalido");
				return;
			}
			System.out.println(numero + " " + operador + " " + i + " = " + resultado);

		}

	}

}
