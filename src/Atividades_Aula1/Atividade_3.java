package Atividades_Aula1;

import java.util.Scanner;
public class Atividade_3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("informe o Seu Salário :");
		
			float salarioBruto = leia.nextFloat();
		System.out.print("informe o Seu Adicional Nortuno :");
		
			float adicionalNoturno = leia.nextFloat();
		System.out.print("informe as Suas Horas Extras:");
		
			float horasExtras = leia.nextFloat();
		
		System.out.print("informe os Descontos :");
		
			float descontos = leia.nextFloat();
		
		
		float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos ;
		System.out.println( "o Salário liquído é de :" + salarioLiquido);

	}

}
