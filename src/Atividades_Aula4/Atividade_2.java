package Atividades_Aula4;

import java.util.Scanner;

public class Atividade_2 {
	
    public static void main(String[] args){
    	
        Scanner leia = new Scanner(System.in);
        
        
        
        
       
        int[] vetor = new int[10];
        int soma = 0;

        // Leitura dos 10 números inteiros e armazenamento no vetor
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = leia.nextInt();
            soma += vetor[i]; // Soma de todos os elementos
        }

        
        System.out.println("\nElementos nos índices ímpares:");
        for (int i = 1; i < 10; i += 2) {
            System.out.print(vetor[i] + " ");
        }

        // Exibindo elementos pares
        System.out.println("\n\nElementos pares:");
        for (int i = 0; i < 10; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " ");
            }
        }

        // Calculando a média
        double media = (double) soma / 10;

        
        System.out.println("\n\nSoma: " + soma);
        System.out.printf("Média: %.2f\n", media);

       

        
        
        leia.close();
    }
}
