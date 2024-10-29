package Atividades_Aula1;


import java.util.Scanner;

public class Atividade_2 {

	public static void main(String[] args) {
			
		Scanner leia = new Scanner(System.in);
		
			System.out.println(" Coloque as 4 notas em sequência: ");
			System.out.println(" Coloque a primeira nota: ");
				float nota1 = leia.nextFloat();
			System.out.println(" Coloque a segunda nota: ");
				float nota2 = leia.nextFloat();
			System.out.println(" Coloque a terceira nota: ");
				float nota3 = leia.nextFloat();
			System.out.println(" Coloque á quarta  nota: ");
				float nota4 = leia.nextFloat();
				
				float media = (nota1 + nota2 + nota3 + nota4) / 4 ;
		
			System.out.println("Média final é:" + media);

		leia.close();
	}

	
}
