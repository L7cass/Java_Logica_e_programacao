package Principal;

import java.util.Scanner;

public class Ler2Times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);

		// solcitaqção dos nomes dos times e da quantidade de gols

		System.out.println("Digite o nome do time: ");
		String time1 = Sc.next();

		System.out.println("Digite a quntidade de gols do " + time1 + ":");
		int GolTime1 = Sc.nextInt();

		System.out.println("Digite o nome do time: ");
		String time2 = Sc.next();

		System.out.println("Digite a quntidade de gols do " + time2 + ":");
		int GolTime2 = Sc.nextInt();

		// verificar com a quantidades de gols se há um vecendor sem sim qual time se
		// não houver vencedor declarar empate

		String resultado;
		if (GolTime1 > GolTime2) {
			resultado = "com a vitoria do " + time1;
		}else if (GolTime2 > GolTime1) {
			resultado = "com a vitoria do " + time2;
		}else  {
			resultado = "em empate";
		}
		
		System.out.println("A partida terminou " + resultado);

		Sc.close();

	}

}
