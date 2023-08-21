package etities;

public class Triangulo {
	
	public int ladoA;
	public int ladoB;
	public int ladoC;
	
	public void obterTipoTriangulo() {
		if(ladoA == ladoB && ladoB == ladoC) {
			System.out.println("Triangulo Equilatero");
		}else if(ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {	
		System.out.println("Triangulo Isóceles");
		}else {
			System.out.println("Triangulo Escaleno");
		}
	}

}
