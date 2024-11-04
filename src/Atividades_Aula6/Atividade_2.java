package Atividades_Aula6;

import java.util.Scanner;
import java.util.Stack;


public class Atividade_2 {






   
	public static void main(String[] args) {
		
		
		
		
		
        Stack<String> pilhaLivros = new Stack<>();
        
        
        Scanner scanner = new Scanner(System.in);
        
        
        int opcao;

        do {
            System.out.println("\nDigite uma opção:");
            System.out.println("1: Adicionar um novo livro na pilha");
            System.out.println("2: Listar todos os livros da Pilha");
            System.out.println("3: Retirar um livro da pilha");
            System.out.println("0: Finalizar o programa");
            System.out.print("Opção: ");
            
            opcao = scanner.nextInt();
            
            scanner.nextLine(); // Limpar o buffer de entrada

            switch (opcao) {
            
                case 1:
                	
                    System.out.print("\nDigite o nome do livro: ");
                    
                    String nomeLivro = scanner.nextLine();
                    
                    pilhaLivros.push(nomeLivro);
                    
                    System.out.println("\nPilha:");
                    
                    for (String livro : pilhaLivros) {
                        System.out.println(livro);
                    }
                    System.out.println("\nLivro adicionado!");
                    break;

                case 2:
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("\nA pilha está vazia!");
                    } else {
                        System.out.println("\nLista de Livros na Pilha:");
                        for (String livro : pilhaLivros) {
                            System.out.println(livro);
                        }
                    }
                    break;

                case 3:
                    if (pilhaLivros.isEmpty())
                    {
                        System.out.println("\nA Pilha está vazia!");
                        
                    } else {
                    	
                        String livroRemovido = pilhaLivros.pop();
                        
                        System.out.println("\nPilha:");
                        
                        for (String livro : pilhaLivros) {
                            System.out.println(livro);
                        }
                        System.out.println("\nUm Livro foi retirado da pilha!");
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

