package Principal;

import java.util.Scanner;

import etities.Triangulo;

public class Triangulos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Triangulo triangulo = new Triangulo();
		
		System.out.println("Entre com o valor do lado A: ");
		triangulo.ladoA = sc.nextInt();
		
		System.out.println("Entre com o valor do lado B: ");
		triangulo.ladoB = sc.nextInt();
		
		System.out.println("Entre com o valor donlado C: ");
		triangulo.ladoC = sc.nextInt();
		
		triangulo.obterTipoTriangulo();
		
		sc.close();
	}
	

}
