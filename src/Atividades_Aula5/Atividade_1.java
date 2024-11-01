package Atividades_Aula5;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade_1 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		ArrayList<String> lista = new ArrayList<String>();
		
		
			System.out.println("digite 5 cores");
			
				for(int cor = 0 ; cor < 5 ; cor++){
					
			System.out.println("Cor " + (cor + 1 )  + ": ");
			
			String corEntrada = leia.nextLine();
			lista.add(corEntrada);
			
			
		}
		System.out.println("Cores digitadas: " + lista);	
		lista.sort(null);
		System.out.printf("Cores ordenadas: " + lista );	
		
		
		leia.close();
	}

}
