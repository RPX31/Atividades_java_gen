package Atividades_Aula2;

import java.util.Scanner; 

public class Atividade_3 {
	
	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
	
		System.out.print("informe Seu nome completo:");
			String nomePessoa = leia.nextLine();
		System.out.print("informe Sua idade:");
			int idadePessoa = leia.nextInt();
		System.out.println("é Sua primeira doação ? true : false  ");	
			boolean doacao = leia.nextBoolean();
		
		
		
		if (idadePessoa <= 69 && idadePessoa >= 18 && doacao == true ) {
			
			System.out.println( nomePessoa + "  está apta para doar sangue!");
			
		}
		else if ( idadePessoa >= 60 && idadePessoa <= 69 && doacao == true ) {
			
            System.out.println (nomePessoa + "  está apta para doar sangue!");
			
		}
		else if (idadePessoa >= 18 && idadePessoa <= 59 && doacao == false ) {
			System.out.println ( nomePessoa + " está apto para doar sangue!");		
		}
		else {
			System.out.println( nomePessoa + "  não está apto para doar sangue!");			
			
		}
		leia.close();
		
	}
	
}
