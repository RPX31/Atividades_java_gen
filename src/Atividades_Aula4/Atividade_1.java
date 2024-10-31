package Atividades_Aula4;

import java.util.Scanner;

public class Atividade_1 {
	public static void main(String[] args) {
		
		 Scanner leia = new Scanner(System.in);
	        
	        
	        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};

	        System.out.println("Digite o número que você deseja encontrar: ");
	        
	        
	        int numeroDesejado = leia.nextInt();
	        boolean encontrado = false;

	        for (int indice = 0; indice < vetor.length; indice++) {
	            if (vetor[indice] == numeroDesejado) {
	                System.out.println("O número " + numeroDesejado + " está localizado na posição: " + indice);
	                encontrado = true;
	                break;
	            }
	        }
	        
	        
	        if (encontrado == false) {
	            System.out.println("O número " + numeroDesejado + " não foi encontrado!");
	        }

	        leia.close();
	}

}
