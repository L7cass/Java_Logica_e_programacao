package Principal;

import java.util.Scanner;

import estities.carro;

public class Programa {

	public static void main(String[] args) {
		// Conceito do carro
		//caracteristicas(atributos)
		//exemplos de comportamentos acelerar, freiar, ascender farois...
		//comportamentos(metodos/funcao)
		//classes tem muitos recursos como:
		//sobrecarga de metodos e contrutores
		//4 pilares podem ser aplicados
		//entities(entidades do sistema) de arcordo com a modelagem 
		//de negocios: carro, pessoa, endereço...
		//serviçes: ClientesService, E-mail serviços...
		//controllers
		//utilitarias: Math
		//classe é um molde para o objeto
		
		Scanner Sc = new Scanner(System.in);
		carro carro = new carro();
		carro carroPopular = new carro();
		
		carro.modelo = "Corolla";
		carro.ano = "2023";
		carro.placa = "pba-1234";
		carro.cor = "branco";
		
		carroPopular.modelo = "Hb20";
		carroPopular.cor = "cinza";
		
		/*carroPopular.ano= Sc.nextLine();
		
		System.out.println(carro.ano);
		System.out.println(carroPopular.ano);*/
		
		System.out.println(carro.acelerar);
		carro.acelerarveiculo();
		carro.acelerarveiculo();
		carro.acelerarveiculo();
		carro.acelerarveiculo();
		
		System.out.println(carro.acelerar);
		carro.acelerar = 10;
		System.out.println(carro.acelerar);
		


				
		
	}

}
