package Atividades_Aula6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade_1 {

	 public static void main(String[] args) {
		 
	        Queue<String> filaClientes = new LinkedList<>();
	        
	        	Scanner scanner = new Scanner(System.in);
	        	
	        int opcao;

	        do {
	            System.out.println("\nDigite uma opção:");
	            System.out.println("1: Adicionar um novo Cliente na fila");
	            System.out.println("2: Listar todos os Clientes na fila");
	            System.out.println("3: Chamar (retirar) uma pessoa da fila");
	            System.out.println("0: Finalizar o programa");
	            System.out.print("Opção: ");
	            
	            opcao = scanner.nextInt();
	            scanner.nextLine(); 

	            switch (opcao) {
	                case 1:
	                   
	                	System.out.print("\nDigite o nome: ");
	                	
	                    String nomeCliente = scanner.nextLine();
	                    
	                    filaClientes.add(nomeCliente);
	                    
	                    System.out.println("\nFila:");
	                    
	                    for (String cliente : filaClientes) {
	                        System.out.println(cliente);
	                    }
	                    System.out.println("\nCliente Adicionado!");
	                    break;

	                case 2:
	                    if (filaClientes.isEmpty()) {
	                        System.out.println("\nA fila está vazia!");
	                    } else {
	                        System.out.println("\nLista de Clientes na Fila:");
	                        for (String cliente : filaClientes) {
	                            System.out.println(cliente);
	                        }
	                    }
	                    break;

	                case 3:
	                    if (filaClientes.isEmpty()) {
	                        System.out.println("\nA Fila está vazia!");
	                    } else {
	                        String clienteChamado = filaClientes.poll();
	                        System.out.println("\nFila:");
	                        for (String cliente : filaClientes) {
	                            System.out.println(cliente);
	                        }
	                        System.out.println("\nO Cliente " + clienteChamado + " foi Chamado!");
	                    }
	                    break;

	                case 0:
	                    System.out.println("\nPrograma Finalizado!");
	                    break;

	                default:
	                    System.out.println("\nOpção inválida! Tente novamente.");
	            }
	        } while (opcao != 0);

	        scanner.close();
	    }
	}

	




