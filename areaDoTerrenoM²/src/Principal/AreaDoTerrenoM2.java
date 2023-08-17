package Principal;

import java.util.Scanner;

import estities.medida;

public class AreaDoTerrenoM2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		double largura;
		double comprimento;
		
		
		
		System.out.println("Digite a largura do terreno: ");
		largura = Sc.nextDouble();
		
		System.out.println("Digite o comprimento do terreno: ");
	    comprimento = Sc.nextDouble();
	    
	   
	    medida.largura = largura;
		medida.comprimento = comprimento;
		
		System.out.println("A area total do terreno é " + (largura * comprimento)+ "M²");
	    
	    Sc.close();
	    
	    
		
		

	}

}
