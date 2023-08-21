package estities;

public class Comandos {
	public int canal;
	public int volume;
	public boolean ligado;
	
	public Comandos () {
		canal = 1;
		volume = 0;
		ligado = false;
	}
	
	
	public void aumentarVolume() {
		if(ligado && volume <= 16){
		   volume += 1;
		}
	}
	
	public void diminuirVolume() {
		if(ligado && volume >= 0){
			   volume -=1;
		}
	}	
		public void  aumentarCanal()  {
			if(ligado && canal <= 15){
			   canal += 1;
			}
		}
		public void diminuirCanal() {
			if(ligado && canal > 1){
			   canal -= 1;
			}
		}public void ligarTelevisor() {
			ligado = true;
		}
		public void desligarTelevisor() {
			ligado = false;
		}
		
		
		
		
		
		public void status() {
			if (ligado == true ) {
			System.out.println("Tv ligada");	
			System.out.println("canal: " + canal);
			System.out.println("volume: " + volume);
			
		} else {
			System.out.println("Tv desligada");
		}	

	}

}
