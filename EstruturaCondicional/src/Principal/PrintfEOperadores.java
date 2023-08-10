package Principal;

public class PrintfEOperadores {

	public static void main(String[] args) {

		String nome = "Lucas";
		int idade = 17;
		double altura = 1.74;
		boolean falso = false;
		boolean verdadeio = true;

		System.out.printf("%s, tem %d, e sua altura é: %2f", nome, idade, altura);

		/*
		 * Operadores de comparação
		 *  > maior que
		 *  < menor que 
		 *  >= maior ou igual a 
		 *  <= menor ou igual a 
		 *  != diferente 
		 *  == igual
		 */

		/*
		 * separadores logicos 
		 * && significa E
		 * ll significa OU
		 * ! significa Negação
		 * 
		 * 
		 */
		
		//se  == if
		//else == senao
		if(verdadeio && falso) {
				System.out.println(10);
		}else {
				System.out.println(20);
		}
		
		char opcao = 's';
		int idade2 = 18;
		String DiaSemana = "Sexta";
		
		//um unico if é uma estrutura simples
		//if e else tenho uma estrutura composta
		//if else é uma estrutura encadeada
		//podemos ter estrutura dentro de cada if / if else
		if (opcao == 's' && idade2 >= 18) 
		{
			System.out.println("pode entrar na festa");
		}
		else
		{
			System.out.println("volta pra casa:");
		}
		
		if(DiaSemana.equals("segunda")) {
			System.out.println("segunda-feira");
		}
		else if(DiaSemana.equals("terca" )) {
			System.out.println("terca-feira");
			}
		else if(DiaSemana.equals("sexta" )) {
			System.out.println("sexta-feira");
			}
		else {
			System.out.println("nao corresponde nenhum dia da semana!");
			
		}
		
		int diadasemana = 7;
		
		switch (diadasemana) {
		case 1:
			System.out.println("domingo");
			break;
		case 2:
			System.out.println("segunda");
			break;
		case 3:
			System.out.println("terca");
			break;
		case 4:
			System.out.println("quarta");
			break;
		case 5:
			System.out.println("quinta");
			break;
		case 6:
			System.out.println("sexta");
			break;
		case 7:
			System.out.println("sabado");
			break;	
			
		default:
			System.out.println("nao corresponde a nenhum dia da semana");
			break;
		}
		
			
		}

	}


