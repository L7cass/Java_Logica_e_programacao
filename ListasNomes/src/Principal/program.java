package Principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import etities.pessoa;

public class program {

	public static void main(String[] args ) {

		pessoa pessoas = new pessoa();
		Scanner sc = new Scanner(System.in);

		ArrayList<pessoa> pessoas1 = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o nome " + (i + 1) + ":");
			String nome = sc.nextLine();
			pessoas1.add(new pessoa());

		}
		
		Collections.sort(pessoas1);

		System.out.println("Ordem Alfabetica: ");

		for (pessoa pessoa : pessoas1) {
			System.out.println(pessoa);
		}

		sc.close();

	}

}
