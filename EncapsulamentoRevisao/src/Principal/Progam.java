package Principal;

import java.util.Scanner;

import etities.produto;

public class Progam {

	public static void main(String[] args) {
		produto produto = new produto();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o nome do produto");
		produto.setNome(sc.nextLine());
		
		System.out.println("Entre com o preço do produto: ");
		produto.setPreco(sc.nextInt());
		
		System.out.println("Entre com a quantidade que vai adicionr do produto: ");
		produto.adicionarQuantidade(sc.nextInt());
		
		
	
		
		System.out.println("Entre com a quantidade que vai remover do produto: ");
		produto.removerQuantidade(sc.nextInt());
		
		
		produto.mostrarEstoque();
		
		sc.close();
	

	}

}
