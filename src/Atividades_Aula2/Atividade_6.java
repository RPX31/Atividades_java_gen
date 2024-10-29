package Atividades_Aula2;
import java.util.Scanner;

public class Atividade_6 {

	    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	        
	        String nomeColaborador;
	        int codigoCargo;
	        float salario;
	        float novoSalario = 0.0f;
	        String nomeCargo = "";

	        
	        System.out.print("Nome do colaborador: ");
	        nomeColaborador = scanner.nextLine();

	        
	        System.out.print("Cargo: ");
	        codigoCargo = scanner.nextInt();

	        
	        System.out.print("Salário: R$ ");
	        salario = scanner.nextFloat();

	        
	        switch (codigoCargo) {
	            case 1:
	                nomeCargo = "Gerente";
	                novoSalario = salario + (0.10f * salario); 
	                break;
	            case 2:
	                nomeCargo = "Vendedor";
	                novoSalario = salario + (0.07f * salario); 
	                break;
	            case 3:
	                nomeCargo = "Supervisor";
	                novoSalario = salario + (0.09f * salario); 
	                break;
	            case 4:
	                nomeCargo = "Motorista";
	                novoSalario = salario + (0.06f * salario); 
	                break;
	            case 5:
	                nomeCargo = "Estoquista";
	                novoSalario = salario + (0.05f * salario); 
	                break;
	            case 6:
	                nomeCargo = "Técnico de TI";
	                novoSalario = salario + (0.08f * salario); 
	                break;
	            default:
	                System.out.println("Código do cargo inválido.");
	                scanner.close();
	                return;
	                } 

	        
	        System.out.printf("Nome do colaborador: "+ nomeColaborador);
	        System.out.printf("Cargo: %s%n", nomeCargo);
	        System.out.printf("Salário: R$ %.2f%n", novoSalario);

	        
	        scanner.close();
	    }
}



