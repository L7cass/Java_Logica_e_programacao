package Principal;

public class Atividade1 {

	public static void main(String[] args) {

		int[][] numeros = new int [3][3];
		
        int contador = 10;
		
		for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j < numeros.length; j++) {
				numeros[i][j] = contador ++;
			}
		}
		for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j < numeros.length; j++) {
				if (i == j) {
				System.out.print(numeros[i][j] + "\t");
				}else {
					System.out.print("\t");
				}
			}
		
		System.out.println();
		}	

	
				
			
	}

}
