package Atividades_Aula3;

import java.util.Scanner;

public class Atividade_2 {
	
	public static void main(String[] args) {
		
		
		  Scanner scanner = new Scanner(System.in);
	        int idade; 
	        int contMenor21 = 0;
	        int contMaior50 = 0;

	        System.out.println("Digite a idade de uma pessoa (ou um número negativo para sair):");

	        while (true) {
	            System.out.print("Idade:");
	            idade = scanner.nextInt();

	            if (idade < 0) {
	                break;
	            }

	            System.out.println("Idade informada: " + idade);
	        
	        
	        if (idade < 21) {
                contMenor21++;} 
	        
	        else if (idade > 50) {
                contMaior50++;
            }
        }

       
        System.out.println("Total de pessoas com idade menor que 21 anos: " + contMenor21);
        System.out.println("Total de pessoas com idade maior que 50 anos: " + contMaior50);
        System.out.println("Programa encerrado.");
        
	        scanner.close();
	    }
	}