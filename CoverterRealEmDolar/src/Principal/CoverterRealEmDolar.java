package Principal;

import java.util.Scanner;

public class CoverterRealEmDolar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);

		double cota��ododolar = 4.99;

		System.out.println("digite 1 para escolher real ou digite 2 para d�lares: ");
		int opcao = Sc.nextInt();

		if (opcao == 1) {
			System.out.print("digite o valor em reais: ");
			double real = Sc.nextInt();
			double dolar = realparadolar(real, cota��ododolar);
			System.out.println("valor em dolares: $" + dolar);
		} else if (opcao == 2) {
			System.out.print("digite o valor em dolar: ");
			double dolar = Sc.nextInt();
			double real = dolarparareal(dolar, cota��ododolar);
			System.out.println("valor em dolares: R$" + real);
		} else {
			System.out.println("opcao invailda.");

		}

		Sc.close();

	}

	static double realparadolar(double real, double cota��ododolar) {
		return real / cota��ododolar;

	}

	static double dolarparareal(double dolar, double cota��ododolar) {
		return dolar * cota��ododolar;

	}

}
