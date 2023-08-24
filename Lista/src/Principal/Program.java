package Principal;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		// Listas trabalham com dados do mesmo tipo
		//Uma lista é um tipo generico de uma coleta 
		//uma lista é uma coleção de dados 
		
		ArrayList<String> nomes = new ArrayList<>();
		
		String nome1 = "Adicionado por ultimo";
		
		nomes.add("Lucas");
		nomes.add("Leo");
		nomes.add("Lara");
		nomes.add("Luana");
		nomes.add(nome1);

		System.out.println(nomes);
		
		System.out.println(nomes.get(4));
		
		nomes.remove(1);
		
		System.out.println(nomes);
		
		System.out.println("Imprimindo com forEach: ");
		for (String nome : nomes); {
			
			System.out.println(nomes);
		}
		System.out.println("Imprimindo com for:");
		
		for (int i = 0; i < nomes.size(); i++)	{
			System.out.println(nomes.get(i));
		}	
		
		System.out.println("Imprimindo com expressão lambda: ");
		
		nomes.forEach(nome -> System.out.println(nome));
		
		System.out.println("Imprimindo ordenadamente: ");
	
	}
	

}
