package Principal;

import java.util.Scanner;

import etities.Usuario;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Usuario usuario = new Usuario();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o nome do usuario: ");
		usuario.setNome(sc.nextLine());
		
		System.out.println("Entre com o e-mail: ");
		usuario.setE_mail(sc.nextLine());
		
		System.out.println("Cadraste uma senha: ");
		usuario.setSenha(sc.nextLine());
		
		usuario.obterDadosUsuario();


		

	}

}
