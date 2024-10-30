package Atividades_Aula3;
import java.util.Scanner;
public class Atividade_3 {
	public static void main(String[] args) {
		
		
		 Scanner scanner = new Scanner(System.in);
	        int numero;
	        int soma = 0;

	        do {
	            System.out.print("Digite um número: ");
	            numero = scanner.nextInt();

	            // Verifica se o número é positivo
	            if (numero > 0) {
	                soma += numero; // Adiciona à soma
	            }

	        } while (numero != 0); // O loop continua até que o número 0 seja digitado

	       
	        System.out.println("A soma dos números positivos é: " + soma);

	        scanner.close(); 
		
		
		
		
		
	}
	
}
