package Principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import etities.pessoa;

public class ProgramPessoa {

	public static void main(String[] args) {

		pessoa pessoa1 = new pessoa("Du", 23);
		pessoa pessoa2 = new pessoa("Dudu", 22);
		pessoa pessoa3 = new pessoa("Edu", 26);

		ArrayList<pessoa> pessoas = new ArrayList<>();

		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		System.out.println(pessoas);

		Collections.sort(pessoas);

		System.out.println(pessoas);

		Collections.sort(pessoas, Comparator.comparing(pessoa::getIdade));

		System.out.println(pessoas);

	}

}
