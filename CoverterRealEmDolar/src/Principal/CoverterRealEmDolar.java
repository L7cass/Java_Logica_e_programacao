package Principal;

import java.util.Scanner;

public class CoverterRealEmDolar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);

		double cotaçãododolar = 4.99;

		System.out.println("digite 1 para escolher real ou digite 2 para dólares: ");
		int opcao = Sc.nextInt();

		if (opcao == 1) {
			System.out.print("digite o valor em reais: ");
			double real = Sc.nextInt();
			double dolar = realparadolar(real, cotaçãododolar);
			System.out.println("valor em dolares: $" + dolar);
		} else if (opcao == 2) {
			System.out.print("digite o valor em dolar: ");
			double dolar = Sc.nextInt();
			double real = dolarparareal(dolar, cotaçãododolar);
			System.out.println("valor em dolares: R$" + real);
		} else {
			System.out.println("opcao invailda.");

		}

		Sc.close();

	}

	static double realparadolar(double real, double cotaçãododolar) {
		return real / cotaçãododolar;

	}

	static double dolarparareal(double dolar, double cotaçãododolar) {
		return dolar * cotaçãododolar;

	}

}
