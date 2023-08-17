package Principal;

import java.util.Scanner;

public class ContraCheque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Sc = new Scanner(System.in);
		
		String nome;
		double salarioBruto = 0;
		double totalVendas = 0;
		double inss = 0.05;
		double irpf = 0.11;
		
		System.out.println("Entre com o nome do funcionario: ");
		nome = Sc.nextLine();
		
		System.out.println("Entre com o salario do funcionario: ");
		salarioBruto = Sc.nextDouble();
		
		System.out.println("Entre com o total de vendas do funcionario");
		totalVendas = Sc.nextDouble();
		
		double descontos = calcularDescontos(salarioBruto, inss, irpf);
		double comissao = CalcularComissao(totalVendas);
		double salarioLiquido = salarioBruto - descontos + comissao;
		System.out.println("************************");
		System.out.println("Funcionario " + nome );
		System.out.println("salario Bruto: " + salarioBruto);
		System.out.println("Totalde vendas do mes: " + totalVendas);
		System.out.println("Descontos do mes: " + descontos);
		System.out.println("Comissao do mes: " + comissao);
		System.out.println("Salario Liquido: " + salarioLiquido);
		if (totalVendas < 10000) {
			System.out.println("Continue Tentando!");
			System.out.println("************************");
		}
		
	
		
		
		calcularSalarioliquido(salarioBruto, inss, irpf);
		CalcularComissao(totalVendas);
		Sc.close();
		
		Sc.close();
	}
	
	
	private static double calcularDescontos(double salarioBruto, double inss, double irpf) {
		return 0;
	}




	static double calcularSalarioliquido(double salarioB, 
			double inss, double irpf) {
		return ((salarioB * inss) + (salarioB * irpf));
	}
		static double CalcularComissao(double totalVendas) {
			double bonificacao = 0;
			
			if(totalVendas>20000) {
				bonificacao = totalVendas * 0.05;
			}else if (totalVendas > 15000) {
				bonificacao = totalVendas * 0.03;
			}else if (totalVendas > 10000) {
				bonificacao = totalVendas * 0.01;
			}else {
				bonificacao = 0;
			}
			
			return bonificacao;
		}
		
		static void contraCheques (String nome, double SB, double TV) {
			
	
			

		
		
		

	}

}
