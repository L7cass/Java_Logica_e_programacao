package Principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import etities.produto;

public class Program {

	public static void main(String[] args) {

		produto produto = new produto();
		Scanner sc = new Scanner(System.in);
		ArrayList<produto> produtos = new ArrayList<>();

		for (int i = 1; i < 4; i++)
			;

		System.out.println("Entre com o nome do produto");
		produto.setNome(sc.nextLine());

		System.out.println("Entre com a quantidade");
		produto.setQuantidade(sc.nextInt());

		System.out.println("Entre com o valor do produto");
		produto.setPreco(sc.nextDouble());
		sc.nextLine();

		produtos.add(produto);

		System.out.println(produtos);

		Collections.sort(produtos);

		System.out.println("imprimindo em ordem alfabetica");
		produtos.forEach(prod -> System.out.println(prod));

		System.out.println("imprimindo por quantidade");
		produtos.sort(Comparator.comparing(produto::getQuantidade));
		System.out.println(produtos);

		System.out.println("imprimindo por quantidade");
		produtos.sort(produtos, Comparator.comparing(produto::getQuantidade));
		System.out.println(produtos);

	}

}
