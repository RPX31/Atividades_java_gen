package Atividades_Aula1;


import java.util.Scanner;

public class Atividade_4 {

	public static void main(String[]args) {
		
		Scanner leia = new Scanner(System.in);
		
	
	System.out.print("Digite o primeiro numero: ");
		float nm1= leia.nextFloat();
		
	System.out.print("Digite o segundo numero: ");
		float nm2= leia.nextFloat();
		
	System.out.print("Digite o terceiro numero: ");
		float nm3= leia.nextFloat();
		
	System.out.print("Digite o quarto numero: ");
		float nm4= leia.nextFloat();

	
	float calcule1 = nm1 * nm2;
	
	float calcule2 = nm3 * nm4;
	
	float diferenca = calcule1 + calcule2;
	float diferenca2 = calcule1 - calcule2;
	
	System.out.println(" as Diferenças é: " + diferenca);
	System.out.println(" as Diferenças é: " + diferenca2);
	
	leia.close();
	}	
}
