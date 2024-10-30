package Atividades_Aula2;
import java.util.Scanner;
public class Atividade_5 {
	
	    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);
	        
	       
	        
	        
	        double valorTotal = 0.0;
	        String nomeProduto = "";

	       
	        System.out.print("Código do Produto: ");
	       int codigoProduto = scanner.nextInt();

	        
	        System.out.print("Quantidade: ");
	        int quantidade = scanner.nextInt();

	        
	        switch (codigoProduto) {
	            case 1:
	                nomeProduto = "Cachorro Quente";
	                valorTotal = quantidade * 10.00;
	                break;
	            case 2:
	                nomeProduto = "X-Salada";
	                valorTotal = quantidade * 15.00;
	                break;
	            case 3:
	                nomeProduto = "X-Bacon";
	                valorTotal = quantidade * 18.00;
	                break;
	            case 4:
	                nomeProduto = "Bauru";
	                valorTotal = quantidade * 12.00;
	                break;
	            case 5:
	                nomeProduto = "Refrigerante";
	                valorTotal = quantidade * 8.00;
	                break;
	            case 6:
	                nomeProduto = "Suco de Laranja";
	                valorTotal = quantidade * 13.00;
	                break;
	            default:
	                System.out.println("Código do produto inválido.");
	                scanner.close();
	                return; 
	        }

	        
	        System.out.printf("Produto: %s%n", nomeProduto);
	        System.out.printf("Valor total: R$ %.2f%n", valorTotal);

	       
	        scanner.close();
	    }
	}


