package Atividades_Aula1;

import java.util.Scanner;

public class Atividade_1 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.print(" digite o seu salário atual:"  );
		
		float salario = leia.nextFloat();
		
			System.out.println(" salário é:" + salario);
		
			System.out.print(" digite o seu abono: "  );
		
		float abono = leia.nextFloat();
			
			System.out.println(" o abono é de:" + abono);
		
		float NovoSalario = salario + abono;
		
			System.out.println(" Seu novo Salário é de: " + NovoSalario);
	
		leia.close();
	}
}

